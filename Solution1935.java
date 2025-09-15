import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class Solution1935 {
    public static int canBeTypedWords(String text, String brokenLetters) {

        ArrayList<String> al1 = new ArrayList<>(Arrays.asList(text.split(" ")));
        String compare = "";
        for (int i = 0; i<al1.size(); i++){
            compare = al1.get(i);
            for (int j = 0; j<brokenLetters.length();j++){
                if(compare.indexOf(brokenLetters.charAt(j))!=-1) {
                    al1.remove(i--);
                    break;
                }
            }
        }
        return al1.size();
    }
    public static void main(String[] args) {

        System.out.println(canBeTypedWords("hallo world universe","ad"));
    }
}
