package pl.coderslab.day2.s3.ex4;

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

        System.out.println("============1===========");

        words.stream()
                .forEach(word -> System.out.println(word.length()));

        System.out.println("============2===========");
        List<String> sortedWords = words.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedWords.toString());

        System.out.println("============3===========");

        words.stream()
                .filter(word -> word.contains("c"))
                .forEach(System.out::println);

        System.out.println("============4===========");

        int wordLength = words.stream().mapToInt(String::length).sum();
        System.out.println("wersja 1: "+wordLength);


        int res = words.stream()
                .map( el -> el.length() )
                .reduce( (p, c) -> p + c )
                .get();


        System.out.println("wersja 2: "+res);

        System.out.println("============5===========");
        words.stream()
                .limit(3)
                .sorted()
                .forEach(System.out::println);


    }
}
