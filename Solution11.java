public class Solution11 {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0 ;
        int currentArea = 0 ;
        int currentHeight = 0;
        while (left<right){

            currentHeight = Math.min(height[left],height[right]);
            currentArea = (right-left)*currentHeight;
            maxArea = Math.max(maxArea,currentArea);

            if(height[left]<height[right]) left++;
            else right--;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,2,1}));
    }
}
