import java.util.Arrays;
import java.util.Queue;

public class Case1 {
    public static void main(String[] args) {
        int[] array = new int[] {1,5,3,4,2,7,6,0};
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));

    }
    public static void quickSort(int[] array) {
        int len = array.length;
        if(array == null || len  == 0 || len == 1) {
            return;
        }
        sort(array,0,len - 1);
    }
    public static void sort(int[] array,int left,int right) {
        if(left > right) {
            return;
        }
        int base = array[left];
        int i = left,j = right;
        while(i != j) {
            while (array[j] >= base && i < j) {
                j--;
            }
            while (array[i] <= base && i < j) {
                i++;
            }
            if(i < j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
            array[left] = array[i];
            array[i] = base;
            sort(array,left,i - 1);
            sort(array,i + 1,right);
        }
    }
}
