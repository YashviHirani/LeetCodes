public class Solution3712 {
    public static int sumDivisibleByK(int[] nums, int k) {

        int[] freq = new int[100];
        for(int i : nums){
            freq[i-1]++;
        }
        int j = 1;
        int sum = 0;
        for(int i : freq){
            if(i>0 && i%k==0)  sum += (i*j);
            j++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDivisibleByK(new int[]{1,2,2,3,3,3,3,4},2));
    }
}
