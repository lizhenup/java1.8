/**
 * @author ：lizhen
 * @date ：Created in 2020/9/6 20:03
 * @description：
 * @modified By：
 * @version: $
 */
/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int[] arr2 = new int[m];
            for (int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
            }
            ArrayList<Integer> list = new ArrayList<>();
            int len1 = arr1.length - 1;
            int len2 = arr2.length - 1;
            int st1 = 0;
            int st2 = 0;
            while (st1 <= len1 && st2 <= len2) {
                if(arr1[st1] == arr2[st2]) {
                    list.add(arr1[st1]);
                    st1++;
                    st2++;
                }else if(arr1[st1] > arr2[st2]) {
                    st1++;
                }else {
                    st2++;
                }
            }
            for (int i = 0; i < list.size() - 1; i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println(list.get(list.size() - 1));
        }
    }
}*/
/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int n = sc.nextInt();
            ArrayList<HashSet<Integer>> list = new ArrayList<>();
            ArrayList<ArrayList<Integer>> listP = new ArrayList<>();
            int k = 0;
            LinkedList<Integer> start = new LinkedList<>();
            while (k++ < n) {
                int numP = sc.nextInt();
                HashSet<Integer> set = new HashSet<>();
                ArrayList<Integer> list1 = new ArrayList<>();
                while (numP-- > 0) {
                    int p = sc.nextInt();
                    if(p == 0) {
                      start.add(k);
                    }
                    set.add(p);
                    list1.add(p);
                }
                list.add(new HashSet<>(set));
                listP.add(new ArrayList<>(list1));
            }
            int ret = 0;
            HashSet<Integer> gone = new HashSet<>();
            if(start.size() == 0) {
                System.out.println(0);
            }else {
                while (start.size() > 0) {
                    int team = start.removeFirst();
                    for (int i = 0; i < listP.get(team).size(); i++) {
                        if(!gone.contains(listP.get(team).get(i))) {
                            gone.add(listP.get(team).get(i));
                            ret++;
                        }
                    }
                }
            }
        }
    }
}*/
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int k = sc.nextInt();
            int n = num;
            HashMap<String, Integer> map = new HashMap<>();
            while (n-- > 0) {
                String s = sc.next();
                if(!map.containsKey(s)) {
                    map.put(s,1);
                }else {
                    map.put(s,map.get(s) + 1);
                }
            }
            ArrayList<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    if(o1.getValue() == o2.getValue()) {
                        if(o1.getKey().length() > o2.getKey().length()) {
                            return o2.getValue().compareTo(o1.getValue());
                        }else if(o1.getKey().length() < o2.getKey().length()) {
                            return o1.getValue().compareTo(o2.getValue());
                        }else {
                        }
                    }
                    return o1.getValue().compareTo(o2.getValue());
                }
            });
            for (int i = list.size() - 1; i > list.size() - 1 - k; i--) {
                System.out.println(list.get(i).getKey()+ " " + list.get(i).getValue());
            }
            for (int i = 0; i < k; i++) {
                System.out.println(list.get(i).getKey()+ " " + list.get(i).getValue());
            }
        }
    }
}*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,1);
        /*Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int len = sc.nextInt();
            //int[][] find = new int[n + 1][len];
            Arrays.sort(arr);
            int num = 0;
            for (int i = 0; i < arr.length; i++) {
                if(num < len) {
                    num+= arr[i];
                }else {
                    if(i != arr.length - 1) {
                        num += arr[arr.length - 1];
                    }
                }
            }
            System.out.println(num);*/
            /*int num = 0;
            for (int i = 1; i <= n ; i++) {
                for (int j = 1; j <= len; j++) {
                    if(arr[i - 1] > j) {
                        find[i][j] = find[i - 1][j];
                    }else {
                        num = Math.max(num, arr[i - 1]);
                        int max = find[i - 1][j - arr[i - 1]]
                                +arr[i - 1];
                        find[i][j] = Math.max(max, find[i - 1][j]);
                    }
                }
            }
            int end = 0;
            for (int i = arr.length - 1; i >= 0; i--) {
                if(num != arr[i]) {
                    end = arr[i];
                    break;
                }
            }
            System.out.println(find[n][len - 1] + end);*/

       // }
    }
}
