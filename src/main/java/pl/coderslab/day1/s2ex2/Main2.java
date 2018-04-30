package pl.coderslab.day1.s2ex2;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<Moveable> moveableList = new ArrayList<>();

        Cat cat = new Cat();
        Car car = new Car();
        Person person = new Person();
        moveableList.add(cat);
        moveableList.add(car);
        moveableList.add(person);

        for (int i=0; i<moveableList.size(); i++) {
            moveableList.get(i).start();
        }
    }
}
