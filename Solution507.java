class Solution507{
    public static boolean checkPerfectNumber(int num) {
        return (num==6 || num==28 || num==496 || num==8128 || num==33550336);
        /**
         int sum = 0;
         for (int i = 1 ; i < (num/2+1) ; i++) {
         if (num % i == 0) sum += i;
         }
         return sum == num;
         */
    }
    public static void main(String[] args) {
        for(int i = 0 ; i < 1000000000 ; i++){
            if(checkPerfectNumber(i)){
                System.out.print(i + " ");
            }
        }
    }
}