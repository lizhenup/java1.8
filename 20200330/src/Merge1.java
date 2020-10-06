import java.util.Arrays;

public class Merge1 {
    public static void main(String[] args) {
        int[] arr = {11,44,23,67,88,65,34,48,9,12};
        int[] tmp = new int[arr.length];    //新建一个临时数组存放
        mergeSort(arr,0,arr.length - 1,tmp);
        System.out.print(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high, int[] tmp) {
        if(low < high) {
            int mid = (high + low) / 2;
            mergeSort(arr,low,mid,tmp);
            mergeSort(arr,mid + 1,high,tmp);
            merge(arr,low,mid,high,tmp);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high, int[] tmp) {
        int i = low,j = mid + 1,k = 0;
        while (i <= mid && j <= high) {
            if(arr[i] < arr[j]) {
                tmp[k++] = arr[i++];
            }else {
                tmp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            tmp[k++] = arr[i++];
        }
        while (j <= high) {
            tmp[k++] = arr[j++];
        }
        for (int t = 0; t < k; t++) {
            arr[t + low] = tmp[t];
        }
    }
}
