public class Solution3280 {
    public String convertDateToBinary(String date) {

        String[] ans = date.split("-");
        StringBuilder ans1 = new StringBuilder();
        for (String s : ans){
            ans1.append(Integer.toBinaryString(Integer.parseInt(s))).append("-");
        }
        return ans1.deleteCharAt(ans1.length()-1).toString();
    }
}
