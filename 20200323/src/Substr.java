import java.util.*;

public class Substr {
    /*public static boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        char[] S = s.toCharArray();
        boolean[] ret = new boolean[n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < S.length; j++) {
                int cur = j,index = 0;
                while (cur < S.length && p[i].charAt(index) == S[cur]) {
                    if(index < p[i].length() - 1) {
                        index++;
                        cur++;
                    }else if(index == p[i].length() - 1){
                        ret[i] = true;
                        break;
                    }else {
                        break;
                    }
                }
            }
        }
        return ret;
    }
    public static void main1(String[] args) {
        String[] p = {"dd","scdd","k","n"};
        String s ="skscdd";
        System.out.println(Arrays.toString(chkSubStr(p,p.length,s)));
    }*/
   /* public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int op = sc.nextInt();
            String[] S = new String[n];
            String[] name = new String[n];
            int[] grade = new int[n];
            for (int i = 0; i < S.length; i++) {
                name[i] = sc.next();
                grade[i] = sc.nextInt();
            }
            if(op == 0) {
                for (int i = 0; i < grade.length - 1; i++) {
                    for (int j = 0; j < grade.length  - 1 - i; j++) {
                        if( grade[j] < grade[j + 1]) {
                            int tmp = grade[j];
                            grade[j] = grade[j + 1];
                            grade[j + 1] = tmp;
                            String cur = name[j];
                            name[j] = name[j + 1];
                            name[j + 1] = cur;
                        }
                    }
                }
            }else {
                for (int i = 0; i < grade.length - 1; i++) {
                    for (int j = 0; j < grade.length  - 1 - i; j++) {
                        if( grade[j] > grade[j + 1]) {
                            int tmp = grade[j];
                            grade[j] = grade[j + 1];
                            grade[j + 1] = tmp;
                            String cur = name[j];
                            name[j] = name[j + 1];
                            name[j + 1] = cur;
                        }
                    }
                }
            }
            for (int i = 0; i < name.length; i++) {
                System.out.println(name[i] +" "+ grade[i]);
            }
        }
    }*/
    public static int getValue(int[] gifts, int n) {
        // write code here
        quickSort(gifts,0,n -1);
        int count = 1;
        for(int i = 0; i < gifts.length - 1; i++) {
            if(gifts[i] == gifts[i + 1]) {
                count++;
                if(count > gifts.length / 2) {
                    return gifts[i];
                }
            }else if(count != 1 && gifts[i] != gifts[i + 1]) {
                count = 1;
            }
        }
        return 0;
    }
    public static void quickSort(int[] gifts,int start, int end) {
        if(start > end) {
            return;
        }
        int i = start,j = end,tmp = gifts[start];
        while(i < j) {
            while(i < j && tmp <= gifts[j]) {
                j--;
            }
            while(i < j && tmp >= gifts[i]) {
                i++;
            }
            if(i < j) {
                gifts[i] = gifts[i] + gifts[j];
                gifts[j] = gifts[i] - gifts[j];
                gifts[i] = gifts[i] - gifts[j];
            }
        }
        gifts[start] = gifts[i];
        gifts[i] = tmp;
        quickSort(gifts,start,j -1);
        quickSort(gifts,j + 1,end);
    }

    public static void main(String[] args) {
        int[] arr = {56,8,9,7,3,2,6,9,9,9,56,97,7,9,9,9,9,9,9,9,9};
        System.out.println(getValue(arr,arr.length));
        System.out.println(Arrays.toString(arr));
    }
}