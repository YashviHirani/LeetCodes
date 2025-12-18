public class Solution2000 {
    public String reversePrefix(String word, char ch) {

        StringBuilder rev = new StringBuilder();
        int index = 0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)==ch){
                rev.append(ch);
                index = i;
                break;
            }
            rev.append(word.charAt(i));
        }
        if(index==0) return word;
        else{
            rev.reverse();
            word = rev + word.substring(index+1);
            return word;
        }
    }
}
