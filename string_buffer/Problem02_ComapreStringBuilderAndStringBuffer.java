package string_buffer;

public class Problem02_ComapreStringBuilderAndStringBuffer {

    //Concatenation through string builder
    public static void ConcatenateStringBuilder(String add){
        StringBuilder sb = new StringBuilder();
        int i=1;
        while(i<1000000){
            sb.append(add);
            i++;
        }
    }

    //Concatenation through String buffer
    public static void ConcatenateStringBuffer(String add){
        StringBuffer sb = new StringBuffer();
        int i=1;
        while(i<1000000){
            sb.append(add);
            i++;
        }
    }

    public static void main(String[] args) {
       String word = "hello";

       //calculating time for string builder
       long startTime1 = System.nanoTime();
       ConcatenateStringBuffer(word);
       long endTime1 = System.nanoTime();
       //time taken by stringBuilder
       System.out.println("Time taken by String Builder to Concatenate : "+Math.abs(startTime1-endTime1)+"ns");

       //calculating time for StringBuffer
       long startTime2 = System.nanoTime();
       ConcatenateStringBuffer(word);
       long endTime2 = System.nanoTime();
       //time taken by stringBuffer
       System.out.println("Time taken by String Buffer to Concatenate : "+Math.abs(startTime2-endTime2)+"ns");


    }
}
