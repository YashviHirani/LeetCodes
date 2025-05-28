import java.util.*;
public class Solution19 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(n==0){
            return head;
        }
        if(n==size(head)){
            ListNode temp = head;
            head = head.next;
            temp = null;
            return head;
        }
        else{
            ListNode temp1 = head;
            ListNode temp2 = head;
            ListNode temp3 = head;
            int index = size(head) - n;

            for(int i = 1; i < index; i++){
                temp1 = temp1.next;
            }
            temp3 = temp1.next;
            temp2 = temp1.next.next;
            temp1.next = temp2;
            temp3 = null;
        }
        return head;
    }
    // size
    public int size(ListNode head){
        int size = 0;
        ListNode n = head;

        while (n!=null){
            n = n.next;
            ++size;
        }
        return size;
    }
}