/**
 * @author ：lizhen
 * @date ：Created in 2020/7/27 11:23
 * @description：
 * @modified By：
 * @version: $
 */
import java.util.*;

public class Main {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            //System.out.println();
            while(n-- > 0) {
                char[] ch = sc.nextLine().toCharArray();
                if(ch.length == 0) {
                    System.out.println();
                }
                int start = 0;
                int end = ch.length - 1;
                int ret = -1;
                while(start < end) {
                    if(ch[start] != ch[end]) {
                        if(ch[start + 1] == ch[end]) {
                            ret = start;
                            break;
                            //start++;
                        }else {
                            ret = end;
                            //end--;
                            break;
                        }
                    }
                    start++;
                    end--;
                }
                System.out.println(ret);
            }
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            HashSet<Integer>  set = new HashSet<>();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = a + b;
            while(n-- > 0) {
                int num = sc.nextInt();
                set.add(num);
            }
            int[] arr = new int[set.size()];
            int i = 0;
            for(int s : set) {
                arr[i++] = s;
            }
            Arrays.sort(arr);
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }


}
