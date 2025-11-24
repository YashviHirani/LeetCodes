import java.util.*;

public class Solution2785{
    public static String sortVowels(String s) {
        StringBuilder sb = new StringBuilder("aeiouAEIOU");
        List<Character> l1 = new ArrayList<>();
        for (int i = 0; i<s.length(); i++){
            if(sb.indexOf(s.charAt(i)+"")!=-1) l1.add(s.charAt(i));
        }
        Collections.sort(l1);
        char[] ch = new char[s.length()];
        int j = 0;
        for(int i = 0; i<ch.length; i++){
            if(sb.indexOf(s.charAt(i)+"")!=-1){
                ch[i] = l1.get(j++);
            }
            else ch[i] = s.charAt(i);
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        System.out.println(sortVowels("lEetcOde"));
    }
}
