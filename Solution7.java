public class Solution7 {
    public static int reverse(int x) {

        boolean check = false;
        if(x<0){
            x = Math.abs(x);
            check = true;
        }
        int rem = 0;
        int temp = x;
        int temp1 = x;
        int i = 0;
        long ans = 0;
        long pow = 0;
        long see = 0;
        while (temp1>0){
            temp1/=10;
            i++;
        }
        while (temp>0){
            rem = temp%10;
            pow = powerOfNum(--i);
            if(pow==0) return 0;
            see = rem*pow;
            if(see>2147483647) return 0;
            ans = ans+see;
            temp/=10;
        }
        if(ans<=(-2147483648) || ans>=(2147483647)) return 0;
        if(check) return (int)(ans*-1);
        return (int)ans;
    }
// 10 ^ 5
    public static long powerOfNum(int i ){
        long x = 1;
        for (int j = 1; j<=i; j++){
            x*=10;
            if(x>2147483647) return 0;
        }
        return x;
    }
    public static void main(String[] args) {
        System.out.println(reverse(1563847412));
    }
}
