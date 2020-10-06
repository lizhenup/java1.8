import java.util.Arrays;
import java.util.Scanner;

public class Quick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        quick(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quick(int[] arr,int start,int end) {
        if(start > end) {
            return;
        }
        int i = start,j = end;
        while (i < j) {
            while (i < j && arr[j] >= arr[start]) {
                j--;
            }
            while (i < j && arr[i] <= arr[start]) {
                i++;
            }
            if(i < j) {
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
            }
        }
        int tmp = arr[start];
        arr[start] = arr[i];
        arr[i] = tmp;
        quick(arr,start,j - 1);
        quick(arr,j + 1,end);
    }
}
