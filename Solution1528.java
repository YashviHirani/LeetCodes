import java.util.Arrays;

public class Solution1528 {
    public String restoreString(String s, int[] indices) {
        int j = 0;
        char[] ch = new char[s.length()];
        for(int i : indices){
            ch[i] = s.charAt(j++);
        }
        return new String(ch);
    }
}
