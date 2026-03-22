import java.util.Stack;

public class Solution2487 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNodes(ListNode head) {

        ListNode temp = head;
        Stack<ListNode> st1 = new Stack<>();
        ListNode store;

        while(temp!=null){
            st1.push(temp);
            temp = temp.next;
        }
        while(!st1.isEmpty()){
            store = st1.pop();
            if(temp==null) temp = store;
            else {
                if(temp.val<=store.val){
                    store.next = temp;
                    temp = store;
                }
            }
        }
        return temp;
    }
}
