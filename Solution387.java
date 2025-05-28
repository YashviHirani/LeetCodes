class Solution387 {
    public int firstUniqChar(String s) {

        boolean check = false;

        for(int i = 0; i<s.length(); i++){
            for(int j = 0; j<s.length(); j++) {

                if(i!=j){
                    if (s.charAt(i) == s.charAt(j)) {
                        check = true;
                        break;
                    }
                }
            }
            if(!check){
                return i;
            }
            else{
                check = false;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Solution387 s = new Solution387();
        System.out.println( s.firstUniqChar("leetcode"));
    }
}