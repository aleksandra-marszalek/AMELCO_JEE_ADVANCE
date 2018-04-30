package pl.coderslab.day2.s2.ex2;

import java.util.function.Predicate;

public class Main1 {

    public static void main(String[] args) {


        printValue("hello", val-> (val instanceof String) == true);
        printValue(123, val-> (val instanceof String) == true);
    }

    static void printValue(Object value, Predicate<Object> f) {
        if (f.test(value)) {
            System.out.println(value);
        }
    }
}
