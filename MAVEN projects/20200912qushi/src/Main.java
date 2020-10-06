import java.util.*;

/**
 * @author ：lizhen
 * @date ：Created in 2020/9/12 18:51
 * @description：
 * @modified By：
 * @version: $
 */
public class Main {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            int num = sc.nextInt();
            if(num >= s.length()) {
                System.out.println(0);
            }else {
                StringBuffer sb = new StringBuffer(s);
                boolean flg;
                while (num-- > 0) {
                    flg = false;
                    for (int i = 0; i < sb.length() - 1; i++) {
                        if(sb.charAt(i + 1) < sb.charAt(i)) {
                            flg = true;
                            sb.deleteCharAt(i);
                            break;
                        }
                    }
                    if(!flg) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                }
                while (sb.charAt(0) == 0 && sb.length() > 1) {
                    sb.deleteCharAt(0);
                }
                System.out.println(sb.toString());
            }
        }
    }*/
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String mid = sc.next();
            String last = sc.next();
            StringBuffer ret = new StringBuffer();
            char root = last.charAt(last.length() - 1);
            int index = findIndex(mid,root);
            findFirst(root,ret,mid,last,index);
            System.out.println(ret.toString());
        }
    }


    private static void findFirst(char root, StringBuffer ret, String mid, String last, int index) {
        ret.append(root);
        if(index > 0) {
            String midLeft = mid.substring(0,index);
            String lastLeft = last.substring(0,midLeft.length());
            findFirst(lastLeft.charAt(lastLeft.length() - 1),ret,midLeft,
                    lastLeft,findIndex(midLeft,lastLeft.charAt(lastLeft.length() - 1)));
        }
        if(index < mid.length() - 1) {
            String midRight = mid.substring(index+1,mid.length());
            String lastRight = last.substring(last.length() - 1 - midRight.length(),last.length() - 1);
            findFirst(lastRight.charAt(lastRight.length() - 1),ret,midRight,
                    lastRight,findIndex(midRight,lastRight.charAt(lastRight.length() - 1)));
        }

    }

    public static int findIndex(String s, char key) {
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if(key == s.charAt(i)) {
                index = i;
                break;
            }
        }
        return index;
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            if (s1.length() != s2.length()) {
                System.out.println("false");
            } else {
                boolean ret = true;
                HashMap<Character, Integer> map = new HashMap<>();
                for (int i = 0; i < s1.length(); i++) {
                    char c = s1.charAt(i);
                    map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
                }
                for (int i = 0; i < s2.length(); i++) {
                    char c = s2.charAt(i);
                    if (!map.containsKey(c)) {
                        ret = false;
                        break;
                    }else {
                        if(map.get(c) <= 0) {
                            ret = false;
                            break;
                        } else {
                            map.put(c, map.get(c) - 1);
                        }
                    }
                }
                if(ret) {
                    for (char key : map.keySet()) {
                        if(map.get(key) > 0) {
                            ret = false;
                            break;
                        }
                    }
                    if(ret) {
                        System.out.println(ret);
                    }
                }else {
                    System.out.println(ret);
                }
            }
        }
    }

    public char firstUniqChar(String s) {
        LinkedHashMap<Character,Boolean> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c,!map.containsKey(c));
        }
        for (Character key : map.keySet()) {
            if(map.get(key)) {
                return key;
            }
        }
        return ' ';
    }
}
