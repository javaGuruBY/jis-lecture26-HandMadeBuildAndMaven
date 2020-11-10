package by.jrr.service;

import by.jrr.bean.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonProvider {

    public static List<Person> getPersonsFromArray(String[] arg) {
        List<Person> personList = new ArrayList<>();
        if (arg != null) {
            if (arg.length % 2 == 0) {
                for (int i = 0; i < arg.length; i = i + 2) {
                    int k = i + 1;
                    int age = 0;
                    try {
                        age = Integer.valueOf(arg[k]);
                    } catch (Exception ex) {
                        System.out.println("illegal parameter for age: need int, got" + arg[k] + " age set to 0");
                    }
                    Person person = new Person(arg[i], age);
                    personList.add(person);
                }
            } else {
                throw new IllegalArgumentException("Wrong number of parameters, should be even, got " + arg.length);
            }
        } else {
            throw new IllegalArgumentException("Wrong number of parameters, should be even, got null");
        }
        return personList;
    }
}
