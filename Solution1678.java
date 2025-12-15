public class Solution1678 {
    public static String interpret(String command) {

        int size = command.length()-2;
        int i = 0;
        StringBuilder ans = new StringBuilder();
        while(i<=size) {
            if (command.charAt(i) == 'G'){
                ans.append('G');
                i++;
            }
            else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                ans.append('o');
                i+=2;
            } else {
                ans.append("al");
                i+=4;
            }
        }
        if (i<=size+1 && command.charAt(i) == 'G') ans.append('G');
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(interpret("(al)G(al)()()G"));
    }
}
