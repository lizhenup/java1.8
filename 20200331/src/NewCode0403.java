import java.text.DecimalFormat;
import java.util.*;

public class NewCode0403 {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            double n = sc.nextDouble();
            double ret = 1;
            while (n > 1) {
                ret *= (1 - (1 / n--));
            }
            System.out.println(ret);
            ret *= 100;
            System.out.println(new DecimalFormat("0.00").format(ret) + "%");
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            double ret = func2(n) / func1(n) * 100;
            System.out.println(String.format("%.2f",ret) + "%");
        }
    }

    private static double func2(int n) {
        if(n == 1) {
            return 0;
        }else if(n == 2) {
            return 1;
        }else {
            return (n-1) *(func2(n - 1) + func2(n - 2));
        }
    }

    private static double func1(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * func1(n - 1);
    }
}
