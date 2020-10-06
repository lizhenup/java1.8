import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ：lizhen
 * @date ：Created in 2020/7/19 23:48
 * @description：
 * @modified By：
 * @version: $
 */
public class Main implements Serializable {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IOException {
        //1.通过new 创建
        ArrayList<Integer> list1 = new ArrayList<>();
        //2.使用Class类的newInstance方法
        ArrayList<Integer> list2 = (ArrayList<Integer>) Class.forName("java.util.ArrayList").newInstance();
        //或者
        ArrayList<Integer> list3 = ArrayList.class.newInstance();
        //使用Constructor类的newInstance方法
        Constructor<ArrayList> constructor = ArrayList.class.getConstructor();

        ArrayList<Integer> list4 = constructor.newInstance();

        /**
         * create by: lizhen
         * description:这两种newInstance方法就是大家所说的反射。
         * 事实上Class的newInstance方法内部调用Constructor的newInstance方法。
         * 这也是众多框架，如Spring、hibernate、Struts等使用后者的原因。
         * create time:
         *
         * @Param: args
         * @return
         */

        //4.使用clone方法
        //用clone方法创建对象并不会调用任何构造函数。
        ArrayList<Integer> list5 = (ArrayList<Integer>) list1.clone();

        //5.使用反序列化
        //为了反序列化一个对象，我们需要让我们的类实现Serializable接口
        //不会调用任何构造参数

        //ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));

        //ArrayList<Integer> list6 = (ArrayList<Integer>) in.readObject();
        int[] arr = {1,2,3,4,5,6};
        reOrderArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reOrderArray(int [] array) {
        int k = 0;
        for(int i = 0; i < array.length; i++){
            if((array[i] & 1) == 1){
                int temp = array[i];
                int j = i;
                while(j > k){
                    array[j] = array[j-1];
                    j--;
                }
                array[k++] = temp;
            }
        }
    }
}
