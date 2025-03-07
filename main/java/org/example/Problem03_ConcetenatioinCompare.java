package org.example;

public class Problem03_ConcetenatioinCompare {

    //concetenation using string builder
    public static void ConcetenateString(String s){
        String word="hello";
        int i=1;
        while(i < 1_000_000){
            s+=word;
            i++;
        }
    }

    //concetenation using string buffer
    public static void ConcetenateStringBuilder(String s){
        StringBuilder sb = new StringBuilder();
        String word= "hello";
        int i=1;
        while(i<1_00_000){
            sb.append(word);
            i++;
        }
    }

    //Concetenation using String Builder
    public static void ConcetenateStringBuffer(String s){
        StringBuffer buffer= new StringBuffer();
        String word= "hello";
        int i=1;
        while(i<1_00_000){
            buffer.append(word);
            i++;
        }

    }

    public static void main(String[] args) {

        String s=""; //empty string

        //measure string time
//        long startTime = System.nanoTime();
//        ConcetenateString(s);
//        long endTime = System.nanoTime();
//
//        System.out.println("Time taken by string : "+(endTime-startTime)/1000000.0);

//        measure string builder time
        long startTime = System.nanoTime();
        ConcetenateStringBuilder(s);
        long endTime = System.nanoTime();

        System.out.println("Time taken by string Builder: "+(endTime-startTime)/1000000.0+"ms");
//
//        //measure string buffer time
//        startTime = System.nanoTime();
//        ConcetenateStringBuffer(s);
//        endTime = System.nanoTime();
//
//        System.out.println("Time taken by string Buffer : "+(endTime-startTime)/1000000.0);


    }
}
