import java.util.Scanner;

class Solution26 {
    public int removeDuplicates(int[] nums) {

        int k = 1;
        int[] ans = new int[nums.length];
        for(int i = 1 ;i<nums.length; i++){
            if(nums[i]!=nums[k-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        // to print elements
        for(int i = 0; i<k; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        return k;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Solution26 s1 = new Solution26();
        int[] nums = {4,4,4}; // [1,2,4,5,1,4,5] --> [1,2,4,5,,,_] --> k=4
        System.out.println(s1.removeDuplicates(nums));
    }
}