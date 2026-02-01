import java.util.Arrays;
import java.util.Scanner;

class Solution2682 {

    public int[] circularGameLosers(int n, int k) {

        int [] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = (i+1);
        }
        int j = 0;
        int count = 0;
        for(int i = 0;  ; i += (++j)*k){
            if(nums[(i)%n]==0){
                break;
            }
            else{
                nums[i%n] = 0;
                count++;
            }
        }
        int [] ans = new int[n-count];
        int y = 0;
        for(int i = 0; i<n; i++){
            if(nums[i]!=0){
                ans[y++] = nums[i];
            }
        }
        return ans;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Solution2682 s1 = new Solution2682();
        int [] see = s1.circularGameLosers(4,4);
        System.out.println(Arrays.toString(see));
    }
}