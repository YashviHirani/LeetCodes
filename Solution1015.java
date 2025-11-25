public class Solution1015 {
    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) return -1;
        int rem = 1;
        int c = 1;
        if (1 % k == 0) return c;
        while (true) {
            rem = (rem * 10 + 1) % k;
            c++;
            if (rem == 0) {
                return c;
            }
        }
    }
}
