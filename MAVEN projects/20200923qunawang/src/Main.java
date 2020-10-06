/**
 * @author ：lizhen
 * @date ：Created in 2020/9/23 19:13
 * @description：
 * @modified By：
 * @version: $
 */
import java.math.BigInteger;
import java.util.*;

public class Main {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n < m || n <= 0 || m <= 0) {
                System.out.println(0);
            }else {
                if(m  > n / 2) {
                    m = n - m;
                }
                BigInteger ret = new BigInteger("1");
                BigInteger k = new BigInteger("1");
                for (int i = 0; i < m; i++) {
                    BigInteger tmp1 = new BigInteger(String.valueOf(n - i));
                    BigInteger tmp2 = new BigInteger(String.valueOf(i + 1));
                    ret = ret.multiply(tmp1);
                    k = k.multiply(tmp2);
                }
                BigInteger res = ret.divide(k);
                System.out.println(res);
            }
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            sc.nextLine();
            String[] s1 = sc.nextLine().split(" ");
            String[] s2 = sc.nextLine().split(" ");
            if(n <= 0) {
                System.out.println(n);
            }else {
                HashMap<String ,Integer> map = new HashMap<>();
                for (int i = 0; i < s2.length; i++) {
                    map.put(s2[i],i);
                }
                for (int i = 0; i < s1.length; i++) {
                    if(!map.containsKey(s2[i])) {
                        System.out.println(0);
                        continue;
                    }
                }
                int[] arr = new int[n];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = map.get(s1[i]);
                }
                int[] dp = new int[n];
                dp[0] = 1;
                for (int i = 1; i < arr.length; i++) {
                    int max = 0;
                    for (int j = i; j >= 0; j--) {
                        if(arr[j] < arr[i] && dp[j] > max) {
                            max = dp[j];
                        }
                    }
                    dp[i] = max + 1;
                }
                System.out.println(dp[dp.length - 1]);
            }
        }
    }
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            sc.nextLine();
            String[] s = sc.nextLine().split(" ");
            if(n < 2) {
                System.out.println("GaoPai");
            }else if(n == 2) {
                if(s[0].substring(1,s[0].length()).equals(s[1].substring(1,s[1].length()))) {
                    System.out.println("YiDui");
                }else {
                    System.out.println("GaoPai");
                }
            }else if(n == 3) {
                if((s[0].substring(1,s[0].length()).equals(s[1].substring(1,s[1].length())))
                        || (s[0].substring(1,s[0].length()).equals(s[2].substring(1,s[2].length())))
                        || (s[1].substring(1,s[1].length()).equals(s[2].substring(1,s[2].length())))) {
                    System.out.println("YiDui");
                }else {
                    System.out.println("GaoPai");
                }
            }else {
                System.out.println("HuangJiaTongHuaShun");
            }
        }
    }*/
}
