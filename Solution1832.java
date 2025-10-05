class Solution1832 {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        boolean [] fix = new boolean[26];
        sentence = sentence.toLowerCase();
        for(int i = 0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                fix[(ch -'a')] = true;
            }
        }
        for (boolean b : fix) {
            if (!b) return false;
        }
        return true;
        /* 0 ms code :--
        if(sentence.length()<26) return false;
        for(char ch='a';ch<='z';ch++){
            if(sentence.indexOf(ch)<0){
                return false;
            }
         }
        return true;
         */
    }
}