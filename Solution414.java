import java.util.*;

public class Solution414 {
    public int thirdMax(int[] nums) {

        HashSet<Integer> hs1 = new HashSet<>();

        for(int i : nums){
            hs1.add(i);
        }

        List<Integer> al1 = new ArrayList<>(hs1);
        Collections.sort(al1);
        int size = al1.size();
        if(size>=3) return al1.get(size-3);
        else return al1.get(size-1);
    }
}