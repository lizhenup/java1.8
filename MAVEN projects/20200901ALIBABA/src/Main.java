/**
 * @author ：lizhen
 * @date ：Created in 2020/9/1 18:59
 * @description：
 * @modified By：
 * @version: $
 */
import java.util.*;
public class Main {
    static HashSet<String> set1;
    static HashSet<String> set2;
    static HashSet<String> tmp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int lenS = sc.nextInt();
            int lenT = sc.nextInt();
            String S = sc.next();
            String T = sc.next();
            if(S.length() == 0 || T.length() == 0) {
                System.out.println(0);
            }else {
                int ret = 0;
                HashSet<Character> set = new HashSet<>();
                if(lenS > lenT) {
                    for (int i = 0; i < lenT; i++) {
                        for (int j = 0; j < lenS; j++) {
                            if(T.charAt(i) == S.charAt(i)) {
                                S.replace(S.charAt(i),' ');
                                if(ret == 0)
                                    ret++;
                                if(!set.contains(T.charAt(i)) && ret != 0) {
                                    set.add(T.charAt(i));
                                    ret += ret * 2;
                                }else {
                                    ret += (ret - 1) * 2;
                                }

                            }
                        }
                    }
                }else {
                    for (int i = 0; i < lenS; i++) {
                        for (int j = 0; j < lenT; j++) {
                            if(T.charAt(i) == S.charAt(i)) {
                                T.replace(T.charAt(i),' ');
                                if(ret == 0)
                                    ret++;
                                if(!set.contains(T.charAt(i)) && ret != 0) {
                                    set.add(T.charAt(i));
                                    ret += ret * 2;
                                }
                            }
                        }
                    }
                }
            }

        }
    }

    /*private static HashSet<String> toSet(ArrayList<String> list1) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < list1.size(); i++) {
            set.add(list1.get(i));
        }
        return set;
    }*/

    /*private static ArrayList<String> func(String S) {
        ArrayList<String> ret = new ArrayList();
        ret.add(S.substring(0,1));
        tmp.add(ret.get(0));
        for (int i = 1; i < S.length(); i++) {
            ret.add(S.substring(i,i+1));
            tmp.add(ret.get(i));
            for (int j = 0; j < i; j++) {
                ret.add(ret.get(j) + S.charAt(i));
                tmp.add(ret.get(ret.size() - 1));
            }
        }
        return ret;
    }*/
}
