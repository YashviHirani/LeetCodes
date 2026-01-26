import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1200 {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {

        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        int diff;
        int size = arr.length-1;

        for(int i = 1; i<=size; i++){
            diff = arr[i-1] - arr[i];
            if(diff<0) diff *= -1;
            if(min>diff) min = diff;
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> pairs;
        for(int i = 1; i<=size; i++){
            if((arr[i] - arr[i-1])==min){
                pairs = new ArrayList<>();
                pairs.add(arr[i-1]);
                pairs.add(arr[i]);
                ans.add(pairs);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minimumAbsDifference(new int[]{-12,17,-59,50,10,83,27,-79}));
    }
}
