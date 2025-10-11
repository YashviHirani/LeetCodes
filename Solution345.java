class Solution345 {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length()-1;
        String vowel = "AEIOUaeiou";
        char leftC ;
        char rightC ;
        StringBuilder temp = new StringBuilder();
        while (left < right){
            leftC = s.charAt(left);
            rightC = s.charAt(right);
            if(vowel.indexOf(leftC) == -1 ) left++;
            if(vowel.indexOf(rightC) == -1 ) right--;
            if((vowel.indexOf(leftC) != -1 && vowel.indexOf(rightC) != -1) ) {
                temp.append(s, 0, left).append(rightC).append(s, left + 1, right).append(leftC).append(s.substring(right + 1));
                left++;
                right--;
                s = temp.toString();
                temp.delete(0,temp.length());
            }
        }
        return s;
    }
}