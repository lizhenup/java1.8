/**
 * @author ：lizhen
 * @date ：Created in 2020/9/25 19:12
 * @description：
 * @modified By：
 * @version: $
 */
import java.util.*;


public class Main {

    /*public static Interval solve (int n, int k, String str1, String str2) {
        // write code
        int a = 0;
        int b = 0;
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == str2.charAt(i)) {
                a++;
            }else {
                b++;
            }
        }
        Interval ret = new Interval();
        if(n <= k) {
            ret.start = a;
            ret.end = a;
        }else {
            ret.start = n - a;
            ret.end = n - b;
        }
        return ret;
    }*/
    public static void main(String[] args) {
        //float a = 0.9f - 0.8f;
        //float b = 1.0f - 0.9f;
       // System.out.println(a);
       // System.out.println(b);
        //System.out.println(a == b);
        //String[] s1 = {"1101","1010","1111","1110"};
       // String[] s2 = {"ABCD","EFGH","IJKL","MNPQ"};
        //System.out.println(rotatePassword(s1,s2));
    }
    public static String rotatePassword (String[] s1, String[] s2) {
        // write code here
        char[][] ch = new char[s1.length][s1[0].length()];
        char[][] arr = new char[s2.length][s2[0].length()];
        for (int i = 0; i < ch.length; i++) {
            String tmp = s1[i];
            for (int j = 0; j < ch[0].length; j++) {
                ch[i][j] = tmp.charAt(j);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            String tmp = s2[i];
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = tmp.charAt(j);
            }
        }
        StringBuilder sb1 = new StringBuilder();
        int len = ch[0].length - 1;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[0].length; j++) {
                if(ch[i][j] == '0') {
                    sb1.append(arr[i][j]);

                }
            }
        }
        for (int i = 0; i < ch[0].length; i++) {
            for (int j = ch.length - 1; j >= 0; j--) {
                if(ch[j][i] == '0') {
                    sb1.append(arr[i][len - j]);
                }
            }
        }
        for (int i = ch.length - 1; i >= 0; i--) {
            for (int j = ch[0].length - 1; j >= 0; j--) {
                if(ch[i][j] == '0') {
                    sb1.append(arr[len - i][len - j]);
                }
            }
        }
        for (int i = arr[0].length - 1; i >= 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if(ch[j][i] == '0') {
                    sb1.append(arr[len - i][len - j]);
                }
            }
        }
        //String ret = new String(sb1.append(sb2).append(sb3).append(sb4).toString());
        return sb1.toString();
    }
}
