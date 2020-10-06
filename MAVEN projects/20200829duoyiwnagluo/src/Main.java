/**
 * @author ：lizhen
 * @date ：Created in 2020/8/29 14:13
 * @description：
 * @modified By：
 * @version: $
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        People people = new People(10);
        System.out.println(people.age);
        People people1 = new People(10,"ss");
        System.out.println(people1.age);
    }

}
class People {
    int age;
    String name;

    public People(int age) {
        age = age;
    }

    public People(int age, String name) {

        this.age = age;
        this.name = name;
    }
}
