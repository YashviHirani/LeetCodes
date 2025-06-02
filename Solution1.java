import java.util.Scanner;
class Solution1 {
    public int[] twoSum(int[] nums, int target) {

        int [] indices = new int[2];
        boolean flag = false;
        for(int i = 0; i<nums.length; i++){
            if(!flag) {
                for (int j = 0; j < nums.length; j++) {
                    if (i!=j) {
                        if (nums[i] + nums[j] == target) {
                            indices[0] = i;
                            indices[1] = j;
                            flag = true;
                            break;
                        }
                    }
                }
            }
            else {
                break;
            }
        }
        return indices;
    }

    public static void main(String[] args) {

        int[] nums = {3,3};
        Scanner sc = new Scanner(System.in);

        System.out.println("enter target - ");
        int target = sc.nextInt();

        Solution1 s1 = new Solution1();
        int[] see = s1.twoSum(nums,target);
        for(int i = 0; i <see.length; i++){
            System.out.print(see[i]+" ");
        }
    }
}
