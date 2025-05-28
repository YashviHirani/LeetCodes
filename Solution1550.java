class Solution1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
        boolean ans = false;
        int count = 0;
        if(!(arr.length>=3)){
            System.out.println("There are no consecutive odds !");
            return ans;
        }
        for(int i = 0; i<arr.length; i++){

            if(arr[i]%2!=0){

                for(int j = i; j< arr.length; j+=1){

                    if(arr[j]%2!=0){
                        ++count;
                    }
                    if(arr[j]%2==0){
                        count = 0;
                    }
                    if(count==3) {
                        ans = true;
                    }
                }
                break;
            }
        }
        if(ans){
            return ans;
        }
        return ans;
    }

    public static void main(String[] args) {

        int [] arr = {1,2,1,1};
        Solution1550 S = new Solution1550();

        System.out.println(S.threeConsecutiveOdds(arr));
    }
}