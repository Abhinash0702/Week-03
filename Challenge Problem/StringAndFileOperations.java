import java.io.*;
import java.util.StringTokenizer;

public class StringAndFileOperations {
    public static void main(String[] args) {
        // String Concatenation Performance Test
        compareStringBuilderAndBuffer();

        // Reading a Large File and Counting Words
        String filePath = "index";
        countWordsInFile(filePath);
    }

    // Compares StringBuilder and StringBuffer performance
    private static void compareStringBuilderAndBuffer() {
        final int iterations = 1_000_000;
        String text = "hello";

        // Using StringBuilder
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endTime = System.nanoTime();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) / 1_000_000 + " ms");

        // Using StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    // Reads a file using FileReader and InputStreamReader and counts words
    private static void countWordsInFile(String filePath) {
        try {
            FileReader fileReader = new FileReader(filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            int wordCount = 0;

            // Read each line and count words using StringTokenizer
            while ((line = bufferedReader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line);
                wordCount += tokenizer.countTokens();
            }

            System.out.println("Total word count: " + wordCount);

            // Close resources
            bufferedReader.close();
            inputStreamReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
