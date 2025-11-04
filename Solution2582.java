public class Solution2582{
    public static int passThePillow(int n, int time) {
        int r = 2*(n-1);
        time = time%r;

        if(time<n) return time+1;
        else return 2*n-time-1;
    }

    public static void main(String[] args) {
        System.out.println(passThePillow(18,38));
    }
}
