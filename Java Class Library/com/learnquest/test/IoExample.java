package com.learnquest.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IoExample {

    public static void main(String[] args) {
        // File paths
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        // Write to file using BufferedWriter (with append)
        writeToBufferedWriter(outputFilePath, "Hello, BufferedWriter!");

        // Read from file using BufferedReader
        String content = readFromBufferedReader(inputFilePath);
        System.out.println("Read from file: " + content);
    }

    private static void writeToBufferedWriter(String filePath, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            // Write data to the file using BufferedWriter with append mode
            writer.write(data);
            System.out.println("Write to file successful.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFromBufferedReader(String filePath) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Read data from the file using BufferedReader
            String line = reader.readLine();
            while (line != null) {
                content.append(line).append("\n");
                line = reader.readLine();
            }

            System.out.println("Read from file successful.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content.toString();
    }
}
