import java.util.HashSet;

public class Solution3217 {
    public static ListNode modifiedList(int[] nums, ListNode head) {

        HashSet<Integer> hs1 = new HashSet<>();
        for (int i:nums) hs1.add(i);

        ListNode temp1 = head.next;
        ListNode prev = head;

        if(hs1.contains(head.val)){
            head = head.next;
            temp1 = head;
        }
        while (temp1!=null && temp1.next!=null){
            if(hs1.contains(head.val)){
                head = head.next;
                temp1 = head;
            }
            else if(hs1.contains(temp1.val)) {
                prev.next = temp1.next;
                temp1 = temp1.next;
            }
            else{
                prev = temp1;
                temp1 = temp1.next;
            }
        }
        if(temp1!=null && hs1.contains(temp1.val)) prev.next=null;
        return head;
    }
    public static int size(ListNode head){
        int ans = 0;
        while (head != null){
            ans++;
            head = head.next;
        }
        return ans;
    }
    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        System.out.println(size(a1));
        System.out.println(modifiedList(new int[]{1,2,3},a1));
    }
}