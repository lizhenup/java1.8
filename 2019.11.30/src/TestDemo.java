public class TestDemo {
    public  static  String reverse(String str) {
       char[] array =  str.toCharArray();
       int left = 0;
       int right = array.length-1;
       while (left < right) {
           char tmp = array[left];
           array[left] = array[right];
           array[right] = tmp;
           left++;
           right--;
       }
       return String .copyValueOf(array);
    }
    public static void main(String[] args) {
        String str = "abcdef";
        String ret = reverse(str);
        System.out.println(ret);
    }
}
