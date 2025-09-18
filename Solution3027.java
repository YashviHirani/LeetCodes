public class Solution3027 {
    public int numberOfPairs(int[][] points) {
        int ans = 0;
        int size = points.length;
        for (int i = 0; i<(size-1); i++){
            for (int j = 0; j<(size-1); j++){
                if(points[j][0]>points[j+1][0] || (points[j][0]==points[j+1][0] && points[j][1]<points[j+1][1])){
                       int temp1 = points[j][0];
                       int temp2 = points[j][1];
                       // swapping x-coordinate
                       points[j][0] = points[j+1][0];
                       points[j+1][0] = temp1;
                       // swapping y-coordinate
                       points[j][1] = points[j+1][1];
                       points[j+1][1] = temp2;
                }
            }
        }
        for (int j = 0; j < size; j++) {
            int y2 = points[j][1];
            int minY = Integer.MAX_VALUE;
            for (int i = j - 1; i >= 0; i--) {
                int y1 = points[i][1];
                if (y1 >= y2 && y1 < minY) {
                    ans++;
                    minY = y1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){

        Solution3027 s1 = new Solution3027();
        System.out.println();

    }
}
