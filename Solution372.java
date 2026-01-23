public class Solution372 {

    static final int MOD = 1337;

    public static int superPow(int a, int[] b) {

        a = a % MOD;      // reduce base
        int ans = 1;      // final answer

        // process exponent digit by digit
        for (int digit : b) {

            // ans = ans^10 % MOD
            ans = power(ans, 10);

            // ans = ans * a^digit % MOD
            ans = (ans * power(a, digit)) % MOD;
        }

        return ans;
    }

    // fast modular power
    static int power(int n, int pow) {
        int ans = 1;
        n = n % MOD;

        while (pow > 0) {
            if ((pow & 1) == 1) {
                ans = (ans * n) % MOD;
            }
            n = (n * n) % MOD;
            pow >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(superPow(2, new int[]{1, 0})); // 1024
    }
}
