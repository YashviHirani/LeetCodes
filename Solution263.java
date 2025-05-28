import java.util.*;
public class Solution263 {
    boolean ans = true;
    public boolean isUgly(int n) {

        ans = true;
        if(n==1){
            ans = true;
            return ans;
        }
        if(n<=0){
            ans = false;
            return ans;
        }
        while(n%2==0){

            n /=2;
        }
        while(n%3==0){

            n /=3;
        }
        while(n%5==0){

            n /=5;
        }

        return n==1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Solution263 s = new Solution263();

        System.out.print("enter n - ");
        int n = sc.nextInt();

        System.out.println(s.isUgly(n));
    }
}