import java.util.List;

public class Go {
    public static ListNode mergeTwoLists(ListNode headA, ListNode headB) {
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while (headA != null && headB != null) {
            if (headA.data < headB.data) {
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            } else {
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;

            }

        }
        if (headA != null) {
            tmp.next = headA;
        }
        if (headB != null) {
            tmp.next = headB;
        }
        return newHead;
    }

    public static void main(String[] args) {
        DoubleList doubleList = new DoubleList();
        doubleList.addLast(1);
        doubleList.addFirst(0);
        doubleList.display();
        doubleList.addIndex(2,2);
        doubleList.display();
        doubleList.addLast(4);
        doubleList.addIndex(3,3);
        doubleList.display();
        doubleList.remove(3);
        doubleList.display();
    }
}

