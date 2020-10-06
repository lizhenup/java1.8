public class TestDemo {
    public static void main(String[] args) {
        MySingleList mySingleList =new MySingleList();
        mySingleList.addLast(1);
        mySingleList.addFirst(5);
        mySingleList.addFirst(4);
        mySingleList.addFirst(3);
        mySingleList.addLast(7);
        mySingleList.addFirst(2);
        mySingleList.addFirst(1);
        mySingleList.display();
        mySingleList.remove1(1);
        mySingleList.display();
    }
}
