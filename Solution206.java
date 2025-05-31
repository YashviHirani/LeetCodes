import java.util.*;
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode head2 = null;
        while(head!=null) {

            ListNode newNode = head.next;
            head.next = head2;
            head2 = head;
            head = newNode;
        }
        return head2;
    }
}