public class Solution191 {

    public int hammingWeight(int n) {

        int count = 0;
        while (n!=0){
            count++;
            n = n & (n-1);
        }
        return count;
    }

    public static void main(String[] args){

        Solution191 s1 = new Solution191();
        System.out.println(s1.hammingWeight(128));
    }
}
