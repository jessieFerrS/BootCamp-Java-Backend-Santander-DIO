import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();

        // CLIENTES
        Cliente ana = new Cliente();
        ana.setNome("Ana Bueno");
        Cliente bia = new Cliente();
        bia.setNome("Bia Alcântara");

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(ana);
        clientes.add(bia);

        // CONTAS
        ContaCorrente contaCorrente1 = new ContaCorrente(ana);
        contaCorrente1.depositar(1000);
        ContaCorrente contaCorrente2 = new ContaCorrente(bia);
        contaCorrente2.depositar(500);

        ContaPoupanca contaPoupanca = new ContaPoupanca(ana);
        contaPoupanca.depositar(600);

        List<Conta> contas = new ArrayList<>();
        contas.add(contaCorrente1);
        contas.add(contaCorrente2);
        contas.add(contaPoupanca);

        // só pode ser chamado após a criação da conta poupanca
        contaCorrente1.transferir(250, contaPoupanca);

        // IMPRESSAO DE EXTRATOS
        System.out.println("*************************************");
        contaCorrente1.imprimirExtrato();
        contaCorrente2.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
        System.out.println();

        System.out.println("*************************************");
        // EXIBE A LISTA DE CLIENTES DO BANCO
        banco.setClientes(clientes);
        System.out.println("*** Lista de Clientes " + banco.getNome() + " ***");
        System.out.println("*************************************");
        for (Cliente cliente : banco.getClientes()) {
            System.out.println("- " + cliente.getNome());
        }
        System.out.println("*************************************");
        System.out.println();
        System.out.println("*************************************");

        // EXIBE A LISTA DE CONTAS DO BANCO
        banco.setContas(contas);
        System.out.println("*** Lista de Contas " + banco.getNome() + " ***");
        System.out.println("*************************************");
        for (Conta conta : banco.getContas()) {
            System.out.println("- " + conta.getClass().getName() + " - " + conta.getCliente().getNome());
        }
        System.out.println("*************************************");

    }
}