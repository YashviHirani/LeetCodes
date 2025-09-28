import java.util.Arrays;

public class Solution976 {
    public int largestPerimeter(int[] nums) {

        Arrays.sort(nums);
        int size = nums.length;
        // 1,2,2
        // 1,1,2,10
        for(int i = size-1; i>2; i--){
            if(nums[i]<(nums[i-1]+nums[i-2])){
                return (nums[i]+nums[i-1]+nums[i-2]);
            }
        }
        return 0;
    }
}
