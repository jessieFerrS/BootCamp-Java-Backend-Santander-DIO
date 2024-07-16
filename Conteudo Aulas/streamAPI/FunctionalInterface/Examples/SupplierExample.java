package streamAPI.FunctionalInterface.Examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Represnta uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornercer novos objetos de um determinado tipo.
 */

public class SupplierExample {
    public static void main(String[] args) {
        //usar o Supplier com expressão lambda pra fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        //usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList(); //collect(Collectors.toList());

        // OUTRA MANEIRA:
        //com classes anonimas
//        List<String> listaSaudacoes = Stream.generate(
//                    new Supplier<String>() {
//                        @Override
//                        public String get() {
//                            return "Olá, seja bem-vindo(a)!";
//                        }
//                    }
//                )
//                .limit(3)
//                .toList();

        //com lambda
//        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
//                .limit(6)
//                .toList();

        // imprimir as saudações geradas
        listaSaudacoes.forEach(s -> System.out.println(s)); //(System.out::println); -> reference method
    }
}
