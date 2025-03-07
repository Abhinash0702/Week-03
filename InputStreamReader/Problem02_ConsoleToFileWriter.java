import java.io.*;

public class Problem02_ConsoleToFileWriter {
    public static void main(String[] args) {
        // Specify the output file path
        String filePath = "index.txt"; 

        try {
            // Create an InputStreamReader to read from System.in
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);

            // Wrap InputStreamReader in BufferedReader for efficient reading
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            // Create a FileWriter to write to the file (append mode: false)
            FileWriter fileWriter = new FileWriter(filePath);

            // Wrap FileWriter in BufferedWriter for efficient writing
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Enter text to write to the file (type 'exit' to stop):");

            String userInput;
            // Read user input until "exit" is entered
            while (!(userInput = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(userInput); // Write input to file
                bufferedWriter.newLine(); // Add a newline after each input
            }

            // Close resources
            bufferedWriter.close();
            fileWriter.close();
            bufferedReader.close();
            inputStreamReader.close();

            System.out.println("User input has been saved to: " + filePath);
        } catch (IOException e) {
            System.out.println("Error handling file: " + e.getMessage());
        }
    }
}
