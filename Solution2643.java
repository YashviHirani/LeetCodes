public class Solution2643 {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] max = new int[2];
        int temp = 0;
        for(int i = 0; i < mat.length ; i++){
            for(int j = 0; j < mat[0].length ;j++){
                if(mat[i][j]==1)    temp++;
            }
            if(max[1] < temp){
                max[0] = i;
                max[1] = temp;
            }
            temp = 0;
        }
        return max;
    }
}
