import java.util.Arrays;
public class TestDemo3 {
    //合并俩个有序数组
   public static int[] mergeArray(int[] array1,int[] array2) {
        int[] tmp = new int[array1.length+array2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < array1.length && j < array2.length) {
            if(array1[i] <= array2[j]) {
                tmp [k++] = array1[i++];
            }else {
                tmp [k++] = array2[j++];
            }
        }
            while (j < array2.length) {
                tmp [k++] = array2[j++];
            }
            while (i < array1.length) {
                tmp [k++] = array1[i++];
            }
       return tmp;
    }
    //aaaaabbbbbccccdddd 拼接成5a5b4c4d
    public static String func (String str) {
        char ch = str.charAt(0);
        int repCount = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                repCount++;
            }else {
                stringBuilder.append(repCount).append(ch);
                ch = str.charAt(i);
                repCount = 1;
            }
        }
        return stringBuilder.append(repCount).append(ch).toString();
    }

    public static void main(String[] args) {
        String str = "aaabbbbddddfff";
        String ret = func(str);
        System.out.println(ret);
    }
    public static void main1(String[] args) {
        int[] array1 = {1,3,6,9,25,37};
        int[] array2 = {2,4,6,8,96,118,788};
        int[] arr = mergeArray(array1,array2);
        System.out.println(Arrays.toString(arr));
    }
}
