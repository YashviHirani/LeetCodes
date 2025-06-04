import java.util.Arrays;
import java.util.Scanner;

class Solution1480 {
    public int[] runningSum(int[] nums) {

        int sum = 0;
        for(int i = 0; i<nums.length; i++){

            sum = sum+nums[i];
            nums[i] = sum;
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Solution1480 s1 = new Solution1480();
        System.out.println();
        int [] nums = {1,2,3,4};
        s1.runningSum(nums);
    }
}