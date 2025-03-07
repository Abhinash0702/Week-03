import java.io.*;
import java.util.Scanner;

public class Problem02_CountingWordsInFile {

    public static int countWords(String target){

        int count=0; //to count the occurence of target word

        try{
            BufferedReader reader = new BufferedReader(new FileReader("index.txt"));
            String line;

            while((line = reader.readLine())!= null){

                //making array of words by removing all full stops, commas.
                String check[] = line.toLowerCase().replaceAll("[.,]","").split(target.toLowerCase());
                count+=check.length-1;
            }
        }
        catch (Exception e){
            System.out.println("File is not found");
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the target word : ");
        String target = input.next();

        System.out.println("Total occurence of word '"+target+"' -> "+countWords(target));

    }
}
