import java.awt.*;
import java.util.*;

public class Solution2545 {
    public int[][] sortTheStudents(int[][] score, int k) {

//        HashMap<Integer,int[]> hm1 = new HashMap<>();
//
//        for (int[] ints : score) {
//            hm1.put(ints[k], ints);
//        }
//        ArrayList<Integer> al1 = new ArrayList<>(hm1.keySet());
//        al1.sort(Collections.reverseOrder());
//        int i = 0;
//        for(int j : al1){
//            score[i++] = hm1.get(j);
//        }
//        return score;
        mergeSortRecursion(score,k,0, score.length-1);
        return score;
    }
    void mergeSortRecursion(int[][] score,int k,int left, int high){
        if(left<high){
            int mid = (left+high)/2;

            mergeSortRecursion(score,k,left,mid);
            mergeSortRecursion(score,k,mid+1,high);
            merge(score,k,left,mid,high);
        }
    }
    void merge(int[][] score,int k1, int left, int mid ,int high){

        int i = left;
        int k = 0;
        int j = mid+1;
        int[][] ans = new int[high-left+1][];

        while (i<=mid && j<=high){
            if(score[i][k1]>=score[j][k1]){
                ans[k++] = score[i++];
            }
            else {
                ans[k++] = score[j++];
            }
        }
        while(i<=mid){
            ans[k++] = score[i++];
        }
        while(j<=high){
            ans[k++] = score[j++];
        }
        for(i = 0; i< ans.length; i++){
            score[left+i] = ans[i];
        }
    }
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                {10,6,9,1},
                {7,5,11,2},
                {4,8,3,15}
        };
     //   arr = sortTheStudents(arr,2);

    }
}
