public class Solution709 {
    public String toLowerCase(String s){

        int size = s.length();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<size; i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z') ans.append((char)(s.charAt(i)-32));
            else ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}
