public class Solution2269 {
    public static int divisorSubstrings(int num, int k) {

        String n = num+"";
        int temp = 0;
        int ans = 0;
        for (int i = 0; i<n.length()-k+1; i++){
            temp = Integer.parseInt(n.substring(i,i+k));
            if(temp>0 && num%temp==0) ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(divisorSubstrings(430043,2));
    }
}
