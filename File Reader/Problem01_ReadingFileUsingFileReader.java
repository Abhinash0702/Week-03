import java.io.BufferedReader;
import java.io.FileReader;

public class Problem01_ReadingFileUsingFileReader {
    public static void main(String[] args) {

        try{
            BufferedReader b = new BufferedReader(new FileReader("index.txt"));

            String line;
            while((line = b.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (Exception e){
            System.out.println("File not found");
        }
    }
}
