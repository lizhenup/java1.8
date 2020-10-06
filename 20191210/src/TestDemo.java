import sun.security.x509.IssuingDistributionPointExtension;

import java.util.*;
public class TestDemo {
    public boolean backspaceCompare(String S, String T) {
        return func(S).equals(func(T));
    }

    private String func(String S) {
        Stack<Character> k = new Stack();
        for (char c : S.toCharArray()) {
            if (c != '#') {
                k.push(c);
            } else if (!k.empty() && c == '#') {
                k.pop();
            }
        }
        return String.valueOf(k);
    }

    //给定一个字符串列表，每个字符串可以是以下四种类型之一：
    //1.整数（一轮的得分）：直接表示您在本轮中获得的积分数。
    //2. "+"（一轮的得分）：表示本轮获得的得分是前两轮有效回合得分的总和。
    //3. "D"（一轮的得分）：表示本轮获得的得分是前一轮有效回合得分的两倍。
    //4. "C"（一个操作，这不是一个回合的分数）：表示您获得的最后一个有效回合的分数是无效的，
    // 应该被移除。
    //你需要返回你在所有回合中得分的总和。
    public int calPoints(String[] ops) {
        Stack<Integer> k = new Stack();
        for (String op : ops) {
            if (op.equals('+')) {
                int top = k.pop();
                int newTop = top + k.peek();
                k.push(top);
                k.push(newTop);
            } else if (op.equals('D')) {
                k.push(k.peek() * 2);
            } else if (op.equals('C')) {
                k.pop();
            } else {
                k.push(Integer.valueOf(op));
            }
        }
        int Sum = 0;
        for (int ret : k) {
            Sum += ret;
        }
        return Sum;
    }

    public int calPoints2(String[] ops) {
        Stack<Integer> stack = new Stack();
        for (String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(op));
            }
        }

        int ans = 0;
        for (int score : stack) ans += score;
        return ans;
    }
        public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA.length == 0 || popA.length == 0) {
            return false;
        }
        Stack<Integer> st = new Stack<Integer>();
        int index = 0;
        for (int i = 0; i < pushA.length; i++) {
            st.push(pushA[i]);
            while (!st.empty() && st.peek() == popA[index]) {
                st.pop();
                index++;
            }
        }
        return st.empty();
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for (String str : tokens) {
            if(str.equals("+")) {
                s.push(s.pop() + s.pop());
            }else if(str.equals("-")) {
                s.push(-s.pop() + s.pop());
            } else if(str.equals("*")) {
                s.push(s.pop() * s.pop());
            }else if(str.equals("/")) {
                int pop = s.pop();
                s.push(s.pop() / pop);
            }else{
                s.push(Integer.valueOf(str));
            }
        }
        return s.pop();
    }
}
class StockSpanner {
    Stack<Integer> prices,days;
    public StockSpanner() {
        prices = new Stack();
        days = new Stack();
    }
    public int next(int price) {
        int key = 1;
        while (!prices.empty() && prices.peek() <= price) {
            prices.pop();
            key += days.pop();
        }
        prices.push(price);
        days.push(key);
        return key;
    }
}

