import java.util.ArrayList;
import java.util.List;

class Solution1018 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int shift = 0;
        for (int num : nums) {
            shift = ((shift << 1) + num) % 5;
            ans.add(shift == 0);
        }
        return ans;
    }
}