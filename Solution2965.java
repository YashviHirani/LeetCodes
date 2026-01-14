class Solution2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int []ans = new int[2];
        boolean []a = new boolean[n*n];
        int sum = 0;

        for(int arr[] : grid){
            for(int num : arr){
                if(!a[num-1]){
                    a[num-1] = true;
                }else {
                    ans[0] = num;
                }
                sum += num;
            }
        }
        ans[1] = (n*n)*((n*n)+1)/2 - sum + ans[0];
        return ans;
    }
}