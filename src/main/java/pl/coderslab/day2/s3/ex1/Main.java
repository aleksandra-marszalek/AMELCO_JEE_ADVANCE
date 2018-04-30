package pl.coderslab.day2.s3.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("test");
        words.add("abażur");
        words.add("stół");
        words.add("stodoła");
        words.add("pasibrzuch");
        words.add("kot");
        words.add("kotek");
        words.add("kotek");
        words.add("alibaba");
        words.add("domek");
        words.add("python");


        //p1
        //create stream;

        words.stream()
                .filter( text -> (text.charAt(0) == 'a' || text.charAt(0) == 's') )
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);



        //p2

        List<String> filteredwords = words.stream()
                .distinct()
                .filter( text -> text.length()==5)
                .collect(Collectors.toList());

        filteredwords.forEach(System.out::println);



        //p3
        String newText = words.stream()
                .map( el-> el.substring(0,3))
                .sorted()
                .collect(Collectors.joining(","));

        System.out.println(newText);



    }
}
