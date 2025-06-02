import java.util.*;
class Solution125 {
    public boolean isPalindrome(String s) {

        String straw = s.trim();
        straw = straw.toLowerCase();
        System.out.println("Straw = "+straw);
        String sky = "";

        for(int i = 0; i<straw.length(); i++){
            if(((straw.charAt(i)>='a')&&(straw.charAt(i)<='z'))||((straw.charAt(i)>='0')&&(straw.charAt(i)<='9'))) sky+=straw.charAt(i);
        }
        StringBuffer sb = new StringBuffer(sky);
        sb.reverse();
        System.out.println("sky = "+sky);
        System.out.println("sb = "+sb);
        if(sky.equals(sb.toString())){
            return true;
        }
        return false;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Solution125 s1 = new Solution125();
        System.out.println("enter string - ");
        String straw = sc.nextLine();
        System.out.println(s1.isPalindrome(straw));
    }
}
