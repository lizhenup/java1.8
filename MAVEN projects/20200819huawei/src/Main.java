/**
 * @author ：lizhen
 * @date ：Created in 2020/8/19 18:55
 * @description：
 * @modified By：
 * @version: $
 */
import org.omg.CORBA.INTERNAL;

import java.util.*;

public class Main {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int[][] arr = new int[M][N];
            int sum = M * N;
            int num = 1;
            int a1 = 0;
            int a2 = arr[0].length - 1;
            int startA = 0;
            int b1 = 1;
            int b2 = arr.length - 2;
            int startB = arr[0].length - 1;
            int c1 = arr[0].length - 1;
            int c2 = 0;
            int startC = arr.length - 1;
            int d1 = arr.length - 2;
            int d2 = 1;
            int startD = 0;
            LinkedList<Integer> list1 = new LinkedList<>();
            LinkedList<Integer> list2 = new LinkedList<>();
            while (sum > 0) {
                for (int i = a1; i <= a2 && sum > 0; i++) {
                    if(arr[startA][i] != 0) {
                        break;
                    }else {
                        arr[startA][i] = num;
                        isTe(num,list1,list2,startA,i);
                        num++;
                        sum--;
                    }
                }
                a1++;
                a2--;
                startA++;
                for (int i = b1; i <= b2 && sum > 0; i++) {
                    if(arr[i][startB] != 0) {
                        break;
                    }else {
                        arr[i][startB] = num;
                        isTe(num,list1,list2,i,startB);
                        num++;
                        sum--;
                    }

                }
                b1++;
                b2--;
                startB--;
                for (int i = c1; i >= c2 && sum > 0; i--) {
                    if(arr[startC][i] != 0) {
                        break;
                    }else {
                        arr[startC][i] = num;
                        isTe(num,list1,list2,startC,i);
                        num++;
                        sum--;
                    }

                }
                c1--;
                c2++;
                startC--;
                for (int i = d1; i >= d2 && sum > 0; i--) {
                    if(arr[i][startD] != 0) {
                        break;
                    }else {
                        arr[i][startD] = num;
                        isTe(num,list1,list2,i,startD);
                        num++;
                        sum--;
                    }
                }
                d1--;
                d2++;
                startD++;
            }
            if(list1.size() == 0) {
                System.out.println("[" +"]");
            }else {
                System.out.print("[");
                for (int i = 0; i < list1.size() -1; i++) {
                    System.out.print("["+list1.get(i)+","+list2.get(i)+"]"+",");
                }
                System.out.println("["+list1.get(list1.size() -1)+","+list2.get(list2.size() -1)+"]"+"]");
            }
        }
    }*/

    private static void isTe(int num, LinkedList<Integer> list1, LinkedList<Integer> list2,int a, int b) {
        if((num / 10 % 2 != 0) && num % 10 == 7) {
            list1.add(a);
            list2.add(b);
        }
    }
    public void func(int n, int m) {
        int[][] arr = new int[n][m];
        int num = 1;
        int sum = n * m;
        for (int i = 0; i < arr[0].length; i++) {
            arr[0][i] = num++;
            sum--;
            //isTe();
        }
        for (int i = 1; i < arr.length; i++) {
            arr[i][arr[0].length - 1] = num++;
            sum--;
            //isTe();
        }
        for (int i = arr[0].length - 2; i >= 0; i--) {
            arr[arr.length - 1][i] = num++;
            sum--;
            //isTe();
        }
        for (int i = arr.length - 2; i >= 1; i--) {
            arr[i][0] = num++;
            sum--;
            //isTe();
        }
        int x = 1;
        int y = 1;
        while (sum > 0) {
            if(arr[x - 1][y] != 0 &&
                    arr[x][y - 1] != 0 && arr[x][y] == 0) {
                arr[x][y++] = num++;
                sum--;
            }else if(arr[x - 1][y] != 0 &&
                    arr[x][y + 1] != 0 && arr[x][y] == 0) {
                arr[x][y] = num++;
                sum--;
            }
        }
    }
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int a = Integer.parseInt(s1);
            ArrayList<Integer> list = new ArrayList<>();
            list.add(Integer.parseInt(s2));
            if(s2.length() < s1.length()) {
                StringBuilder sb = new StringBuilder(s2);
                while (sb.length() < s1.length()) {
                    sb.append(0);
                    list.add(Integer.parseInt(sb.toString()));
                }
            }
            int tmp = a;
            int[] as = new int[s1.length()];
            int t = as.length - 1;
            while (tmp > 0) {
                as[t--] = tmp % 10;
                tmp /= 10;
            }
            int min = Integer.MAX_VALUE;
            for (int l : list) {
                int[] k = add(as,l,s1.length());
                int maxK = Integer.MIN_VALUE;
                int minK = Integer.MAX_VALUE;
                for (int i = 0; i < k.length; i++) {
                    maxK = Math.max(k[i], maxK);
                    minK = Math.min(k[i], minK);
                }
                min = Math.min(maxK - minK, min);
            }
            System.out.println(min);
       }
    }

    private static int[] add(int[] as, int l,int len) {
        int[] ret = new int[len];
        int[] ls = new int[len];
        int i1 = as.length - 1;
        while (l > 0) {
            ls[i1--] = l % 10;
            l /= 10;
        }
        for (int i = 0; i < ls.length; i++) {
            ret[i] = as[i] + ls[i];
        }
        return ret;
    }*/


}
/*class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            int max = 0;
            HashMap<Integer,Integer> map=new HashMap<>();
            int[] arr = new int[num];
            for(int i = 0; i < num; i++){
                arr[i] = sc.nextInt();
                max = Math.max(arr[i], max);
                map.put(arr[i],
                        map.containsKey(arr[i]) ? map.get(arr[i]) + 1 : 1);
            }
            if(map.get(0) < 1){
                continue;
            }
            long sum = 1;
            int tmp = 1;
            for(int i = 0; i <= max; i++){
                if(map.get(i) == 0){
                    System.out.println(sum%(1000000000+7));
                    break;
                }
                if(i == 0){
                    tmp = 2 * map.get(0);
                }else{
                    sum *= getSum(tmp, map.get(i));
                    tmp = 2 * map.get(i);
                }
            }
            System.out.println(sum%(1000000000+7));
        }
    }

    public static long getSum(int m,int n){
        long tmp = 1;
        long tmp2 = 1;
        for(int i = 0; i < n; i++){
            tmp *= (m-i);
            tmp2 *= (i+1);
        }
        return tmp / tmp2;
    }
}*/
/*class Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int maxNode = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                int num = sc.nextInt();
                arr[i] = num;
                maxNode = Math.max(maxNode, num);
                map.put(num,
                        map.containsKey(num) ? map.get(num) + 1 : 1);
            }
            if(map.get(0) == 0) {
                System.out.println(0);
            }else {
                long sum = 1;
                int nextNum = 2;
                for (int i = 1; i <= maxNode; i++) {
                    if(map.get(i) == 0) {
                        System.out.println(sum % (1000000000 + 7));
                        break;
                    }else {
                        sum *= findNum(nextNum, map.get(i));
                        nextNum = 2 * map.get(i);
                    }
                }
                System.out.println(sum % (1000000000 + 7));
            }
        }
    }

    /**
     * create by: lizhen
     * description:
     * create time:
     *   m
     * C   = [n(n - 1) .... (n - m + 1)] / [m!]
     *   n
     *  3
     *C    = [4 * 3 * 2] / [1 * 2 * 3]
     *  4
     *
     * @return a
     * @Param: null
    */
    /*private static long findNum(int m, int n) {
        long a = 1;
        long b = 1;
        for (int i = 0; i < n; i++) {
            a *= (m - i);
            b *= (i + 1);
        }
        return a / b;
    }
}*/