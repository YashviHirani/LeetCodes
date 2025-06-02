import java.util.Scanner;
class Solution58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastIndex = s.lastIndexOf(" ");

        System.out.println(s);
        return s.length()-(lastIndex+1);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Solution58 s1 = new Solution58();
        System.out.println("enter string - ");
        String s = sc.nextLine();
        System.out.println(s1.lengthOfLastWord(s));
    }
}