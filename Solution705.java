class MyHashSet {

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    final int SIZE = 1000;
    ListNode[] bucket;
    public MyHashSet() {
        bucket = new ListNode[SIZE];
    }
    int get(int key) {
        return key % SIZE;
    }

    public void add(int key) {
        int idx = get(key);
        if(bucket[idx]==null){
            bucket[idx] = new ListNode(key);
        }
        else{
            ListNode temp = bucket[idx];
            while (temp != null){
                if(temp.val==key) return; // already exists
                if (temp.next == null) break; // stop BEFORE last

                temp = temp.next;
            }
            temp.next = new ListNode(key);
        }
    }

    public void remove(int key) {
        int idx = get(key);
        ListNode head = bucket[idx];
        if (head == null) return;
        if (head.val == key) {
            bucket[idx] = head.next;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            if (temp.next.val == key) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public boolean contains(int key) {
        int idx = get(key);
        ListNode temp = bucket[idx];
        while (temp != null){
            if(temp.val==key) return true;
            temp = temp.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */