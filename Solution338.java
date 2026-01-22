class Solution338 {
    public int[] countBits(int n) {
        int size = n;
        int[] ans = new int[n+1];
        int i = 0;
        while (n > 0){
            // ans[i] = ans[i / 2] + (i % 2);
            int temp = n;
            while (temp > 0) {
                if(temp % 2 == 1)   ans[size-i]++;
                temp /= 2;
            }
            i++;
            n--;
        }
        return ans;
    }
}