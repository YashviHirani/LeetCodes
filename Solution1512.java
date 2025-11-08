public class Solution1512 {
    public int numIdenticalPairs(int[] nums) {

        int i = 0;
        int j = 0;

        int count = 0;
        while(i<nums.length){
            j = i+1;
            while (j<nums.length){
                if(i<j && nums[i]==nums[j]) count++;
                j++;
            }
            i++;
        }
        return count;
    }
}
