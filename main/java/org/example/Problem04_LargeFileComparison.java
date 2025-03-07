package org.example;

import java.io.*;

public class Problem04_LargeFileComparison {
    public static void main(String[] args) {
        String filePath = "largefile.txt"; // 500MB file path

        // Test FileReader
        long startTime = System.currentTimeMillis();
        try (FileReader fileReader = new FileReader(filePath)) {
            while (fileReader.read() != -1) {} // Read character-by-character
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("FileReader Time: " + (endTime - startTime) + " ms");

        // Test InputStreamReader with BufferedReader
        startTime = System.currentTimeMillis();
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {
            while (br.readLine() != null) {} // Read line-by-line
        } catch (IOException e) {
            e.printStackTrace();
        }
        endTime = System.currentTimeMillis();
        System.out.println("InputStreamReader Time: " + (endTime - startTime) + " ms");
    }
}
