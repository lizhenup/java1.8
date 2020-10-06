/**
 * @author ：lizhen
 * @date ：Created in 2020/9/16 10:42
 * @description：
 * @modified By：
 * @version: $
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            int ret = 0;
            int st = 0;
            int len = 0;
            boolean flg = false;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c >= '0' && c <= '9') {
                    if(!flg) {
                       st = i;
                       len = 1;
                       flg = true;
                    }else {
                        len++;
                    }
                }else {
                    if(len != 0) {
                        String sub = s.substring(st,st+len);
                        ret += Integer.parseInt(sub);
                        flg = false;
                        len = 0;
                    }
                }
            }
            int[] arr = {1,2,3,4};
            if(len != 0) {
                String sub = s.substring(st,st+len);
                ret += Integer.parseInt(sub);
            }
            System.out.println(ret);
        }
    }


}

