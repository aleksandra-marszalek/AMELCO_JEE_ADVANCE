package pl.coderslab.day2.s2.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        while (!text.equals("quit")) {
            words.add(text);
            text = scan.nextLine();
        }

        //to samo można zrobić collections
        //Collections.sort(words);
        words.sort((a,b) -> a.compareToIgnoreCase(b));

        //jesli bysmy chcieli odwrotnie:
        //words.sort(a,b) -> b.compareToIgnoreCase(a));

        words.forEach( value -> System.out.println(value));
    }
}
