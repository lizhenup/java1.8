package frank.model;

import lombok.Data;

@Data
public class Duck {
    private String name;
    private Integer age;

    public Duck() {

    }

    public Duck(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}
