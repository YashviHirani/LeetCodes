class Solution3467 {
    public int[] transformArray(int[] nums) {
        int numberOfOdd = 0;
        for (int num : nums){
            if(num % 2 != 0) numberOfOdd++;
        }
        for (int i = nums.length - 1 ; i >= 0 ; i--){
            if(numberOfOdd > 0){
                nums[i] = 1;
                numberOfOdd--;

            }else {
                nums[i] = 0;
            }
        }
        return nums;
    }
}