package frank;

import frank.model.Duck;

import frank.model.DuckShop;
import frank.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applications.xml");
        /*Duck duck1 = (Duck) context.getBean("duck1");
        System.out.println(duck1);
        Duck duck2 = (Duck) context.getBean("duck2");
        System.out.println(duck2);
        DuckShop shop = (DuckShop) context.getBean("duckShop");
        System.out.println(shop);
        Person person = context.getBean(Person.class);
        System.out.println(person);
        Duck duck3 = (Duck) context.getBean("duck3");
        System.out.println(duck3);
        Duck duck4 = (Duck) context.getBean("duck4");
        System.out.println(duck4);*/

    }
}
