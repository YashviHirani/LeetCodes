import java.util.List;

class Solution147 {
    public static ListNode insertionSortList(ListNode head) {

        ListNode ans = new ListNode(0);
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            ListNode prev = ans;

            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }
            current.next = prev.next;
            prev.next = current;
            current = nextNode;
            // print(ans.next);
        }

       return ans.next;

    }
    static void print(ListNode head){
        while (head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // [-1,5,2,4,3,0,-2]

        ListNode head = new ListNode(3);
        ListNode a1 = new ListNode(-1);
        ListNode a2 = new ListNode(1);
        ListNode a3 = new ListNode(8);
        ListNode a4 = new ListNode(5);
        ListNode a6 = new ListNode(-2);
        ListNode a5 = new ListNode(-4);
        head.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        print(head);
        print(insertionSortList(head));
    }
}