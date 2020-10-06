import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
    /*public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                arr[j] = arr[j] + arr[j + 1];
                arr[j + 1] = arr[j] - arr[j + 1];
                arr[j] = arr[j] - arr[j + 1];
            }
        }
    }*/
    /*public static void selectSort(int [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = 0;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] > arr[max]) {
                    max = j;
                }
            }
            int tmp = arr[max];
            arr[max] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;

        }
    }*/
    /*public static void heapSort1(int[] arr) {
        createHeap1(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int tmp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = tmp;
            shiftDown(arr, arr.length - i - 1, 0);
        }
    }

    private static void createHeap1(int[] arr) {
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            shiftDown1(arr, arr.length, i);
        }
    }

    private static void shiftDown1(int[] arr, int size, int index) {
        int left = 2 * index + 1;
        while (left < size) {
            int max = left;
            int right = 2 * index + 2;
            if(right < size) {
                if(arr[right] > arr[left]) {
                    max = right;
                }
            }
            if(arr[index] >= arr[max]) {
                break;
            }
            int tmp = arr[index];
            arr[index] = arr[max];
            arr[max] = tmp;

            index = max;
            left = 2 * index + 1;
        }
    }*/
    /*public static void heapSort(int[] array) {
        createHeap(array);
        for (int i = 0; i < array.length - 1; i++) {
            // 交换前 // 无序区间: [0, array.length - i)
            // 有序区间: [array.length - i, array.length)
            swap(array, 0, array.length - 1);
            // 交换后
            // 无序区间: [0, array.length - i - 1)
            // 有序区间: [array.length - i - 1, array.length)
            // 无序区间长度: array.length - i - 1
            shiftDown(array, array.length - i - 1, 0);
        }
    }*/


    /*private static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
    private static void createHeap(int[] array) {
        for (int i = (array.length - 1) / 2; i >= 0; i--) {
            shiftDown(array, array.length, i);
        }
    }
    public static void shiftDown(int[] array, int size, int index) {
        int left = 2 * index + 1;
        while (left < size) {
            int max = left;
            int right = 2 * index + 2;
            if (right < size) {
                if (array[right] > array[left]) {
                    max = right;
                }
            }
            if (array[index] >= array[max]) {
                break;
            }
            int t = array[index];
            array[index] = array[max];
            array[max] = t;
            index = max;
            left = 2 * index + 1;
        }
    }*/
    /*public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1 ; i++) {
            boolean flg = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flg = false;
                }
            }
            if(flg) {
                break;
            }
        }
    }*/
    public static void main(String[] args) {
        int[] arr = {12,3,6,7,2,5,69};
        //quickSort(arr, 0 , arr.length - 1);
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr) {
        mergeSortInternal(arr, 0, arr.length);
    }

    private static void mergeSortInternal(int[] arr, int start, int end) {
        if(start >= end - 1) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSortInternal(arr, start, mid);
        mergeSortInternal(arr, mid, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int i = start, j = mid, len = end - start;
        int[] tmp = new int[len];
        int k = 0;
        while (i < mid && j < end) {
            if(arr[i] <= arr[j]) {
                tmp[k++] = arr[i++];
            }else {
                tmp[k++] = arr[j++];
            }
        }
        while ( i < mid) {
            tmp[k++] = arr[i++];
        }
        while ( j < end) {
            tmp[k++] = arr[j++];
        }
        for (int t = 0; t < len; t++) {
            arr[start + t] = tmp[t];
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        if(left > right) {
            return;
        }
        int i = left, j= right, tmp = arr[left];
        while (i < j) {
            while (arr[j] >= tmp && i <j) {
                j--;
            }
            while (arr[i] <= tmp && i < j) {
                i++;
            }
            if(i < j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[left] = arr[i];
        arr[i] = tmp;
        quickSort(arr, left, j - 1);
        quickSort(arr, j + 1, arr.length - 1);
    }
}
