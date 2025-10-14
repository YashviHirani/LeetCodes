import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Solution442 {
    public List<Integer> findDuplicates(int[] nums) {

        Hashtable<Integer,Integer>  ht1 = new Hashtable<>();
        List<Integer> ans = new ArrayList<>();
        for (int i : nums){
            if(ht1.containsKey(i)) ans.add(i);
            else ht1.put(i,1);
        }
        return ans;
    }
}
