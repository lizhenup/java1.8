package Go11.Go21;

public class Go {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addFirst(2);
        mySingleList.addFirst(1);
        mySingleList.display();
        mySingleList.addList(3);
        mySingleList.addList(7);
        mySingleList.addList(5);
        mySingleList.addList(15);
        mySingleList.display();
        int data = mySingleList.getLength();
        System.out.println(data);
        mySingleList.addIndex(3,99);
        mySingleList.display();
        mySingleList.contains(99);
        mySingleList.remove(99);
        mySingleList.display();
        mySingleList.addList(3);
        mySingleList.addList(3);
        mySingleList.addList(3);
        mySingleList.addList(3);
        mySingleList.addList(3);
        mySingleList.addList(3);
        mySingleList.display();
        mySingleList.removeAll(3);
        mySingleList.display();
    }
}
