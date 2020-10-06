public class Go {
    // 将两个有序链表合并为一个新的有序链表并返回。
    public ListNode mergeTwoLists(ListNode headA, ListNode headB) {
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while (headA != null && headB != null) {
            if(headA.data < headB.data) {
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            }else {
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;
            }
        }
        if(headA == null) {
            tmp.next = headB;
        }else {
            tmp.next = headA;
        }
        return newHead;
    }
    //创造一个公共结点
    public static void createCut
            (ListNode headA, ListNode headB) {
        headA.next = headB.next.next;
    }
    // 输入两个链表，找出它们的第一个公共结点
    public static  ListNode getIntersectionNode
            (ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }

        ListNode pL = headA;//永远指向长的单链表
        ListNode pS = headB;//永远指向短的单链表

        int lenA = 0;
        int lenB = 0;

        //求的lenA  lenB
        while (pL != null) {
            lenA++;
            pL = pL.next;
        }
        while (pS != null) {
            lenB++;
            pS = pS.next;
        }
        pL = headA;
        pS = headB;

        //差值-》最长的单链表先走len步
        int len = lenA-lenB;
        if(len < 0) {
            pL = headB;
            pS = headA;
            len = lenB-lenA;
        }

        //让pL先走len步
        while (len > 0) {
            pL = pL.next;
            len--;
        }
        //开始一起走  (pL  != pS ) {一人一步走}
        while (pL != pS ) {
            pL = pL.next;
            pS = pS.next;
        }
        return pL;
    }
    public static void main(String[] args) {
        MySingleList mySingleList1 = new MySingleList();
        mySingleList1.addLast(1);
        mySingleList1.addLast(2);
        mySingleList1.addLast(3);
        mySingleList1.addLast(10);
        mySingleList1.display();//1  2  3  10
        MySingleList mySingleList2 = new MySingleList();
        mySingleList2.addLast(3);
        mySingleList2.addLast(4);
        mySingleList2.addLast(10);
        mySingleList2.addLast(17);
        mySingleList2.display();// 3  4  10 17

        createCut(mySingleList1.head, mySingleList2.head);
        ListNode getIntersectionNode = getIntersectionNode(
                mySingleList1.head,mySingleList2.head);
        System.out.println(getIntersectionNode.data);
    }
}
