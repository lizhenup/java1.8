class RunnableS implements Runnable {

    @Override
    public void run() {
        System.out.println(ThreadS.currentThread().getName() + " aaaaa ");
    }
}
/*public class MyRunnable {
    public static void main(String[] args) {
        ThreadS t = new ThreadS(new RunnableS());
        t.start();

    }
}*/
