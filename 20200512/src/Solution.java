import java.util.Arrays;
import java.util.Scanner;

/*public class Solution {
    static int min;

    public static void main(String[] args) {
        int[] arr = {1000,2,3,5,6,7,8,9,100};
        System.out.println(maxPresent(arr));;
    }
    public static int maxPresent (int[] presentVec)
    {
        // write code here
        int sum = 0;
        for(int vec : presentVec)
        {
            sum +=vec;
        }
        min = sum;
        dfs(presentVec,0,0,0,sum);
        return min;
    }

    private static boolean dfs(int[] presentVec, int i, int curSum,int curSum2,int all)
    {
        if(i>=presentVec.length)
        {
            min = Math.min(min, Math.abs(curSum-curSum2));
            return min<=1? true:false;
        }
        if(curSum >= all/2)
        {
            min = Math.min(min, Math.abs(all-2*curSum));
            return min<=1? true:false;
        }
        if(curSum2>=all/2)
        {
            min = Math.min(min, Math.abs(all-2*curSum2));
            return min<=1?true:false;
        }
        if(dfs(presentVec,i+1, curSum,curSum2+presentVec[i], all))
        {
            return true;
        }
        return dfs(presentVec,i+1, curSum+presentVec[i],curSum2, all);
    }
}*/
/*public class Solution {
    public static void main(String[] args) {
        int[] arr = {1000,2,3,5,6,7,8,9,100};
        System.out.println(maxPresent(arr));;
    }
    public static int maxPresent (int[] presentVec) {
        // write code here
        int n = presentVec.length;
        if(n == 0) return 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += presentVec[i];
        }
        //简化为背包问题
        int v = (sum + 1) / 2;
        int[] dp = new int[v+1];
        for(int i = 0; i < n; i++){
            int p = presentVec[i];
            for(int j = v; j >= p; j--){
                dp[j] = Math.max(dp[j], dp[j-p]+p);
            }
        }
        int result = 2*dp[v] - sum;
        return  result >= 0 ? result : -result;
    }
}*/
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int count = -1;
            for(int i = 0; i < n; i++) {
                int[] tmp = Arrays.copyOf(arr,i + 1);
                for(int j = 0; j <= i; j++) {
                    int money = sc.nextInt();
                    if(j - 1 >= 0 && j < i) {
                        arr[j] = money + (tmp[j] > tmp[j-1] ? tmp[j] : tmp[j-1]);
                    }else if(j == i && j != 0 && j - 1 == count) {
                        arr[j] = money + tmp[j - 1];
                    }else {
                        arr[j] += money;
                    }
                }
                count++;
            }
            Arrays.sort(arr);
            System.out.println(arr[arr.length - 1]);
        }
    }
}

