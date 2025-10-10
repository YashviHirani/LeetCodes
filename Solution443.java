import java.util.Arrays;

public class Solution443 {
    public static int compress(char[] chars) {

        if(chars.length==1) return 1;

        int read = 0;
        int write = 0;
        int count = 0;
        char curr = chars[0];
        while (read<chars.length){
            count = 0;
            curr = chars[read];
            while(read< chars.length && curr==chars[read]){
                read++;
                count++;
            }
            chars[write++] = curr;
            if(count>1) {
                char[] freq = (count + "").toCharArray();
                for (char i : freq) {
                    chars[write++] = i;
                }
            }
        }
        return write;
    }

    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a','a','b','b','c','c','c'}));
    }
}
