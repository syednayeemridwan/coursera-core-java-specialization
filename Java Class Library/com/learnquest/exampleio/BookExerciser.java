package com.learnquest.exampleio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class BookExerciser {
    public static void main(String[] args) {
        String location = "books.txt";
        List<Book> books = readBooksFromFile(location);
        for (Book book : books) {
            System.out.println("Title = " + book.getTitle());
            System.out.println("Author = " + book.getAuthor());
            System.out.println("Price = " + book.getPrice());
            System.out.println("-----------------------------");
        }

    }

    public static List<Book> readBooksFromFile(String name) {
        List<Book> books = new ArrayList<>();

        try (
                FileInputStream file = new FileInputStream(name);
                InputStreamReader reader = new InputStreamReader(file);
                LineNumberReader lineReader = new LineNumberReader(reader);) {
            String line = lineReader.readLine();
            while (line != null) {
                String title = line;
                String author = lineReader.readLine();
                double price = Double.parseDouble(lineReader.readLine());
                Book book = new Book(title, price, author);
                books.add(book);
                line = lineReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }
}
