import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.printf("\nSaldo atual: %.1f", saldo);
                    break;
                case 2:
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque > saldo){
                        System.out.println("\nSaldo insuficiente.");
                    } else {
                        saldo -= valorSaque;
                        System.out.printf("\nSaldo atual: %.1f", saldo);
                    }
                    break;
                case 3:
                    System.out.printf("\nSaldo atual: %.1f", saldo);
                    break;
                case 0:
                    System.out.println("\nPrograma encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
