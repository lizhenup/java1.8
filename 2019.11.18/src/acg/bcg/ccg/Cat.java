package acg.bcg.ccg;
class Cat extends Animal{
    public Cat(String name,int age) {
        super(name, age);
    }
    String sex;
    public void catSex(String sex) {
        this.sex = sex;
        System.out.println(name+"是一只"+sex+"猫，它今年"+age+"岁了");
    }
}
