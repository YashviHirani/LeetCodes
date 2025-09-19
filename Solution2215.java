import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Solution2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Hashtable<Integer,Integer> ht1 = new Hashtable<>();
        Hashtable<Integer,Integer> ht2 = new Hashtable<>();
        int i = 0;
        for(int n : nums1){
            ht1.put(n,1);
        }
        for(int n : nums2){
            ht2.put(n,1);
        }
        ArrayList<Integer> al1 = new ArrayList<>();  // 4 6
        ArrayList<Integer> al2 = new ArrayList<>();  // 3 7
        for (int k : ht1.keySet()) {
            if (!ht2.containsKey(k)) al1.add(k);
        }
        for (int k : ht2.keySet()) {
            if (!ht1.containsKey(k)) al2.add(k);
        }
        ArrayList<List<Integer>> ans = new ArrayList<>();
        ans.add(al1);
        ans.add(al2);
        return ans;
    }
}
