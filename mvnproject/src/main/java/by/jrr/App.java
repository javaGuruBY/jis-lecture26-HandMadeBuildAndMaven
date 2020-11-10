package by.jrr;

import by.jrr.bean.Person;
import by.jrr.service.PersonProvider;

import java.util.List;

public class App {
    public static void main(String... arg) {
        System.out.println("JavaGuru");
        List<Person> personList = PersonProvider.getPersonsFromArray(arg);
        System.out.println(personList);
    }
}
