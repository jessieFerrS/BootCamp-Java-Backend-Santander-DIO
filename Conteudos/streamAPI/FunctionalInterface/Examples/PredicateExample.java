package streamAPI.FunctionalInterface.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T
 * e retorna um valor booleano (verdadeiro ou falso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */

public class PredicateExample {
    public static void main(String[] args) {
        // Criar de uma lista de palavras
        List<String> palavras = Arrays.asList("Java", "Python", "JavaScript", "C", "Go", "Ruby", "Kotlin");

        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        //usar o stream para filtrar as palavras com mais de 5 caracteres e, em seguida
        //imprimir cada palavra que passou no filtro

        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);

        //OUTRA MANEIRA
//       ( palavras.stream()
//            .filter(
//                    new Predicate<String>() {
//
//                        @Override
//                        public boolean test(String p) {
//                            return p.length() > 5;
//                        }
//                    }
//            )
//            .forEachSystem.out::println);


        palavras.stream()
                .filter(p -> p.length() > 5)
                .forEach(System.out::println);
    }
}
