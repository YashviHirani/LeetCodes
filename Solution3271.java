public class Solution3271 {
    public static String stringHash(String s, int k) {
            int sum =0;
            int count = 0;
            StringBuilder ans = new StringBuilder();
        for(int i = 0; i<s.length(); i+=k){
            sum += (s.charAt(i)-'a');
            count++;
            if(count==k){
                count = 0;
                ans.append((char) (sum % 26 + 'a'));
                sum = 0;
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(stringHash("abcd",2));
    }
}
