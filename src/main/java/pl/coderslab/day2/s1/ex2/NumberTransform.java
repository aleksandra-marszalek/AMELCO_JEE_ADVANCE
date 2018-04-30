package pl.coderslab.day2.s1.ex2;


public class NumberTransform implements Transform {
    @Override
    public Object change(Object o) {
        return (double) o + 1;
    }
}