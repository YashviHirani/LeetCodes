import java.util.Arrays;

public class Solution274 {
    public int hIndex(int[] citations){

        Arrays.sort(citations);
        int ans = 0;
        int size = citations.length;;
        for(int i= size-1; i>=0; i--){
            if(citations[i]>=size-i) ans++;
        }
        return ans;
    }
}
