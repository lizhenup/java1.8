import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            double[] ret = new double[5];
            Queue<Integer> queue = new LinkedList<Integer>();
            int count = 0,sum = 0,cur = 0;
            for(int a : arr) {
                if(a % 5 == 0 && a % 2 == 0) {
                    ret[0] += a;
                }else if(a % 5 == 1) {
                    queue.offer(a);
                }else if(a % 5 == 2) {
                    ret[2] = ++count;
                }else if(a % 5 == 3) {
                    cur++;
                    sum += a;
                }else {
                    if(a > ret[4]) {
                        ret[4] = a;
                    }
                }
            }
            if(queue.size() > 1) {
                ret[1] += queue.poll() - queue.poll();
            }else if(queue.size() == 1) {
                ret[1] += queue.poll();
            }
            int t = 1;
            while (!queue.isEmpty()) {
                ret[1] += t * queue.poll();
                t *= -1;
            }
            if(sum != 0 && cur != 0) {
                double data = (double) sum / (double) cur;
                ret[3] = new BigDecimal(data).setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
            }
            for (int i = 0; i < ret.length; i++) {
                if(ret[i] == 0 && i + 1 != ret.length) {
                    System.out.print("N" + " ");
                }else if(ret[i] == 0 && i + 1 == ret.length) {
                    System.out.print("N");
                }else if(ret[i] != 0 && i + 1 != ret.length && i != 3) {
                    System.out.print((int)ret[i] + " ");
                }else if(ret[i] != 0 && i + 1 == ret.length) {
                    System.out.println((int)ret[i]);
                }else {
                    System.out.print(ret[i] + " ");
                }
            }
        }
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int ability = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for(int a : arr) {
                if(ability >= a) {
                    ability += a;
                }else {
                    ability += Gdc(a,ability);
                }
            }
            System.out.println(ability);
        }
    }

    public static int Gdc(int num1, int num2) {
        while(num2 != 0) {
            int tmp = num1 % num2;
            num1 = num2;
            num2 = tmp;
        }
        return num1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int studentNum = sc.nextInt();
            int operationNum = sc.nextInt();
            int[] arr = new int[studentNum];
            for(int i = 0; i < studentNum; i++) {
                arr[i] = sc.nextInt();
            }
            int num = 0,a,b;
            char c;
            while (num++ < operationNum) {
                c = sc.next().charAt(0);
                a = sc.nextInt();
                b = sc.nextInt();
                if(c == 'Q') {
                    int ret = -1;
                    if(a > b) {
                        a = a + b;
                        b = a - b;
                        a = a - b;
                        a--;
                    }else {
                        a--;
                    }
                    for(int i = a; i < b; i++) {
                        if(ret < arr[i]) {
                            ret = arr[i];
                        }
                    }
                    System.out.println(ret);
                }else {
                    arr[--a] = b;
                }
            }
        }
    }
}
