/*
* 面试问题：
* Cloneable 是一个空接口 为什么
* 标记接口：
* Person implements Cloneable
* 将来可以被克隆
* 1.实现implements Cloneable
* 2.重写Object clone()
* 3.如果当前类包含了引用类型
* Person ——》 Money
* 在Person的clone方法内 不仅要克隆本事 还需要克隆money
*
*/
public class TestDemo {

    public static void main(String[] args) throws CloneNotSupportedException{
        Person person = new Person();
        person.name = "caocao";
        Person person2 = (Person)person.clone();
        System.out.println(person.m.money);
        System.out.println(person2.m.money);
        System.out.println("=====================");
        person2.m.money= 15.9;
        System.out.println(person.m.money);
        System.out.println(person2.m.money);
    }
}
class Money implements Cloneable{
    double money = 12.8;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable {
    public String name;
    public Money m;
    public Person() {
        this.m = new Money();
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        Person per = (Person)super.clone();
        per.m = (Money) this.m.clone();
        return per;
    }
}
