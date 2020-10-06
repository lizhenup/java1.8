import java.util.*;

public class Main {
    public static void main6(String[] args) {
        boolean flg = false;
        System.out.println(flg);
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        System.out.println(Arrays.toString(arrayPrint(arr,5)));
    }
    public static int[] arrayPrint(int[][] arr, int n) {
        // write code here
        int[] array = new int[n*n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[index++] = arr[i][j];
            }
        }
        int[] ret = new int[n*n];
        int[] tmp = new int[n];
        int flush  = n,count = 2*n-1;
        for(int i = 0; i < n; i++) {
            tmp[i] = flush--;
        }
        int cur = 1,retI = 0;
        boolean flg = true;
        while (count-- > 0) {
            if(cur <= n && flg) {
                for (int i = cur-1; i >= 0; i--) {
                    ret[retI++] = array[tmp[i]-1];
                    if(tmp[i] <= n*n) {
                        tmp[i]+=n;
                    }
                }
                if(cur != n) {
                    cur++;
                }else {
                    cur--;
                    flg = false;
                }
            }else {
                for (int i = n-1; i >= n-cur; i--) {
                    ret[retI++] = array[tmp[i]-1];
                    if(tmp[i] <= n*n) {
                        tmp[i]+=n;
                    }
                }
                cur--;
            }
        }
        return ret;
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            char[] old = sc.nextLine().toCharArray();
            char[] now = sc.nextLine().toCharArray();
            HashSet<Character> set = new HashSet<Character>();
            for(char n : now) {
                set.add(n);
            }
            StringBuffer sb =  new StringBuffer();
            for(char o : old) {
                if(!set.contains(o)) {
                    sb.append(o);
                }
            }
            System.out.println(sb.toString());
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
            int max = arr[0],sum = arr[0];
            for(int j = 1; j < arr.length; j++) {
                sum = arr[j] >= 0 ? sum + arr[j] : arr[j];
                max = max > sum ? max : sum;
            }
            System.out.println(max);
        }
    }
    static HashSet<Integer> bigMonth = new HashSet<Integer>();
    static HashSet<Integer> smallMonth = new HashSet<Integer>();
    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        bigMonth.add(1);
        bigMonth.add(3);
        bigMonth.add(5);
        bigMonth.add(7);
        bigMonth.add(8);
        bigMonth.add(10);
        bigMonth.add(12);
        smallMonth.add(4);
        smallMonth.add(6);
        smallMonth.add(9);
        smallMonth.add(11);
        while(sc.hasNext()) {
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            if((year % 4 == 0 && year %100 != 0) || year % 400 == 0) {
                if(month == 2 && day > 0 && day <= 29) {
                    System.out.println(31+day);
                }else {
                    if((smallMonth.contains(month) && day > 0 && day <= 30) ||
                            (bigMonth.contains(month) && day > 0 && day <= 31)) {
                        System.out.println(days(month,day)+1);
                    }
                }
            }else {
                if(month == 2 && day > 0 && day <= 28) {
                    System.out.println(31+day);
                }else {
                    if((smallMonth.contains(month) && day > 0 && day <= 30) ||
                            (bigMonth.contains(month) && day > 0 && day <= 31)) {
                        System.out.println(days(month,day));
                    }
                }

           }
        }
    }
    public static int days(int month,int day) {
        switch(month) {
            case 1 :
                break;
            case 3 :
                day+=59;
                break;
            case 4 :
                day+=90;
                break;
            case 5 :
                day+=120;
                break;
            case 6 :
                day+=151;
                break;
            case 7 :
                day+=181;
            case 8 :
                day+=212;
                break;
            case 9 :
                day+=243;
                break;
            case 10 :
                day+=273;
                break;
            case 11 :
                day+=304;
                break;
            case 12 :
                day+=334;
                break;
        }
        return day;
    }
    public static void main5(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            sc.nextLine();
            HashSet<Integer> set = new HashSet<Integer>();
            while(n-- > 0) {
                char[] ch = sc.nextLine().toCharArray();
                StringBuffer sb = new StringBuffer();
                for(char c : ch) {
                    if(c == 48) {
                        sb.append(0);
                    }else if(c == 49) {
                        sb.append(1);
                    }else if((c >= 65 && c<= 67)|| c == 50) {
                        sb.append(2);
                    }else if((c >= 68 && c<= 70)|| c == 51) {
                        sb.append(3);
                    }else if((c >= 71 && c<= 73)|| c == 52) {
                        sb.append(4);
                    }else if((c >= 74 && c<= 76)|| c == 53) {
                        sb.append(5);
                    }else if((c >= 77 && c<= 79)|| c == 54) {
                        sb.append(6);
                    }else if((c >= 80 && c<= 83)|| c == 55) {
                        sb.append(7);
                    }else if((c >= 84 && c<= 86)|| c == 56) {
                        sb.append(8);
                    }else if((c >= 87 && c<= 90)|| c == 57) {
                        sb.append(9);
                    }
                }
                set.add(Integer.parseInt(new String(sb)));
            }
            int[] ret = new int[set.size()];
            int i = 0;
            for(int s : set) {
                ret[i++] = s;
            }
            Arrays.sort(ret);
            for(int r : ret) {
                System.out.println(toLength(r/10000,3) + "-" + toLength(r % 10000,4));
            }
            System.out.println();
        }
    }
    public static String  toLength(int num,int len) {
        StringBuffer  sb = new StringBuffer();
        sb.append(num);
        while (sb.length() < len) {
            sb.insert(0,0);
        }
        return new String(sb);
    }

    static ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*while (sc.hasNext()) {*/
            int n = /*sc.nextInt()*/6;
            int m = /*sc.nextInt()*/6;
            dfs(1,n,m);
            for(ArrayList<Integer> l : ret) {
                int i = 0;
                for (; i < l.size() - 1; i++) {
                    System.out.print(l.get(i) + " ");
                }
                System.out.println(l.get(i));
            }
        /*}*/
    }

    private static void dfs(int index, int n, int count) {
        if(count == 0) {
            ret.add(new ArrayList<>(list));
        }else {
            for (int i = index; i <= count && i <= n; i++) {
                list.add(i);
                dfs(i + 1,n,count - i);
                list.remove(list.size() - 1);
            }
        }
    }
    public static void main7(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String[] str = sc.nextLine().split("_");
            System.out.print(str[0]);
            for(int i = 1; i < str.length; i++) {
                char ch = (char)(str[i].charAt(0)-32);
                StringBuffer sb = new StringBuffer();
                sb.append(ch).append(str[i].substring(1,str[i].length()));
                System.out.print(sb);
            }
            System.out.println();
        }
    }
    public static void main8(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String[] str = sc.nextLine().split(" ");
            HashMap<Character,Integer> map = new HashMap<Character,Integer>();
            char[] A = str[0].toCharArray();
            for(char a : A) {
                map.put(a,map.containsKey(a) ? map.get(a) + 1 : 1);
            }
            char[] B = str[1].toCharArray();
            if(compareB(map,B)) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }

    private static boolean compareB(HashMap<Character,Integer> map, char[] B) {
        for(char b : B) {
            if(map.containsKey(b) && map.get(b) > 0) {
                map.put(b,map.get(b)-1);
            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            String[] words = new String[n];
            for(int i = 0; i < words.length; i++) {
                words[i] = sc.next();
            }
            String check = sc.next();
            int findNum = sc.nextInt();
            int count = 0;
            ArrayList<String> list1 = new ArrayList<String>();
            for(String w : words) {
                if(!check.equals(w) && check.length() == w.length() && func(check.toCharArray(),w.toCharArray())) {
                    count++;
                    list1.add(w);
                }
            }
            String[] bros = new String[list1.size()];
            int k = 0;
            for(String l : list1) {
                bros[k++] = l;
            }
            quickSort(bros,0,bros.length - 1);
            System.out.println(count);
            if(findNum <= bros.length && count > 0) {
                System.out.println(words[findNum-1]);
            }
        }
    }

    private static boolean func(char[] ch, char[] w) {
        Arrays.sort(ch);
        Arrays.sort(w);
        for(int k = 0; k < ch.length; k++) {
            if(ch[k] != w[k]) {
                return false;
            }
        }
        return true;
    }
    private static void quickSort(String[] str, int left, int right) {
        if(left > right) {
            return;
        }
        int i = left,j = right;
        String tmp = str[left];
        while (i != j) {
            while (i < j && find(tmp.toCharArray(),str[j].toCharArray())) {
                j--;
            }
            while (i < j && !find(tmp.toCharArray(),str[i].toCharArray())) {
                i++;
            }
            if(i < j) {
                String tmep = str[i];
                str[i] = str[j];
                str[j] = tmep;
            }
        }
        str[left] = str[i];
        str[i] = tmp;
        quickSort(str,left,i-1);
        quickSort(str,i+1,right);
    }

    private static boolean find(char[] tmp, char[] s) {
        for(int i = 0; i < (tmp.length > s.length ? s.length : tmp.length); i++) {
            if(tmp[i] < s[i]) {
                return true;
            }else if(tmp[i] > s[i]) {
                return false;
            }
        }
        if(tmp.length > s.length) {
            return true;
        }else {
            return false;
        }
    }

}
