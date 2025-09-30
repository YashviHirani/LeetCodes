import java.util.Arrays;
import java.util.Scanner;

public class Solution27 {
    public static int removeElement(int[] nums, int val) {

        // 3,2,2,3
        int i = 0;
        int k = 0;
        for(int j = 0; j<nums.length;j++){
            if(nums[j]!=val){
                nums[i] = nums[j];
                i++;
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args){
        System.out.println(removeElement(new int[]{3,2,3,5,2,3},3));
        //                                         i
        //                                           j
    }
}
