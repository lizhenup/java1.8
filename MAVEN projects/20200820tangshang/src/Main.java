/**
 * @author ：lizhen
 * @date ：Created in 2020/8/20 19:57
 * @description：
 * @modified By：
 * @version: $
 */
import java.util.*;
public class Main {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            int flgG = 0;
            int flgO = 0;
            int ret = 0;
            //StringBuilder sb = new StringBuilder(str);
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == 'G') {
                    flgG++;
                }
                if(str.charAt(i) == 'o' && flgG > 0) {
                    flgO++;
                }
                if(str.charAt(i) == 'd' && flgG > 0 && flgO >= 2) {
                    ret++;
                    flgG--;
                    flgO -= 2;
                }
            }
            System.out.println(ret);
        }
    }*/
    /*static int ret = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] arr = new int[N][M];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            ret = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    findRoad(i,j,arr,1);
                }
            }
            System.out.println(ret);
        }
    }

    private static void findRoad(int i, int j, int[][] arr, int num) {
        if(i - 1 >= 0 && arr[i][j] < arr[i - 1][j]) {
            findRoad(i - 1, j,arr,num + 1);
        }else {
            ret = Math.max(ret, num);
        }
        if(i + 1 < arr.length && arr[i][j] < arr[i + 1][j]) {
            findRoad(i + 1, j,arr,num + 1);
        }else {
            ret = Math.max(ret, num);
        }
        if(j - 1 >= 0 && arr[i][j] < arr[i][j - 1]) {
            findRoad(i, j - 1,arr,num + 1);
        }else {
            ret = Math.max(ret, num);
        }
        if(j + 1 < arr[0].length && arr[i][j] < arr[i][j + 1]) {
            findRoad(i, j + 1,arr,num + 1);
        }else {
            ret = Math.max(ret, num);
        }
    }*/
    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(arr));
    }
    static int ret = Integer.MIN_VALUE;
    static int num;
    public static int eraseOverlapIntervals (int[][] intervals) {
        // write code here
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < intervals.length; i++) {
            set.add(intervals[i][0]);
        }
        for (int i = 0; i < intervals.length; i++) {
            num = Integer.MIN_VALUE;
            findRoad(intervals,intervals[i][0],set,0);
            ret = Math.max(ret,num);
        }
        return intervals.length - ret;
    }

    private static void findRoad(int[][] intervals, int start, HashSet<Integer> set, int k) {
        if(!set.contains(start)) {
            num = Math.max(k,num);
            return;
        }
        for (int i = 0; i < intervals.length; i++) {
            if(intervals[i][0] == start) {
                findRoad(intervals,intervals[i][1],set,k + 1);
            }
        }
    }
}
