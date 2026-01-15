import java.util.Arrays;

class Solution1051{
    public int heightChecker(int[] heights) {
        int []acc = heights.clone();
        Arrays.sort(heights);
        int ans = 0;
        for(int i = 0 ; i < heights.length ; i++){
            if(acc[i] != heights[i]) ans++;
        }
        return ans;
    }
}