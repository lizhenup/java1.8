/**
 * @author ：lizhen
 * @date ：Created in 2020/9/19 14:56
 * @description：
 * @modified By：
 * @version: $
 */
import java.util.*;

public class Main {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            int k = 65;
            int num = n * m;
            for (int i = 0; i < arr[0].length; i++) {
                arr[0][i] = k++;
                num--;
                if(k == 91) {
                    k = 65;
                }
            }
            for (int i = 1; i < arr.length; i++) {
                arr[i][arr[0].length - 1] = k++;
                num--;
                if(k == 91) {
                    k = 65;
                }
            }
            for (int i = arr[0].length - 2; i >= 0; i--) {
                arr[arr.length - 1][i] = k++;
                num--;
                if(k == 91) {
                    k = 65;
                }
            }
            for (int i = arr.length - 2; i > 0; i--) {
                arr[i][0] = k++;
                num--;
                if(k == 91) {
                    k = 65;
                }
            }
            int i = 1;
            int j = 1;
            while (num > 0) {
                if(k == 91) {
                    k = 65;
                }
                if(arr[i - 1][j] != 0 && arr[i][j - 1] != 0) {
                    arr[i][j] = k++;
                    num--;
                    if(arr[i][j + 1] == 0) {
                        j++;
                    }else {
                        i++;
                    }
                }else if(arr[i - 1][j] != 0 && arr[i][j + 1] != 0) {
                    arr[i][j] = k++;
                    num--;
                    if(arr[i + 1][j] == 0) {
                        i++;
                    }else {
                        j--;
                    }
                }else if(arr[i + 1][j] != 0 && arr[i][j + 1] != 0) {
                    arr[i][j] = k++;
                    num--;
                    if(arr[i][j - 1] == 0) {
                        j--;
                    }else {
                        i--;
                    }
                }else if(arr[i + 1][j] != 0 && arr[i][j - 1] != 0) {
                    arr[i][j] = k++;
                    num--;
                    if(arr[i - 1][j] == 0) {
                        i--;
                    }else {
                        j++;
                    }
                }
            }

            for (int u = 0; u < arr.length; u++) {
                for (int v = 0; v < arr[0].length; v++) {
                    System.out.print((char) arr[u][v] + " ");
                }
                System.out.println();
            }
        }
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            char[] s = sc.nextLine().toCharArray();
            char[] p = sc.nextLine().toCharArray();
            int len = s.length;
            int i = 0;
            int j = 0;
            int k = -1;
            int iX = 0;
            int iJ = 0;
            int iD = 0;
            boolean ret = true;
            while (i < len) {
                if(s[i] == p[j]) {
                    i++;
                    j++;
                }else if(p[j] == '.') {
                    if(k == -1) {
                        i++;
                        j++;
                    }else if(iJ != 0) {
                        if(i - k > 0) {
                            iJ = 0;
                            i++;
                            j++;
                        }else {
                            ret = false;
                            break;
                        }
                    }else if(iX != 0) {
                        if(i - k >= 0) {
                            iX = 0;
                            i++;
                            j++;
                        }else {
                            ret = false;
                            break;
                        }
                    }
                }else if(p[j] == '*') {
                    if(k == -1) {
                        k = i;
                        i++;
                        j++;
                        iX++;
                    }else if(iD != 0 && (k - i) == 1) {
                        k = i;
                        iD = 0;
                    }else if(iJ != 0 && (k - i) > 0) {
                        iJ = 0;
                    }else {
                        ret = false;
                        break;
                    }
                }else if(p[j] == '+') {
                    if(k == -1) {
                        k = i;
                        i++;
                        j++;
                        iJ++;
                    }else if(iD != 0) {
                        if(k - i != 1) {
                            ret = false;
                            break;
                        }else {
                            iD = 0;
                        }
                    }else if(iX != 0 && k - i >= 0) {
                        iX = 0;
                        k = i;
                        i++;
                        j++;
                    }else {
                        ret = false;
                        break;
                    }
                }
            }
            System.out.println(ret);
        }
    }
}
