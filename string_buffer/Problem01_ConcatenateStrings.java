package string_buffer;

public class Problem01_ConcatenateStrings {

    //method to concatenate strings
    public static String concatenate(String [] words){
        StringBuffer sb = new StringBuffer(); //making the object of string buffer

        for(int i=0;i<words.length;i++){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String [] sentence = {"hello!, everyone", "this is the",  "example of string"+"concatenation","using string buffer"};
        System.out.println("before concatenation");
        for(String s: sentence){
            System.out.println(s);
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("After Concatenation!!");
        System.out.println(concatenate(sentence));
    }
}
