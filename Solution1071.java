public class Solution1071 {
    public String gcdOfStrings(String str1, String str2) {

        int size1 = str1.length();
        int size2 = str2.length();
        if(!(str1+str2).equals(str2+str1)) return "";
        return str1.substring(0,gcd(size1,size2));
    }
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
