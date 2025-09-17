public class Solution724 {
    public static int pivotIndex(int[] nums) {

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
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,2,3,2,1}));
    }
}
