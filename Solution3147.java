public class Solution3147 {
    public static int maximumEnergy(int[] energy, int k) {

        int max = Integer.MIN_VALUE;
        int size = energy.length;
        int[] ans = new int[size];

        for (int i = size-1; i>=0; i--){
            ans[i] = energy[i];
            if((i+k)<size){
                ans[i] += ans[i+k];
            }
            max = Math.max(ans[i],max);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maximumEnergy(new int[]{5,-10,4,3,5,-9,9,-7},2));
    }
}
