
/*import java.util.Scanner;
class Calculator {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public  void add() {
        System.out.print(getNum1()+getNum2());
    }
    public void sub() {
        System.out.print(getNum1()-getNum2());
    }
    public void mul() {
        System.out.print(getNum1()*getNum2());
    }
    public void div() {
        System.out.print(getNum1()/getNum2());
    }

}
public class Go {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要进行的运算（+、-、*、/）");
        System.out.println("==================================");
        String Cal = scanner.nextLine();

        if (Cal.equals("+")) {
            System.out.println("请输入你要运算的整数：");
            int num1 = scanner.nextInt();
            calculator.setNum1(num1);
            System.out.print("+");
            int num2 = scanner.nextInt();
            calculator.setNum2(num2);
            System.out.print("=");
            calculator.add();

        } else if (Cal.equals("-")) {
            System.out.println("请输入你要运算的整数：");
            int num1 = scanner.nextInt();
            calculator.setNum1(num1);
            System.out.print("-");
            int num2 = scanner.nextInt();
            calculator.setNum2(num2);
            System.out.print("=");
            calculator.sub();

        } else if (Cal.equals("*")) {
            System.out.println("请输入你要运算的整数：");
            int num1 = scanner.nextInt();
            calculator.setNum1(num1);
            System.out.print("*");
            int num2 = scanner.nextInt();
            calculator.setNum2(num2);
            System.out.print("=");
            calculator.mul();

        } else if (Cal.equals("/")) {
            System.out.println("请输入你要运算的整数：");
            int num1 = scanner.nextInt();
            calculator.setNum1(num1);
            System.out.print("/");
            int num2 = scanner.nextInt();
            calculator.setNum2(num2);
            System.out.print("=");
            calculator.div();

        } else {
            System.out.println("输入错误 ");
        }
        scanner.close();
    }
}*/
/*public class  Go {
    public static void main(String[] args) {
        Gos gos1 = new Gos();
        gos1.setName("张大胖");
        gos1.setSex("男");
        gos1.setAge(19);
        gos1.setTall(176);
        gos1.setWeight(77);
        System.out.println(gos1.getName());
        System.out.println(gos1.getSex());
        System.out.println(gos1.getAge());
        System.out.println(gos1.getTall());
        System.out.println(gos1.getWeight());
        Gos gos2 = new Gos();
        gos2.setName("张小胖");
        gos2.setSex("女");
        gos2.setAge(19);
        gos2.setTall(156);
        gos2.setWeight(67);
        gos2.Person();
        Gos gos3 = new Gos();
        gos2.setName("张x胖");
        gos2.setSex("女");
        gos2.setAge(16);
        gos2.setTall(146);
        gos2.setWeight(47);
        gos2.Person2();
    }
}*/
class Fun {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void change() {
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        /*num1 = getNum1()+getNum2();
        num2 = num1-getNum2();
        num1 = num1-num2;*/
    }
    public void show() {
        System.out.println("num1:"+num1+" "+"num2:"+num2);
    }
}
public class Go {
    public static void main(String[] args) {
        Fun fun = new Fun();
        fun.setNum1(90);
        fun.setNum2(26);
        fun.show();
        //System.out.println("num1:"+fun.getNum1()+" "+"num2:"+fun.getNum2());
        fun.change();
        //System.out.println("num1:"+fun.getNum1()+" "+"num2:"+fun.getNum2());
        fun.show();

    }
}