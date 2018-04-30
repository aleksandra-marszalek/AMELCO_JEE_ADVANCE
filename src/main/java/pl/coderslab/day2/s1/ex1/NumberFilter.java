package pl.coderslab.day2.s1.ex1;

public class NumberFilter implements Filter {

    @Override
    public boolean check (Object v) {
        return (int) v < 20;
    }
}
