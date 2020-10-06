import java.sql.SQLOutput;
import java.util.*;

class Student {
    public String name;
    public String idClass;
    public double score;

    public Student(String name, String idClass, double score) {
        this.name = name;
        this.idClass = idClass;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", idClass='" + idClass + '\'' +
                ", score=" + score +
                '}';
    }
}
class Str {
    public String str1;
    public String str2;

    @Override
    public String toString() {
        return "Str{" +
                "str1='" + str1 + '\'' +
                ", str2='" + str2 + '\'' +
                '}';
    }

    public Str(String str) {
        this.str1 = str1;

    }
}
public class Go {
    public static List<Character> func(String str1,String str2) {
        List<Character> ret = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {

        }
        return ret;
    }
    public static void main(String[] args) {
//        List<Str> list = new ArrayList<>();
        Str str1 = new Str("welcome to bit");
        Str str2 = new Str("come");
//        list.add(str1);
//        list.add(str2);
        //func(str1,str2);
    }
    public static void main3(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student("张策","java 20",75.65);
        Student student2 = new Student("张小策","java 20",65.65);
        Student student3 = new Student("张大策","java 20",55.65);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        System.out.println(list);
        //list.sort();
    }
    public static void main2(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("及时雨","宋江");
        map.put("浪里白条","张顺");
        map.put("矮脚虎","王英");
        map.put("黑旋风","李逵");
        map.put("行者","武松");
        System.out.println(map);
        String str = map.getOrDefault("及时雨2","阿飞");
        System.out.println(str);
        System.out.println("==============");
        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
    }
    public static void main1(String[] args) {
        Collection<String> collection = new ArrayList<>();
    }
}
