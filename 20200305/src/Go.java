import java.sql.SQLOutput;
import java.util.*;
class Test {
        public static void hello() {
            System.out.println("hello");
        }
}
    public class Go {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            char[] st2 = str2.toCharArray();
            char[] st1 = str1.toCharArray();
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < st2.length; i++) {
                for(int j = 0; j < st1.length;j++) {
                    if(st2[i] == st1[j] && st2[i] != ' ') {
                        func(st2[i],st1);
                    }
                }
            }
            for(char s : st1) {
                sb.append(s);
            }
            System.out.println(sb.toString());
        }
        public static char[] func(char a,char[] st1) {
            for(int i  = 0; i <st1.length; i++) {
                if(a == st1[i]) {
                    int j = i;
                    while((j + 1) < st1.length) {
                        st1[j] = st1[j + 1];
                        j++;
                    }
                    st1[st1.length -1] = ' ';
                    i--;
                }
            }
            return st1;
        }
        /*public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n =  0;
            if(sc.hasNext()) {
                n = sc.nextInt();
            }
            int re = func(n);
            System.out.println(re);
        }
        public static int func(int n) {
            Stack<Integer> stack = new Stack<Integer>();
            for(int i = 0; i <= (n / 6); i++) {
                int tmp = n - i * 6;
                for(int j = 0; j <= (n / 8); j++) {
                    if((tmp - j * 8) == 0) {
                        stack.push(i + j);
                    }
                }
            }
            if(stack.isEmpty()) {
                return -1;
            }
            int ret = stack.peek();
            while(!stack.isEmpty()) {
                if(ret > stack.peek()) {
                    ret = stack.pop();
                } else {
                    stack.pop();
                }

            }
            return ret;
        }*/
        public static void main1(String[] args) {
            /*Scanner sc = new Scanner(System.in);
            Stack stack = new Stack<Integer>();
            while(sc.hasNextInt()) {
                int n = sc.nextInt();
                while (n-- > 0) {
                    stack.push(sc.nextInt());
                }
            }*/
                //func(stack);
        }

        /*private static int func(Stack<Integer> stack) {
            Stack stack1 = stack;
            int count = 0,cur = 0;
            while (!stack.isEmpty()) {
                int tmp = stack.peek();
                while (!stack.isEmpty() && cur + stack.peek() <= 40 ) {
                    cur += stack.pop();
                    if(cur == 40) {
                        count++;
                    }
                }
                stack.pop();
                if(!stack.isEmpty()) {
                    cur = tmp;
                }
            }
        }*/
        public class Solution {
            Stack<Integer> stack1 = new Stack<Integer>();
            Stack<Integer> stack2 = new Stack<Integer>();

            public void push(int node) {
                if(stack1.isEmpty() && stack2.isEmpty()) {
                    stack1.push(node);
                    return;
                }else if(!stack1.isEmpty() && stack2.isEmpty()) {
                    stack2.push(node);
                    swap1(stack1,stack2);
                    return;
                }else if(stack1.isEmpty() && !stack2.isEmpty()) {
                    swap2(stack1,stack2);
                    stack1.push(node);
                    swap1(stack1,stack2);
                    return;
                }

            }
            public void swap1(Stack<Integer> stack1,Stack<Integer> stack2) {
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
            }
            public void swap2(Stack<Integer> stack1,Stack<Integer> stack2) {
                while (!stack2.isEmpty()) {
                    stack1.push(stack2.pop());
                }
            }

            public int pop() {
                if(stack1.empty() && stack2.empty()) {
                    return -1;
                }else if(!stack1.isEmpty() && stack2.isEmpty()) {
                    swap1(stack1,stack2);
                    stack2.pop();
                    swap2(stack1,stack2);
                    return 0;
                }else if(stack1.isEmpty() && !stack2.isEmpty()) {
                    swap2(stack1,stack2);
                    stack1.pop();
                    swap1(stack1,stack2);
                    return 0;
                }
                return 0;

            }

        }
    }





