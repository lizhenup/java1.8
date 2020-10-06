public class TestDemo {
    /*class Student {
        public String name;
        public int age;
        public int grade;
        public Student(String name, int age, int grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }
    }
    public static void main1(String[] args) {
        Student[] students = new Student[] {

        };
    }*/
    public static void main(String[] args) {
    }
}
/*
* 1.implements Cloneable
* 2.重写object clone()
* 3.如果当前类包含了引用类型
* Person-> Money
* 在Person的clone方法内，不仅要克隆自己本身 还要克隆Money
*/
class Money implements Cloneable {
    double money = 12.5;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable {
    public String name;
    public Money m;

    public Person(String name, Money m) {
        this.name = name;
        this.m = m;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
