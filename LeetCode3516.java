import java.util.Scanner;

public class LeetCode3516 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter x - ");
        int x = sc.nextInt();
        System.out.print("enter y - ");
        int y = sc.nextInt();
        System.out.print("enter z - ");
        int z = sc.nextInt();

        Solution c1 = new Solution();
        System.out.println( c1.findClosest(x,y,z));
    }
}
class Solution {

    public int findClosest(int x, int y, int z){

        if(Math.abs((x-z))>Math.abs((y-z))){
            return 2;
        }
        else if(Math.abs((x-z))<Math.abs((y-z))){
            return 1;
        }
        else{
            return 0;
        }
    }
}
