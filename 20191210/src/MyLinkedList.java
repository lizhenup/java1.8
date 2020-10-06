class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

}
class MyLinkedList {
    public ListNode head;
    /** Initialize your data structure here. */
    MyLinkedList() {
    }
    public int length() {
        int count = 0;
        if(this.head == null) {
            return -1;
        }
        ListNode cur = this.head;
        while(cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0 || index > length()) {
            return -1;
        }
        int count = 1;
        ListNode cur = this.head;
        if(count != index) {
            while(cur != null) {
                cur = cur.next;
                count++;
            }
        }
        return cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        if(this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }

    /** Append a node of value val to the last element of the linked list. */
    void addAtTail(int val) {
        ListNode node = new ListNode(val);
        if(this.head == null) {
            this.head = node;
        }else {
            ListNode cur = this.head;
            while(cur != null) {
                cur = cur.next;
            }
            cur = node;
        }

    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    private ListNode funcIndex(int index) {
        int count = 1;
        ListNode cur = this.head;
        if(count != index-1) {
            while(cur != null) {
                cur = cur.next;
                count++;
            }
        }
        return cur;


    }
    public int addAtIndex(int index, int val) {
        ListNode node = new ListNode(val);
        if(index < 0 || index-1 == 0) {
            addAtHead(val);
        } else if(index == 0 ||index > length()) {
            return -1;
        }else if (index == length()){
            addAtTail(val);
        }else {
            ListNode prev = funcIndex(index);
            node.next = prev.next;
            prev.next =node;
        }
        return 1;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index <= 0 || index > length()) {
            return;
        }
        if(index == 1) {
            this.head = this.head.next;
        }else {
            ListNode prev = funcIndex(index);
            prev.next = prev.next.next;
        }
        return;
    }
}