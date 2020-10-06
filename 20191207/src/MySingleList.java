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
    public void addLast(int data) {
        ListNode Node = new ListNode(data);
        ListNode cur = this.head;
        if(this.head == null) {
            this.head = Node;
        }else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = Node;
        }
    }
    public void display() {
        if(this.head == null) {
            return;
        }
        ListNode cur = this.head;
        while (cur != null){
            System.out.print(cur.data + " ");
            cur =cur.next;
        }
        System.out.println(" ");
    }
    //返回单链表中间的节点 如果节点个数为偶数 则返回中间第二个
        public ListNode middleNode() {
            ListNode fast = this.head;
            ListNode slow = this.head;
            if(this.head == null) {
                return null;
            }
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }
        //返回链表中倒数第k个节点
        public ListNode findKthToTail(int k) {
            if(k <= 0) {
                return null;
            }
            ListNode fast = this.head;
            ListNode slow = this.head;
            while (k-1 > 0) {
                if(fast.next != null) {
                    fast = fast.next;
                    k--;
                }else {
                    System.out.println("该节点不存在");
                    return null;
                }
            }
            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
        }
        //以x为基准分割单链表 大于等于 x的节点在后
        public ListNode partition(int x) {
            ListNode bs = null;
            ListNode be = null;
            ListNode as = null;
            ListNode ae = null;
            ListNode cur = this.head;
            if(this.head == null) {
                return null;
            }
            while (cur != null) {
                if(cur.data < x) {
                    if(bs == null) {
                        bs = cur;
                        be = bs;
                    }else {
                        be.next = cur;
                        be = be.next;
                    }
                }else {
                    if(as == null) {
                        as = cur;
                        ae = as;
                    }else {
                        ae.next = cur;
                        ae = ae.next;
                    }
                }
                cur = cur.next;
            }
            if(bs == null) {
                return as;
            }
            be.next = as;
            if(as != null) {
                ae.next = null;
            }
            return bs;
        }
        public void display2(ListNode newHead) {
            ListNode cur = newHead;
            if(newHead == null) {
                return;
            }
            while (cur != null){
                System.out.print(cur.data + " ");
                cur =cur.next;
            }
            System.out.println(" ");
        }
        public ListNode reverseList() {
            ListNode prev = null;
            ListNode newHead = null;
            ListNode cur = this.head;
            if (this.head == null) {
                return null;
            }
            while (cur != null) {
                ListNode curNext = cur.next;
                //只有一个节点与遍历完成节点的情况
                if (curNext == null) {
                    newHead = cur;
                }
                cur.next = prev;
                prev = cur;
                cur = curNext;
            }
            return newHead;
        }
        public ListNode partition2(int x) {
            ListNode node = new ListNode(x);
            ListNode bs = null;
            ListNode be = null;
            ListNode as = node;
            ListNode ae = node;
            ListNode cur = this.head;
            if(this.head == null) {
                return null;
            }
            while (cur != null) {
                if(cur.data < x) {
                    if(bs == null) {
                        bs = cur;
                        be = bs;
                    }else {
                        be.next = cur;
                        be = be.next;
                    }
                }else {
                    if(as == cur) {
                        as = cur;
                    }else{
                        ae.next = cur;
                        ae = ae.next;
                    }
                }
                cur = cur.next;
            }
            if(bs == null) {
                return as;
            }
            be.next = as;
            if(as != null) {
                ae.next = null;
            }
            return bs;
        }
        public ListNode partition3(int x) {
            ListNode node = new ListNode(x);
            ListNode bs = null;
            ListNode be = null;
            ListNode as = null;
            ListNode asNext = null;
            ListNode ae = null;
            ListNode cur = this.head;
            if(this.head == null) {
                return null;
            }
            while (cur != null) {
                if(cur.data < x) {
                    if(bs == null) {
                        bs = cur;
                        be = bs;
                    }else {
                        be.next = cur;
                        be = be.next;
                    }
                }else if(cur.data == x) {
                    as = cur;
                    as.next = asNext;
                    }else{
                        if(asNext == null) {
                            asNext = cur;
                            ae = cur;
                        }else{
                            ae.next = cur;
                            ae = ae.next;
                        }
                    }
                cur = cur.next;
                }
            if(bs == null) {
                return as;
            }
            be.next = as;
            if(as != null) {
                ae.next = null;
            }
            return bs;
        }
}
