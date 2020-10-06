/**
 * @author ：lizhen
 * @date ：Created in 2020/7/30 13:31
 * @description：
 * @modified By：
 * @version: $
 */
class SuperClass {
    private int n;
    SuperClass(){
        System.out.println("SuperClass()");
    }
    SuperClass(int n) {
        System.out.println("SuperClass(int n)");
        this.n = n;
    }
}
// SubClass 类继承
class SubClass extends SuperClass{
    private int n;

    SubClass(){ // 自动调用父类的无参数构造器
        System.out.println("SubClass");
    }

    public SubClass(int n){
        super(300);  // 调用父类中带有参数的构造器
        System.out.println("SubClass(int n):"+n);
        this.n = n;
    }
}
// SubClass2 类继承
class SubClass2 extends SuperClass{
    private int n;

    SubClass2(){
        super(300);  // 调用父类中带有参数的构造器
        System.out.println("SubClass2");
    }

    public SubClass2(int n){ // 自动调用父类的无参数构造器
        System.out.println("SubClass2(int n):"+n);
        this.n = n;
    }
}
public class TestSuperSub{
    public static void main (String args[]){
        /*System.out.println("------SubClass 类继承------");
        SubClass sc1 = new SubClass();
        SubClass sc2 = new SubClass(100);
        System.out.println("------SubClass2 类继承------");
        SubClass2 sc3 = new SubClass2();
        SubClass2 sc4 = new SubClass2(200);*/

        //SuperClass superClass = new SubClass();
        //SubClass subClass = new SubClass();
        //SuperClass superClass = subClass;
    }
    /**
     * create by: lizhen
     * description:输出结果推测
     * create time:
     * 预测         实际输出
     *SuperClass()  SuperClass()
     *SubClass      SubClass
     *SuperClass(int n)  SuperClass(int n)
     *SubClass(int n):100  SubClass(int n):100
     * ------SubClass2 类继承------
     * SuperClass(int n) SuperClass(int n)
     * SubClass2  SubClass2
     * SubClass   SuperClass()
     * SubClass2(int n): 200  SubClass2(int n):200
     * @Param: null
     * @return
     */
}
