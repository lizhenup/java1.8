

import java.util.*;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/3 0:07
 * @description：
 * @modified By：
 * @version: $
 */
public class Main {
    /*public static void main(String[] args) {
        //堆上开辟内存
        String string = "ABC";
        //堆上开辟内存
        String string1 = new String("ABC");
        //将引用指向string开辟的内存
        String string2 = "AB" + "C";
        char[] chars = {'A','B','C'};
        //堆上开辟内存
        String string3 = new String(chars);
        System.out.println(string.equals(string1));
        System.out.println(string.equals(string2));
        System.out.println(string3);
        System.out.println(string3.equals(string));
        System.out.println("++++++++++++++");
        System.out.println(string == string1);
        System.out.println(string == string2);
        System.out.println(string == string3);
        System.out.println(string1 == string2);
    }*/
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(5);
        System.out.println(queue.size());
        int[] arr = {52, 37, 5, 69, 99, 66, 12, 3, 2};
        for (int i = 0; i < arr.length; i++) {
            if(queue.size() < 5) {
                queue.offer(arr[i]);
            }else if(!queue.isEmpty() && queue.peek() < arr[i]) {
                queue.poll();
                queue.add(arr[i]);
            }


        }
        for (int i : queue) {
            System.out.println(i);
        }
    }



    /*public static int func(int[] array) {
        System.out.println(array.length);
        char[] arr = new char[array.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(array[i]).charAt(0);
            //arr[i] = (char) ('0' + array[i]);
            //arr[i] = (char) (48 + array[i]);
        }
        System.out.println(Arrays.toString(arr));
        HashMap<String, Integer> map = new HashMap<>();
        if(arr.length > 0) {
            digui(arr, 0, map);
        }
        int ret = 0;
        for (String s : map.keySet()) {
            if(Integer.valueOf(s) % 7 == 0 && Integer.valueOf(s) != 0) {
                ret += map.get(s);
            }
        }
        return ret;
    }
    public static void digui(char[] ch, int start,HashMap<String, Integer> map) {
        if(start == ch.length - 1){
            String s = new String(ch);
            map.put(s,map.containsKey(s) ? map.get(s) + 1 : 1);
            return;
        }
        for(int i = start; i < ch.length; i++){
            Swap(ch, start, i);
            digui(ch, start+1, map);
            Swap(ch, start, i); }
    }
    public static void Swap(char[] ch, int i, int j){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }*/
}
