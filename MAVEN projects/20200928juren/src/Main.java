import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author ：lizhen
 * @date ：Created in 2020/9/28 19:17
 * @description：
 * @modified By：
 * @version: $
 */
public class Main {
    /*public static void main(String[] args) {
        int[][] arr = {{0,1,2},{3,4,5},{6,7,8}};
        System.out.println(RotateMatrix(arr));
    }*/
    public static int[][] RotateMatrix (int[][] matrix) {
        // write code here
        int[] arr = new int[matrix.length * matrix[0].length];
        int index = 0;
        for (int i = matrix[0].length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix.length; j++) {
                arr[index++] = matrix[j][i];
            }
        }
        int[][] ret = new int[matrix.length][matrix[0].length];
        index = 0;
        for (int i = 0; i < ret.length; i++) {
            for (int j = 0; j < ret[0].length; j++) {
                ret[i][j] = arr[index++];
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        String s1 = "abccade";
        String s2 = "dgcadde";
        System.out.println(GetCommon(s1, s2));
    }

    public static String GetCommon (String str1, String str2) {
        // write code here
        /*HashSet<String> set1 = new HashSet<>();
        findSub(str1,set1);
        HashSet<String> set2 = new HashSet<>();
        findSub(str2,set2);*/
        /*String ret = "";
        for (String s : set1) {
            if(set2.contains(s)) {
                if(ret.length() < s.length()) {
                    ret = s;
                }
            }
        }
        return ret;*/
        //ArrayList<String> list = new ArrayList<>();
        int[][] arr = new int[str1.length()][str2.length()];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(str1.charAt(i) == str2.charAt(j)) {
                    arr[i][j] = 1;
                    /*StringBuffer sb = new StringBuffer();
                    sb.append(i).append(j);
                    list.add(new String(sb));*/
                }
            }
        }
        int ret = 0;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 1) {
                    int st = i;
                    int tmp = 0;
                    int x = i;
                    int y = j;
                    while (arr[x][y] == 1) {
                        tmp++;
                        if(x < arr.length - 1) {
                            x++;
                        }else {
                            break;
                        }
                        if(y < arr[0].length - 1) {
                            y++;
                        }else {
                            break;
                        }
                    }
                    if(tmp > len) {
                        len = tmp;
                        ret = st;
                    }
                }
            }
        }
        return str1.substring(ret, ret + len);
    }

    /*private void findSub(String str, HashSet<String> set) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                StringBuffer sb = new StringBuffer();
                for (int k = i; k <= j; k++) {
                    sb.append(str.charAt(k));
                }
                set.add(new String(sb));
            }
        }
    }*/

    /*private void findSub(char[] ch, int i, String sub,HashSet<String> set) {
        if(i == ch.length) {
            set.add(sub);
            return;
        }else {
            findSub(ch,i + 1, sub+ch[i],set);
            findSub(ch,i + 1, sub,set);
        }
    }*/
}
