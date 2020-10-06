import java.util.Scanner;
import java.util.Stack;

public class NewCode311 {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt(),count = 0;
            double k = 1;
            for(int i = 1; i <= n; i++) {
                k *= i;
            }
            System.out.println(k);
            char[] ch = String.valueOf(k).toCharArray();
            Stack<Character> stack = new Stack<Character>();
            for(int i = 0; i <ch.length - 2; i++) {
                stack.push(ch[i]);
            }
            while (!stack.isEmpty() && stack.peek() == '0') {
                stack.pop();
                count++;
            }
            System.out.println(count);
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()) {
                int n = sc.nextInt(),count = 0;
                for(int i = 5; i <= n;


                    i *= 5) {
                    count += n / i;
                }
                System.out.println(count);
            }
        }
}
