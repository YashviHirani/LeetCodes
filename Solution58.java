public class Solution58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        System.out.println(s);
        return s.length()-(s.lastIndexOf(" ")+1);
    }
}