public class Solution3751 {
    public int totalWaviness(int num1, int num2) {

        int ans = 0;
        char [] ch;
        for(int i = num1; i<=num2; i++){

            ch = (i+"").toCharArray();
            if(ch.length>=3) {
                for (int j = 1; j < ch.length - 1; j++) {

                    if((ch[j-1]<ch[j] && ch[j]>ch[j+1]) || (ch[j-1]>ch[j] && ch[j]<ch[j+1])) ans++;
                }
            }
        }
        return ans;
    }
}
