public class Solution3289 {
    public int[] getSneakyNumbers(int[] nums) {

        int [] freq = new int[100];
        int [] ans = new int[2];

        int j = 0;
        for (int num : nums) {
            if (freq[num] == 1){
                ans[j++] = num;
                if(j==2) break;
            }
            else freq[num]++;
        }  
        return ans;
    }
}
