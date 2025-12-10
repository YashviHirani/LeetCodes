public class Solution3760 {
    public int maxDistinct(String s) {
        int ans = 0;
        boolean[] freq = new boolean[26];
        for(int i = 0 ; i < s.length() ; i++){
            int temp = s.charAt(i)-'a';
            if(!freq[temp]){
                ans++;
                freq[temp] = true;
            }
        }
        return ans;
    }
}