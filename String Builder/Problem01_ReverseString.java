import java.util.Scanner;

public class Problem01_ReverseString {

    //method to reverse a string using string builder
    public static String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();   //will reverse the string stored in string builder
        return sb.toString();
    }

    //main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking input from the user
        System.out.print("enter something : ");
        String s =  input.nextLine();
        System.out.println("Given String -> "+s);

        System.out.println("String after rejection -> "+reverseString(s));

    }
}
