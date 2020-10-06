/**
 * @author ：lizhen
 * @date ：Created in 2020/9/15 19:24
 * @description：
 * @modified By：
 * @version: $
 */
import java.sql.Array;
import java.util.*;

public class Main {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            if(str.equals("")) {
                System.out.println(true);
            }else {
                boolean flg = true;
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    if(c == '{' || c == '(' || c == '[') {
                        stack.push(c);
                    }else if(!stack.isEmpty()) {
                        if(c == '}' && stack.peek() == '{') {
                            stack.pop();
                        }else if(c == ')' && stack.peek() == '(') {
                            stack.pop();
                        }else if(c == ']' && stack.peek() == '[') {
                            stack.pop();
                        }else {
                            flg = false;
                        }
                    }else {
                        flg = false;
                    }
                }
                if(!stack.isEmpty()) {
                    flg = false;
                }

                System.out.println(flg);
            }
        }
    }*/
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            LinkedHashSet<Character> set = new LinkedHashSet<>();
            for (int i = 0; i < str.length(); i++) {
                set.add(str.charAt(i));
            }
            StringBuffer sb = new StringBuffer();
            for (char c : set) {
                sb.append(c);
            }
            System.out.println(sb.toString());
        }
    }*/
    public static void main(String[] args) {
        String s1 = "";
        String s2 = null;
        System.out.println(s1.length());
    }

    public void quickSort(int[] arr,int st, int ed) {
        if(st > ed) {
            return;
        }
        int i = st;
        int j = ed;
        int cur = arr[st];
        while (i != j) {
            while (cur >= arr[j] && i < j) {
                j--;
            }
            while (cur <= arr[i] && i < j) {
                i++;
            }
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        arr[st] = arr[i];
        arr[i] = cur;
        quickSort(arr,st, i - 1);
        quickSort(arr, i + 1, ed);
    }
}
