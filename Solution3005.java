import java.util.HashMap;

public class Solution3005 {
    public int maxFrequencyElements(int[] nums) {

        HashMap<Integer,Integer> hm1 = new HashMap<>();
        for (int n : nums){
            if(!hm1.containsKey(n)) hm1.put(n,1);
            else hm1.put(n,hm1.get(n)+1);
        }
        int max = 0;
        for(int n1 : hm1.values()){
            if(max<=n1) max = n1;
        }
        int count = 0;
        for (int n1 : hm1.values()){
            if(n1==max) count+=n1;
        }
        return count;
    }
}
