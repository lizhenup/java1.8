/**
 * Created with IntelliJ IDEA.
 * Description: 不带头节点的单链表
 * User: GAOBO
 * Date: 2019-11-03
 * Time: 10:12
 */
//节点类
class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class MySingleList {

    public ListNode head;//标志头

    public MySingleList() {
        this.head = null;
    }

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
        } else {
            node.next = head;
            this.head = node;
        }
    }

    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if (this.head == null) {
            this.head = node;
        } else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur = node;
        }
    }

    //打印链表数据
    public void display() {
        if(this.head == null) {
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    //获取单链表长度
   /* public  int getLength() {
        int count = 0;
        ListNode cur = this.head;

    }*/
    private ListNode searchIndex(int index) {
       // prev-->index-1;
        ListNode prev = this.head;
        for (int i = 0; i <index-1; i++) {
            prev = prev.next;
        }
        return prev;
    }
    //插入到index位置
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        ListNode node = new ListNode(data);
        //if(index< 0||index>)
        if(index == 0) {
            addFirst(data);
            return true;
        }
        ListNode prev = searchIndex(index);
        node.next = prev.next;
        prev.next = node;
        return false;
    }
    private ListNode searchPrev(int key) {
        return null;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        //1、删除的节点如果是头结点
        if(this.head.data ==key) {
            this.head = head.next;
        } else {
            //2、找到删除的节点的前驱  如果找不到  返回null

            ListNode prev = searchPrev(key);
            if(prev==null) {
                System.out.println("没有找到你要删除的值");
            }
            //3、进行删除
            ListNode del = prev.next;
            prev.next = del.next;
        }
    }
    public void remove1(int key) {
        ListNode prev = searchPrev(key);
        ListNode cur = this.head.next;
        while(cur !=null) {
            if(prev.next.data==key) {
                prev.next = cur.next;
                cur=cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
    }
}
