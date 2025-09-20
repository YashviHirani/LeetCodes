import java.util.HashMap;
import java.util.HashSet;
class Solution1207 {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        for (int j : arr) {
            if (!hm1.containsKey(j)) {
                hm1.put(j, 1);
            } else {
                hm1.put(j, hm1.get(j) + 1);
            }
        }
        HashSet<Integer> hashSet = new HashSet<>(hm1.values());
        return hashSet.size()==hm1.size();
    }
}