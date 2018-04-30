package pl.coderslab.day2homework;

import coderslab.day2.s1.ex1.Filter;

import java.util.List;
import java.util.function.Predicate;

public class Main1 {

    public static void main(String[] args) {

        checkNumber ifLessThan100 = (n) -> {
            if (((int) n>0) && ((int) n<100)) {
                return true;
            } else {
                return false;
            }
        };

        int n = 1000;
        int n2 = 10;

        System.out.println("Liczba "+ n + " mieści się w przedziale 0-100: " + ifLessThan100.check(n));
        System.out.println("Liczba " + n2 + " mieści się w przedziale 0-100: " + ifLessThan100.check(n2));



    }

}
