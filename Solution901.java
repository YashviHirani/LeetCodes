import java.util.Stack;

class StockSpanner {
Stack<int[]> st1;
    public StockSpanner() {
     st1 = new Stack<>();
    }

    public int next(int price) {
       int span = 1;
       while(!st1.isEmpty() && st1.peek()[0]<=price){
           span += st1.pop()[1];
       }
       st1.push(new int[]{price,span});
       return span;
    }

    public static void main(String[] args) {
        //  32 82 73 99 91
        //  1   2  1  4  1
        StockSpanner sp1 = new StockSpanner();
        System.out.println(sp1.next(32));
        System.out.println(sp1.next(82));
        System.out.println(sp1.next(73));
        System.out.println(sp1.next(99));
        System.out.println(sp1.next(91));
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */