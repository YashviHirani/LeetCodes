import java.util.Arrays;

public class Solution2149{
    public static int[] rearrangeArray(int[] nums) {

        int i = 0;
        int j = 1;
        int size = nums.length;
        int[] ans = new int[size];
        for(int n : nums){
            if(n>0){
                ans[i] = n;
                i+=2;
            }
            else{
                ans[j] = n;
                j+=2;
            }
        }
        return ans;
    }
    //        while(i<size && j<size){
//
//            if(nums[i]<0 && nums[j]>0){
//                nums[i] = nums[j] + nums[i] - (nums[j]=nums[i]);
//                i+=2;
//                j+=2;
//            }
//            else if(nums[i]>0) i+=2;
//            else if(nums[j]<0) j+=2;
//        }
//        return nums;
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangeArray(new int[]{28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31})));
        // System.out.println(Arrays.toString(rearrangeArray(new int[]{3,1,-2,-5,2,-4})));
    }
}
