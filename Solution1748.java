public class Solution1748 {

    public int sumOfUnique(int[] nums) {

        int[] freq = new int[100];

        for(int n : nums){
            freq[n-1]++;
        }
        int ans = 0;
        for(int i = 0; i<100; i++){
            if(freq[i]==1) ans+=(i+1);
        }
        return ans;
    }
}
