package Go11.Go21;
//手撕单链表第一部分
    class ListNode {
        public ListNode next;
        public int data;
        public ListNode(int data) {
            this.data = data;
            this.next = next;
        }
    }
class MySingleList {
       public ListNode head;
        public MySingleList() {
            this.head = head;
        }
        public void addFirst(int data) {
            ListNode node = new ListNode(data);
            if(this.head == null) {
                this.head = node;
            }else {
                node.next = this.head;
                this.head = node;
            }
        }
     public void addList(int data) {
            ListNode node = new ListNode(data);
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
     public void display() {
            if(this.head == null) {
                return;
            }
            ListNode cur = this.head;
            while (cur != null) {
                System.out.print(cur.data+" ");
                cur = cur.next;
            }
         System.out.println(" ");
     }
     public int getLength() {
            ListNode cur = this.head;
            int count = 0;
            if(cur == null) {
                return 0;
            }
            while (cur != null) {
                cur = cur.next;
                count++;
            }
            return count;
     }
     private ListNode searchIndex(int index) {
            ListNode prev = this.head;
            int count = 0;
            if(count < index - 1) {
                prev = prev.next;
                count++;
            }
            return prev;
     }
     public void addIndex(int index,int data) {
            if(index < 0 || index > getLength()) {
                return;
            }
            ListNode prev =  searchIndex(index);
            ListNode cur = new ListNode(data);
           cur.next = prev.next;
            prev.next = cur;
     }
    public boolean contains1(int key){
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    public boolean  contains(int key) {
            ListNode cur = this.head;
            while(cur != null) {
                if (cur.data == key) {
                    System.out.println("找到了");
                    return true;
                }

                cur = cur.next;
            }
            System.out.println("没找到");
            return false;
    }
    private  ListNode searchPrev(int key) {
       ListNode cur = this.head;
       while (cur.next != null) {
           if(cur.next.data == key) {
               return cur;
           }
           cur= cur.next;
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
        ListNode prev = searchPrev(key);
        if(prev == null) {
            System.out.println("无删除节点");
        }
        ListNode del = prev.next;
        prev.next = del.next;
    }
    public void removeAll(int key) {
        if(this.head == null) {
            return;
        }
        ListNode prev = this.head;
        ListNode cur = this.head.next;
        while (cur != null) {
            if(prev.next.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.data == key) {
            this.head.next = this.head.next;
        }
    }
    public void clear1() {
            this.head = null;
    }
    public void clear2() {
            while (this.head.next != null) {
                this.head = this.head.next;
            }
            this.head = null;
    }
}

