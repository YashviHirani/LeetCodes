public class Solution1844 {
    public String replaceDigits(String s) {

        StringBuilder ans = new StringBuilder();
        int size = s.length();

        for(int i = 1; i<size; i+=2){
            // a1b2c3
            ans.append(s.charAt(i-1));
            ans.append((char)(s.charAt(i)+s.charAt(i-1)-'0'));
        }
        if(size%2!=0) ans.append(s.charAt(size-1));
        return ans.toString();
    }
}
