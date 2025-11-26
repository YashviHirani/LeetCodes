import java.util.HashMap;

public class Solution904 {
    public int totalFruit(int[] fruits) {

        int max = 0;
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        int left = 0;

        for(int i = 0; i<fruits.length; i++){
            hm1.put(fruits[i],hm1.getOrDefault((fruits[i]),0)+1);
            while(hm1.size()>2){
                hm1.put(fruits[left],hm1.get(fruits[left])-1);
                if (hm1.get(fruits[left])==0) hm1.remove(fruits[left]);
                left++;
            }
            max=Math.max(max,i-left);
        }
        return max;
    }
}
