class Solution382 {
    ListNode head;
    public Solution382(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        // 1-2-3
        int n = size(head);
        int random = (int)((Math.random())*(Math.pow(10,4)))%n;
        ListNode temp = head;
        while((random--)>0){
            temp = temp.next;
        }
        return temp.val;
    }
    public int size(ListNode head){
        int i = 1;
        ListNode temp = head;
        while (temp.next!=null){
            temp = temp.next;
            i++;
        }
        return i;
    }
}
