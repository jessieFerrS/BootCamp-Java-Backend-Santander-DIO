package streamAPI.FunctionalInterface.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Represnta uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.
 */

public class FunctionExample {
    public static void main(String[] args) {
        // criar uma lista de numeros interiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // usar a function com expressao lambda para dobrar todos os numeros
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // usar a função para dobrar todos os numeros no Stream e armazena-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .toList();

        //OUTRA MANEIRA
//        List<Integer> numerosDobrados = numeros.stream()
//                .map(
//                    new Function<Integer, Integer>() {
//                        @Override
//                        public Integer apply(Integer n) {
//                            return n * 2;
//                        }
//                    }
//                )
//                .toList();

        // imprimir a lista de numeros dobrados
        numerosDobrados.forEach(n -> System.out.println(n));
    }
}
