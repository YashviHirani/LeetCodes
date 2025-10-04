import java.util.Hashtable;

public class Solution2206 {
    public boolean divideArray(int[] nums) {

        if(nums.length%2!=0) return false;
        Hashtable<Integer,Integer> ht1 = new Hashtable<>();

        for(int i : nums){
            if(!ht1.containsKey(i)) ht1.put(i,1);
            else{
                ht1.put(i,ht1.get(i)+1);
            }
        }
        for (int x : ht1.values()){
            if(x%2!=0) return false;
        }
        return true;
    }
}
