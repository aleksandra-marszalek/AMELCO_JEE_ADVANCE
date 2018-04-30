package pl.coderslab.day2homework;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main3 {

    public static void main(String[] args) {

        Function sampleText = T -> {

            return (T.toString().substring(2, T.toString().length() - 2)).toLowerCase();
        };

        String sample = "CODERSLAB";
        System.out.println(sampleText.apply(sample));

        // zakomentowana druga opcja

//        System.out.println(sampleTextCut("CODERSLAB", T -> T));

    }

//
//    static String sampleTextCut(String s, Function t) {
//        String newText = "";
//        newText = s.toLowerCase().substring(2, s.length() - 2);
//        return newText;
//    }


}