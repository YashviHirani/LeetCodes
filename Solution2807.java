public class Solution2807 {
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode currentNode = head;
        ListNode nextNode;
        if(head.next!=null) nextNode = head.next;
        else return head;

        while(nextNode!=null){
            ListNode temp = new ListNode(greatestCommonDivisor(currentNode.val, nextNode.val));
            currentNode.next = temp;
            temp.next = nextNode;
            currentNode = nextNode;
            nextNode = nextNode.next;
        }
        return head;
    }
    int greatestCommonDivisor(int a, int b){
        int temp;
        while (b!=0){
            temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {

        // System.out.println(greatestCommonDivisor(40,1));
    }
}
