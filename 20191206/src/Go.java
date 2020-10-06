public class Go {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(6);
        mySingleList.addLast(455);
        mySingleList.addLast(76);
        mySingleList.addLast(97);
        mySingleList.addLast(45);
        mySingleList.addLast(65);
        mySingleList.addLast(98);
        mySingleList.addLast(116);
        mySingleList.display();
        ListNode ret = mySingleList.partition(97);
        mySingleList.display2(ret);
        /*ListNode ret2 = mySingleList.partition2(3);
        mySingleList.display3(ret2);*/
    }
}
