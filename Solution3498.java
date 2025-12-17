public class Solution3498 {
    public static int reverseDegree(String s) {

        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            sum += ((26-(s.charAt(i)-'a'))*(i+1));
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(reverseDegree("abc"));
    }
}
