import java.util.Arrays;
import java.util.HashSet;

public class Solution2442 {
    public static int countDistinctIntegers(int[] nums) {

        HashSet<Integer> hs1 = new HashSet<>();
        for (int j : nums) {
            hs1.add(j);
            hs1.add(reverse(j));
        }
        return hs1.size();
    }
    static int reverse(int num){
        int rev = 0;
            while (num > 0) {
                rev = (num % 10) + rev * 10;
                num /= 10;
            }
        return rev;
    }
    //        StringBuilder rev;
//        for (int num : nums) {
//            hs1.add(num);
//            rev = new StringBuilder();
//            rev.append(num);
//            rev.reverse();
//            hs1.add(Integer.parseInt(rev.toString()));
//        }
    public static void main(String[] args) {
        System.out.println(countDistinctIntegers(new int[]{1,13,10,12,31}));
    }
}
