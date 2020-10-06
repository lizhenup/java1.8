import java.util.*;
public class newCode37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str1 = str.split(" ");
        int[] array = new int[str1.length];
        for (int i = 0; i < str1.length; i++) {
            array[i] = Integer.parseInt(str1[i]);
        }
        Arrays.sort(array);
        int count = 0, ret = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] == array[i + 1]){
                ret = array[i];
                count++;
            }else if((array[i] < array[i + 1]) && count != 0){
                if(count >= ((array.length) / 2))  {
                    return;
                }else {
                    count = 0;
                }
            }
        }
        System.out.println(ret);
    }

    /*public static void  main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array = new double[4];
        array[0] = sc.nextInt();
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();
        array[3] = sc.nextInt();
        Queue<Integer> queue = new LinkedList<Integer>();
        double A = func(array[0],array[2]);
        double B = func(array[1],array[3]);
        double C = func1(array[1],array[3]);
        if(A >= 0 && (A % 1 == 0)) {
            queue.offer((int)A);
        }
        if(B >= 0 && (B % 1 == 0)) {
            queue.offer((int)B);
        }
        if(C >= 0 && (C % 1 == 0)) {
            queue.offer((int)C);
        }
        if(queue.size() != 3) {
            System.out.println("No");
        }else {
            while (!queue.isEmpty()) {
                System.out.print(queue.poll()+" "+ queue.poll()+" "+ queue.poll());
            }
        }

    }
    public static  double func(double a, double b) {
        double ret = (a + b) / 2;
        return ret;
    }
    public static  double func1(double a, double b) {
        double ret1 =  -(a - b) / 2;
        return ret1;
    }*/
    /*public static void  main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = sc.nextInt();
        String[] a = new String[4];
        int j = 0;
        for(int i = 0; i <str.length(); i++) {
            if(str.charAt(i) != ' ') {
                a[j++] = String.valueOf(str.charAt(i));
            }
        }
        int[]array = new int[4];
        for(int i = 0; i < a.length; i++) {
            array[i] = Integer.parseInt(a[i]);
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        double A = func(array[0],array[2]);
        double B = func(array[1],array[3]);
        double C = func1(array[1],array[3]);
        if(A >=0 && (A % 1 == 0)) {
            queue.offer((int)A);
        }
        if(B >=0 && (B % 1 == 0)) {
            queue.offer((int)B);
        }
        if(C >=0 && (C % 1 == 0)) {
            queue.offer((int)C);
        }
        if(queue.size() != 3) {
            System.out.println("No");
        }else {
            System.out.print(queue.peek()+" "+ queue.peek()+" "+ queue.peek());
        }

    }
    public static  double func(int a, int b) {
        double ret = (a + b) / 2;
        return ret;
    }
    public static  double func1(int a, int b) {
        double ret1 =  -(a - b) / 2;
        return ret1;
    }*/


}