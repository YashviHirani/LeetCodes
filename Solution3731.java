import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution3731 {
    public List<Integer> findMissingElements(int[] nums) {

        int min = 0;
        int max = 0;
        HashSet<Integer> hs1 = new HashSet<>();

        for(int i : nums){
            if(i<min) min = i;
            if(i>max) max = i;
            hs1.add(i);
        }
        List<Integer> al1 = new ArrayList<>();
        for(int i = min; i<=max; i++){
            if(!hs1.contains(i)) al1.add(i);
        }
        return al1;
    }
}
