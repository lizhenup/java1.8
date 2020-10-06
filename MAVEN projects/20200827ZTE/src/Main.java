import java.util.*;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/27 10:59
 * @description：
 * @modified By：
 * @version: $
 */
/*
4 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
*/
public class Main {
    public static void main(String[] args) {
        /*Integer a = new Integer(127);
        Integer b = new Integer(127);
        Integer c = 127;
        int d = 1;
        Integer e = Integer.valueOf(127);
        System.out.println();*/
        String a = "abc";
        String b = new String("abc");
        String c = "ab" + "c";
        String d = "ab";
        String e = d +"c";
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == e);
        System.out.println(b == c);
        System.out.println(c == e);



        /*Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            long ret = Long.MIN_VALUE;
            for (int i = 1; i < arr.length - 1; i++) {
                for (int j = 1; j < arr[0].length - 1; j++) {
                    ret = Math.max(func(arr,arr[i][j],i,j), ret);
                }
            }
            System.out.println(ret);
        }*/
    }

   /* private static int func(int[][] arr, int num, int x, int y) {
        return num + arr[x - 1][y] + arr[x + 1][y] + arr[x][y - 1] + arr[x][y + 1];
    }*/
}
