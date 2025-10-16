import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i =  0;
        int j = 0;
        HashSet<Integer> al1 = new HashSet<>();
        // -1,1,2,3,8,8,9
        // 0,3,9,8,10

        while (i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                al1.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int [] ans = new int[al1.size()];
        int m = 0;
        for (int ms : al1){
            ans[m++] = ms;
        }
        return ans;
    }
}