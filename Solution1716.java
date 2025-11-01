public class Solution1716 {
    public int totalMoney(int n) {

        int fix = 0;
        int day = 1;
        int coin = 0;
        for (int i = 1; i <= n; i++) {

            // Add the correct amount: Day of the week + Base for the week
            coin += (day + fix);

            // End of the week check (Day 7)
            if (day == 7) {
                fix += 1; // Increase the base amount for the next week
                day = 1;  // Reset day to 1 for the start of the next week
            } else {
                day += 1; // Just increment the day
            }
        }
        return coin;
    }
}
