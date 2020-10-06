/**
 * @author ：lizhen
 * @date ：Created in 2020/9/3 18:54
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
            int n = sc.nextInt();
            int numF = 0;
            int numZ = 0;
            for (int i = 0; i < n; i++) {
                if(sc.nextInt() == 5) {
                    numF++;
                }else {
                    numZ++;
                }
            }
            if(numZ == 0 || numF == 0) {
                System.out.println(-1);
            }else {
                numF -= numF % 9;
                StringBuffer sb = new StringBuffer();
                while (numF-- > 0) {
                    sb.append(5);
                }
                while (numZ-- > 0) {
                    sb.append(0);
                }
                System.out.println(sb.toString());
            }
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int num = sc.nextInt();
            int good = sc.nextInt();
            LinkedHashMap<Integer, Integer> map1 = new LinkedHashMap<>();
            LinkedHashMap<Integer, Integer> map2 = new LinkedHashMap<>();
            int k = good;
            while (k-- > 0) {
                int m = sc.nextInt();
                while (m-- > 0) {
                    int start = sc.nextInt();
                    int end = sc.nextInt();
                    if(map1.size() == 0) {
                        map1.put(start,end);
                    }else if(map2.size() == 0){
                        map2.put(start,end);
                    }
                }

            }
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            HashSet<Integer> set = new HashSet<>();
            for (int m : map1.keySet()) {
                if(!set.contains(m)) {
                    queue.offer(m);
                }
                if(!set.contains(map1.get(m))) {
                    queue.offer(map1.get(m));
                }
            }
            System.out.println(queue.size());
            while (queue.size() > 1) {
                System.out.print(queue.poll() + " ");
            }
            System.out.println(queue.poll());
        }
    }
}
/*for(int key : map1.keySet()) {
                            if(start <= key && end <= map1.get(key)) {
                                //左包
                                map2.put(start,map1.get(key));
                            }else if(start >= key && end >= map1.get(key)) {
                                //内包
                                map2.put(start,end);
                            }else if(start >= key && end <= map1.get(key)) {
                                //右包
                                map2.put(start,map1.get(key));
                            }
                            else if(start <= key && end <= map1.get(key)) {
                                //全包
                                map2.put(key,map1.get(key));
                            }
                        }*/
