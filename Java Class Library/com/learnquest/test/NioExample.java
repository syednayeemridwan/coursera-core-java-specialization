package com.learnquest.test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NioExample {

    public static void main(String[] args) {
        // File paths
        Path inputFilePath = Path.of("input.txt");
        Path outputFilePath = Path.of("output.txt");

        // Write to file using BufferedWriter and Java NIO
        writeToBufferedWriterNIO(outputFilePath, "Hello, BufferedWriter with NIO!");

        // Read from file using BufferedReader and Java NIO
        String content = readFromBufferedReaderNIO(inputFilePath);
        System.out.println("Read from file: " + content);
    }

    private static void writeToBufferedWriterNIO(Path filePath, String data) {
        try (BufferedWriter writer = Files.newBufferedWriter(filePath, StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            // Write data to the file using BufferedWriter with Java NIO
            writer.write(data);
            System.out.println("Write to file successful.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFromBufferedReaderNIO(Path filePath) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = Files.newBufferedReader(filePath, StandardCharsets.UTF_8)) {
            // Read data from the file using BufferedReader with Java NIO
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            System.out.println("Read from file successful.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content.toString();
    }
}
