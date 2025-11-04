import java.util.ArrayList;
import java.util.List;

public class Solution119 {
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i<=rowIndex; i++){
            ArrayList<Integer> al1 = new ArrayList<>();
            for (int j = 0; j<=i; j++){
                if(j==0 || j==i) al1.add(1);
                else{
                    List<Integer> al2 = ans.get(i-1);

                    al1.add(al2.get(j-1)+al2.get(j));
                }
            }
            ans.add(al1);
        }
        return ans.getLast();
    }

    public static void main(String[] args) {
        System.out.println(getRow(1));
    }
}
