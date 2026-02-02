import java.util.*;

public class Solution636 {
    public static int[] exclusiveTime(int n, List<String> logs) {

        Stack<String[]> st1 = new Stack<>();
        int[]ans = new int[n];
        String [] split1;
        int prevTime = 0;
        int currentTime = 0;
        int id = 0;
        for(String s1 : logs){
            split1 = s1.split(":");
            currentTime = Integer.parseInt(split1[2]);
            id = Integer.parseInt(split1[0]);

            if(Objects.equals(split1[1], "start")){
               if(!st1.isEmpty()){
                ans[Integer.parseInt(st1.peek()[0])] += currentTime - prevTime;
               }
                prevTime = currentTime;
                st1.push(split1);
            }
            else{
                ans[id] += currentTime - prevTime+1;
                prevTime = currentTime+1;
                st1.pop();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(exclusiveTime(2,new ArrayList<>(Arrays.asList(new String[]{"0:start:0","1:start:2","1:end:5","0:end:6"})))));
    }
}
