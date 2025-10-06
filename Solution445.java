import javax.swing.*;
import java.util.Stack;

public class Solution445 {
       public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        ListNode ans = null;
        int carry = 0;
        while(temp1!=null){
            stack1.push(temp1);
            temp1 = temp1.next;
        }
        while(temp2!=null){
            stack2.push(temp2);
            temp2 = temp2.next;
        }
        int sum = 0;
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            sum = carry;
            if(!stack1.isEmpty()) sum+=stack1.pop().val;
            if(!stack2.isEmpty()) sum+=stack2.pop().val;
            carry = sum/10;
            sum = sum%10;
            ListNode temp = new ListNode(sum);
            temp.next = ans;
            ans = temp;
        }
        if(carry>0){
            ListNode temp = new ListNode(carry);
            temp.next = ans;
            ans = temp;
        }
        return ans;
    }
}
