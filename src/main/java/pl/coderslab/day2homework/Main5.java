package pl.coderslab.day2homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main5 {

    public static void main(String[] args) {


        List<String> list = Arrays.asList("tree", "bird", "park", "snow", "computer", "i jeszcze jakiś inny napis, który na końcu ma a");

        List<String> newList = search(list, l -> l.length()==4 );
        System.out.println(newList.toString());




    }

    static <T> List<T> search(Collection<T> collection, Predicate<T> predicate) {

        List<T> newList = new ArrayList<>();
        for (T c: collection) {
            if (predicate.test(c)) {
                newList.add(c);
            }
        }
        return newList;
    }

    static <S, T> List<T> changeCollection(Collection<T> collection, Function<S, T> function) {

        List<T> newList = new ArrayList<>();
        for (T c: collection) {
            function.apply((S) c);
            newList.add(c);

        }
        return newList;
    }

    static <T> void consumeCollection(Collection<T> collection, Consumer<T> consumer) {
        for (T c: collection) {
            consumer.accept(c);
        }
    }
}
