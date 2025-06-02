//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
public class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if((list1==null)&&(list2==null)){
            return list1;
        }
        if(((list1==null)&&(list2.next==null))){
            return list2;
        }
        if(((list2==null)&&(list1.next==null))){
            return list1;
        }

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while(temp1!=null && temp2!=null){
            if(temp2.val>temp1.val){
                ListNode see = temp1;
                temp1.val = temp2.val;
                temp2.val = see.val;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return list1;
    }
}