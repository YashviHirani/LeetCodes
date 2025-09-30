public class Solution121 {
    public static int maxProfit(int[] prices) {

        if(prices.length==0 || prices.length==1) return 0;
        int min = prices[0];
        int max = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            max = Math.max(max, price - min);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
