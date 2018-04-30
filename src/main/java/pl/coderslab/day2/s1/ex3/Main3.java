package pl.coderslab.day2.s1.ex3;

import coderslab.day2.s1.ex1.Filter;
import coderslab.day2.s1.ex2.Transform;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(2);
        listNumbers.add(40);
        listNumbers.add(30);
        listNumbers.add(15);

        List<Integer> newList = create(listNumbers, currentElement -> currentElement>20, currentElement -> currentElement -1);
        for (Integer s:newList
             ) {
            System.out.println(s);
        }

    }

    static <T, S> List<T> create(List<S> src, Filter<S> f, Transform<T, S> t) {
        List<S> newList = new ArrayList<>();
        for (S s : src) {
            if (f.check(s)) {
                s =(S) t.change(s);
                newList.add(s);
            }
        }
        return (List<T>) newList;

    }
}
