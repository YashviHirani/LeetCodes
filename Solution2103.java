public class Solution2103 {
    public static int countPoints(String rings) {

        boolean[] red = new boolean[10];
        boolean[] blue = new boolean[10];
        boolean[] green = new boolean[10];
        char ch;
        int digit;

        for(int i = 1; i<rings.length(); i+=2){
            ch = rings.charAt(i-1);
            digit = rings.charAt(i)-'0';
            if(ch=='R'){
                red[digit] = true;
            } else if (ch=='B') {
                blue[digit] = true;
            }
            else{
                green[digit] = true;
            }
        }
        int ans = 0;
        for(int i = 0; i<10; i++){
            if(red[i] && blue[i] && green[i]) ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countPoints("B0B6G0R6R0R6G9"));
    }
}
