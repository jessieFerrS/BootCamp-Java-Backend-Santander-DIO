package streamAPI.FunctionalInterface.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Representa uma operação que aceita um argumento do tipo T (qualquer tipo) e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream
 * sem modificar ou retornar um valor.
 */


public class ConsumerExample {
    public static void main(String[] args) {
        //criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // usar o consumer com expressao lambda para imprimir numeros pares
//        Consumer<Integer> imprimirNumeroPar = numero -> {
//            if (numero % 2 == 0) {
//                System.out.println(numero);
//            }
//        };
        //numeros.stream().forEach(imprimirNumeroPar);
        //numeros.forEach(imprimirNumeroPar);

        //OUTRA MANEIRA
//        Consumer<Integer> imprimirNumeroPar = numero -> {
//            if (numero % 2 == 0) {
//                System.out.println(numero);
//            }
//        };
//
//        // usar o Consumer para imprimir numeros pares no STREAM
//        numeros.stream().forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer n) {
//                if(n % 2 == 0) {
//                    System.out.println(n);
//                }
//            }
//        });
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        // FAZENDO POR FUNÇÃO LAMBDA
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // usar o Consumer para imprimir numeros pares no STREAM
//        numeros.forEach(n -> {
//            if (n % 2 == 0) {
//                System.out.println(n);
//            }
//        });
    }
}
