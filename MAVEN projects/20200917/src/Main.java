import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author ：lizhen
 * @date ：Created in 2020/9/17 10:48
 * @description：3种 1 2 5 分 n分
 * @modified By：
 * @version: $
 */
/*class Dp{
    int a = 0;
    int b = 0;
    int c = 0;

    public Dp(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}*/
public  class  Main {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //while (sc.hasNext()) {
            int n = 100;//sc.nextInt();
            System.out.println(func(n));
        //}

    }*/
    /*static int ret = 0;
    public static int func(int num) {
        ret = 0;
        HashSet<String> set = new HashSet<>();
        dfs(num,0,0,0,set);
        return ret;
    }

    private static void dfs(int num, int a, int b, int c, HashSet<String> set) {

        if(num == 0) {
            StringBuffer sb = new StringBuffer();
            sb.append(a).append(b).append(c);
            //Dp dp = new Dp(a,b,c);
            if(!set.contains(sb.toString())) {
                ret += 1;
                set.add(sb.toString());
            }
           return;
        }
        if(num >= 5) {
                if()
                set.add(sb.toString());
                dfs(num - 5,a,b,c + 1,set);
        }
        if(num >= 2) {
            set.add(sb.toString());
            dfs(num - 2,a,b + 1,c,set);
        }
        if(num >= 1) {
            set.add(sb.toString());
            dfs(num - 1, a + 1, b, c,set);
        }
    }*/
    public static void main(String[] args) {
        //char[] ch = {'a','a','a','d','b','b','b','c','c','d'};
        String s = "(({}(()[])))";
        String s1 = "))))";
        String s2 = "";
        System.out.println(func1(s2));

    }
    public static boolean func1(String s) {
        if(s.length() == 0 || s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '{' || c == '(' || c == '[') {
                stack.push(c);
            }else if(!stack.isEmpty()) {
               if(c == '}' && stack.peek() == '{') {
                   stack.pop();
               }else if(c == ']' && stack.peek() == '[') {
                   stack.pop();
               }else if(c == ')' && stack.peek() == '(') {
                   stack.pop();
               }
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }

}



