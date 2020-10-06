import java.util.Queue;
import java.util.*;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/16 14:58
 * @description：
 * @modified By：
 * @version: $
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            Queue<String> strs = new LinkedList<>();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) != ' ') {
                    sb.append(str.charAt(i));
                }else if(sb.length() > 0 && str.charAt(i) == ' ') {
                    strs.offer(sb.toString());
                    sb.delete(0,sb.length());
                }
            }
            if(sb.length() > 0) {
                strs.offer(sb.toString());
            }
            String tmp = null;
            Queue<String> queue = new LinkedList<>();
            if(strs.size() == 0) {
                System.out.println();
            }else {
                for (String s : strs) {
                    if(s.equals("undo") && !queue.isEmpty() && tmp == null) {
                        tmp = ((LinkedList<String>) queue).removeLast();
                    }else if(s.equals("redo") && tmp != null) {
                        queue.add(tmp);
                        tmp = null;
                    }else if(!s.equals("redo") && !s.equals("undo") && !s.equals(" ")){
                        queue.add(s);
                    }
                }
                while (queue.size() > 1) {
                    System.out.print(queue.poll() + " ");
                }
                System.out.println(queue.poll());
            }
        }
    }
    /*public static int CalulateMethodCount (int num_money) {
        // write code here
        int a = 2;
        int b = 4;
        int c = 7;
        if(num_money <= 2) {
            return num_money;
        }else if(num_money == 3) {
            return 4;
        }else if(num_money == 4) {
            return 5;
        }else {
            for (int i = 5; i <= num_money; i++) {
                 c *= 2;

            }
            return c;
        }
    }*/
}
