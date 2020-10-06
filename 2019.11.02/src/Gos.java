class  Gos {
    private String name;
    private  String sex;
    private  int age;
    private  int tall;
    private  int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void Person() {
        System.out.println("名字："+getName() +" "+"性别："+ getSex() +" "+"年龄："+ getAge());
    }
    public void Person2() {
        System.out.println(
                "名字："+getName() +" "+"性别："+ getSex() +" "+"年龄："+ getAge() +" "+"身高："+ getTall() +" "+"体重："+getWeight() );
    }

}
