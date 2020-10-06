import java.util.*;

public class Main {
        public static void main5(String[] args) {
            int[] arr = {6, 9, 8,36,24,12,7,66};
            quickSort(0,arr.length - 1,arr);
            System.out.println(Arrays.toString(arr));
        }
        /**
         *快速排序：
         *思想：分治的思想
         *通过记录待排序数组的起始下标和终止下标
         *将第一个元素标记为分割的基准
         *用i去获取起始的位置 i从前往后走
         *j去获取终止的位置   j从后往前走
         *在i 与 j没有相遇的前提下
         *j先走 去找比基准小的数字  i后走 去找比基准大的数字
         *当i j 都找到了后 交换数组i 与j 下标的数字
         *若此时i j还未相遇则继续上述过程
         *当i j相遇后 此时i左边的数字都小于基准 j右边的数字都大于基准
         *此时交换 基准与 i下标的值
         *然后在左边和右边的区间中递归上述过程
         *递归结束 数组有序
         */
        public static void quickSort(int low,int high,int[] arr) {
            if(low > high) {
                return;
            }
            int i = low, j = high, tmp = arr[low];
            while(i < j) {
                while(tmp <= arr[j] && i < j) {
                    j--;
                }
                while(tmp >= arr[i] && i < j) {
                    i++;
                }
                if(i < j) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
            arr[low] = arr[i];
            arr[i] = tmp;
            quickSort(low,j - 1,arr);
            quickSort(j + 1, arr.length - 1,arr);
        }
    /*public static void main(String[] args) {
        System.out.println(fib(100));

    }
    private static long fib(int x) {
        long a = 1, b = 2;
        if(x == 1) {
            return a;
        }else if(x == 2) {
            return b;
        }
        long sum = 0;
        while(x-->2){
            sum =a+b;
            a=b;
            b=sum;
        }

        return sum;
    }*/
    /*static final int s = 100; //自定义的台阶数

    static int compute(int stair){
        if ( stair <= 0){
            return 0;
        }
        if (stair == 1){
            return 1;
        }
        if (stair == 2){
            return 2;
        }
        return compute(stair-1) + compute(stair-2);
    }

    public static void main(String args[]) {
        System.out.println("共有" + compute(s) + "种走法");
    }*/
    /*public static void main(String[] args) {
        System.out.println(func(100));
    }
    public static int func(int a) {
        if( a <= 0) {
            return 0;
        }else if(a == 1) {
            return 1;
        }else if(a == 2) {
            return 2;
        }
        return func(a - 1) + func(a - 2);
    }*/
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String num = sc.nextLine();
            String[] str = num.split("");
        System.out.println(Arrays.toString(str));
            int tmp = Integer.parseInt(num) * Integer.parseInt(num);
            System.out.println(func(str) + " " + func(String.valueOf(tmp).split("")));
        }
    }

    private static int func(String[] str) {
        int ret = 0;
        if(str.length == 1) {
            return(Integer.parseInt(str[0]));
        }else {
            for(int i = 0; i < str.length; i++) {
                ret += Integer.parseInt(str[i]);
            }
        }
        return ret;
    }
    /*public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int people = sc.nextInt();
            sc.nextLine();
            String[] person = sc.nextLine().split(" ");
            int num = sc.nextInt();
            sc.nextLine();
            String[] nums = sc.nextLine().split(" ");
            System.out.println(people);
            System.out.println(Arrays.toString(person));
            System.out.println(num);
            System.out.println(Arrays.toString(nums));
            LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
            for(int i = 0; i < person.length; i++) {
                map.put(person[i],0);
            }
            map.put("Invalid",0);
            for(int i = 0; i < nums.length; i++) {
                if(map.containsKey(nums[i])) {
                    int j = map.get(nums[i]);
                    map.put(nums[i],++j);
                }else {
                    int k = map.get("Invalid");
                    map.put("Invalid",++k);
                }
            }
            Set keys = map.keySet();
            for (Object key : keys) {
                System.out.println(key+":"+map.get(key));
            }
        }
    }*/
}
