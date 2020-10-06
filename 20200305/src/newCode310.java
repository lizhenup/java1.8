import java.util.*;
public class newCode310 {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        int k = Integer.parseInt(str1[str1.length - 1]);
        int[] array = new int[str1.length - 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(str1[i]);
        }
        Arrays.sort(array);
        for (int i = 0;i < k; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0,cur = 0,ret = - 1;
        while(sc.hasNext()) {
            n = sc.nextInt();
            if(n > 1000) {
                n = 999;
            }
            LinkedList<Integer> list = new LinkedList<Integer>();
            for (int i = 0; i < n; i++) {
                list.addLast(i);
            }
            while (!list.isEmpty()) {
                cur = (cur + 2) % list.size();
                ret = list.remove(cur);
            }
            System.out.println(ret);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 1000) {
                n = 999;
            }
            LinkedList<Integer> list = new LinkedList<Integer>();
            for (int i = 0; i < n; i++) {
                list.addLast(i);
            }
            int i = 0,ret = 0;
            while (!list.isEmpty()) {
                i = (i + 2) % list.size();
                ret = list.remove(i);
            }
            System.out.println(ret);
        }
    }
}
