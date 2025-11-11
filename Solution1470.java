import java.util.Arrays;

public class Solution1470 {
    public static int[] shuffle(int[] nums, int n) {

        int i = 0;
        int j = n;
        int k = 0;
        int[] numNum = new int[nums.length];
        while((n--)>0){
            numNum[k] = nums[i++];
            numNum[++k] = nums[j++];
            k++;
        }
        return numNum;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{2,5,1,3,4,7},3)));
    }
}
