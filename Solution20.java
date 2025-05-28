import java.util.*;
class Solution20 {
    public boolean isValid(String s) {

        String check = "";
        Stack<String> s1 = new Stack<>();
        check = s;
        System.out.println("check = "+check);

        for(int i = 0; i<check.length(); i++){
            if(check.charAt(i)=='('||check.charAt(i)=='{'||check.charAt(i)=='['){
                s1.push(check.charAt(i)+"");
            }
            if(check.charAt(i)==')'||check.charAt(i)=='}'||check.charAt(i)==']'){
                if(!s1.isEmpty()) {
                    String peeK = s1.peek();
                    if (((peeK.equals("("))&&(check.charAt(i)==')'))||(peeK.equals("{")&&(check.charAt(i)=='}'))||(peeK.equals("[")&&(check.charAt(i)==']'))){
                        s1.pop();
                        continue;
                    }
                }
                s1.push(check.charAt(i)+"");
            }
        }
        if(s1.isEmpty() && !(check.isEmpty())){
            System.out.println("balanced string");
            return true;
        }
        else{
            System.out.println("unbalanced string !");
            return false;
        }
    }
}