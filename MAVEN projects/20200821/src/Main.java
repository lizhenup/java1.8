import java.util.Scanner;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/21 16:59
 * @description：
 * @modified By：
 * @version: $
 */
public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //while (sc.hasNext()) {
            String a = "1988";//sc.nextLine();
            String b = "98";//sc.nextLine();
            int[] arr1 = new int[a.length()];
            int[] arr2 = new int[b.length()];
            for (int i = arr1.length - 1; i >= 0; i--) {
                arr1[i] = a.charAt(a.length() -1 - i) - 48;
            }
            for (int i = b.length() - 1; i >= 0; i--) {
                arr2[i] = b.charAt(b.length() -1 - i) - 48;
            }
            int[] ret = new int[a.length() + b.length()];
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    int num = arr1[i] * arr2[j];
                    int t = i + j;
                    while (num > 0) {
                        ret[t] += num % 10;
                        int k = ret[t];
                        while (k >= 10) {
                            ret[t] -= 10;
                            ret[t + 1]++;
                            k = ret[t + 1];
                        }
                        t++;
                        num /= 10;
                    }
                }
            }
            StringBuffer sb = new StringBuffer();

            for (int i = ret.length - 1; i >= 0; i--) {
                sb.append(ret[i]);
            }
            while (sb.charAt(0) == '0') {
                sb.deleteCharAt(0);
            }
            System.out.println(sb.toString());
       // }
    }

}
