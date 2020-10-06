/**
 * @author ：lizhen
 * @date ：Created in 2020/7/31 13:57
 * @description：
 * @modified By：
 * @version: $
 */
import java.util.*;
public class Main {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int money = sc.nextInt();
            //int numAll = a + b + c + d + e;
            int ret = 0;
            int tmp = money;
            int oneHu = tmp / 100;
            tmp %= 100;
            int fiveT = tmp / 50;
            tmp %= 50;
            int ten = tmp / 10;
            tmp %= 10;
            int five = tmp / 5;
            tmp %= 5;
            int one = tmp;
            if(e >= oneHu) {
                ret += oneHu;
            }else {
                ret += e;
                fiveT = (oneHu - e) * 2;
            }
            if(d >= fiveT) {
                ret += fiveT;
            }else {
                ret += d;
                ten = (fiveT - d) * 5;
            }
            if(c >= ten) {
                ret += ten;
            }else {
                ret += c;
                ten = (ten - c) * 2;
            }
            if(b >= five) {
                ret += five;
            }else {
                ret += b;
                one = (five - b) * 5;
            }

            if(a >= one) {
                ret += one;
                System.out.println(ret);
            }else {
                System.out.println(-1);
            }
        }
    }*/
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.next();
            StringBuffer sb = new StringBuffer();
            boolean flg = false;
            for (int i = 0; i < str.length(); i++) {
                if(sb.length() == 0 && '-' == str.charAt(i)) {
                    flg = !flg;
                }
                if('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                    sb.append(str.charAt(i));
                }
            }
            if(sb.length() == 0) {
                System.out.println(0);
            }else {
                if(flg) {
                    int ret = Integer.parseInt(new String(sb)) * - 1;
                    System.out.println(ret);
                }else {
                    int ret = Integer.parseInt(new String(sb)) * - 1;
                    System.out.println(ret);
                }
            }
        }
    }*/
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a3 = sc.nextInt();
            int a4 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            int b3 = sc.nextInt();
            int b4 = sc.nextInt();
            if(a1 > a3) {
                int tmp = a1;
                a1 = a3;
                a3 = tmp;
            }
            if(a2 > a4) {
                int tmp = a2;
                a2 = a4;
                a2 = tmp;
            }
            if(b1 > b3) {
                int tmp = b1;
                b1 = b3;
                b3 = tmp;
            }
            if(b2 > b4) {
                int tmp = b2;
                b2 = b4;
                b2 = tmp;
            }
            if(((a1 < b1)&& (b1 < a3)) || ((a1 < b3)&& (b3 < a3))
                    || ((a2 < b2)&& (b2 < a4)) || ((a2 < b4)&& (b4 < a4))) {
                System.out.println(1);
            }else if(((a1 < b1)&& (b1 < a3)) && ((a1 < b3)&& (b3 < a3))
                    || ((a2 < b2)&& (b2 < a4)) && ((a2 < b4)&& (b4 < a4))) {
                System.out.println(0);
            }else {
                System.out.println(0);
            }
        }
    }*/
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //while (sc.hasNext()) {
            int n = 9;//sc.nextInt();
            int[] arr = {25, 84, 21, 47, 15, 27, 68, 35, 20};//new int[n];
            int mid = n / 2;
            HashMap<Integer, Integer> map = new HashMap<>();
            //PriorityQueue<Integer> queue = new PriorityQueue<>(n);
            for (int i = 0; i < arr.length; i++) {
                //arr[i] = sc.nextInt();
                map.put(arr[i], i);
            }
            int[] arr1 = arr.clone();
            Arrays.sort(arr1);
            //System.out.println("ar1" + Arrays.toString(arr1));
            int flg = 0;
            for (int i = 0; i <= mid; i++) {
                if(arr1[i] != arr[i]) {
                    flg++;
                    int tmp = arr[i];
                    arr[i] = arr1[i];
                    arr[map.get(arr1[i])] = tmp;
                }
            }
            arr[0] = arr1[0];
            arr[mid + 1] = arr1[mid + 1];
            int num = flg;
            while (num-- > 0) {
                System.out.println(Arrays.toString(arr));
            }
            int k = mid;
            for (int i = arr.length - 1; i >= mid ; i--) {
                if(arr[i] < arr[k]) {
                    int tmp = arr[i];
                    arr[i] = arr[k];
                    arr[k++] = tmp;
                    System.out.println(Arrays.toString(arr));
                }

            }
            System.out.println(Arrays.toString(arr));
        //}
    }*/
    /*public static void main(String[] args) {
        int[] arr = {0, 2 , 0, 0, 5};
        int ret = func(arr);
        System.out.println(ret);
    }
   public static int func(int[] array) {
       System.out.println(array.length);
       char[] arr = new char[array.length];
       for (int i = 0; i < arr.length; i++) {
           arr[i] = String.valueOf(array[i]).charAt(0);
           //arr[i] = (char) ('0' + array[i]);
           //arr[i] = (char) (48 + array[i]);
       }
       System.out.println(Arrays.toString(arr));
       HashMap<String, Integer> map = new HashMap<>();
       if(arr.length > 0) {
           digui(arr, 0, map);
       }
       int ret = 0;
       for (String s : map.keySet()) {
           if(Integer.valueOf(s) % 7 == 0 && Integer.valueOf(s) != 0) {
               ret += map.get(s);
           }
       }
       return ret;
   }
   public static void digui(char[] ch, int start,HashMap<String, Integer> map) {
       if(start == ch.length - 1){
           String s = new String(ch);
           map.put(s,map.containsKey(s) ? map.get(s) + 1 : 1);
           return;
       }
       for(int i = start; i < ch.length; i++){
           Swap(ch, start, i);
           digui(ch, start+1, map);
           Swap(ch, start, i); }
   }
    public static void Swap(char[] ch, int i, int j){
       char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
   }*/
}
