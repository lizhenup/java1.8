import java.util.*;

public class Main {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            //String s = "m jbrwbmamzlz bkjokxancguvcoc";
            String[] strs = sc.nextLine().split(" ");
            System.out.println(strs.length);
            Stack<String> stack = new Stack<>();
            for(String str : strs) {
                Stack<Character> st = new Stack<>();
                for(int i = 0; i < str.length(); i++) {
                    st.push(str.charAt(i));
                }
                StringBuffer sb = new StringBuffer();
                while(!st.isEmpty()) {
                    sb.append(st.pop());
                }
                stack.push(new String(sb));
            }
            while(!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
                if(stack.size() == 1) {
                    System.out.println(stack.pop());
                }
            }
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            //sc.nextLine();
            //String[] str = new String[n];
            LinkedList<String> list = new LinkedList<>();
            while(n-- > 0) {
                String s = sc.next();
                if(s.length() < 8) {
                    StringBuffer sb = new StringBuffer(s);
                    while(sb.length() < 8) {
                        sb.append(0);
                    }
                    list.add(new String(sb));
                }else if(s.length() > 8) {
                    int size = s.length();
                    int cur = 8;
                    while(size > 8) {
                        list.add(s.substring(cur - 8, cur));
                        if(cur + 8 < s.length()) {
                            cur += 8;
                        }
                        size -= 8;
                    }
                    StringBuffer sb = new StringBuffer(s.substring(cur));
                    while (sb.length() < 8) {
                        sb.append(0);
                    }
                    list.add(new String(sb));
                }else {
                    list.add(s);
                }
            }
            for(String li :list) {
                System.out.println(li);
            }
        }
    }
}
