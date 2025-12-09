public class Solution2079 {
    public static int wateringPlants(int[] plants, int capacity) {
        int steps = 0;
        int actualCapacity = capacity;
        for(int i = 0; i<plants.length; i++){
                steps++;
            if(capacity<plants[i]){
                capacity = actualCapacity;
                steps+=(2*i);
            }
                capacity -=plants[i];
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(wateringPlants(new int[]{2,2,3,3},5));
    }
}
