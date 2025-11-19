import java.util.Arrays;
import java.util.HashSet;

public class Solution2154 {
    public int findFinalValue(int[] nums, int original) {

//        Arrays.sort(nums);
//        for (int num : nums) {
//            if (num == original) original = original * 2;
//        }
//        return original;

        HashSet<Integer> hs1 = new HashSet<>();
        for(int i : nums) hs1.add(i);
        while (hs1.contains(original)){
            original = original*2;
        }
        return original;
    }
}
