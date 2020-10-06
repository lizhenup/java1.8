package acg.bcg.ccg;

import java.sql.SQLOutput;

public class Animal {
    protected String name;
    protected int age;
    final  String acd = "acddca";
    public Animal(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void animalEat(String food) {
        System.out.println(name + "正在吃"+ food);
    }

}
