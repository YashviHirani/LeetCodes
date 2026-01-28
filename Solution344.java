public class Solution344 {
    public void reverseString(char[] s) {

        int i = 0;
        int j = s.length-1;

        while (i<=j){
            s[i] = (char) (s[j] + s[i]-(s[j]=s[i]));
            i++;
            j--;
        }
    }
}
