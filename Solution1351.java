class Solution1351 {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int [] arr : grid){
            count += floorInSortedArray(arr);
        }
        return count;
    }
    int floorInSortedArray(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int mid ;
        while (low<=high){
            mid = (low+high)/2;
            if(arr[mid]<0){
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return arr.length-low;
    }

}