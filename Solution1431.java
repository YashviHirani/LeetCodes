import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            if (max <= candy) {
                max = candy;
            }
        }
        for (int candy : candies) {
            if (max <= (candy+extraCandies)) {
                ans.add(true);
            }else {
                ans.add(false);
            }
        }
        return ans;
    }
}
