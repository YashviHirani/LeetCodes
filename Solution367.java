public class Solution367 {
    public boolean isPerfectSquare(int num) {
        long low = 0;
        long high = num;
        long mid = 0;
        long squareRoot = 0;
        while (low<=high){
            mid = (low+high)/2;
            squareRoot = mid*mid;
            if(squareRoot==num){
                return true;
            }
            else if(squareRoot<num){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
}
