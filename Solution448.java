import java.util.ArrayList;
import java.util.List;

public class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] freq = new boolean[nums.length];
        for(int i : nums)  if(!freq[i-1])  freq[i-1] = true;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0 ; i < nums.length; i++)  if(!freq[i]) ans.add(i+1);
        return ans;
    }
}
