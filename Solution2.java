import java.util.*;
public class Solution2 {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    ListNode head;
    String sum1 = "";
    String sum2 = "";
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        reverseAdd(l1,sum1,1);
        reverseAdd(l2,sum2,2);
        int s1 = Integer.parseInt(sum1);  // l2 -> 19  --> 91
        int s2 = Integer.parseInt(sum2);  // l1 -> 199 --> 991
        int ans = s1+s2;                  // l3 --> 2801
        // a = 1
        // sum = 
        String Ans = ""+ans;
        String ANS = "";
        for(int i = Ans.length()-1; i>=0; i--){
            ANS += Ans.charAt(i);
        }
        System.out.println(ANS);
        for(int i = 0; i<Ans.length(); i++){
            String see = ""+ANS.charAt(i);
            int s3 = Integer.parseInt(see);
            insertAtEnd(s3);
        }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(head.val);
        display();
        return head;
    }

    void reverseAdd(ListNode temp,String sum,int i){
        if(temp==null){
            return;
        }
        else{
            reverseAdd(temp.next,sum,i);
            if(i==1){
                sum+=temp.val;
            }
            if(i==2){
                sum+=temp.val;
            }
        }
    }
    // 2. insert at end
    void insertAtEnd(int data){
        ListNode temp1 = new ListNode(data);
        ListNode temp2 = head;
        if(head==null){
            head = temp1;
            return;
        }
        else{
            while(temp2.next!=null){
                temp2 = temp2.next;
            }
            temp2.next = temp1;
        }
    }
    // 17. normal display
    void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {

        // list 1
        Solution2 s1 = new Solution2();
        s1.insertAtEnd(9);

        System.out.print("list 1 : ");
        s1.display();
        // list 2
        Solution2 s2 = new Solution2();
        s2.insertAtEnd(1);
        s2.insertAtEnd(9);
        s2.insertAtEnd(9);
        s2.insertAtEnd(9);
        s2.insertAtEnd(9);
        s2.insertAtEnd(9);
        s2.insertAtEnd(9);
        s2.insertAtEnd(9);
        s2.insertAtEnd(9);
        s2.insertAtEnd(9);

        System.out.print("list 2 : ");
        s2.display();
        Solution2 s3 = new Solution2();
        s3.addTwoNumbers(s1.head, s2.head);
    }
}