package pl.coderslab.day2.s1.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {

        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(2);
        listNumbers.add(40);
        listNumbers.add(30);
        listNumbers.add(15);


// easier not to use numberFilter - only lambda expression
        printList(listNumbers, currentElement -> currentElement>20);

    }

    // use filter to check if the element is greater than 20 - if so, prints it
    static <T> void printList (List<T> src, Filter<T> f) {
        for (T s : src) {
            if (f.check(s)) {
                System.out.println(s);
            }
        }
    }

}
