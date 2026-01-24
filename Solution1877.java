import java.util.Arrays;

class Solution1877 {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int start = 0;
        int last = nums.length - 1;

        while (start < last){
            ans = Math.max((nums[start]+nums[last]),ans);
            start++;
            last--;
        }
        return ans;
    }
}