/**
 * @author ：lizhen
 * @date ：Created in 2020/7/29 18:31
 * @description：
 * @modified By：
 * @version: $
 */
import java.util.*;

public class Main {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int num = sc.nextInt();
            int high = sc.nextInt();
            int[] arr = new int[n];
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            for (int i = 0; i < arr.length; i++) {
                int tmp = sc.nextInt();
                queue.add(tmp);
            }
            while (num-- > 0) {
                int min = queue.peek() + high;
                queue.poll();
                queue.add(min);
            }
            System.out.println(queue.peek());
        }
    }*/

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            //HashSet<Integer> numSet = new HashSet<>();
            //LinkedList<Integer> list = new LinkedList<>();
            LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
                if(set.contains(arr[i])) {
                    int num = arr[i];
                    while (set.contains(num)) {
                        set.remove(num);
                        map.remove(num);
                        num *= 2;

                    }
                    set.add(num);
                    map.put(num, i);
                }else {
                    map.put(arr[i], i);
                    set.add(arr[i]);
                }
            }
            for (int s : map.keySet()) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }*/
    /*public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int num = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int tmp = sc.nextInt();
                if(!set.contains(tmp)) {
                    set.add(tmp);
                }
            }
            LinkedList<LinkedList<Integer>> lists = new LinkedList<>();
            for (int s : set) {
                LinkedList<Integer> list = new LinkedList<Integer>();
                list.add(s);
                HashSet<Integer> tmpSet = new HashSet<>();
                tmpSet.remove(s);
                for (int tmp : tmpSet) {
                    if((list.get(0) & tmp) == list.get(0)) {
                        set.remove(tmp);
                        list.addFirst(tmp);
                    }else if((list.get(list.size() - 1) & tmp) == list.get(list.size() - 1)) {
                        set.remove(tmp);
                        list.addLast(tmp);
                    }
                }
                lists.add(list);
            }
            ArrayList<Integer> list = new ArrayList<>();
            for (int s: set) {
                list.add(s);
            }
            for (LinkedList<Integer> list1 : lists) {
                if (list1.size() > 0) {
                    list.add(list1.get(0));
                }
            }
            Integer[] arr = (Integer [])list.toArray();
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                if(((i - 1) >= 0) && ((i + 1) < arr.length)
                        && ((int)(arr[i - 1] + 1) == arr[i]) && ((arr[i + 1] - 1) == arr[i])) {
                    System.out.println(set.size() - 3);
                }
            }
        }
    }*/
    /*public static void main(String[] args) {
        int[] arr = {12,7,3,56,1,55,6,35};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }*/

    /*public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i - 1;
            for (; j >=0 && tmp < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = tmp;
        }

    }*/
    /*public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i - 1;
            for (;j >= 0 && arr[j] > tmp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = tmp;
        }
    }*/
}
