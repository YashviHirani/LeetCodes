public class Solution2161 {
    public static int[] pivotArray(int[] nums, int pivot) {

        int[] ans = new int[nums.length];

        // for elements  less than pivot
        int j = 0;
        int count = 0;
        for(int i : nums){
            if(i<pivot) ans[j++] = i;
            else if (i==pivot) count++;
        }
        // for adding pivot occurence more than 1
        while (count>0){
            ans[j++] = pivot;
            count--;
        }
        // for elements more than pivot
        for(int i : nums){
            if(i>pivot) ans[j++] = i;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(pivotArray(new int[]{9,12,5,10,14,3,10},10));
    }
}
