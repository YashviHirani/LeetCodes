public class Solution3541 {
    public int maxFreqSum(String s) {

        int [] freq = new int[26];
        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        // n = 0,4 8,14,20
        int max1 = 0;
        int max2 = 0;
        for(int i = 0; i<26; i++){
            if(i==0 || i==4 || i==8 || i==14 || i==20){
                max1 = Math.max(max1,freq[i]);
            }
            else{
                max2 = Math.max(max2,freq[i]);
            }
        }
        return (max1+max2);
    }
}
