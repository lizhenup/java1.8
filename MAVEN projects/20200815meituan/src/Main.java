/**
 * @author ：lizhen
 * @date ：Created in 2020/8/15 15:59
 * @description：
 * @modified By：
 * @version: $
 */
import java.awt.*;
import java.util.*;
public class Main {
    /*static int num = 100000000;
    static  LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        map.put(2178,8712);
        map.put(21978,87912);
        map.put(219978,879912);
        map.put(2199978,8799912);
        map.put(21782178,87128712);
        map.put(21999978,87999912);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int ret = 0;
            if(n < 2178) {
                System.out.println(0);
            }else {
                if(n >= num) {
                    for (int i = num + 1; i <= n; i++) {
                        int  ni = Nx(i);
                        if(i * 4 == ni) {
                            map.put(i, ni);
                        }
                    }
                    num = n;
                }
                Set<Integer> set = map.keySet();
                for (int key : set) {
                    if(n >= key) {
                        System.out.println(map.get(key));
                        ret++;
                    }else {
                        break;
                    }
                }
                System.out.println(ret);
                for (int key : set) {
                    if(ret-- > 0) {
                        System.out.println(key+" "+map.get(key));
                    }else {
                        break;
                    }
                }
            }
        }
    }

    private static int Nx(int i) {
        Queue<Integer> queue = new LinkedList<>();
        while (i / 10 > 0) {
            queue.offer(i % 10);
            i /= 10;
        }
        if(i != 0) {
            queue.offer(i);
        }
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            sb.append(queue.poll());
        }
        //System.out.println(Integer.parseInt(sb.toString()));
        return Integer.parseInt(sb.toString());
    }*/
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String[] str = new String[n * 2];
            String start = "KKK";
            int num = 0;
            for (int i = 0; i < str.length; i++) {
                str[i] = sc.next();
                //String[] tmp = str[i].split(" ");
                if(start.equals("KKK")) {
                    start = str[i];
                }else {
                    if(start.equals(str[i])) {
                        num++;
                        start = "KKK";
                    }
                }
            }
            System.out.println(num);
        }
    }*/
   /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] x = new int[m];
            int[] y = new int[m];
            HashSet<HashSet<Integer>> sets = new HashSet<>();
            for (int i = 0; i < m; i++) {
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
                if(i == 0) {
                    HashSet<Integer> set = new HashSet<>();
                    set.add(x[i]);
                    set.add(y[i]);
                    sets.add(set);
                }else {
                    boolean flg = false;
                    for (HashSet<Integer> set : sets) {
                        if(set.contains(x[i]) && !set.contains(y[i])) {
                            set.add(y[i]);
                            flg = true;
                        }else if(set.contains(y[i]) && !set.contains(x[i])) {
                            set.add(x[i]);
                            flg = true;

                        }
                    }
                    if(flg) {
                        HashSet<Integer> set = new HashSet<>();
                        set.add(x[i]);
                        set.add(y[i]);
                        sets.add(set);
                    }
                }
            }
            System.out.println(sets.size());
            for(HashSet<Integer> set : sets) {
                int[] arr = new int[set.size()];
                int i = 0;
                for(int s : set) {
                    arr[i++] = s;
                }
                Arrays.sort(arr);
                for (int j = 0; j < arr.length - 1; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println(arr[arr.length - 1]);

            }
        }
    }*/


}
