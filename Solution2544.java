public class Solution2544 {
    public int alternateDigitSum(int n) {

        int temp = n;
        int size = 0;
        while (temp > 0){
            temp /= 10;
            size++;
        }
        int sum = 0;
        int sign;
        if(size % 2 == 0)   sign = -1;
        else sign = 1;

        while (n > 0) {
            int remainder = (n % 10);
            sum += remainder * sign;
            sign *= -1;
            n /= 10;
        }
        return sum;
    }
}
