package pl.coderslab.day2homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main2 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("tree", "bird", "park", "snow", "computer", "i jeszcze jakiś inny napis, który na końcu ma a");

        List<String> filtered = filterList(list, object -> (object.toString().length() > 4));
        List<String> filtered2 = filterList(list, object -> object.toString().contains("b"));
        List<String> filtered3 = filterList(list, object -> object.toString().endsWith("a"));


        System.out.println(filtered.toString());
        System.out.println(filtered2.toString());
        System.out.println(filtered3.toString());
    }

    static List<String> filterList(List<String> stringList, Predicate<Object> f) {
        List<String> filteredList = new ArrayList<>();
        for (String s : stringList) {
            if (f.test(s)) {
                filteredList.add(s);
            }
        }
        return filteredList;

    }
}
