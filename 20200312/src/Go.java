import java.util.*;
public class Go {
      static int[] weight;
      static int N;
      static int count=0;
      public static void main1(String[] args) {
          Scanner input = new Scanner(System.in);
          while (input.hasNext()) {
              N = input.nextInt();
              weight = new int[N+1];
              for (int i = 1; i <= N; i++) {
                  weight[i] = input.nextInt();
              }
              count(40,N);
              System.out.println(count);
          }
      }
      public static void count(int s,int n) {
          //如果正好装满
          if(s==0) {
              ++count;
              return ;

           }//是s<0或n<1则不能完成
          if(s < 0||(s > 0 && n < 1)) return ;
          count(s-weight[n],n-1);
          count(s,n-1);
      }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int N = sc.nextInt(),a = 0, b = 1, c = 1;
            System.out.println(Fibonacci(a,b,c,N));
        }
    }
    public static int Fibonacci(int a,int b,int c,int N) {
          int ret = 0;
        if(a <= N && N <= b) {
            return count(a,b,N);
        }
        if(b <= N && N <= c) {
            return count(b,c,N);

        }
        int tmp = c;
        c = a + b;
        a = b;
        b = tmp;
        if(ret != 0) {
            return ret;
        }
        return Fibonacci(a,b,c,N);
    }
    public static int count (int a, int b, int N) {
        if(N - a > b - N) {
            return b - N;
        }else {
            return N - a;
        }
    }
    static int COUNT = 0;
    public static int countWays(int x, int y) {
        // write code here
        if(x == 1 || y == 1) {
            return 1;
        }
        return countWays(x - 1,y) + countWays(x,y - 1);
    }

    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            char[] ch = sc.nextLine().toCharArray();
            int[] array = new int[ch.length];
            for (int i = 0; i < ch.length; i++) {
                array[i] = Integer.valueOf(Character.toString(ch[i]));
            }
            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
            for (int i = 0; i < 10; i++) {
                int val = 0;
                for (int j = 0; j < array.length; j++) {
                    if( i == array[j]) {
                        val++;
                    }
                }
                if(val != 0) {
                    map.put(i,val);
                }
            }
            Set keys = map.keySet();
            for(Object key : keys) {
                System.out.println(key + ":" + map.get(key));
            }

        }
    }

    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        for(int i = 0; i < B.length; i++) {
            B[i] = 1;
            for(int j = 0; j < A.length; j++) {
                if(j != i) {
                    B[i] *= A[j];
                }
            }
        }
        return B;
    }
        public static String[] getGray(int n) {
            String[] resStrs = null;
            if(n == 1){
                resStrs = new String[]{"0","1"};
            }else{
                String[] strs = getGray(n-1);
                resStrs = new String[2*strs.length];
                for(int i=0; i<strs.length; i++){
                    resStrs[i] = "0"+strs[i];
                    resStrs[resStrs.length-1-i] = "1"+strs[i];
                }
            }
            return resStrs;
        }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getGray(3)));
    }
}

