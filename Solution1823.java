import java.util.ArrayList;

public class Solution1823 {
        public static int findTheWinner(int n, int k) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 1 ; i <= n ; i++){
                arrayList.add(i);
            }
            int i = 0;
            while (arrayList.size()>1){
                i = (i+k-1)%arrayList.size();
                arrayList.remove(i);
            }
            return arrayList.removeFirst();
        }

    public static void main(String[] args) {
        System.out.println(findTheWinner(5,2));
    }
}
