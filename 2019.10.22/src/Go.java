import java.util.Arrays;

public class Go {
    static int count = 0;
    //建立一个新数组使其扩大二倍
    /*public static int[] transform(int[] array) {
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = 2*array[i];
        }
        return tmp;
    }
    public static void main3(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[]ret = transform(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(ret));
    }*/
    //转义字符
    /*public static String func2(int[] array) {
        String ret ="[";
        for (int i = 0; i <array.length ; i++) {
            ret += array[i];
            if(i !=array.length-1) {
                ret +=",";
            }
        }
        ret +="]";
        return ret;
    }

    public static void main(String[] args) {
       int[] array = {1,2,3,4,5,6};
        System.out.println(func2(array));
    }*/
    //public static  int
    public static int[] func3(int[] array) {
        int[] tmp = new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            tmp[i]=array[i];
        }
        return tmp;
    }
    /*public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int[] arr1=func3(array);
        int[] arr2=Arrays.copyOf(array,array.length);
        int[] arr3 = new int [6];
        *//*System.arraycopy(array,
                0,array2,0,array.length);*//*
        System.arraycopy(array,
                0,arr3,0,array.length);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }*/
    public static int func3(int [] array,int tofind ) {
        for (int i = 0; i <array.length ; i++) {
            if(array[i]==tofind) {
                return i;
            }
        }
        return -1;
    }
    /*public static void bubbleSort(int[] array) {

        boolean flg = false;
        //趟数
        for (int i = 0; i < array.length-1; i++) {
            flg = false;//因为每一趟都有能有序
            //次数
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(!flg) {
                return;
            }
        }
    }*/
    public static void func4(int[]array) {
        boolean flg = false;
        //int [] tmp =new int [array.length];
        for (int i = 0; i <array.length-1 ; i++) {
            flg = false;
            for (int j = 0; j <array.length-1-i ; j++) {
                if(array[i]>array[i+1]) {
                    int tmp =  array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    flg =true;
                }

            }

        }if(!flg) {
            return ;
        }
    }
    //二分查找
    public static int func5(int []array,int key) {
        int left = 0;
        int right = array.length-1;
        while(left<=right) {
            count++;
            int mid = (left+right)/2;
            if(array[mid]==key) {
                return mid;
            }else if(array[mid]<key) {
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] array= {15,24,33,42,45,36,455};
        System.out.println(Arrays.toString(array));
        func4(array);
        //System.out.println((func3(array,6)));
        //bubbleSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("要找的元素在数组中的下标为："+func5(array,455)+"        "  + "二分查找进行的次数为："+count);
    }
}