import java.util.ArrayList;

class Solution3495 {
    public static long minOperations(int[][] queries) {
        long ans = 0;
        for (int[] query : queries) {
            ans += m1(query);
        }
        return ans;
    }

    static long m1(int[] a){
        int sum = 0;
        int fd = a[0];
        int ld = a[1];
        for(int i = fd ; i <= ld ; i++){
            sum += ((int)(Math.log(i)/Math.log(4))+1);
        }
        return (sum + 1) / 2;
    }

    public static void main(String[] args) {
        int[][] a = {{1,8}};
        System.out.println(minOperations(a));

    }
}