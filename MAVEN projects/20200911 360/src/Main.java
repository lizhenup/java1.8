/**
 * @author ：lizhen
 * @date ：Created in 2020/9/11 19:58
 * @description：
 * @modified By：
 * @version: $
 */
import java.util.*;
public class Main {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String pwd = sc.nextLine();
            if(pwd.length() < 8) {
                System.out.println("Irregular password");
            }else {
                boolean flgA = false;
                boolean flgB = false;
                boolean flgC = false;
                boolean flgD = false;
                for (int i = 0; i < pwd.length(); i++) {
                    char c = pwd.charAt(i);
                    if(c >= '0' && c <= '9') {
                        flgA =true;
                    }else if(c >= 'a' && c <= 'z') {
                        flgB =true;
                    }else if(c >= 'A' && c <= 'Z') {
                        flgC =true;
                    }else {
                        flgD =true;
                    }
                }
                if(flgA && flgB && flgC && flgD) {
                    System.out.println("Ok");
                }else {
                    System.out.println("Irregular password");
                }
            }
        }
    }*/
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int doPerson = sc.nextInt();
            if(doPerson <= 0) {
                for (int i = 1; i <= num ; i++) {
                    System.out.print(i);
                }
            }else {
                int[] arr1 = new int[doPerson];
                int[] arr2 = new int[doPerson];
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = sc.nextInt();
                    arr2[i] = sc.nextInt();
                }
                LinkedHashSet<Integer> set = new LinkedHashSet<>();
                for (int i = 1; i <= num ; i++) {
                    set.add(i);
                }
                if(doPerson == 2 && arr1[0] == arr1[1]) {
                    for (int i : set) {
                        System.out.print(i + " ");
                    }
                } else {
                    for (int i = 1; i < arr1.length - 1; i++) {
                        set.remove(arr1[i]);
                    }
                    if(arr1[0] == 0) {
                        set.remove(arr1[0]);
                    }
                    if(arr2[arr2.length - 1] == 1) {
                        set.remove(arr2[arr2.length - 1]);
                    }
                    if(set.size() > 2) {
                        set.remove(arr1[0]);
                        set.remove(arr1[doPerson - 1]);
                    }
                    for (int i : set) {
                        System.out.print(i + " ");
                    }
                }
            }
        }
    }*/
    //PAYPALISHIRING
    //PAAPLYI
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(convert(s,3));

    }


    /*public static String convert(String s, int numRows) {
        String ret = "";
        if(numRows <= 0 || s.length() == 0
                || s == null || numRows < 3) {
            return ret;
        }
        int len = s.length();
        char[][] ch = new char[numRows][len];
        int x = 0;
        int y = 0;
        int k1 = numRows;
        int k2 = 0;
        int index = 0;
        while (index <= len - 1) {
            while (k1-- > 0 && index <= len - 1) {
                ch[x++][y] = s.charAt(index++);
            }
            if(index <= len - 1) {
                k2 = numRows - 2;
                x-=2;
                y++;
            }else {
                break;
            }
            while (k2-- > 0 && index <= len - 1) {
                ch[x--][y++] = s.charAt(index++);
            }
            if(index <= len - 1) {
                k1 = numRows;
            }else {
                break;
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numRows; j++) {
                if(ch[i][j] >= 'A' && ch[i][j] <= 'Z') {
                    sb.append(ch[i][j]);
                }
            }
        }
        return sb.toString();
    }*/

    public static String convert(String s, int numRows) {
        if(numRows == 1) {
            return s;
        }
        ArrayList<StringBuffer> list = new ArrayList<>();
        for (int i = 0; i < Math.min(s.length(), numRows); i++) {
            list.add(new StringBuffer());
        }
        int index = 0;
        boolean flg = false;
        for (char c : s.toCharArray()) {
            list.get(index).append(c);
            if(index == 0 || index == numRows - 1)
                flg = !flg;
            index += flg ? 1 : -1;
        }
        StringBuffer ret = new StringBuffer();
        for (StringBuffer sb : list) {
            ret.append(sb);
        }
        return ret.toString();
    }
}
