class Solution3340 {
    public static boolean isBalanced(String num) {
        int sum1 = 0;
        int sum2 = 0;
        int i = 0;
        int j = 1;
        while (i < num.length()){
            sum1 += (num.charAt(i)-'0');
            i+=2;
            if(j<num.length()){
                sum2 += (num.charAt(j)-'0');
                j+=2;
            }
        }
        return sum2 == sum1;
    }

    public static void main(String[] args) {
        System.out.println( isBalanced("24123"));
    }
}