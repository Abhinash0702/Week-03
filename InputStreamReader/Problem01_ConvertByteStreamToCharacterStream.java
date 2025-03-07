import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public class Problem01_ConvertByteStreamToCharacterStream {
    public static void main(String[] args) { 
        
        String filePath = "index.txt";  
        String charset = "UTF-8";  

        try {
            // Create a FileInputStream to read the binary data
            FileInputStream fileInputStream = new FileInputStream(filePath);

            // Create an InputStreamReader to convert bytes to characters
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, Charset.forName(charset));

            // Wrap the InputStreamReader in a BufferedReader for efficient line-by-line reading
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            // Read and print the file line by line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);  // Print the read line of characters
            }

            // Close resources
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
        } catch (UnsupportedCharsetException e) {
            System.out.println("Error: Unsupported Charset: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

