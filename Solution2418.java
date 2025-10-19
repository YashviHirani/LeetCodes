import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class Solution2418 {
    public static String[] sortPeople(String[] names, int[] heights) {

        Hashtable<Integer,String> ht1 = new Hashtable<>();
        int j =0;
        for(int i : heights){
            ht1.put(i,names[j++]);
        }
        Arrays.sort(heights);
        j = 0;
        for(int i = heights.length-1; i>=0; i--){
            names[j++] = ht1.get(heights[i]);
        }
        return names;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortPeople(new String[]{"Mary","John","Emma"},new int[]{180,165,170})));
    }
}
