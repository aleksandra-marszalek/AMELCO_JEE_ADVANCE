package pl.coderslab.day1.s2ex2;

public class Main1 {

    public static void main(String[] args) {

        Moveable[] moveableTab = new Moveable[3];

        Cat cat = new Cat();
        Car car = new Car();
        Person person = new Person();
        moveableTab[0] = cat;
        moveableTab[1] = car;
        moveableTab[2] = person;

        for (int i =0; i<moveableTab.length; i++) {
            moveableTab[i].start();
        }


    }
}
