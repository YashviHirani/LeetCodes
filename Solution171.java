public class Solution171 {
    public int titleToNumber(String columnTitle) {

        int size = columnTitle.length();
        int ans = 0;
        for(int i = 0; i<size; i++){
            ans = (ans*26)+columnTitle.charAt(i)-'A'+1;
        }
        return ans;
    }
}
