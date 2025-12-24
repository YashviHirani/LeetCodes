import java.util.Arrays;

public class Solution3074 {
    public int minimumBoxes(int[] apple, int[] capacity) {

        int count = 0;
        Arrays.sort(capacity);

        for (int i : apple) {
            count += i;
        }
        int ans = 0;
        for (int i = capacity.length - 1; i >= 0; i--) {
            if (count > 0) {
                count -= capacity[i];
                ans++;
            } else break;
        }
        return ans;
    }
}
