public class Solution2181 {
    public ListNode mergeNodes(ListNode head) {

        if(head==null) return head;
        ListNode ans = null;
        ListNode ans1 = ans;
        ListNode temp = head.next;
        int sum = 0;
        while(temp!=null){
            if(temp.val!=0){
                sum += temp.val;
            }
            else{
                if(ans==null){
                    ans = new ListNode(sum);
                    ans1 = ans;
                }
                else{
                    ans.next = new ListNode(sum);
                    ans = ans.next;
                }
                sum = 0;
            }
            temp = temp.next;
        }
        return ans1;
    }
}
