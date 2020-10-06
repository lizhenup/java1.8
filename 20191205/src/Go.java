public class Go {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addFirst(2);
        mySingleList.addFirst(6);
        mySingleList.display();
        mySingleList.addLast(7);
        mySingleList.addLast(9);
        mySingleList.addLast(9);
        mySingleList.addLast(9);
        mySingleList.addLast(9);
        mySingleList.addLast(9);
        mySingleList.addLast(16);
        mySingleList.display();
        mySingleList.addIndex(0,10);
        mySingleList.display();
        mySingleList.addIndex(4,99);
        mySingleList.display();
        int tc = mySingleList.contains(10);
        int td = mySingleList.contains(15);
        /*System.out.println(tc);
        System.out.println(td);*/
        mySingleList.removeAll(9);
        mySingleList.display();
        ListNode ret = mySingleList.reverseList();
        mySingleList.display2(ret);
    }
}
