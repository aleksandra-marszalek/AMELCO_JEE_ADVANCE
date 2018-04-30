package pl.coderslab.day2.s2.ex4;

import java.util.function.Predicate;

public class Main4 {

    public static void main(String[] args) {



        calculateData("4", value -> {

            double val = Double.valueOf( value.toString() );

            double powResult = val * val;
            double sqrtResult = Math.sqrt(val);
            double factorialResult = factorial(val);

            System.out.println("Result for "+ val);
            System.out.println("power: " + powResult);
            System.out.println("sqrt: " + sqrtResult);
            System.out.println("factorial: " + factorialResult);
        }
        );
        }

        static void calculateData (Object value, MathInterface<Object> f) {
            f.operate(value);

    }

    static int factorial(double n){
        if (n == 0)
            return 1;
        else
            return (((int) n) * factorial((int) n-1));
    }

}
