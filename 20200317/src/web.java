import java.util.*;
public class web {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "ACTGACACGTACGAGCTAGCTAGCTAGCTACG";
            char[] ch = str.toCharArray();
            int n = 5,ed = 0;
            double gc = 0.0;
            for(int i = 0; i + n - 1 < ch.length; i++) {
                char[] ch1 = new char[n];
                int start = i,end = i + n - 1,k = 0;
                while(start <= end) {
                    ch1[k++] = ch[start++];
                }
                int count = 0;
                for(char c : ch1) {
                    if(c == 'G' || c == 'C') {
                        count++;
                    }
                }
                double ret = (double)count / (double)n;
                if(ret > gc) {
                    gc = ret;
                    ed = end;
                }
            }
            for(int st = ed - n + 1;st <= n; st++) {
                System.out.print(ch[st]);
            }
            System.out.println();
    }
        public static void main2(String[] args) {
            int a = 300,b = 0;
            for(int i = 1; i <= 30; i++) {
                b += b + 1;
            }
            System.out.print(a +" "+ b);
        }
}
