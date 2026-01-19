class Solution1979 {
    public static int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int numNum : nums){
            if(min > numNum) min = numNum;
            if(max < numNum) max = numNum;
        }
        return gcd(min,max);
    }
    static int gcd(int min , int max){
        int ans = max;
        while (ans > 0){
            if(max % ans == 0 && min % ans == 0){
                break;
            }
            ans--;
        }

        return ans;
    }

    public static void main(String[] args) {
        findGCD(new int[]{7,5,6,8,3});
    }
}