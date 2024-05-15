import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Objeto da classe scanner
        Scanner sc = new Scanner(System.in);

        // Entradas do usuário
        System.out.print("Digite o Nome do Cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Digite o número da Agência: ");
        String agencia = sc.nextLine();
        System.out.print("Digite o Número da Conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Digite o Saldo inicial da Conta R$: ");
        double saldo = sc.nextDouble();

        // Exibe os dados
        String mensagem = String.format("Olá, %s, obrigado por criar uma conta em nosso banco!\nSua agência é %s, conta %d e seu saldo de R$%.2f já está disponível para saque!!",
                nomeCliente, agencia, numeroConta, saldo);
        System.out.println(mensagem);

    }
}