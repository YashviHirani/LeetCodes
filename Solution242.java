import java.util.Arrays;
import java.util.Scanner;

public class Solution242 {

    boolean isAnagram(String s, String t) {

        char []c1 = s.toCharArray();
        char []c2 = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        String s1 = new String(c1);
        String t1 = new String(c2);
        if(s1.equals(t1)) return true;
        else return false;
    }

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            Solution242 s1 = new Solution242();
            System.out.println();
            System.out.println(s1.isAnagram("car","rat"));
        }
}
