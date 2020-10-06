import java.util.Arrays;
import java.util.*;
/*
* java中的类型传递只有值传递
* 根据数据类型可以分为对基本数据类型的传值操作和对复合数据类型的传值操作
* 基本数据类型包括 boolean(1字节 默认值：false) byte(1字节 默认值：0) short(2字节 默认值：0)
* char(2字节 默认值：'\u0000') int(4字节 默认值：0)  float(4字节 默认值：0.0)
* long(8字节 默认值：0) double(8字节 默认值：0)
* 复合数据类型：数组、类和接口
 * java中对基本类型进行传值操作时改变形参的值不会实际影响到实参。
* String类型也符合此情况 因为String类型如果改变对象的内容就会产生新的对象
* 当对复合数据类型进行传值操作时 传递给形参的是实参的地址 操作形参时直接改变了实参的值
* 总结一下:java中进行值传递时 简单类型及String形参改变不影响实参的值
* 对数组、类、接口进行值传递时，形参改变影响实参的值
* */
public class Go {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] a = str.toCharArray();
        Queue<Integer> queue = new LinkedList<Integer>();
        int count1 = 0,count2 = 0,head;
        for(int i = 0; i < a.length; i++) {
            if(func(a[i]) && func(a[i + 1])) {
                count1++;
            }else if(count1 != 0 && func(a[i]) && func(a[i + 1])) {
                count2++;
            }else if(count1 != 0 && count2 != 0 && func(a[i]) && func(a[i + 1])) {
                if(count1 < count2) {
                    count1 = 0;
                }
            }
    }

    }
    public static int func1() {

    }
    public static boolean func(char a) {
        if(48 < Integer.valueOf(a) && 57 > Integer.valueOf(a)) {
            return true;
        } else {
            return false;
        }
    }*/

    public static void main1(String[] args) {
        String str = "()(())(())";
        boolean ret = chkParenthesis(str,str.length());
        System.out.println(ret);
        /*Scanner sc = new Scanner(System.in);
        Stack stack = new Stack<>();
        int n = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        while (sc.hasNext()) {
            if((n = sc.nextInt()) != 0) {
                queue.offer((n / 2));
            }else {
                break;
            }

        }
        for(int q : queue) {
            System.out.println(q);
        }*/
    }
    public static boolean chkParenthesis(String A, int n) {
        // write code here
        char [] a = A.toCharArray();
        Stack stack = new Stack<Character>();
        if ((n % 2) != 0) {
            return false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (('(' != a[i]) && (')' != a[i])) {
                    return false;
                }else {
                        if(!stack.isEmpty() && a[i] == ')' && a[i] != (char)stack.peek()) {
                            stack.pop();
                        } else {
                            stack.push(a[i]);
                        }
                }

            }
        }
        if(stack.isEmpty()) {
            return true;
        }else {
            return false;
        }

    }
    /*public static void main(String[] args) {
        int[] array = {26,56,4,59,12,2,7,3,55,6,9,0};
        System.out.println(Arrays.toString(array));
        //bubbleSort(array);
//        insertSort(array);
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i],j = 0;
            for(j = i - 1; j >= 0; j--) {
                if(array[j] > tmp) {
                    array[j + 1] = array[j];
                }else {
                    break;
                }
            }
            array[j + 1] = tmp;
        }
    }
    public static void bubbleSort(int[] array) {
        boolean flg = false;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flg = true;
                }
            }
            if(!flg) {
                break;
            }
        }
    }
    public static void quickSort(int[] array) {
        quick(array,0,array.length - 1);
    }

    private static void quick(int[] array, int low, int high) {
        int pivot = partion(array,low,high);
        quick(array,low,pivot - 1);
        quick(array,pivot + 1,high);
    }

    private static int partion(int[] array, int start, int end) {
        int tmp = array[start];
        while (start < end) {
            while ((start < end) && array[end] >= tmp) {
                end--;
            }
            if(start >= end) {
                array[start] = tmp;
                break;
            }else {
                array[start] = array[end];
            }
            while ((start < end) && array[start] <= tmp) {
                start++;
            }
            if(start >= end) {
                array[start] = tmp;
                break;
            }else {
                array[end] = array[start];
            }
        }
        return start;

    }
 /*   public static void insertSort1(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i],j = 0;
            for (j = i - 1; j >= 0; j--) {
                if(array[j] > tmp) {
                    array[j + 1] = array[j];
                }else {
                    break;
                }
            }
            array[j + 1] = tmp;
        }
    }
 public static void insertSort2(int[] array) {
     for (int i = 1; i < array.length; i++) {
         int tmp = array[i],j = 0;
         for (j = i - 1; j >= 0; j--) {
             if(array[j] > tmp) {
                 array[j + 1] = array[j];
             }else {
                 break;
             }
         }
         array[j + 1] = tmp;
     }

 }
 public static void bubbleSort1(int[] array) {
     for (int i = 0; i < array.length - 1; i++) {
         boolean flg = false;
         for (int j = 0; j < array.length - 1 - i; j++) {
             if(array[j] > array[j + 1]) {
                 int tmp = array[j];
                 array[j] = array[j + 1];
                 array[j + 1] = tmp;
                 flg = true;
             }
         }
         if(!flg) {
            break;
         }
     }
 }*/
}
