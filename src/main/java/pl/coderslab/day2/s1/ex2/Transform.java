package pl.coderslab.day2.s1.ex2;


    @FunctionalInterface
    public interface Transform<T, S> {

        T change(S s);
    }

