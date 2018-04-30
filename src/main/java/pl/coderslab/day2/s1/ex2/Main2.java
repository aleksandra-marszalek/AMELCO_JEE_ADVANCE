package pl.coderslab.day2.s1.ex2;

import coderslab.day2.s1.ex1.Filter;

import java.util.ArrayList;
import java.util.List;

public class Main2 {


    public static void main(String[] args) {


        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(2);
        listNumbers.add(40);
        listNumbers.add(30);
        listNumbers.add(15);


        printList(listNumbers, currentElement -> currentElement>20, currentElement -> currentElement -1);
    }

    static <T, S> void printList(List<S> src, Filter<S> f, Transform<T, S> t) {
        for (S s : src) {
            if (f.check(s)) {
                System.out.println(t.change(s));
            }
        }
    }
}
