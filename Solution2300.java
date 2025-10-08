import java.util.Arrays;

public class Solution2300 {
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {

        Arrays.sort(potions);
        int left ;
        int right ;
        int mid;
        int size1 = spells.length;
        int size2 = potions.length;
        int [] ans = new int[size1];
        for (int i = 0; i<size1; i++){
            left = 0;
            right = size2 - 1;
            while (left<=right){
                mid = (left+right)/2;
                if(((long) potions[mid] * spells[i]) < success){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
            if(ans[i]==0) ans[i] = size2-left;
        }
        return ans;
    }
}
