

/**
 * @author ：lizhen
 * @date ：Created in 2020/9/8 18:45
 * @description：
 * @modified By：
 * @version: $
 */
/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String find = sc.nextLine();
            String R = sc.nextLine();
            String t = sc.nextLine();
            ArrayList<String> list = new ArrayList<>();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < R.length(); i++) {
                char ch = R.charAt(i);
                if(ch == ' ' && sb.length() != 0) {
                    list.add(new String(sb));
                    sb.delete(0,sb.length());
                    sb.append(ch);
                    list.add(new String(sb));
                    sb.delete(0,sb.length());
                }else if((ch >= 'a' && ch <= 'z') ||
                        (ch >= 'A' && ch <= 'Z')) {
                    sb.append(ch);
                }else {
                    list.add(new String(sb));
                    sb.delete(0,sb.length());
                    sb.append(ch);
                    list.add(new String(sb));
                    sb.delete(0,sb.length());
                }

            }
            if(sb.length() != 0) {
                list.add(new String(sb));
            }
            HashSet<String> set = new HashSet<>();
            set.add(find);
            func(find.toCharArray(),set,0);
            for (int i = 0; i < list.size() - 1; i++) {
                String str = list.get(i);
                if(set.contains(str)) {
                    System.out.print(t);
                }else {
                    System.out.print(list.get(i));
                }

            }
            if(set.contains(list.get(list.size() - 1))) {
                System.out.println(t);
            }else {
                System.out.println(list.get(list.size() - 1));
            }
        }
    }

    private static void func(char[] chars, HashSet<String> set, int start) {
        if(start >= chars.length - 1) {
            StringBuffer sb = new StringBuffer(String.valueOf(chars));
            set.add(sb.toString());
        }
        for (int i = start; i < chars.length; i++) {
            Swap(chars,start,i);
            func(chars,set,start + 1);
            Swap(chars,start,i);
        }
    }

    private static void Swap(char[] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }
}*/
/*import java.util.*;

public class Main {
    static int num = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int E0 = sc.nextInt();
            int X = sc.nextInt();
            int L = sc.nextInt();
            int[][] arr = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            num = Integer.MAX_VALUE;
            func(0,0,E0,X,L,0,arr);
            if(num == Integer.MAX_VALUE) {
                System.out.println("NA");
            }else {
                System.out.println(num);
            }

        }
    }

    private static void func(int stX, int stY,int e0, int x, int l, int go, int[][] arr) {
        if(stX == arr.length - 1 && stY == arr[0].length - 1) {
            num = Math.min(num,go);
            return;
        }
        if(stX - 1 >= 0) {
            if(arr[stX - 1][stY] <= e0) {
                func(stX - 1,stY,e0-arr[stX - 1][stY],x,l,go+1,arr);
            }else if(l >= arr[stX - 1][stY] && x > 0) {
                func(stX - 1,stY,l-arr[stX - 1][stY],x-1,l,go+1,arr);
            }
        }
        if(stX + 1 < arr.length) {
            if(arr[stX + 1][stY] <= e0) {
                func(stX + 1,stY,e0-arr[stX + 1][stY],x,l,go+1,arr);
            }else if(l >= arr[stX + 1][stY] && x > 0) {
                func(stX + 1,stY,l-arr[stX + 1][stY],x-1,l,go+1,arr);
            }
        }
        if(stY + 1 < arr[0].length) {
            if(arr[stX][stY + 1] <= e0) {
                func(stX,stY+ 1,e0-arr[stX][stY + 1],x,l,go+1,arr);
            }else if(l >= arr[stX][stY + 1] && x > 0) {
                func(stX,stY + 1,l-arr[stX][stY + 1],x-1,l,go+1,arr);
            }
        }
        if(stY - 1 >= 0) {
            if(arr[stX ][stY - 1] <= e0) {
                func(stX,stY - 1,e0-arr[stX][stY - 1],x,l,go+1,arr);
            }else if(l >= arr[stX][stY - 1] && x > 0) {
                func(stX,stY - 1,l-arr[stX][stY - 1],x-1,l,go+1,arr);
            }
        }
    }
}*/
/*class Car {
    public void Run() {
        System.out.println("汽车 Run");
    }
}*/
/*class A extends Car {
    public void Run() {
        System.out.println("A Run");
    }
}
class B extends A {
    public void Run() {
        System.out.println("B Run");
    }
}


public class Main {
    public static void func(Car car) {
        car.Run();
    }
    public static void main(String[] args) {
        func(new B());
        func(new A());
    }
}*/
public class Main {
    public static void main(String[] args) {
        String[] st = {"12","15","58","75"};
        System.out.println(String.join(".",st));
    }
}

