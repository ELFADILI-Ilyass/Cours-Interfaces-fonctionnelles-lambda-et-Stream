package Ex2;

import java.util.*;
import java.util.function.Function;

public class TestFunction {

    public static void main(String[] args) {

        List<String> mots = Arrays.asList("java", "jee", "spring");

        Function<String, String> maj = String::toUpperCase;
        Function<String, Integer> longueur = String::length;

        mots.stream().map(maj).forEach(System.out::println);
        mots.stream().map(longueur).forEach(System.out::println);
    }
}

