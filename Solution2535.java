public class Solution2535 {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int Dsum = 0;

        for(int i:nums){
            sum += i;
            while (i > 0){
                Dsum += i%10;
                i /= 10;
            }
        }
        return Math.abs(Dsum-sum);
    }
}
