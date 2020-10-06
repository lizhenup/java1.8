import java.util.HashMap;
import java.util.*;

/**
 * @author ：lizhen
 * @date ：Created in 2020/9/23 16:27
 * @description：
 * @modified By：
 * @version: $
 */
public class Main {
    /*public static void main(String[] args) {
        int[][] i = {{2,8,4},{2,5,0},{10,9,8}};
        int[][] a = {{2,11,3},{15,10,7},{9,17,12},{8,1,14}};
        System.out.println(getTriggerTime(i,a));
    }*/
    /*public static int[] getTriggerTime (int[][] increase, int[][] requirements) {
        // write code here
        int[] ret = new int[requirements.length];
        for (int i = 0; i < ret.length; i++) {
            if(requirements[i][0] == 0 && requirements[i][1] == 0 &&requirements[i][2] == 0) {
                ret[i] = 0;
            }else {
                ret[i] = -1;
            }
        }
        int C = 0;
        int R = 0;
        int H = 0;
        for (int i = 0; i < increase.length; i++) {
            C += increase[i][0];
            R += increase[i][1];
            H += increase[i][2];
            for (int j = 0; j < requirements.length; j++) {
                if(C >= requirements[j][0] && R >= requirements[j][1] && H >= requirements[j][2] && ret[j] == -1) {
                    ret[j] = i + 1;
                }
            }
        }
        //dfs(increase, requirements,C,R,H,1,ret);
        return ret;

    }*/
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();

        //char a = 'a',z = 'z',k = '0', j = '9';
        //System.out.println((int)k);48
        //System.out.println((int)j);57
        //System.out.println((int)a);97
        //System.out.println((int)z);122
        int k = 48;
        for (int i = 0; i < 10; i++) {
            map.put((char) k++,i);
        }
        int j = 97;
        for (int i = 10; i < 36; i++) {
            map.put((char) j++,i);
        }
        Scanner sc = new Scanner(System.in);
        //while (sc.hasNext()) {
        String t = "1y2p0ij32e8e7";
            char[] s = t.toCharArray();//sc.nextLine().toCharArray();
            int ind = 0;
            if(s.length > 20) {
                ind = -1;
                System.out.println(0);
            }
            int index = 0;
            boolean flg = true;
            int[] arr = new int[20];
            for (int i = s.length - 1; i >= 0; i--) {
                if((s[i] >= '0' && s[i] <= '9') || (s[i] >= 'a' && s[i] <= 'z')) {
                    if(index == 0) {
                        index++;
                        func(arr,map.get(s[i]));
                    }else {
                        long tmp = (long) Math.pow(map.get(s[i]), index++);
                        func(arr,tmp);
                    }
                }else if(i == 0 && s[i] == '-') {
                    flg = false;
                }else {
                    System.out.println(0);
                    ind = -1;
                }
            }
            StringBuffer sb = new StringBuffer();
            if(!flg) {
                sb.append('-');
            }
            if(ind == 0) {
                boolean find = true;
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i] != 0 && find) {
                        find = false;
                        sb.append(arr[i]);
                    }else if(!find) {
                        sb.append(arr[i]);
                    }
                }
                System.out.println(sb.toString());
            }
       // }
    }

    private static void func(int[] arr, long tmp) {
        boolean flg = false;
        for (int i = arr.length - 1; i >= 0; i--) {
            if(tmp >= 0) {
                if(flg) {
                    arr[i] += tmp % 10 + 1;
                    if(arr[i] >= 10) {
                        arr[i] -= 10;
                        flg = true;
                    }else {
                        flg = false;
                    }
                }else {
                    arr[i] += tmp % 10;
                    if(arr[i] >= 10) {
                        arr[i] -= 10;
                        flg = true;
                    }
                }
               tmp /= 10;
            }
        }
    }

}
