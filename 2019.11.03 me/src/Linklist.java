class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
        this.next = null;

    }
}
class MySingleList {
    public  ListNode head;//标志头
    public  MySingleList() {
        this.head =null;
    }

//头插法
public  void addFirst(int data) {
    ListNode node = new ListNode(data);
    if(this.head==null) {
        this.head=node;
      }else{
        node.next = this.head;
        this.head = node;
      }
    }
    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if(this.head==null) {
            this.head=node;
        }else{
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next =node;
        }

        

    }

}