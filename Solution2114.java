class Solution2114 {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        int temp;
        for(String s : sentences){
            temp = s.split(" ").length;
            ans = Math.max(temp,ans);
        }
        return ans;
    }
}