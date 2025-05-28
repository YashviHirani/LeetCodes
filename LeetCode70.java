import java.util.*;
class Solution70 {
    int ans = 0;
    public int climbStairs(int n) {

        int count = 0;
        int temp = n;

        if(temp/1==0){
            ++count;
        }
        if(n/2==0 || n%2==0){
            ++count;
        }

        // return ways
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Solution70 s = new Solution70();
        System.out.print("enter stairs - ");
        int n = sc.nextInt();

        System.out.println(s.climbStairs(n));
    }
}