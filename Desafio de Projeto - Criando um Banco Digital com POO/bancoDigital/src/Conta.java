import lombok.Getter;

@Getter
public abstract class Conta implements IConta{
    // ATRIBUTOS
    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;
    protected Banco banco;


    // CONSTRUTOR
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++; //Incrementa o numero da conta
        this.cliente = cliente;
        this.banco = new Banco();
    }

    // METODOS
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInformacoesComuns() {
        System.out.println("*************************************");
        System.out.println(String.format("Banco: %s", this.banco.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Titular da Conta: %s", this.cliente.getNome()));
        System.out.println(String.format("Numero da Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo Atual: %.2f", this.saldo));
        System.out.println("*************************************");
    }
}
