public class Solution319 {
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
    }
    /* Code to check pattern :-
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] a = new int[n];
        for(int i = 1 ; i <= n ;i++){
            for(int j = 1 ; j <= n ;j++){
                if(j % i == 0){
                    if(a[j-1]==0){
                        a[j-1] = 1;
                        System.out.print(" 1 ");
                    }else {
                        a[j-1] = 0;
                        System.out.print(" 0 ");
                    }
                }else {
                    if(a[j-1]==0){
                        System.out.print(" 0 ");
                    }else {
                        System.out.print(" 1 ");
                    }
                }
            }
            System.out.println();
        }
    }
     */
}
