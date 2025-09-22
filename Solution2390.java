import java.util.Stack;

public class Solution2390 {
    public String removeStars(String s) {

        Stack<Character> st1 = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '*') st1.pop();
            else st1.push(ch);
        }
        StringBuilder sb1 = new StringBuilder();
        for (char ch : st1) {
            sb1.append(ch);
        }
        return sb1.reverse().toString();
    }
}
