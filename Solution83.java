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
    void display(ListNode head){
        ListNode temp = head;
        while(temp.next!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Solution83 s1 = new Solution83();

        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(1);
        ListNode a3 = new ListNode(2);
        ListNode a4 = new ListNode(3);
        ListNode a5 = new ListNode(3);
        ListNode a6 = new ListNode(4);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;

        ListNode t  = s1.deleteDuplicates(a1);
        System.out.println("t = "+t.val);
    }
}