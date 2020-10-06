import java.util.Scanner;

public class go {
    public static int func(int a,int b) {
        int tmp = 0;
        if(a%b==0) {
            return b;
        }
        while(a%b!=0) {
            tmp=a%b;
            a=b;
            b=tmp;
        }


        return tmp;
}
    public static int func2(int n) {
        int count = 0;
        for (int num = 1; num <= n; num++) {

            if (num % 10 == 9) {
                count++;
            }

            if (num / 10 == 9) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int m =scanner.nextInt();
        System.out.println("请输入第二个数字： ");
        int n =scanner.nextInt();
        System.out.println(func(m,n));*/
        System.out.println(func2(100));
    }
}
