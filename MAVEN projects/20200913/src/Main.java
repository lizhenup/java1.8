/**
 * @author ：lizhen
 * @date ：Created in 2020/9/13 10:18
 * @description：
 * @modified By：
 * @version: $
 */
import java.util.*;

public class Main {
    /*static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            LinkedList<Integer> list = new LinkedList<>();
            while (sc.hasNextInt()) {
                list.add(sc.nextInt());
            }
            int money = list.removeLast();
            Collections.sort(list);
            if(list.get(0) > money) {
                System.out.println(-1);
            }else {
                min = Integer.MAX_VALUE;
                LinkedList<Integer> tmp = new LinkedList<>();
                dfs(money,list,0,list.size() - 1);
            }
        }
    }

    private static void dfs(int money, LinkedList<Integer> list, int day, int st) {
        if(money == 0) {
            min = Math.min(day, min);
            return;
        }
        for (int i = st; i >= 0; i--) {
            int k = 0;
            while (money >= list.get(i) && money > 0) {
                money -= list.get(i);
                day += 1;
            }

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

            System.out.println(145);
            System.out.println("3 1 2 4 5");
        }
    }*/

    static int ret = 0;
    public int func(int run, int[][] arr) {
        if(arr == null || arr.length == 0
                || run <= 0) {
            return 0;
        }
        ret = 0;
        dfs(0,0,run,arr);
        return ret;
    }

    private void dfs(int x, int y, int run, int[][] arr) {
        if(x == arr.length - 1 && y == arr[0].length - 1) {
            ret++;
            return;
        }
        if(x - run >= 0 && arr[x - run][y] == 1) {
            dfs(x - run, y, run, arr);
        }
        if(x + run < arr.length - 1 && arr[x + run][y] == 1) {
            dfs(x + run, y, run, arr);
        }
        if(y + run < arr[0].length - 1 && arr[x][y + run] == 1) {
            dfs(x, y + run, run, arr);
        }
        if(y - run >= 0 && arr[x][y - run] == 1) {
            dfs(x, y - run, run, arr);
        }
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcdsawba"));
    }
    /*public static int lengthOfLongestSubstring(String s) {
        int st = 0;
        int len = 0;
        if(s.length() == 1) {
            return 1;
        }
        boolean flg = true;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                //int tmp = Math.max(,i - map.get(c));
                len = Math.max(i - st,len);
                st = i;
                flg = false;
            }
            if(i == s.length() - 1) {
                if(flg) {
                    return s.length();
                }else {
                    len = Math.max(i - st,len);
                }

            }
            map.put(c,i);
        }

        return len;
    }*/
    /*public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int res = 0, tmp = 0;
        for(int j = 0; j < s.length(); j++) {
            int i = dic.getOrDefault(s.charAt(j), -1); // 获取索引 i
            dic.put(s.charAt(j), j); // 更新哈希表
            tmp = tmp < j - i ? tmp + 1 : j - i; // dp[j - 1] -> dp[j]
            res = Math.max(res, tmp); // max(dp[j - 1], dp[j])
        }
        return res;
    }*/

    public static int lengthOfLongestSubstring(String s) {
        int tmp = 0; int len = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = map.getOrDefault(c,-1);
            map.put(c,i);
            tmp = tmp < i - index ? tmp + 1 : i - index;
            len = Math.max(tmp,len);
        }
        return len;
    }

}
