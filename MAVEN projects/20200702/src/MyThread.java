

class Threads extends ThreadS {
    @Override
    public void run() {
        System.out.println("aaaaa");
    }
}
public class MyThread {
    public static void main(String[] args) {
        Threads thread = new Threads();
        thread.start();
    }
}

