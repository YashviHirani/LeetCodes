import java.lang.reflect.Array;
import java.util.*;

class Solution844 {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='#'){
                if(!(i==0)){
                    if(!s1.isEmpty()) s1.pop();
                }
            }
            else {
                s1.push(s.charAt(i));
            }

        }
        for(int i = 0; i<t.length(); i++){
            if(t.charAt(i)=='#'){
                if(!(i==0)){
                    if(!s2.isEmpty())  s2.pop();
                }

            }
            else {
                s2.push(t.charAt(i));
            }
        }
        if(s1.size()==s2.size()){
            boolean flag = true;
            int size = s1.size();
            for(int i = 0; i<size;i++){
                if(s1.peek()==s2.peek()){
                    flag = true;
                    s1.pop();
                    s2.pop();
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Solution844 s1 = new Solution844();
        System.out.println("enter s - ");
        String s = sc.nextLine();
        System.out.println("enter t - ");
        String t = sc.nextLine();
        System.out.println(s1.backspaceCompare(s,t));
    }
}