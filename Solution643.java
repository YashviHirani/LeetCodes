public class Solution643 {
    public static double findMaxAverage(int[] nums, int k) {

        int sum = 0;
        for(int i = 0; i<k; i++){
            sum+= nums[i];
        }
        int avg = sum;
        for(int i = 0; i<nums.length-k; i++){
            sum = sum - nums[i] + nums[k+i];
            avg = Math.max(avg,sum);
        }
        return (double)avg/k;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{4,0,4,3,3},5));
    }
}
