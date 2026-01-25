class Solution2710 {
    public String removeTrailingZeros(String num) {
        int tZero = num.length() - 1;
        while (num.charAt(tZero)=='0'){
            tZero--;
        }
        return num.substring(0,tZero+1);
    }
}