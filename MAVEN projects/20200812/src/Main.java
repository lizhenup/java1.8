/**
 * @author ：lizhen
 * @date ：Created in 2020/8/12 19:31
 * @description：
 * @modified By：
 * @version: $
 */
import java.awt.*;
import java.util.*;
public class Main {
    /*static boolean flg = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n =1 sc.nextInt();
            while (n-- > 0) {
                String[] s = new String[7];
                for (int i = 0; i < s.length; i++) {
                    s[i] = sc.next();
                }
                int[] w = new int[3];
                int[] b = new int[3];
                int[] t = new int[3];
                int wi = 0;
                int bi = 0;
                int ti = 0;
                flg = true;
                for (int i = 0; i < s.length; i++) {
                    if(s[i].charAt(1) == 'T') {
                        if(ti <= 2) {
                            t[ti++] = Integer.parseInt(s[i].substring(0,1));
                        }else {
                           flg = false;
                           break;
                        }
                    }else if(s[i].charAt(1) == 'B') {
                        if(bi <= 2) {
                            b[bi++] = Integer.parseInt(s[i].substring(0,1));
                        }else {
                            flg = false;
                            break;
                        }

                    }else if(s[i].charAt(1) == 'W') {
                        if(wi <= 2) {
                            w[wi++] = Integer.parseInt(s[i].substring(0,1));
                        }else {
                            flg = false;
                            break;
                        }
                    }
                }
                if (flg) {
                    boolean[] bl = new boolean[3];
                    isNum(w,bl);
                    isNum(t,bl);
                    isNum(b,bl);
                }
                if(flg) {
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }

            }
        }
    }

    private static void isNum(int[] arr, boolean[] bl) {
        if(!flg) {
            return;
        }
        Arrays.sort(arr);
        int k = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                if(k == -1) {
                    if(!bl[arr[i] % 3]) {
                        bl[arr[i] % 3] = true;
                        k = arr[i];
                    }else {
                        flg = false;
                        return;
                    }
                }else {
                    if(k % 3 != arr[i] % 3) {
                        flg = false;
                        return;
                    }else {
                        k += 3;
                    }
                }
            }
        }
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            Point[][] points = new Point[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    Point point = new Point(0,0);
                    points[i][j] = point;
                }
            }
            int[][] sum = new int[n][n];
            int max = Integer.MIN_VALUE;
            int maxX = -1;
            int maxY = -1;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = sc.nextInt();
                    for (int k = 0; k < n; k++) {
                        points[i][k].x += arr[i][j];
                        sum[i][k] += arr[i][j];
                        if(sum[i][k] > max) {
                            max = sum[i][k];
                            maxX = i;
                            maxY = k;
                        }
                    }
                    for (int k = 1; k < points.length; k++) {
                        points[k][j].y += arr[i][j];
                        sum[k][j] += arr[i][j];
                        if(sum[k][j] > max) {
                            max = sum[k][j];
                            maxX = k;
                            maxY = j;
                        }
                    }
                    boolean first = true;
                    while (n-- > 0) {
                        sum[maxX][maxY] = -1;
                        if(first) {
                            int endX = maxX + 1;
                            int endY = maxY + 1;
                            System.out.println(endX +" "+ endY);
                            first = false;
                        }else {
                            int endX = maxX + 1;
                            int endY = maxY + 1;
                            System.out.println(endX +" "+ endY);
                        }
                        int X = points[maxX][maxY].x;
                        int Y = points[maxX][maxY].y;
                        max = Integer.MIN_VALUE;
                        for (int k = 0; k < points[0].length; k++) {
                            if(sum[maxX][k] != -1) {
                                sum[maxX][k] -= X;
                                if(sum[maxX][k] > max) {
                                    max = sum[maxX][k];
                                    maxY = k > maxY ? k - 1 : maxY;
                                    maxX--;
                                }
                            }
                        }
                        for (int k = 0; k < points.length; k++) {
                            if(sum[k][maxY] != -1) {
                                sum[k][maxY] -= Y;
                                if(sum[k][maxY] > max) {
                                    max = sum[k][maxY];
                                    maxX = k > maxX ? k - 1 : maxX;
                                    maxY--;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
class Num {
    static int x = 0;
    static int y = 0;
    static int point = 0;
}
