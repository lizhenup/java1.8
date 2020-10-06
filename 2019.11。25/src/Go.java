import java.util.Arrays;

public class Go {
 /*
 * 如果排序自定义类型数组
 * 需要自己手动实现Comparable接口
 * T：泛型
 * */
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("afei",16,88.1);
        students[1] = new Student("alen",16,78.3);
        students[2] = new Student("are",16,92.8);
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
class Student implements Comparable<Student>{

    public String name;
    public int age;
    public double score;
    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
        //return this.name.compareTo(o.name);
    }
}
