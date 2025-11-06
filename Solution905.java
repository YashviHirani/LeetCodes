import java.util.Arrays;

public class Solution905 {
    public static int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = 0;
        // 3,1,2,4
        while (j< (nums.length)){

            if(nums[j]%2==0){
                nums[i] = nums[j] + nums[i] - (nums[j]=nums[i]);
                i++;
            }
            j++;
        }
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArrayByParity(new int[]{0,1,2})));
    }
}
