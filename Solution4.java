import javax.management.StandardEmitterMBean;
import java.util.Arrays;
import java.util.Scanner;

class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int [] solve = new int[(nums1.length+nums2.length)];
        // merging the two arrays
        for(int i = 0,j=nums1.length,k = 0; i<nums1.length || j<solve.length; i++){
                if (i < nums1.length) {
                    solve[i] = nums1[i];
                    continue;
                }
                else {
                    solve[j] = nums2[k];
                    k++;
                    j++;
                }
        }
        // sorting array with inbuilt method
        Arrays.sort(solve);
        // finding median
        if(solve.length%2!=0){
            int boo = (solve.length-1)/2;
            return solve[boo];
        }
        else {
            int boo = (solve.length-1)/2;
            double median = (solve[boo]+solve[boo+1])/2.0;
            return median;
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Solution4 s1 = new Solution4();
        int [] nums1 = {1,3};
        int [] nums2 = {2};
        System.out.println(s1.findMedianSortedArrays(nums1,nums2));

    }
}