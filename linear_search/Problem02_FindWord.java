package linear_search;


public class Problem02_FindWord {
    public static int  word(String s,String targetWord){
        return s.contains(targetWord) ? 1 : -1;
    }

    public static void main(String[] args) {
        String sentence[] = {"hello everyone!","I want to tell","Java is the best language","in the world" };
        String target = "Java";
        int i=0;
        boolean found = false;
        while(i<sentence.length){
            int check = word(sentence[i],target);
            if(check == 1  ){
                found=true;
                break;
            }
            i++;
        }

        if(found){
            System.out.println("sentence is found with '"+target+"' word -> "+sentence[i]);
        }
        else {
            System.out.println("Sentence is not found");
        }


    }

}
