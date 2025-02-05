import java.util.HashSet;
import java.util.Scanner;

public class Problem02_RemoveDuplicates {

    public static String removeDupli(String s){
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        //iterating through the string to find the duplicates element
        for (int i=0 ; i<s.length();i++){
            char c = s.charAt(i);

            if(!set.contains(c)){
                sb.append(c);
                set.add(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         //taking input from the user
        System.out.print("enter something : ");
        String s =  input.nextLine();
        System.out.println("Given String -> "+s);

        //string with no repeating characters
        System.out.println(removeDupli(s));
    }
}
