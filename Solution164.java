import java.util.Arrays;
import java.util.Map;

public class Solution164 {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if(n<=1) return 0;
        int ans = 0 ;
        Arrays.sort(nums);
        int diff = 0;
        for(int i = 0 ; i < (n-1) ; i++ ){
            diff = Math.abs(nums[i] - nums[i+1]);
            if( diff > ans) ans =  diff;
        }
        return ans;
    }
}
