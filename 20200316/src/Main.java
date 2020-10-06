import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            int[] array1,array2;
            if(str1.length() > str2.length()) {
                array1 = new int[str1.length() + 1];
                array2 = new int[str1.length() + 1];
            }else {
                array1 = new int[str2.length() + 1];
                array2 = new int[str2.length() + 1];
            }
            func(array1,str1);
            func(array2,str2);
            boolean flg = false;
            for(int i = array1.length - 1; i >= 0; i--) {
                if(flg) {
                    if(array1[i] + array2[i] + 1 >= 10) {
                        array1[i] = (array1[i] + array2[i] + 1) % 10;
                    }else {
                        array1[i] += array2[i] + 1;
                        flg = false;
                    }
                }else {
                    if(array1[i] + array2[i] >= 10) {
                        array1[i] = (array1[i] + array2[i]) % 10;
                        flg = true;
                    }else {
                        array1[i] += array2[i];
                    }
                }
            }
            StringBuffer sb = new StringBuffer();
            if(array1[0] == 0) {
                for(int i = 1; i < array1.length; i++) {
                    sb.append(array1[i]);
                }
            }else {
                for(int i = 0; i < array1.length; i++) {
                    sb.append(array1[i]);
                }
            }
            System.out.println(sb.toString());
        }
    }
    public static int[] func(int[] array, String str) {
        String[] Str = str.split("");
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < Str.length; i++) {
            stack.push(Integer.valueOf(Str[i]));
        }
        int k = array.length - 1;
        while (!stack.isEmpty()) {
            array[k--] = stack.pop();
        }
        return array;
    }
}