class Person {
    String name = "No name";
    public Person(String nm) {
        name = nm;
    }
}
class Employee extends Person {
    String empID = "0000";
    public Employee(String id) {
        super("nm");
        empID = id;
    }
}
public class Test {
    private static void testMethod() {
        System.out.println("testMethod");
    }
    public static void main(String[] args) {
        ((Test)null).testMethod();
    }
}
