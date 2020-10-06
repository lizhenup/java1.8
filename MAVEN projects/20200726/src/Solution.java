/**
 * @author ：lizhen
 * @date ：Created in 2020/7/26 12:07
 * @description：
 * @modified By：
 * @version: $
 */

import java.util.*;

public class Solution {
    /*public static void Swap(char[] str, int i, int j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static boolean IsExist(ArrayList<String> result, char[] str){
        return result.contains(String.valueOf(str));
    }

    public static void PermutationHelper(char[] str, int start, ArrayList<String> result){
        if(start == str.length - 1){
            if(!IsExist(result, str)){
                result.add(new String(str));
            }
            return;
        }
        for(int i = start; i < str.length; i++){
            Swap(str, start, i);
            PermutationHelper(str, start + 1, result);
            Swap(str, start, i);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> ret = Permutation(str);
        for (String s : ret) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        if(str != null && str.length() > 0){
            PermutationHelper(str.toCharArray(), 0, result);
            Collections.sort(result);
        }
        return result;
    }*/
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String string = "1asd123546asddd123456asada";
        while (sc.hasNext()) {
            char[] str = sc.nextLine().toCharArray();
            StringBuffer sb = new StringBuffer();
            String ret = "";
            int len = 0;
            int maxLen = 0;

            //System.out.println(str.length);
            for (int i = 0; i < str.length; i++) {
                //System.out.print(str[i]);
                if(isNum(str[i])) {
                    sb.append(str[i]);
                    len++;
                    if(i + 1 < str.length && !isNum(str[i + 1])) {
                        if(len > maxLen) {
                            maxLen = len;
                            ret = sb.toString();

                        }else {
                            sb.delete(0,sb.length());
                            len = 0;
                        }
                    }
                    if(i == str.length - 1) {
                        if(len > maxLen) {
                            ret = sb.toString();
                        }
                    }
                }
            }
            System.out.println(ret);
        }
    }

    public static boolean isNum(char ch) {
        if('0' <= ch && ch <= '9') {
            return true;
        }
        return false;
    }*/

    public static void main2(String[] args) {
        int[] ret = {3,5,6,8,7,4,2,1,5};
        ArrayList<Integer> r = GetLeastNumbers_Solution(ret,4);
        for (int i: r) {
            System.out.println(i);
        }

    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        //Arrays.sort(input);
        ArrayList<Integer> ret = new ArrayList<Integer>();
        PriorityQueue<Integer> queue = new PriorityQueue(k,Comparator.reverseOrder());
        for(int i = 0; i < k; i++) {
            queue.add(input[i]);
        }

        for (int i = k; i < input.length; i++) {
            if(!queue.isEmpty() && queue.peek() > input[i]) {
                queue.poll();
                queue.add(input[i]);
            }
        }
        int[] arr = new int[k];
        int len = 0;
        for (int q : queue) {
            arr[len++] = q;
        }
        //Arrays.sort(arr);
        for (int a : arr) {
            ret.add(a);
        }
        return ret;

    }
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

        }
    }
}
