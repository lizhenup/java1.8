/**
 * @author ：lizhen
 * @date ：Created in 2020/8/8 15:00
 * @description：
 * @modified By：
 * @version: $
 */
import java.util.*;
public class Main {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            long num = 0;
            for (int i = 0; i < n; i++) {
                int tmp = sc.nextInt();
                num += tmp / 2;

            }
            System.out.println(num);
        }
    }*/
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] tmp = new int[n];
            int num = m - n;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                tmp[i] = arr[i];
            }
            Arrays.sort(tmp);
            boolean[] numS = new boolean[tmp[tmp.length - 1] + num + 1];
            for (int i = 1; i < arr.length; i++) {
                numS[arr[i]] = true;
            }
            int[] key = new int[num];
            int k = 0;
            for (int i = 1; i < numS.length && num > 0; i++) {
                if(!numS[i]) {
                    key[k++] = i;
                    num--;
                }
            }
            int[] ret = new int[m];
            int a = 0;
            int j = 0;
            for (int i = 0; i < ret.length; i++) {
                if (a < arr.length && j < key.length) {
                    if(arr[a] < key[j]) {
                        ret[i] = arr[a++];
                    }else {
                        ret[i] = key[j++];
                    }
                } else if(a > arr.length - 1) {
                    ret[i] = key[j++];
                }else {
                    ret[i] = arr[a++];
                }
            }

            for (int i = 0; i < ret.length - 1; i++) {
                System.out.print(ret[i] + " ");
            }
            System.out.println(ret[ret.length - 1]);
        }
    }*/
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int num = sc.nextInt();
            int[] arr = new int[num];
            //int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                //sum += arr[i];
            }
            //sum /= 2;
            int ret = 0;
            int sum1 = 0;
            int sum2 = 0;
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            ArrayList<Integer> list2 = new ArrayList<Integer>();
            //func(list1,list2,sum1,sum2,sum,arr,0);
            for (int i = 0; i < arr.length; i++) {
                if(sum1 <= sum2) {
                    list1.add(arr[i]);
                    sum1 += arr[i];
                }else {
                    list2.add(arr[i]);
                    sum2 += arr[i];
                }
            }
            if (sum1 == sum2) {
                System.out.println(ret);
            }else {
                int k = Math.abs(sum1 - sum2) / 2;
                ArrayList<Integer> tmp = new ArrayList<>();
                if(sum1 > sum2) {
                    for (int i : list1) {
                        if(i == k) {
                            System.out.println(ret);
                        }else if(i < k) {
                            tmp.add(i);
                        }
                    }
                }
            }
        }
    }*/

    /*private static void func(ArrayList<Integer> list1, ArrayList<Integer> list2, int sum1, int sum2, int sum, int[] arr, int start) {
        for (int i = start; i < arr.length; i++) {
            if(sum1 <= sum && sum1 <= sum2) {
                list1.add(arr[i]);
                sum1 += arr[i];
                if((sum1 += arr[i]) >= sum) {
                }
            }else if(sum2 <= sum) {
                list2.add(arr[i]);
                if((sum2 += arr[i]) <= sum) {
                    sum2 += arr[i];
                }
            }else if(sum1)
        }
    }*/
    /*public static void main(String[] args) {
        if(people1 != people2 && people2.isVeryAngry()) {
            people2.exp() += 3;
            System.out.println("+3告辞");
        }
    }*/
}
