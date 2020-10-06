public class TestDemo {
    public static void main(String[] args) {

    }
    //直接插入排序
    //时间复杂度 最坏 o(n^2) 最佳 o(n) 数据越有序 越快
    //空间复杂度o(1)
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            for (int j = i-1; j >= 0; j--) {
               if(array[j] > array[j+1]) {
                   array[j+1] = array[j];
               } else {
                   break;
               }
                array[j+1] = tmp;
            }
        }
        return;
    }
}
