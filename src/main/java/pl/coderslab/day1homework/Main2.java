package pl.coderslab.day1homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("Anna", "Nowak");
        Person person3 = new Person("Tomasz", "Tomaszewski");
        Person person2 = new Person("Jan", "Kowalski");



        personList.add(person1);
        personList.add(person3);
        personList.add(person2);


        Collections.sort(personList);

        for (Person p: personList) {
            System.out.println(p.toString());
        }
    }

}
