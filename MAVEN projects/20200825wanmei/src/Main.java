/**
 * @author ：lizhen
 * @date ：Created in 2020/8/25 19:19
 * @description：
 * @modified By：
 * @version: $
 */
import java.util.*;
public class Main {
    /*public static void main(String[] args) {
        int[][] weight = new int[6][];

        String[] pointsStr = { "V1", "V2", "V3", "V4", "V5","V6"};
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < pointsStr.length; i++) {
            String[] valuesStr = input.nextLine().split(" ");
            int[] values = new int[valuesStr.length];
            for (int j = 0; j < valuesStr.length; j++) {
                values[j] = Integer.parseInt(valuesStr[j]);
            }
            weight[i] = values;
        }
        input.close();

        method(weight, pointsStr);
    }

    public static void method(int[][] weight, String[] pointsStr) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 9999;
        }
        int flg = 0;
        for (int i = 1; i < weight[0].length; i++) {
            if(weight[0][i] != -1) {
                arr[i - 1] = weight[0][i];
                findMinRoad(weight,i,arr,weight[0][i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //-1 0 9 3 -1 -1 -1 -1 0 -1 5 -1 -1 -1 4 0 13 15 -1 -1 -1 -1 0 4 -1 -1 -1 -1 -1 0
    }

    private static void findMinRoad(int[][] weight, int start, int[] arr, int val) {
        for (int i = 1; i < weight[0].length; i++) {
            if(weight[start][i] != -1 && i != start) {
                arr[i - 1] = Math.min(arr[i - 1], weight[start][i] + val);
                findMinRoad(weight,i,arr,val + weight[start][i]);
            }
        }
    }*/
    public static void main(String[] args) {
        Integer c = 129;
        Integer a = new Integer(129);
        Integer b = new Integer(129);
        Integer d = Integer.valueOf(129);
        System.out.println(b);
        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(c == d);
        /*int[] arr = {-1,-1,-1};
        String[] str = {"a","b","c"};
        Stack<String> stack = new Stack<>();
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < str.length; i++) {
            s.append(str[i]);
        }
        stack.push("a b c");
        stack.push("-----");
        boolean flg = true;
        while (flg) {
            StringBuilder sb = new StringBuilder();
            flg = false;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > 0) {
                    sb.append("# ");
                    arr[i]--;
                    flg = true;
                }else {
                    sb.append("  ");
                }
            }
            if(sb.toString().equals("   ")) {
                break;
            }else {
                stack.push(sb.toString());
            }
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }*/
    }
}
/*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int knapsackCapacity = Integer.parseInt(input.nextLine().trim());

        String[] volumesStr = input.nextLine().split(" ");
        int[] volumes = new int[volumesStr.length];
        for (int i = 0; i < volumesStr.length; i++) {
            volumes[i] = Integer.parseInt(volumesStr[i].trim());
        }

        String[] valuesStr = input.nextLine().split(" ");
        int[] values = new int[valuesStr.length];
        for (int i = 0; i < valuesStr.length; i++) {
            values[i] = Integer.parseInt(valuesStr[i].trim());
        }

        if (volumes.length == values.length) {
            System.out.println(method(knapsackCapacity, volumes, values));
        }else {
            System.out.println("道具数量不一致。");
        }
        input.close();
    }

    public static int method(int knapsackCapacity, int[] volumes, int[] values) {
        if(knapsackCapacity == 0 || values.length == 0) {
            return 0;
        }
        int[][] arr = new int[volumes.length + 1][knapsackCapacity + 1];
        for (int i = 1; i <= volumes.length; i++) {
            for (int j = 1; j <= knapsackCapacity; j++) {
                if(volumes[j - 1] > j) {
                    arr[i][j] = arr[i - 1][j];
                }else {
                    int val = values[i - 1] + arr[i - 1][j - volumes[j - 1]];
                    arr[i][j] = Math.max(val, arr[i - 1][j]);
                }
            }
        }
        return arr[volumes.length][knapsackCapacity];
    }*/
