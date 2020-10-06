
class ListNode {
    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class MySingleList {
        public ListNode head;
        public MySingleList() {
            this.head = null;
        }
        //头插法
        public void addFirst(int data) {
            ListNode node = new ListNode(data);
            if (this.head == null) {
                this.head = node;
            }else {
                node.next = this.head;
                this.head = node;
            }
        }
        //尾插法
        public void addLast(int data) {
            ListNode node = new ListNode(data);
            if(this.head == null) {
                this.head = node;
            } else {
                ListNode cur = this.head;
                while (cur.next != null) {
                    cur = cur.next;
                }
                cur.next = node;
            }
        }
        //插入到index位置
       //找到前驱prev(prev即index - 1)与获取链表长度getLength
    public int getLength() {
            ListNode cur = this.head;
            int count = 0;
            while (cur != null) {
                cur = cur.next;
                count++;
            }
            return count;
    }
    //返回的为：前一个节点 所以定义的为ListNode类
    private ListNode searchIndex(int index) {
            ListNode prev = this.head;
            int count = 0;
            while (count < index - 1) {
                prev = prev.next;
                count++;
        }
           return prev;
    }
    public boolean addIndex(int index,int data) {
            ListNode node = new ListNode(data);
            //判断下index插入的位置是否合法
        if(index < 0 || index > getLength()) {
            return false;
        }
        if(index == 0) {
            addFirst(data);
            return true;
        }
        ListNode prev = searchIndex(index);
        node.next = prev.next;
        prev.next = node;
        return true;
    }
    //打印单链表
    public void display() {
            if(this.head == null) {
                System.out.println("单链表为空");
            }
        ListNode cur = this.head;
            while (cur != null) {
                System.out.print(cur.data + " ");
                cur = cur.next;
            }
        System.out.println(" ");
    }
    public int contains(int key) {
            if(this.head == null) {
                return -1;
            }
            ListNode cur = this.head;
            while (cur != null) {
                if(cur.data == key) {
                    return key;
                }
                cur = cur.next;
            }
            return -1;
    }
    private ListNode searchKey(int key) {
            ListNode prev = this.head;
            while (prev.next != null) {
                if(prev.next.data == key) {
                    return prev;
                }
            }
            return null;
    }
    public void remove(int key) {
            if(this.head == null) {
                return;
            }
            if(this.head.data == key) {
                this.head = this.head.next;
                return;
            }
            ListNode prev = searchKey(key);
            if(prev == null) {
                System.out.println("删除节点不存在");
                return;
            }
            ListNode del = prev.next;
            prev.next = del.next;
            return;
    }
    public void removeAll(int key) {
            if(this.head == null) {
                return;
            }
            ListNode prev = this.head;
            ListNode cur = this.head.next;
            while (cur != null) {
                if(cur.data == key) {
                    prev.next = cur.next;
                    cur = cur.next;
                }else{
                    prev = cur;
                    cur = cur.next;
                }
            }
            if(this.head.data == key) {
                this.head = this.head.next;
            }
    }
    public void clear1() {
            this.head = null;
    }
    public void clear2() {
            ListNode cur = this.head;
            if(cur.next != null) {
                cur.next = cur.next.next;
            }
            this.head = null;
    }
    //翻转单链表
    public ListNode reverseList() {
            ListNode prev = null;
            ListNode newHead = null;
            ListNode cur = this.head;
            if(this.head == null) {
                return null;
            }
            while (cur != null) {
                ListNode curNext = cur.next;
                if(cur.next == null) {
                    newHead = cur;
                }
                cur.next = prev;
                prev = cur;
                cur = curNext;
            }
            return newHead;
    }

    public void display2(ListNode newHead) {
            if(newHead == null) {
                return;
            }
            ListNode cur = newHead;
            while (cur != null) {
                System.out.print(cur.data + " ");
                cur = cur.next;
            }
        System.out.println(" ");
    }

}

