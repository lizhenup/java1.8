import java.util.concurrent.*;

public class Main implements Callable<Integer>{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableFuture ca = new CallableFuture();
        FutureTask<Integer> ft = new FutureTask<Integer>(ca);
        for(int i = 0; i < 100; i++) {
            //返回值主线程的名称和执行代号
            //System.out.println("kkk" + Thread.currentThread());
            System.out.println(Thread.currentThread().getName()+" "+i);
            if(i==20) {
                new Thread(ft,"Callable线程").start();
                //该方法将导致主线程被阻塞，直到call()方法结束并返回为止
                //System.out.println("子线程的返回值"+ft.get());
            }
        }
        try{
            System.out.println("子线程的返回值"+ft.get());
        }catch (Exception e) {
            e.printStackTrace();
        }
        ExecutorService cachedThread = Executors.newCachedThreadPool();
        ExecutorService fixed = Executors.newFixedThreadPool(6);
        ExecutorService scheduled = Executors.newScheduledThreadPool(6);
        ExecutorService Single = Executors.newSingleThreadExecutor();

    }



    @Override
    public Integer call() throws Exception {
        int i = 0;
        for( ;i < 100; i++) {
            //System.out.println("kkk" + Thread.currentThread());
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        return i;
    }
}
