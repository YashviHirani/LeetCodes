public class Solution3264 {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        int min = Integer.MAX_VALUE;
        int index = -1;
        for(int i = 1; i<=k; i++){
            min = Integer.MAX_VALUE;
            for(int j = 0; j<nums.length; j++){
                if (nums[j] < min) {
                    min = nums[j];
                    index = j;
                }
            }
            nums[index] = nums[index]*multiplier;
        }
        return nums;
    }
}
