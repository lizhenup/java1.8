import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/6 13:59
 * @description：
 * @modified By：
 * @version: $
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program";
        String s4 = "ming";
        String s5 = "Program" + "ming";
        String s6 = s3 + s4;
        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s6.intern());
        System.out.println(s2 == s2.intern());
    }

    /*public String reverseParentheses(String s) {
        char[] ch = s.toCharArray();
        Stack<Stack<Character>> stack = new Stack<>();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == '(') {
                Stack<Character> tmp = new Stack<>();
                StringBuffer sb = new StringBuffer();
            }else if(ch[i] == ')') {
                while (!tmp.isEmpty()) {
                    sb.appeend();
                }
                stack.push(sb);
            }else {
                //tmp.push()
            }
        }
    }
    public void reverseParenthesesCh(String s) {
        if(s == null) {
            return;
        }
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == '(') {
                reverseParenthesesCh(s.substring(i + 1));
            }else if(ch[i] == ')') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }else {
                stack.push(ch[i]);
            }
        }
    }*/


}
/*class Node {
    int data;
    Node next;
}
class Solution {
    public Node mergeTwoLists(Node n1, Node n2) {
        if(n1 == null && n2 == null) {
            return null;
        }
        if(n1 == null) {
            return n2;
        }
        if(n2 == null) {
            return n1;
        }
        Node newHead = null;
        Node node = null;
        while (n1 != null || n2 != null) {
            if(n1.data < n2.data) {
                if(newHead == null) {
                    newHead = n1;
                    node = newHead;
                }else {
                    node.next = n1;
                }
                n1 = n1.next;
            }else {
                if(newHead == null) {
                    newHead = n2;
                    node = newHead;
                }else {
                    node.next = n2;
                }
                n2 = n2.next;
            }
        }
        if(n1 != null) {
            node.next = n1;
            n1 = n1.next;
        }

        if(n2 != null) {
            node.next = n2;
            n2 = n2.next;
        }
        return newHead;
    }
}*/
