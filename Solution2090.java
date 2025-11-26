import java.util.Arrays;

public class Solution2090 {
    public static int[] getAverages(int[] nums, int k) {
        if(k==0) return nums;
        if(nums.length<=(2*k+1)){
            Arrays.fill(nums, -1);
            return nums;
        }
        long sum = 0;
        int size = nums.length-1;
        // 7,4,3, 9 ,1 ,8, 5,2,6
        int[] ans = new int[nums.length];
        for (int i = 0;i<k; i++){
            ans[i] = -1;
            ans[size-i] = -1;
        }
        int window = (2*k)+1;
        for(int i = 0; i<window; i++) sum+=nums[i];
        int j = k;
        ans[j++] =(int)(sum/window);
        for(int i = k+1;i<=(size-k);i++){
            sum = sum - nums[i-k-1] + nums[i+k];
            ans[j++] = (int)(sum/window);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getAverages(new int[]{7,4,3,9,1,8,5,2,6},3)));
    }
}
