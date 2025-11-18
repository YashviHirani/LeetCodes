import java.util.Arrays;

public class Solution2574 {
    public static int[] leftRightDifference(int[] nums) {

        int[] leftsum = new int[nums.length];
        int sum = 0;
        int temp = 0;
        for(int i = 0; i< nums.length; i++){
            sum += nums[i];
            leftsum[i] = temp;
            temp += nums[i];
        }
         for(int i = 0; i< nums.length; i++){
                nums[i] = Math.abs(leftsum[i] - (sum - leftsum[i]-nums[i]));
         }
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(leftRightDifference(new int[]{10,4,8,3}));
    }
}
