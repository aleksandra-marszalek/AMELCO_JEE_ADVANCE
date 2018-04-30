package pl.coderslab.day2.s1.ex1;

@FunctionalInterface
public interface Filter<V> {
    boolean check(V v);
}
