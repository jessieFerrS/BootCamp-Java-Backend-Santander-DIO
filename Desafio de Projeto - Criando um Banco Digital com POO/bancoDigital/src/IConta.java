public interface IConta {

    // todos os metodos em uma interface são públicos
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, IConta contaDestino);
    void imprimirExtrato();
}
