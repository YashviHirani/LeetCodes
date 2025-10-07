import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution118 {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i<numRows; i++){
            ArrayList<Integer> al1 = new ArrayList<>();
            List<Integer> al2 = ans.get(i-1);
            for (int j = 0; j<=i; j++){
                if(j==0 || j==i) al1.add(1);
                else{
                    al1.add(al2.get(j-1)+al2.get(j));
                }
            }
            ans.add(al1);
        }
        return ans;
        /// will try nCr approach too
       /* List<List<Integer>> ans = new ArrayList<>();

        if(numRows==1){
            ans.add(new ArrayList<>(List.of(1)));
            return ans;
        } else if (numRows==2) {
            ans.add(new ArrayList<>(List.of(1)));
            ans.add(new ArrayList<>(List.of(1,1)));
            return ans;
        }
        ans.add(new ArrayList<>(List.of(1)));
        ans.add(new ArrayList<>(List.of(1,1)));
        List<Integer> temp = new ArrayList<>(List.of(1,1));
        System.out.println(temp);
        List<Integer> dummy = new ArrayList<>();
        int sum = 0;
        while ((numRows--)>2){
            for (int i = 0; i<temp.size(); i++){
                if(i==0){
                    dummy.add(1);
                }
                if(i==(ans.size()-1)){
                    dummy.add(1);
                    continue;
                }
                sum = temp.get(i)+temp.get(i+1);
                dummy.add(sum);
            }
            temp.removeAll(temp);
            temp.addAll(dummy);
            ArrayList<Integer> al1 = new ArrayList<>(temp);
            ans.add(al1);
            dummy.removeAll(dummy);
        }
        return ans;

        */
    }
    public static void main(String[] args) {
        System.out.println(generate(7));
    }
}
