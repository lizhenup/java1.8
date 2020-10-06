//一个类可以实例化多个对象
//一个类生成一个class
/*一、属性（成员变量）：1.实例数据成员（属于类的对象）2.静态数据成员（属于类）
     方法（成员方法）：1.实例成员方法（属于类的对象）2.静态成员方法（属于类）
  二、静态的数据成员和方法只需要通过类名（Person）进行访问或者调用
     ！！！静态的数据成员和对象不依赖于对象 即不需要person1进行访问 调用！！！
  三、类中的数据成员没有初始化时 默认值为对应的0值。 引用类型对应：null 简单类型对应：0
      char \u0000       boolean false
  四、类的成员可以包含以下：字段（属性）、方法（行为）、代码块（静态、实例、本地、同步代码块）、
  内部类（静态、实例、本地、匿名内部类)和接口等。
  五、封装：封装的本质是让类的调用者不必太多的了解类的实现者是如何实现的，只知道如何使用类就行
  了。这样就降低了类的使用者的学习和使用成本，从而降低了复杂度。
  六、体现封装性：private 被private所修饰的属性或者方法 均不能在类外进行访问或者调用
  七、this 当前对象的引用（引用地址）idea 快捷键生成getter setter 使用alt+insert（f12/f11）
      this不能在静态成员 方法中使用
      this.成员变量
      this.成员方法
      this（）;//调用构造方法 注：必须写在第一行 只能调用一个构造方法
      构造方法可以发生重载 参数不同（类型 个数） 返回值不要求
  八、给数据成员初始化的方式：1.提供一系列 get set方法。
      2.构造方法（作用：用来产生对象） 方法名和类名相同  没有返回值
        如果程序没有提供任何的构造方法 编译器会默认生成一个不带参数的构造方法
        注：默认不带有参数的构造方法只有在   任何构造方法   都没有的情况下才会产生
  面试问题：生成一个对象需要几步？1.给对象分配内存  2.调用合适的构造方法
  九、代码块
  本地代码块： 方法内部 不常用
  举例：private  void eat() {
  {
  int a = 99；
  }
  int a =9999；
    }两个a不相同 {}内的a就是本地代码块
  实例（构造）代码块 优先于构造方法执行 初始化实例数据成员
  静态代码块 静态代码块优先于实例代码块执行 静态代码块只执行一次
  执行顺序：静态代码块--》实例代码块--》构造方法
  静态/实例 代码块 数据成员执行顺序与代码顺序有关
  十、补充说明：
       person@16d3586
      引用的类型@地址的哈希值 默认调用Object的toString（）方法 Object：所有类的父类
      如果当前类未重写objectd toString方法，那么调用System.out.println()时
      默认调用Object的toString方法
      如果当前类重写了Object的toString方法，那么久会调用重写方法
      alt+insert快捷键打印成员变量
  十一、匿名对象
  方法一：public  static  void func(Person person) {
        new Person().getName();
        new Person().sleep();
    }
    public static void main2(String[] args) {
        func(new Person());
    }
    方法二:public static void main2(String[] args) {
        new Person().getName();
        new Person().sleep();
    }

  */

import java.util.Scanner;

class Person {

    //通过类名来访问属性2 Person.count

    public static  int count = 10;//方法区
    public final int SIZE = 88;//堆
    public static final int SIZE2 = 888;//方法区
    //属性定义于类的内部，方法的外部
    /*
     *
     * name age 属于属性1
     * eat sleep show属于方法1
     * */
    //name age 存放于JVM的 堆 上
    public String  name="boss张";//如未初始化默认值为空
    public int age=18;
    //方法
    public  void eat() {
        System.out.println("count:"+count);
        System.out.println("吃饭");
    }
    public void sleep() {
        System.out.println("睡觉");
    }
    public  void show() {
        System.out.println("name:"+name+" age:"+age);
    }
    public static void func1() {
        // 错误：System.out.println("name:"+name);
        //在静态成员内部不能直接访问实例数据成员
        //不允许调用实例数据成员方法
        //因为静态成员方法不依赖于对象
        System.out.println("func1()");
    }
    //如果想要在静态成员内部访问实例数据成员
    //将对象作为传参 间接的访问
    public static void func2(Person person) {
        System.out.println("name:"+person.name);
    }
    //封装
    private  String name2 ;
    private  int age2 ;
    public  void setName(String name) {
        this.name =name;
    }
    /*
     * this:当前对象的引用（引用地址）
     * */
    public  String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public  int getAge() {
        return age;
    }
    //构造方法
    public Person(){
        this("sunwukong");
        System.out.println("Person()");
    }
    public Person(String name){
        this.name = name ;
        //这里使用this 解释了为什么this不是当前对象而是当前对象的引用
        //因为构造方法是构造对象 person还未构造对象 this又怎么能代表当前对象
        System.out.println("Person()");
    }
    public Person(String name,int age){
        this.name = name ;
        this.age = age;
        System.out.println("Person()");
    }
    //实例代码块--》 初始化实例数据成员（未初始化的前提）
    {
        this.age = 999999;
        this.name = "哪吒";
        count = 999999;
        System.out.println("实例代码块");

    }
    //静态代码块--》 初始化静态数据成员（未初始化的前提）
    static {
        System.out.println("静态代码块");
    }
}
public class TestDemo {
    public  static  void main(String[] args) {
        //实例化一个对象 new
        Person person1 = new Person();
        /*实例对象后对数据对象的访问
         * 1.通过“.”进行访问：person1.数据成员
         * 2.person1.方法
         * */
        person1.show();
        /*person1位于栈 Person的引用
         * 用于存放堆上成员变量的地址
         * 通过地址来访问成员变量
         * 每次进行引用Person都会在 堆 上开辟相应的成员变量
         * */
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(Person.count);
        Person.func1();
        Person.func2(person1);
        person1.eat();
        person1.setName("张自忠");
        person1.setAge(99);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        Person person2 = new Person("张张");
        Person person3 = new Person("gougou",19);
    }
    public static void main1(String[] args) {
        Person person1 = new Person();
    }
    public  static  void func(Person person) {
        new Person().getName();
        new Person().sleep();
    }
    public static void main2(String[] args) {
        func(new Person());
    }
}
