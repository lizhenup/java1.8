import java.util.*;
public class 加油 {
/* static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int[] arr = new int[sc.nextInt() * 2];
            int k = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            func(k,arr);
            while (!queue.isEmpty()) {
                System.out.print(queue.poll());
                if(queue.size() > 0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    private static void func(int k,int[] arr) {
        Queue<Integer> queue1 = new LinkedList<>();
        while (k-- > 0) {
            int i = 0,j = arr.length / 2;
            while (i < arr.length / 2 || j < arr.length) {
                queue1.offer(arr[i++]);
                queue1.offer(arr[j++]);
            }
            int cur = 0;
            while (!queue1.isEmpty()) {
                arr[cur++] = queue1.poll();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]);
        }
    }*/
static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if(n != 0) {
                int[] arr = new int[n];
                for(int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                int key = sc.nextInt(),count = 0;
                for(int a : arr) {
                    if(key == a) {
                        count++;
                    }
                }
                queue.offer(count);
            }else {
                break;
            }
            while (!queue.isEmpty()) {
                System.out.println(queue.poll());
            }
        }
    }
}

