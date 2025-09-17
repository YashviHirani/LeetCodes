public class Solution3021 {

    public long flowerGame(int n, int m) {

        if(n==1 && m==1) return 0;
        int n1 = 0;
        int m1 = 0;
        int n2 = 0;
        int m2 = 0;
        n1 = n-(n/2); // odd
        n2 = n/2;
        m1 = m-(m/2); // odd
        m2 = m/2;
        return (((long) n1 *m2)+((long) n2 *m1));

    }

    public static void main(String[] args){

        Solution3021 s1 = new Solution3021();
        System.out.println(s1.flowerGame(1,1));

    }
}
