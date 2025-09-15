import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {

        if(head==null){
            System.out.println("empty list");
            return null;
        }
        ListNode temp = head;
        ListNode tempF = head.next;
        while((tempF!=null)){

            if(temp.val==tempF.val){

                temp.next = tempF.next;
                tempF = tempF.next;
                continue;
            }
            temp = temp.next;
        }
        display(head);
        return head;
    }
}
