package Ex5;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class TestFichier {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("test.txt");

        List<String> mots =
                Files.lines(path)
                     .flatMap(line -> Arrays.stream(line.split("\\s+")))
                     .toList();

        System.out.println("Nombre de mots : " + mots.size());

        String plusLong =
                mots.stream()
                    .max(Comparator.comparingInt(String::length))
                    .orElse("");

        System.out.println("Mot le plus long : " + plusLong);

        mots.stream()
            .filter(m -> m.matches("(?i)^[aeiou].*"))
            .forEach(System.out::println);
    }
}

