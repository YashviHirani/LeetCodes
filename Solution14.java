public class Solution14 {
    public static String longestCommonPrefix(String[] strs) {

        StringBuilder prefix = new StringBuilder();
            int i = 0 ;
            int j = 0;
        for (int k = 0; k<strs.length-1; k++){
            if(!strs[k+1].startsWith(strs[k])) {
                while (i < strs[k].length() && j < strs[k + 1].length() && strs[k].charAt(i) == strs[k + 1].charAt(j)) {
                    prefix.append(strs[k].charAt(i));
                    i++;
                    j++;
                }
                strs[k + 1] = prefix.toString();
                prefix = new StringBuilder();
                i = 0;
                j = 0;
            }
            else strs[k+1] = strs[k];
        }
        return strs[strs.length-1];
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"interview", "internet", "integer", "internship", "interesting"}));
    }
}
