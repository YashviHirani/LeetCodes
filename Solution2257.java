import javax.print.DocFlavor;

public class Solution2257 {
    public static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {

        int [][] grid = new int[m][n];
        int ans = m*n;
        ans = ans-(guards.length+ walls.length);
        int x = 0;
        int y = 0;
        for (int[] wall : walls) {
            grid[wall[0]][wall[1]] = 2;
        }
        for (int[] guard : guards) {
            grid[guard[0]][guard[1]] = 1;
        }
//        for (int i = 0; i<grid.length; i++){
//            for (int j = 0; j< grid[i].length; j++){
//                System.out.print(grid[i][j]+" ");
//            }
//            System.out.println(" ");
//        }
        for (int[] guard : guards) {
            x = guard[0];
            y = guard[1];

            // for west direction( <---- )
            for (int i = y-1; i>=0; i--){
                if(grid[x][i]!=1 && grid[x][i]!=2 ){
                    if(grid[x][i] != 4) {
                        ans--;
                        grid[x][i] = 4;
                    }
                }
                else break;
            }
            // for east direction ( ----> )
            for (int i = y+1; i<n; i++){
                if(grid[x][i]!=1 && grid[x][i]!=2 ){
                    if(grid[x][i] != 4) {
                        ans--;
                        grid[x][i] = 4;
                    }
                }
                else break;
            }
            // up
            for (int i = x-1; i>=0; i--){
                if(grid[i][y]!=1 && grid[i][y]!=2 ){
                    if(grid[i][y] != 4) {
                        ans--;
                        grid[i][y] = 4;
                    }
                }
                else break;
            }
            for (int i = x+1; i<m; i++){
                if(grid[i][y]!=1 && grid[i][y]!=2 ){
                    if(grid[i][y] != 4) {
                        ans--;
                        grid[i][y] = 4;
                    }
                }
                else break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] guards = {
                {0, 0},
                {1, 1},
                {2, 3}
        };

        int[][] walls = {
                {0, 1},
                {2, 2},
                {1, 4}
        };
        System.out.println(countUnguarded(4,6,guards,walls));
    }
}
