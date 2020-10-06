/**
 * @author ：lizhen
 * @date ：Created in 2020/8/18 14:54
 * @description：
 * @modified By：
 * @version: $
 */
import java.util.*;
public class Main {
    /*public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String str = "aaaaaaaaaabssssssssddddcdaaa";
        System.out.println(compress(str));
    }*/
    public static String compress(String str) {
        // write code here
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])) {
                map.put(ch[i], map.get(ch[i]) + 1);
            } else {
                if (map.size() == 0) {
                    map.put(ch[i], 1);
                } else {
                    Set<Character> set = map.keySet();
                    for (char c : set) {
                        sb.append(c).append(map.get(c));
                        map.remove(c);
                    }
                    map.put(ch[i], 1);
                }
            }
        }
        if (!map.isEmpty()) {
            Set<Character> set = map.keySet();
            for (char c : set) {
                sb.append(c).append(map.get(c));
                map.remove(c);
            }
        }
        if (sb.length() >= str.length()) {
            return str;
        } else {
            return sb.toString();
        }
    }

    public int[][] convert(int[][] matrix) {
        // write code here
        if (matrix == null || matrix.length == 0) {
            return matrix;
        }
        int n = matrix.length / 2;
        int start = 0;
        int end = matrix.length - 1;
        while (n-- > 0) {
            for (int i = 0; i < matrix[0].length; i++) {
                int tmp = matrix[start][i];
                matrix[start][i] = matrix[end][i];
                matrix[end][i] = tmp;
            }
            start++;
            end--;
        }
        return matrix;
    }

    /*public static void main(String[] args) {
        int[][] f = {{0,1,100},{0,2,500},{1,2,100}};
        int[] arr = findAllCheapestPrice(3,f,0);
        System.out.println(Arrays.toString(arr));
    }*/
    static int money = 0;

    public static int[] findAllCheapestPrice(int n, int[][] flights, int src) {
        // write code here
        int[] ret = new int[n];
        for (int i = 0; i < ret.length; i++) {
            if (i != src) {
                money = Integer.MAX_VALUE;
                func(i, src, flights, 0);
                if (money == Integer.MAX_VALUE) {
                    ret[i] = -1;
                } else {
                    ret[i] = money;
                }

            }
        }
        return ret;

    }

    private static void func(int end, int src, int[][] flights, int moneyN) {
        if (end == src) {
            money = Math.min(moneyN, money);
            return;
        }
        for (int i = 0; i < flights.length; i++) {
            if (flights[i][0] == src) {
                func(end, flights[i][1], flights, moneyN + flights[i][2]);
            }
        }
    }

    /*private int func(int[][] flights, boolean[][] road, int src, int end, HashMap<String, Integer> map, int min) {
        if(src == end) {
            return min;
        }
        for (int i = 0; i < road[0].length; i++) {
            if(road[src][i]) {
                StringBuilder sb = new StringBuilder();
                sb.append(src).append(i);
                func(flights,road,src,i,map,map.get(sb.toString()));
            }
        }

    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        int k = sc.nextInt();
        if (k >= string.length()) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < k; i++) {
            StringBuilder sb = new StringBuilder(string);
            boolean flag = false;
            for (int j = 0; j < sb.length() - 1; j++) {
                if ((sb.charAt(j + 1) - '0') < (sb.charAt(j) - '0')) {
                    flag = true;
                    sb.setCharAt(j, '-');
                    string = sb.toString().replaceFirst("-", "");
                    break;
                }
            }
            if (flag == false) {
                string = string.substring(0, string.length() - 1);
                System.out.println("ss"+ string);
            }
        }
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (string.charAt(i) == '0') {
                stringBuilder.setCharAt(i, '-');
                } else {
                break;
            }
        }
        string = stringBuilder.toString().replaceAll("-", "");
        if (string.length() == 0) {
            System.out.println(0);
        } else {
            System.out.println(string);
        }
    }



}
