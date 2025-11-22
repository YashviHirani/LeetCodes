import java.util.HashMap;
import java.util.HashSet;

public class Solution560 {

        public static int subarraySum(int[] nums, int k) {
            // prefixSum -> frequency
            HashMap<Integer, Integer> freq = new HashMap<>();
            freq.put(0, 1); // empty prefix sum = 0, seen once

            int prefix = 0;
            int ans = 0;

            for (int x : nums) {
                prefix += x;

                // Count how many times (prefix - k) occurred before
                ans += freq.getOrDefault(prefix - k, 0);

                // Store current prefix sum
                freq.put(prefix, freq.getOrDefault(prefix, 0) + 1);
            }

            return ans;
        }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,-1,0},0));
    }
}
