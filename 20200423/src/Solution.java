import java.util.*;
import java.util.Map.Entry;

public class Solution {

    public static int MoreThanHalfNum_Solution(int [] array) {
        quickSort(array,0,array.length - 1);
        int k = array [(array.length - 1 ) / 2 + 1];
        int count = 1, i = (array.length - 1 ) / 2, j = (array.length - 1 ) / 2 + 2;
        while(i >= 0 && array[i] == k) {
            i--;
            count++;
        }
        while(j < array.length && array[j] == k) {
            j++;
            count++;
        }
        if(count >= array.length / 2 + 1) {
            return k;
        }else {
            return 0;
        }
    }

    private static void quickSort(int[] arr, int left, int right) {
        if(left > right) {
            return;
        }
        int i = left, j = right,tmp = arr[left];
        while(i != j) {
            while(i < j && tmp <= arr[j]) {
                j--;
            }
            while(i < j && tmp >= arr[j]) {
                i++;
            }
            if(i < j) {
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
            }
        }
        arr[left] = arr[i];
        arr[i] = tmp;
        quickSort(arr,left,i - 1);
        quickSort(arr,i + 1,right);
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String,Integer> map = new LinkedHashMap<String, Integer>();
        while (sc.hasNext()) {
            String[] Str = sc.nextLine().split("\\\\");
            String totalName = Str[Str.length-1];
            map.put(totalName,map.containsKey(totalName) ? map.get(totalName)+1 : 1);
        }
        sc.close();
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (int i = 0; i < 8; i++) {
            String[] ret = list.get(i).getKey().split(" ");
            if(ret[0].length() > 16) {
                String r = ret[0].substring(ret[0].length()-16,ret[0].length());
                StringBuilder sb = new StringBuilder();
                sb.append(r).append(" ").append(ret[1]).append(list.get(i).getValue());
                System.out.println(new String(sb).trim());
            }else {
                StringBuilder sb = new StringBuilder();
                sb.append(list.get(i).getKey()).append(" ").append(list.get(i).getValue());
                System.out.println(new String(sb).trim());
            }
        }
    }
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int d = sc.nextInt();
            int max = 1;
            findMax(arr,max,0,k,d);
        }
    }

    static int Max = 0;
    private static int findMax(int[] arr, int max, int start,int k,int d) {
        if(d == 0) {
            return max;
        }
        int end;
        if(start + d > arr.length - 1) {
            end = arr.length - 1;
        }else {
            end = start + d;
        }
        max *= arr[start];
        for(int i = start + 1; i < end; i++) {
            max *= arr[i];
             Max = Max > findMax(arr,max,i,k,d - 1) ? Max : findMax(arr,max,i,k,d - 1);
        }
        return Max;
    }
    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            HashMap<Integer,Integer> mapWight = new HashMap<Integer, Integer>();
            HashMap<Integer,Integer> mapHigh = new HashMap<Integer, Integer>();
            while (n-- > 0) {
                int num = sc.nextInt(), wight = sc.nextInt(), high = sc.nextInt() ;
                mapWight.put(num,wight);
                mapHigh.put(num,high);
            }
            System.out.println(mapHigh.size());
            int mW = mapSort(mapWight,mapHigh);
            int mH = mapSort(mapHigh,mapWight);
            System.out.println(mW+" "+mH);
            int max = mH > mW ? mH : mW;
            System.out.println(max);
        }
    }
    private static int mapSort(HashMap<Integer,Integer> map1, HashMap<Integer,Integer> map2) {
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map1.entrySet());
        Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        int t = 0;
        int[] arr1 = new int[list.size()];
        int[] arr2 = new int[list.size()];
        for(Map.Entry l : list) {
            arr1[t] = (int)l.getValue();
            arr2[t++] = map2.get(l.getKey());
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println();
        System.out.println(Arrays.toString(arr2));
        int count = 1,num = 1;
        for (int i = 0; i < arr1.length; i++) {
            int tmp1 = arr1[i],tmp2 = arr2[i];
            for (int j = i + 1; j < arr2.length; j++) {
                if( tmp2 < arr2[j] || (tmp1 == arr1[j] && tmp2 == arr2[j])) {
                    tmp1 = arr1[j];
                    tmp2 = arr2[j];
                    count++;
                }
            }
            num = num > count ? num : count;
            count = 1;
        }
        return num;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(clockwisePrint(arr,3,3)));
    }
    public static int[] clockwisePrint(int[][] mat, int n, int m) {
        // write code here
        int nS = 0,mS = 0, nE = n - 1 , mE = m - 1,count = 0,i = 0, j = 0;
        int[] ret = new int[n * m];
        while(nS <= nE && mS <= mE) {
            if (nS == nE) {
                while (j <= mE) {
                    ret[count++] = mat[nS][j++];
                }
                return ret;
            }
            if (mS == mE) {
                while (i < nE) {
                    ret[count++] = mat[i++][mS];
                }
                return ret;
            }
            while(j < mE) {
                ret[count++] = mat[i][j++];
            }
            while(i < nE) {
                ret[count++] = mat[i++][j];
            }

            while(j > nS) {
                ret[count++] = mat[i][j--];
            }
            while(i > mS) {
                ret[count++] = mat[i--][j];
            }
            i++;
            j++;
            nE--;
            mE--;
            nS++;
            mS++;
        }
        return ret;
    }
}
