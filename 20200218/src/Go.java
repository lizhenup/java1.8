

public class Go {
    public static void main(String[] args) {
        /*
        OuterClass outerClass =  new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.test();
        OuterClass1.InnerClass1 innerClass1 = new OuterClass1.InnerClass1();
        */
        /*
        OuterClass1 outerClass1 =  new OuterClass1();
        OuterClass1.InnerClass1 innerClass1 = new OuterClass1.InnerClass1(outerClass1);
        innerClass1.test();
        */
        new OuterClass2() {
            public void test() {
                System.out.println("Go::test()");
            }
        }.test();

    }
}
class OuterClass {
    public int data1 = 2;
    private int data2 = 3;
    int data3;
    public OuterClass() {
        System.out.println("OutClass()");
    }
    //实例内部类
    //1.如何获取实例内部类的对象？
    // OutClass.InnerClass innerClass = outClass.new InnerClass();
    //外部类类名.内部类类名 变量名 =  外部类对象的引用.new 内部类()
    //2.在实例内部类中。不能定义static属性或者方法
    //如果要定义static，属性一定是static final
    //实例内部类里面的数据成员，一定是在编译期间就能确定的
    //3.面试问题：实例内部类有没有额外的内存开销
    //有 因为实例内部类包换外部类的this引用
    //实例内部类至少有两个this
    class InnerClass {
        public int data4 = 4;
        public int data1 = 6;
        public InnerClass() {
            System.out.println("InnerClass()");
        }
        public void test() {
            System.out.println("InnerClass::test()");
            System.out.println("data1: " + this.data1);
            System.out.println("out::data1: " + OuterClass.this.data1);
        }
    }
}
    class OuterClass1 {
        public int data1 = 666;
        public static int data5 = 6;

        public OuterClass1() {
        System.out.println("OuterClass1()");
        }
        /**
         * 静态内部类：
         * 1.如何拿到静态内部类的对象
         * OuterClass1.InnerClass1 innerClass1 = new OuterClass1.InnerClass1();
         *                                    = new 外部类名.内部类();
         * 2.静态内部类当中，不能够访问外部类的非静态数据成员
         * 传入外部类的引用 可以达到访问外部类的非静态数据成员的目的
         *
         */

        static class InnerClass1 {
            public int data4 = 4;
            public static int data5 = 5;
            OuterClass1 outerClass1;
            public InnerClass1() {
                System.out.println("static::InnerClass1()");
            }
            public InnerClass1(OuterClass1 o) {
                this.outerClass1 = o;
                System.out.println("static::InnerClass1(OuterClass1 o)");
            }

            public void test() {
                System.out.println("data1:" + this.outerClass1.data1);
                System.out.println("data5: "+data5);
                System.out.println("OuterClass1::data5: " + OuterClass1.data5);
                System.out.println("InnerClass::test()");
            }
        }
    }

/**
 * 匿名内部类：
 * 本质：其实就是一个子类
 * 匿名类使用最多的地方就是线程
 */

class OuterClass2 {
        public int data1 = 666;
        public static int data5 = 6;

        public void test() {
            System.out.println("OuterClass2()::test()");
        }
    }
    //内部方法类（不是重点） 定义在方法里面的内部类

