import java.util.Map;

public class Solution2529 {
    public int maximumCount(int[] nums) {
        return Math.max(floorInSortedArray(nums,0),(nums.length - floorInSortedArray(nums,1)));
    }
   int floorInSortedArray(int[] arr,int x) {
        int low = 0;
        int high = arr.length;
        int mid = 0;
        while (low<high){
            mid = (low+high)/2;
            if(arr[mid]<x){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
}
