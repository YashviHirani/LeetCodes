import java.util.Arrays;

public class Solution3131 {
    public int addedInteger(int[] nums1, int[] nums2) {

        int min1 = nums1[0];
        int min2 = nums2[0];

        for (int j : nums1) {
            if (j < min1) min1 = j;
        }

        for (int j : nums2) {
            if (j < min1) min2 = j;
        }

        return min2-min1;
    }
}
