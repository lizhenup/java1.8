/**
 * Created with elliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2019-12-10
 * Time: 19:28
 */
public class MyListQueue {
    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public Node front;
    public Node rear;
    public int usedSize;

    public boolean idEmpty() {
        return this.usedSize == 0;
    }

    //入队
    public void offer(int data) {
        Node node = new Node(data);
        if (front == null && rear == null) {
            this.front = node;
            this.rear = node;

        } else {
            this.rear.next = node;
            this.rear = rear.next;
        }
        this.usedSize++;
        //出队
    }
}
