class Solution2798 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans = 0;
        for(int a : hours) if(a >= target) ans++;
        return ans;
    }
}