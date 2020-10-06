class ListNode {
    public  int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class MySingList {
    public ListNode head;

    //head=null可有可无
    public MySingList() {
        this.head = null;
    }
    //2019.11.03上课内容
    //头插法
    public void addFrist(int data) {
        ListNode node = new ListNode(data);
        if (this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
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
            cur.next = node;
        }
    }

    //任意位置插入，第一个数据节点为0号下标
    //private 为了找到index-1的数据
    private ListNode searchIndex(int index) {
        ListNode prev = this.head;
        int count = 0;
        //将prev标记为index-1的位置
        while (count < index - 1) {
            //prev-->index-1
            prev = prev.next;
            count++;
        }
        return prev;
    }

    public boolean addIndex(int index, int data) {
        if (index < 0 || index > getLength()) {
            return false;
        }
        if (index == 0) {
            addFrist(data);
            return true;
        }
        ListNode node = searchIndex(index);
        ListNode prev = new ListNode(data);
        //插入位置 并与原位置建立next连接
        node.next = prev.next;
        //于插入位置的前一个位置建立next连接
        prev.next = node;
        return false;
    }

    public int getLength() {
        int count = 0;
        ListNode cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;

    }

    //打印单链表数据
    public void display() {

        if (this.head == null) {
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println(" ");

    }

    //11.07
    //查找是否包含关键字key是否在单链表当中
    public boolean contains1(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public ListNode contains2(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    private ListNode searchPrev(int key) {
        //prev 代表前驱
        ListNode prev = this.head;
        while (prev.next != null) {
            if (prev.next.data == key) {
                return prev;
            }
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        //1.删除的节点如果是头节点
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        //2.找到删除的节点的前驱 如果找不到return null;
        ListNode prev = searchPrev(key);
        if (prev == null) {
            System.out.println("没有找到你要删除的节点");
            return;
        }
        ListNode del = prev.next;
        //3、进行删除
        prev.next = del.next;
    }

    //删除所有值为key的值
    public void removeAllKey(int key) {
        ListNode prev = this.head;
        ListNode cur = this.head.next;
        while (cur != null) {
            if (prev.next.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        //最后处理
        if (this.head.data == key) {
            this.head = this.head.next;
        }
    }

    public void clear() {
        //this.head = null;
        while (this.head.next != null) {
            ListNode cur = this.head.next;
            this.head.next = cur.next;
        }
        this.head = null;

    }
    //2019.11.05练习习题
    //反转单链表
    public ListNode reverseList() {
        ListNode prev = null;
        ListNode newHead = null;
        //cur代表当前需要反转的节点
        ListNode cur = this.head;
        while (cur != null) {
            //必须在cur != null的情况下定义curNext 否则报错
            ListNode curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
            //第一次手动将原头置为空
            //原理是prev = null curNext = prev curNext将prev的next域传回到cur的next域
            //执行完next域的交换（即反转时） prev先往后走 走到 cur位置 cur走到cur.next位置 curNext自动后移
            //
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }

    public void display2(ListNode newHead) {

        if (newHead == null) {
            return;
        }
        ListNode cur = newHead;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println(" ");

    }
    //遍历两遍情况下找到 链表中间节点 如果有俩个中间节点则返回第二个节点
    public ListNode middleNode() {
        int len = getLength() / 2;
        ListNode cur = this.head;
        for (int i = 0; i < len; i++) {
            cur = cur.next;
        }
        return cur;
    }
    //遍历一遍情况下找到 链表中间节点 如果有俩个中间节点则返回第二个节点
    public ListNode middleNode2() {
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //删除倒数第k个节点 getLength版
    public ListNode findKthToTail1(int k) {
        ListNode fast = this.head;
        ListNode slow = this.head;
        if (k <= 0 || k > getLength()) {
            return null;
        }
        while (fast != null) {
            if (k - 1 > 0) {
                fast = fast.next;
                k--;
            }
            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }
    //删除倒数第k个节点 面向面试版
    public ListNode findKthToTail2(int k) {
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (k - 1 > 0) {
            if (fast.next != null) {
                fast = fast.next;
                k--;
            } else {
                System.out.println("没有这个节点");
                return null;
            }
        }
        while (fast != null) {
            if (k - 1 > 0) {
                fast = fast.next;
                k--;
            }
            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }
   /* 2019.11.10练习
   public  ListNode reverseList2() {
        ListNode prev = null;
        ListNode newHead = null;
        ListNode cur = this.head;

        while(cur != null) {
            ListNode curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }*/
   //2019.11.10 am
   //找到以x为基准分割链表
    public ListNode partition(int x) {
        //<x的区间
        ListNode beforeStart = null;
        ListNode beforeEnd = null;
        //>x的区间
        ListNode afterStart = null;
        ListNode afterEnd = null;
        ListNode cur = this.head;
        while(cur != null) {
            if(cur.data < x) {
                //判断是不是第一次插入
                if(beforeStart == null) {
                    beforeStart = cur;
                    beforeEnd = cur;
                }else {
                    //与beforeEnd建立前连接
                    beforeEnd.next = cur;
                    //更改beforeEnd位置
                    beforeEnd = beforeEnd.next;
                }
            }else {
                //判断是不是第一次插入
                if(afterStart == null) {
                    afterStart = cur;
                    afterEnd = cur;
                }else {
                    //与afterEnd建立前连接
                    afterEnd.next = cur;
                    //更改afterEnd位置
                    afterEnd = afterEnd.next;
                }
            }
            cur = cur.next;
        }
        //第一个区间无数据情况下的串联
        if(beforeStart == null) {
                return afterStart;
            }
            beforeEnd.next = afterStart;
        if(afterStart != null) {
            //避免排序后最后一个节点的next域不为null的情况
            afterEnd.next = null;
        }
        return beforeStart;

    }
    //在一个排序链表中删除重复的节点 重复的节点不保留
    public ListNode deletDuplication() {
        ListNode cur = this.head;
        //解决头结点发生变化的情况
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while (cur != null) {
            //cur.next 不为空考虑到只有一个节点的情况
            if(cur.next != null && cur.data == cur.next.data) {
                while (cur.next != null &&cur.data == cur.next.data) {
                    cur = cur.next;
                }
                //删除最后一个剩余的重复节点
                cur = cur.next;

            }else {
                //"tmp.next = cur;" 用于修改next域 即串联链表
                tmp.next = cur;
                //tmp往链表后一个位置移动 即cur所在位置
                tmp = tmp.next;
                //cur往链表后一个位置移动 即cur.next所在位置
                cur = cur.next;
            }

        }
        //此时tmp指向最后一个节点
        //考虑到若之前删除了尾节点 则会出现 现尾节点next域不为空的情况
        //"tmp.next = null;"手动将最后一个节点next域置为空
        tmp.next = null;
        //解决头结点发生变化的情况
        return newHead.next;
    }
    //2019.11.10 pm
    //链表的回文结构 回文：上海自来水来自海上 12321 正着反着念都一样就叫回文
    //判断回文
    public boolean chkPalindrome() {
        if(this.head == null) {
            return false;
        }
        if(this.head.next == null) {
            return true;
        }
        //1.找到单链表的中间节点
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //2.反转中间节点后的那部分单链表
        ListNode cur = slow.next;
        while (cur != null) {
            ListNode curNext = cur.next;
            //反转链表
            cur.next = slow;
            //slow后移
            slow = cur;
            //cur后移
            cur = curNext;
        }
        //3.fast/slow往前 head往后
        while(slow != this.head) {
            if(slow.data != this.head.data) {
                //实现判断是否为回文链表
                return false;
            }
            //处理链表成员为偶数情况时 1 2 2 1
            if(this.head.next == slow) {
                return true;
            }
            slow = slow.next;
            this.head = this.head.next;
        }
        //slow = head 直接跳出循环返回 true；
        return  true;
    }
    //创造一个环
    public void creteLoop() {
        ListNode cur = this.head;
        while (cur.next != null) {
          cur = cur.next;
        }
        cur.next = this.head.next.next;

    }
    //判断单链表中是否有环
    public  boolean hasCycle() {
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                break;
                //return true;
            }
            if(fast == null || fast.next == null){
                return false;
            }
        }
        return true;
    }
    //找到环的入口
    public ListNode detectCycle() {
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }
        }
        if(fast == null || fast.next == null){
            return null;
        }
        //原理就是在slow和fast相遇以后将slow或fast中的一个
        //返回到链表的头 fast与slow同时只往后移动一个next域
        //相遇位置即为环的入口
        fast = this.head;
        //or slow = this.head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode findKthToTail3(int k) {
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(k-1 > 0) {
            if(fast.next != null) {
                fast = fast.next;
                k--;
            }else {
                return null;
            }
        }
        if(fast != null) {
            if (k - 1 > 0) {
                fast = fast.next;
                k--;
            }
            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
        }
    public ListNode reverseList2() {
        ListNode prev = null;
        ListNode cur = this.head;
        ListNode newHead = null;
        while (cur != null) {
            ListNode curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }else {
                cur.next = prev;
                prev = cur;
                cur = curNext;
            }
        }
        return newHead;
    }

}



