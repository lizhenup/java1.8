import java.util.*;

public class New {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String n = sc.nextLine();
            int tmp = Integer.parseInt(n);
            System.out.println(tmp);
            char[] nm = n.toCharArray();
            Stack<Character> stack1 = new Stack<Character>();
            for(char m : nm) {
                stack1.push(m);
            }
            char[] ch = String.valueOf(tmp * tmp).toCharArray();
            Stack<Character> stack2 = new Stack<Character>();
            for(char c : ch) {
                stack1.push(c);
            }
            while (!stack1.isEmpty() && !stack2.isEmpty()) {
                if(stack1.peek() == stack2.peek()) {
                    stack1.pop();
                    stack2.pop();
                }else {
                    System.out.println("No!");
                }
            }
            if(stack1.isEmpty()) {
                System.out.println("Yes!");

            }
        }
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            double tmp = n*n,ret = tmp - n;
            while (n / 10 > 0 || n % 10 != 0) {
                ret = ret / 10;
                n = n / 10;
            }
            if(ret - (int)ret == 0) {
                System.out.println("Yes!");
            }else {
                System.out.println("No!");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String m = sc.nextLine();
            if(func1(m.toCharArray()) && func2(m) &&func3(m.length())) {
                System.out.println("OK");
            }else {
                System.out.println("NG");
            }
        }
    }

    private static boolean func3(int length) {
        if(length <= 8) {
            return false;
        }else {
            return true;
        }
    }

    private static boolean func1(char[] chars) {
        int a = 0,b = 0,c = 0,d = 0;
        for(char ch : chars) {
            if(ch >= '0' && ch <= '9') {
                a = 1;
            }else if(ch >= 'a' && ch <= 'z') {
                b = 1;
            }else if(ch >= 'A' && ch <= 'Z') {
                c = 1;
            }else {
                d = 1;
            }
            if(a+b+c+d >=3) {
                return true;
            }
        }
        return false;
    }

    private static boolean func2(String m) {
        for (int i = 0; i < m.length() - 2; i++) {
            if(m.substring(i+3).contains(m.substring(i,i+3))) {
                return false;
            }
        }
        return true;
    }
}
