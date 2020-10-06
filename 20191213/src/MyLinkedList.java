class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class MyLinkedList {
    public ListNode head;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.head = null;
    }
    public int getLength() {
        ListNode cur = this.head;
        if(this.head == null) {
            return -1;
        }
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    //get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1
    public int get(int index) {
        if(this.head == null || index > getLength()-1) {
            return -1;
        }
        int count = 0;
        ListNode cur = this.head;
        while (count < index) {
           if (cur.next != null) {
               cur = cur.next;
               count++;
           }
        }
        return cur.data;
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
    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        ListNode cur = this.head;
        if(this.head == null) {
            this.head = node;
        }else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }
    //在链表中的第 index 个节点之前添加值为 val  的节点。
    // 如果 index 等于链表的长度，则该节点将附加到链表的末尾。
    // 如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    private ListNode getPrev(int index) {
        ListNode prev = this.head;
        if(this.head == null) {
            return null;
        }
        int count = 0;
        while (count < index - 1) {
            prev = prev.next;
            count++;
        }
        return prev;
    }
    public void addAtIndex(int index, int val) {
        if(index <= 0 ) {
            addAtHead(val);
            return;
        }
        if(index > getLength()) {
            return;
        }
        ListNode prev = getPrev(index);
        ListNode node = new ListNode(val);
        node.next = prev.next;
        prev.next = node;
        return;
    }
     //deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index < 0 || index > getLength()-1) {
            return;
        }
        if(index == 0) {
            this.head = this.head.next;
            return;
        }
        ListNode prev = getPrev(index);
        prev.next = prev.next.next;
    }
    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " " );
            cur = cur.next;
        }
        System.out.println(" ");
    }
}