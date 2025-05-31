import java.util.*;
class Solution17 {
    public List<String> letterCombinations(String digits) {

        ArrayList<String> al1 = new ArrayList<>();

        String[] two = {"2","a","b","c"};
        String[] three = {"3","d","e","f"};
        String[] four = {"4","g","h","i"};
        String[] five = {"5","j","k","l"};
        String[] six = {"6","m","n","o"};
        String[] seven = {"7","p","q","r","s"};
        String[] eight = {"8","t","u","v"};
        String[] nine = {"9","w","x","y","z"};

        String [][] numbers = {two,three,four,five,six,seven,eight,nine};

        for(int i = 0; i<digits.length(); i++){
            for(int j = 0; j<digits.length(); j++){
                String see = ""+digits.charAt(i);
                if(see.equals(numbers[j][0])){
                    dialNumber(j,numbers);
                }
            }
        }
        return al1;
    }

    void dialNumber(int j, String[][] numbers){
        // numbers[0][]
        for(int i = 0; i<numbers.length; i++){
           for(int k = 0; k<numbers[0].length; k++){


           }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution17 s1 = new Solution17();
        System.out.println("enter number - ");
        String num = sc.nextLine();
        s1.letterCombinations(num);

    }
}