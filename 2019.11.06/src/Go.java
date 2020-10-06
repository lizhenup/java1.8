public class Go {
    public static void main(String[] args) {
        MySingList mySingList = new MySingList();
        mySingList.addFrist(12);
        mySingList.addFrist(25);
        mySingList.addFrist(53);
        mySingList.addFrist(11);
        mySingList.addLast(8);
        mySingList.addLast(12);
        mySingList.addLast(99);
        mySingList.addLast(99);
        mySingList.addLast(99);
        mySingList.addLast(99);
        ListNode node1 = mySingList.middleNode();
        System.out.println(node1.data);
        ListNode node2 = mySingList.middleNode2();
        System.out.println(node2.data);
        mySingList.display();
        boolean flg = mySingList.contains1(11);
        System.out.println(flg);
        ListNode node = mySingList.contains2(25);
        System.out.println(node.data);
        mySingList.remove(11);
        mySingList.removeAllKey(99);
        mySingList.display();
        ListNode newHead = mySingList.reverseList();
        mySingList.display2(newHead);


    }
}
