import java.util.Stack;

class Solution227 {
    public int calculate(String s) {
        Stack<Integer> ans = new Stack<>();
        s = s.trim();
        int num = 0;
        char sign = '+';
        char ch;
        for (int i = 0 ; i < s.length() ; i++){
            ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num = num*10 + (ch-'0');
            }
            if(!Character.isDigit(ch) && ch != ' ' || i == s.length()-1){
                if(sign=='+'){
                    ans.push(num);
                } else if (sign == '*') {
                    ans.push(ans.pop()*num);
                } else if (sign == '/') {
                    ans.push(ans.pop()/num);
                } else {
                    ans.push(-num);
                }
                sign = ch;
                num = 0;
            }
        }

        int finalAns = 0;
        while (!ans.isEmpty()){
            finalAns += ans.pop();
        }
        return finalAns;
    }
}