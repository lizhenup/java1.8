public class throwable {
        public static void main1(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ": 我还活着");
                    Thread.sleep(1 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }System.out.println(Thread.currentThread().getName() + ": 我即将死去");
        }
        );
        System.out.println(Thread.currentThread().getName() + ": ID: " + thread.getId());
        System.out.println(Thread.currentThread().getName() + ": 名称: " + thread.getName());
        System.out.println(Thread.currentThread().getName() + ": 状态: " + thread.getState());
        System.out.println(Thread.currentThread().getName() + ": 优先级: " + thread.getPriority());
        System.out.println(Thread.currentThread().getName() + ": 后台线程: " + thread.isDaemon());
        System.out.println(Thread.currentThread().getName() + ": 活着: " + thread.isAlive());
        System.out.println(Thread.currentThread().getName() + ": 被中断: " + thread.isInterrupted());

        thread.start(); while (thread.isAlive()) {} System.out.println(Thread.currentThread().getName() + ": 状态: " + thread.getState()); }
    class func extends Thread {
        @Override
        public void run() {

        }
    }

    class func1 implements Runnable{
        @Override
        public void run() {

        }
    }
    static class SynchronizedDemo { 
            public synchronized void method() {
            }

    }
    public static void main(String[] args) { 
            SynchronizedDemo demo = new SynchronizedDemo(); 
            demo.method();
            // 进入方法会锁 demo 指向对象中的锁；出方法会释放 demo 指向的对象中的锁
        }
}

