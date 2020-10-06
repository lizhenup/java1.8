public class TestDemo2 {
    public static int func() {
       return  10/0;
    }

    public static void main(String[] args) {
        int a = 10;
        try {
            if(a == 10) {
                throw new Exception("异常" );
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally");
        }
    }
    public static void main1(String[] args) {
        try {
            System.out.println("before");
            func();
            System.out.println("after");
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("捕获到一个异常");
        }finally {
            System.out.println("这里是被最后执行的代码，并且一定会被执行");
        }
    }
}
