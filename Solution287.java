public class Solution287 {
    public int findDuplicate(int[] nums) {

        int size = nums.length-1;
        boolean [] freq = new boolean[size];
        for(int i = 0; i< size; i++){
            if(freq[i]){
                return nums[i];
            }
            else{
                freq[i] = true;
            }
        }
        return nums[size];
    }
}
