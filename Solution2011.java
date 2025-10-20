public class Solution2011 {
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String s : operations){
            if(s.equals("X++")) x++;
            else if (s.equals("++X")) ++x;
            else if(s.equals("X--")) x--;
            else --x;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"--X","X++","X++"}));
    }
}
