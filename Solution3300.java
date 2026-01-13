class Solution3300{
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        int temp;
        for (int num : nums){
            temp = 0;
            while (num>0){
                temp += num % 10;
                num /= 10;
            }
            min = Math.min(temp , min);
        }
        return min;
    }
}