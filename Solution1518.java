public class Solution1518 {
    public static int numWaterBottles(int numBottles, int numExchange) {

        int ans = 0;
        int emptyBottles = 0;

        while (numBottles>0 && numExchange>emptyBottles){
            ans += numBottles;  //26
            emptyBottles += (numBottles%numExchange);
            numBottles /= numExchange;
            if(emptyBottles>=numExchange) {
                ans += (emptyBottles = (emptyBottles / numExchange));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(numWaterBottles(26,7));
    }
}
