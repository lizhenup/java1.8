import java.util.Arrays;

public class Go {
    public static void main(String[] args) {
        int[] array = new int[] {62,75,4,28,69,77,93,156,587,2};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static  void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = 0  ; j < array.length - 1  - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
    public static void insertSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = 0;
            for(j = i - 1;j >= 0; j--) {
                if(array[j] > tmp) {
                    array[j + 1] = array[i];
                }else {
                    break;
                }
            }
            array[j + 1] = tmp;
        }
    }
}


