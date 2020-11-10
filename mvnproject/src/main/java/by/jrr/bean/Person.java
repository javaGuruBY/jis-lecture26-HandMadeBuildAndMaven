package by.jrr.bean;

import lombok.*;


import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class Person implements Serializable {
    int age;
    int height;
    String name;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }
}
