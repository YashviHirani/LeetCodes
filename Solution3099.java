public class Solution3099 {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int dSum = 0;
        int temp = x;
        while (temp > 0){
            dSum += temp % 10;
            temp /= 10;
        }
        return (x%dSum==0) ? dSum:-1;
    }
}
