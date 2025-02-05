package linear_search;

public class Problem01_FirstNegative {

    public static int FindFirstNegative(int [] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

         int [] nums = {1,3,5,-12,23,45,10,-5,2,-22};

        System.out.println("the first negative number is at index: "+ FindFirstNegative(nums));
    }
}
