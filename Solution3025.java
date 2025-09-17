public class Solution3025 {

    public int numberOfPairs(int[][] points) {
    int ans = 0;
     for (int i = 0; i< points.length; i++){
         for (int j = 0; j< points.length; j++){
            boolean fix = false;
             if(i!=j) {
                 if (points[i][0] <= points[j][0] && points[i][1] >= points[j][1]) {
                     for (int k = 0; k < points.length; k++) {
                         fix = true;
                         if (i == k || j == k) continue;
                         if (points[k][0] >= points[i][0] && points[k][0] <= points[j][0] && points[k][1] <= points[i][1] && points[k][1] >= points[j][1]) {
                             fix = false;
                             break;
                         }
                     }
                 }
                 if (fix) ans++;
             }
         }
     }
     return ans;
    }
    public static void main(String[] args){

        Solution3025 s1 = new Solution3025();
        int [][] points = {{3,1},{1,3},{1,1}};
        System.out.println(s1.numberOfPairs(points));

    }
}
