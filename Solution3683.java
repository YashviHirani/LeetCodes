class Solution3683 {
    public int earliestTime(int[][] tasks) {
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        for(int []i : tasks){
            for(int j : i)   sum += j;
            if(ans > sum) ans = sum;
            sum = 0;
        }
        return ans;
    }
}