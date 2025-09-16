public class Solution604 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int size = flowerbed.length;
        if(size==1 && flowerbed[0]==0) return true;
        else if(size==1 && flowerbed[0]==1 && n==0) return true;
        if(flowerbed[0] == 0 && size > 2 && flowerbed[1]==0){
            n--;
            flowerbed[0] = 1;
        }
        else if(flowerbed[0] == 0 && size == 2 && flowerbed[1]==0 && n==1){
            return true;
        }
        else if(flowerbed[size-1] == 0 && size > 2 && flowerbed[size-2]==0){
            n--;
            flowerbed[size-1] = 1;
        }
        // 1,0,0,0,0,0,1
        int temp = n;
        while(n>0) {
            for (int i = 1; i < (size - 1); i++) {
                if(n==0){
                    return  true;
                }
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
            temp--;
            if(temp != n){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // 1,0,0,0,0,0,1
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1,0,0,0,0,0}, 3));
    }
}
