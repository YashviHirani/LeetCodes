import java.util.Arrays;

class NumArray {

    int[] nums1;
    public NumArray(int[] nums) {
        nums1 = new int[nums.length];
        nums1[0] = nums[0];
        for(int i = 1; i<nums.length; i++){
            nums1[i] = nums1[i-1]+nums[i];
        }
    }
    public int sumRange(int left, int right) {
        if(left==0) return nums1[right];
        return nums1[right]-nums1[left-1];
    }

    public static void main(String[] args) {
        NumArray n1 = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(Arrays.toString(n1.nums1));
        System.out.println(n1.sumRange(2,5));
    }
}