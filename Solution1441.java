import java.util.ArrayList;
import java.util.List;

public class Solution1441 {
    public static List<String> buildArray(int[] target, int n) {
        int j = 0;
        List<String> ans = new ArrayList<>();
        int size = target.length;
        for(int i = 1; i<=n && j<size; i++){
            if(target[j++]==i) ans.add("Push");
            else{
                j--;
                ans.add("Push");
                ans.add("Pop");
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(buildArray(new int[]{1,3},3));
    }
}
