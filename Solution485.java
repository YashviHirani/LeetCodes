import java.util.Map;
import java.util.Scanner;

public class Solution485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i : nums){
            if(i==0){
                max = Math.max(count,max);
                count=0;
            }
            else count++;
        }
        return Math.max(count,max);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Solution485 s1 = new Solution485();
        int [] nums = {1,1,0,1,1,1};
        System.out.println(s1.findMaxConsecutiveOnes(nums));

    }
}
