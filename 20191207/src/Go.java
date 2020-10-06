public class Go {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(6);
        mySingleList.addLast(3);
        mySingleList.addLast(25);
        mySingleList.addLast(5);
        mySingleList.addLast(9);
        mySingleList.addLast(1);
        mySingleList.addLast(62);
        mySingleList.display();
        /*ListNode ret = mySingleList.middleNode();
        System.out.println(ret.data);*/
        /*ListNode ret2 = mySingleList.findKthToTail(1);
        System.out.println(ret2.data);*/
       /* ListNode ret = mySingleList.reverseList();
        mySingleList.display2(ret);*/
        ListNode ret3 = mySingleList.partition2(5);
        mySingleList.display2(ret3);
        ListNode ret4 = mySingleList.partition3(5);
        mySingleList.display2(ret4);
    }
}
