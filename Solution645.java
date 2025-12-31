class Solution645 {
    public int[] findErrorNums(int[] nums) {
        int size = nums.length;
        boolean []freq = new boolean[size];
        int d = 0;
        int sum = 0;
        for (int num : nums) {
            if (freq[num-1]) {
                d = num;
            } else {
                freq[num-1] = true;
            }
            sum += num;
        }
        int expectedSum = size * (size + 1) / 2;
        return new int[]{d, expectedSum - (sum - d)};
    }
}