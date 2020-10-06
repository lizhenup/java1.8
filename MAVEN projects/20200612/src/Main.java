import java.util.*;

public class Main {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            int[] ret = new int[2];
            for(int j = 0; j < n; j++) {
                map.put(arr[j], map.containsKey(arr[j]) ? map.get(arr[j]) + 1 : 1);
            }
            Set<Integer> set = map.keySet();
            int k = 0;
            for (int s : set) {
                if(map.get(s) % 2 != 0) {
                    ret[k++] = s;
                }
            }
            Arrays.sort(ret);
            System.out.println(ret[0] +" "+ ret[1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++) {
                int[] ret = new int[2];
                ret[0] = -1;
                ret[1] = -1;
                for (int j = i - 1; j >= 0; j--) {
                    if(arr[j] < arr[i]) {
                        ret[0] = j;
                        break;
                    }
                }
                for (int k = i + 1; k < arr.length; k++) {
                    if(arr[k] > arr[i]) {
                        ret[1] = k;
                        break;
                    }
                }
                System.out.println(ret[0] +" "+ret[1]);
            }
        }
    }
}
