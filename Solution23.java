import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        ListNode head;
        for (ListNode list : lists) {
            head = list;
            while (head != null) {
                pq.add(head.val);
                head = head.next;
            }
        }
        ListNode ans;
        ListNode temp;
        if(!pq.isEmpty()){
            ans = new ListNode(pq.remove());
            while (!pq.isEmpty()){
                temp =new ListNode(pq.remove());
                temp.next = ans;
                ans = temp;
            }
            return ans;
        }else {
            return null;
        }
    }
}