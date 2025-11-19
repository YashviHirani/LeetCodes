import java.util.HashSet;

public class Solution41 {
    public static int firstMissingPositive(int[] nums) {
        // 1,2,3,5
        HashSet<Integer> al1 = new HashSet<>();
        for(int i : nums){
            al1.add(i);
        }
        int i = 0;
        for(i = 1; i<=nums.length; i++){
             if(!al1.contains(i)) return i;
        }
        return i;
    }
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1,2,0}));
    }
}
