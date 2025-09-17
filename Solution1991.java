public class Solution1991{
    public int findMiddleIndex(int[] nums) {
        int rightSum = 0;  // 9
        int leftSum = 0;

        for(int x : nums){
            rightSum+=x;
        }
        int size = nums.length;
        for(int i = 0; i<size; i++){
            leftSum += nums[i];
            if(rightSum==leftSum) return i;
            rightSum-=nums[i];

        }
        return -1;
    }
}

