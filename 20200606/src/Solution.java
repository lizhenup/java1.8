import java.awt.*;
import java.util.*;




public class Solution {
    public static void main(String[] args) {
        int[] arr = {4,4};
        Point[] ed = {new Point(1,2),new Point(2, 3),new Point(3,4),new Point(4,1)};
        System.out.println(solve(arr,ed));
    }
    public static String solve (int[] param, Point[] edge) {
        // write code here
        int n = param[0];
        int m = param[1];
        if (m >= 100000) {
            return "No";
        }
        // 寻找1号格子
        int[] temp = new int[n];
        int index = 0;
        int num = 0;
        for (Point p : edge) {
            if (p.x == 1 || p.y == 1) {
                temp[index] = p.x == 1 ? p.y : p.x;
                num++;
            }
        }
        if (num < 2) {
            return "No";
        }
        int temIndex = ++index;
        Point p = null;
        for (int i = 0; i < temIndex; i++) {
            for (int j = 0; j < m; j++) {
                p = edge[j];
                if (p.x == temp[i] || p.y == temp[i] && j != num) {
                    if (p.x == temp[i] && !exists(p.y, temp)) {
                        temp[index++] = p.y;
                    } else if (!exists(p.x, temp)) {
                        temp[index++] = p.x;
                    }
                    if (temp[index - 1] == 1) {
                        return "Yes";
                    }
                }
            }
            temIndex = index;
        }
        return "No";
    }

    public static boolean exists(int x,int [] arr) {
        boolean result = false;
        int size = arr.length;
        for(int i = 0; i < size ; i++) {
            if(arr[i] == x) {
                result = true;
                break;
            }
        }
        return result;
    }
}

