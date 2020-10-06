import java.util.*;

public class I {
    /*public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j <= i; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println(func(arr,0,0,0,0,n));
        }
    }

    static ArrayList<int[]> list = new ArrayList<int[]>();
    private static int func(int[][] arr, int x, int y, int sum,int len,int n) {
        if(len == n || len > n) {
            return sum;
        }
        if(len >= y) {
            sum += arr[x][y];
        }

    }*/
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int count = 1,tmp = 1,num = 0,index = 0;
            for(int i = 0; i + 1 < arr.length; i++) {
                if(arr[i] == arr[i + 1]) {
                    tmp++;
                } else {
                    if(tmp > count) {
                        count = tmp;
                        num = arr[i];
                        index = i;
                    }
                    tmp = 1;
                }
            }
            if(num >= k) {
                System.out.println(0);
            }
            int should = k - num, i = 0, j = arr.length - 1,ret = 0;
            while (should-- > 0 && i != j) {
                while (arr[index] - arr[i] == 0) {
                    i++;
                }
                while (arr[index] - arr[j] == 0) {
                    j--;
                }
                ret += Math.abs(arr[index] - arr[i]) > Math.abs(arr[index] - arr[j])
                        ? Math.abs(arr[index] - arr[j]) : Math.abs(arr[index] - arr[i]);

            }
            System.out.println(ret);
        }
    }*/
    public static void main(String[] args) {
        int[] arr = {2,4,3,4,3};
        System.out.println(minimumValueAfterDispel(arr));;
    }
    public static long minimumValueAfterDispel (int[] nums) {
        // write code here
        Arrays.sort(nums);
        long sum = 0;//记录整个数组的和
        long max = 0;//记录能够减去的最大值
        for(int j=0;j<nums.length;j++){
            sum += nums[j];
            int index1 = j;
            int index2 = j;
            int index3 = j;
            for(int i=0;i<=j;i++){
                while(index1 > 0 && nums[index1-1] >= nums[j]-nums[i]){
                    index1--;
                }
                while(index2 > i && nums[index2-1] >= nums[j]-nums[i]){
                    index2--;
                }
                while(index3 < nums.length && (long)nums[index3] < (long)nums[i]+nums[j]){
                    index3++;
                }
                long tmp1 = (i-index1)*((long)nums[j]-nums[i]) + (j-i)*(long)nums[i] + (nums.length-j)*(long)nums[j];
                long tmp2 = (index2-i)*((long)nums[i]) + (j-index2)*((long)nums[j]-nums[i]) + (nums.length-j)*(long)nums[j];
                long tmp3 = (j-i)*(long)nums[i] + (index3-j)*(long)nums[j] + (nums.length-index3)*((long)nums[i]+nums[j]);
                max = Math.max(max,tmp1);
                max = Math.max(max,tmp2);
                max = Math.max(max,tmp3);
            }
        }
        return sum - max;
    }
    public long minimumValueAfterDispel (int[] nums) {
        // write code here
        Arrays.sort(nums);
        int count = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int n : nums) {
            set.add(n);
        }
        if(set.size() == 3) {
            int[] ts = new int[3];
            int t = 0;
            for (int s : set) {
                ts[t++] = s;
            }
            Arrays.sort(ts);
            if(ts[0] + 1 == ts[1] && ts[1] + 1 == ts[2]) {
                return 0;
            }
        }
        if(nums.length % 2 != 0) {
            int tmp = nums[(nums.length - 1) / 2];
            for(int i = 0; i < nums.length; i++) {
                if(tmp - nums[i] >= 0) {
                    nums[i] = tmp - nums[i];
                }
            }
        }else {

        }
    }

    private int[] func(int[] nums,int tmp) {

    }
}
