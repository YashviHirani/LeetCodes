class Solution3746 {
    public int minLengthAfterRemovals(String s) {
        int ans = 0;
        for (int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i)=='a')ans++;
            else ans--;
        }
        return Math.abs(ans);
    }
}