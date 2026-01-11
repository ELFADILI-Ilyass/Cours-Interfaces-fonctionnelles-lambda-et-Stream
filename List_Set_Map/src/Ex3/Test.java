package Ex3;

import java.util.*;
import java.util.stream.*;

public class Test {

    public static void main(String[] args) {

        List<Etudiant> etudiants = Arrays.asList(
            new Etudiant("Ali", 12),
            new Etudiant("Sara", 9),
            new Etudiant("Nora", 15)
        );

        etudiants.stream()
                 .filter(e -> e.getMoyenne() > 10)
                 .sorted(Comparator.comparing(Etudiant::getMoyenne).reversed())
                 .map(e -> e.getNom().toUpperCase())
                 .forEach(System.out::println);

        double moyenneGen =
                etudiants.stream()
                         .mapToDouble(Etudiant::getMoyenne)
                         .average()
                         .orElse(0);

        System.out.println("Moyenne générale : " + moyenneGen);
    }
}

