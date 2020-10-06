package acg.bcg.ccg;

import java.util.concurrent.Callable;

public class Go {
    public static void main(String[] args) {
        Dog dog = new Dog("张小小",9);
        dog.dogSleep("没头没脑睡的香");
        Cat cat = new Cat("白黑黑",6);
        cat.catSex("母");
        /**
         *向上转型发生的时机:
         * 直接赋值
         * 方法传参
         * 方法返回
         * 向上赋值
         */
        Animal cat2 = new Cat("黑白白",9);
        Animal cat3 = cat;
        /**
         *向下转型
         * 创建一个新的父类对象的引用
         * 父类对象中没有dogSleep方法
         *此时想调用Dog中的dogSleep方法则需向下引用
         * 代码为"Dog dog3 = (Dog) animal;"
         * 但需要注意不可张冠李戴
         * 去调用其他子类中的方法 如Cat中的catSex;
         */
        Animal animal = new Dog("xixi",66);
        Dog dog3 = (Dog) animal;
        dog3.dogSleep("有头脑睡的不开心");

    }
}
