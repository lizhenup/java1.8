import java.util.Arrays;
public class QuickSort {
    public static void quickSort(int[] arr,int low,int high) {
        if(low > high) {
            return;
        }
        int i = low,j = high,temp = arr[low];
        while (i < j) {
            while (temp <= arr[j] && i < j) {
                j--;
            }
            while (temp >= arr[i] && i < j) {
                i++;
            }
            if(i < j) {
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        quickSort(arr,low,j - 1);
        quickSort(arr,j + 1,high);
    }

    public static void main(String[] args) {
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
