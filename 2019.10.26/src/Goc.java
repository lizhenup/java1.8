import java.util.Scanner;

public class Goc {
      static class Calculator {
        public  int num1;
        public  int num2;
        public  void add(int num1,int num2) {
            System.out.println(num1+num2);
        }
        public void sub(int num1,int num2) {
            System.out.println(num1-num2);
        }
        public void mul(int num1,int num2) {
            System.out.println(num1*num2);
        }
        public void div(int num1,int num2) {

            System.out.println(num1/num2);
        }
    }

    public static void main(String[] args) {
        Calculator calculator  = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要进行的运算（+、-、*、/）");
        System.out.println("===================");
        String Cal = scanner.nextLine();

   /*     if(str.Cal("+")) {
            System.out.println("请输入你要运算的整数：");
            int num1 = scanner.nextInt();
            System.out.print("+");
            int num2 = scanner.nextInt();
            System.out.print("=");


        } else if(str.equals("-")) {
            System.out.println("请输入你要运算的整数：");
            int num1 = scanner.nextInt();
            System.out.print("-");
            int num2 = scanner.nextInt();
            System.out.print("=");

        } else if(str.equals("*")) {
            System.out.println("请输入你要运算的整数：");
            int num1 = scanner.nextInt();
            System.out.print("*");
            int num2 = scanner.nextInt();
            System.out.print("=");

        } else if(str.equals("/")) {
            System.out.println("请输入你要运算的整数：");
            int num1 = scanner.nextInt();
            System.out.print("/");
            int num2 = scanner.nextInt();
            System.out.print("=");

        }else {
            System.out.println("输入错误 ");
        }*/

    }
}
