/*import java.util.Arrays;

import java.util.Arrays;
public class go {
    public static int max(int[] array) {
        int max =array[0];
        for (int i = 1; i <array.length ; i++) {
            if(array[i]>max) {
                max = array[i] ;
            }
        }
        return max;
    }
    public static int min(int[] array) {
        int min =array[0];
        for (int i = 1; i <array.length ; i++) {
            if(array[i]<min) {
                min = array[i] ;
            }
        }
        return min;
    }
    //平均值
    public static int func(int[] array) {
        int sum = 0;

        for (int i = 0; i <array.length ; i++) {
           sum+=array[i];

        }
        return  sum/array.length;
    }
    public static int func2(int[] array) {
        int i = 0 ;
        int j = array.length-1 ;
        while(i<j) {
            int tmp = array[i];
           array [i] = array[j];
            array[j] = tmp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(array));
        //int[] tmp = new int[array.length];
        //int tmp =0;
        //for (int i = 0; i <array.length ; i++) {
        //    if(array[i]<array[i+1]) {
        //       array[i+1] = array[i];
        //        array[i] = tmp;
        //        tmp = array[i+1];
        //    }
        //}

    //}
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(max(array));
        System.out.println(min(array));
        System.out.println(func(array));
        //int[] arr = int[] func2(array);
       /* for(int x:array) {
            System.out.print(x );
        }*/
   // }
//}*/
/*import java.util.Arrays;
public class go {
    public static int transform(int[] array) {
        int[] tmp =new int[array.length];
        //int[] tmp = array;
        for (int i = 0; i <array.length; i++) {
            tmp[i]=array[i]*2;
        }
        return tmp;
    }
    public static void main(String[] args) {
        int [] array ={1,2,3,4,5};
        transform(array);
        int [] arr = transform(array);
        for(int x:array) {
            System.out.print(x );
        }
        System.out.println(Arrays.toString(tmp));
    }

}*/
/*原数组不改变 新数组扩大二倍
import java.util.Arrays;
public class go {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] arr = transform(array);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] transform(int[] array) {
        int[] ret = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; ++i) {
            ret[i] = ret[i] * 2;
        }
        return ret;

    }
}*/
/*public class go {
public static int binarySerach(
        int[] array,int key,int left, int right) {
    if (left > right) {
        return -1;
    }
    int mid = (left + right) >> 1;
    if (array[mid] == key) {
        return mid;
    }else if(array[mid]>key) {
        return binarySerach(array,key,left,right:mid-1);
    }else {
        return binarySerach(array,key,left:mid+1,right);
    }
    return 0;
}

public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6};
            int binarySerach()

        }
}*/
public class go {
    /**
     * 学习Arrays类当中的方法；
     *Arrays.toString（）;
     * Arrays.copyOf（）;
     * Arrays.copyOfRanger();//拷贝部分数组 左闭右开 【）
     * Arrays.binarySearch();
     * Arrays.equals();//判断数组是否相同
     * Arrays.fill(array,9)//数组的填充
     * Arrays.fill(array,2，9，88)//【2,9）下标填充为88
     * Arrays.sort(arrays);将数组进行排序
     * 原理：等排序学完以后 剖析源码
     */
    public static void func(int[] arr) {
        boolean flg;
        for (int i = 0; i <arr.length-1 ; i++) {
            for(int j =0; j<arr.length-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                int tmp = arr[j];
                arr[j]  =arr[j+1];
                arr[j+1] = tmp;
                flg = true;
                if(!flg) {
                        return;

                    }
                }
            }


        }
       ;

    }
    // 1 2 3 4 5
    public static void main(String[] args) {
        int[] arr = {16,72,63,4,51};
        func(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[6]);
        //System.out.println(Arrays.toString(tmp));


    }
}