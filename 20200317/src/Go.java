import java.util.*;
public class Go {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String[] Strs = sc.nextLine().split(" ");
            int[] arr = new int[Strs.length];
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < arr.length; i++) {
                arr[i] = Integer.valueOf(Strs[i]);
            }
            int i = 1;
            if(arr[0] > 0) {
                while (arr[i] == 0) {
                    i++;
                }
                sb.append(i);
                arr[i]--;
            }
            for (int j = 0; j < arr.length; j++) {
                while (arr[j]-- > 0) {
                    sb.append(j);
                }
            }
            System.out.println(sb);
        }
    }
/*
    static Queue<Integer> queue = new LinkedList<Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            if(n * n % 2 == 0) {
                func1(n * n - 1,n / 2);
                func2(n * n + 1,n / 2);
            }else {
                func1(n * n,n / 2 + 1);
                func2(n * n + 2,n / 2);
            }
            while(!queue.isEmpty()) {
                System.out.print(queue.poll());
                if(queue.size() > 0) {
                    System.out.print("+");
                }
            }
        }
    }
    public static void func1(int k,int n) {
        Stack<Integer> stack = new Stack<Integer>();
        while(n-- > 0) {
            stack.push(k);
            k = k - 2;
        }
        while(!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
    }
    public static void func2(int k,int n) {
        Queue<Integer> queue1 = new LinkedList<Integer>();
        while(n-- > 0) {
            queue1.offer(k);
            k = k + 2;
        }
        while(!queue1.isEmpty()) {
            queue.offer(queue1.poll());
        }
    }
*/
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {

        System.out.println(func(sc.nextInt()));
    }
}
    static int k = 0;
    public static int func(int x) {
        if(k > 10000) {
            return -1;
        }
        if(x % 1000000007 == 0) {
            return k;
        }
        k++;
        func(8 * x + 7);
        func(4 * x + 3);
        return -1;
    }
}