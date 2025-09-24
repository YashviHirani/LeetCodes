public class Solution441 {
    public static int arrangeCoins(int n) {

        if(n==1 || n==2) return 1;
        long low = 0;
        long high = n;
        long mid;
        long range = 0;
        while (low<=high){
            mid = (low+high)/2;
            range = (mid*(mid+1))/2;
            if(range==n) return (int)mid;
            if(range<n){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return (int)high;
    }
    public static void main(String[] args) {
        System.out.println(arrangeCoins(1804289383));
    }
}
