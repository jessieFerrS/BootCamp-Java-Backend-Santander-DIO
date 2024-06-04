package modelando_iphone_UML.Telefone;

public class Movel implements AparelhoTelefonico{
    public void ligar(String numero) {
        System.out.println("LIGANDO TELEFONE MOVEL...");
    }


    public void atender() {
        System.out.println("ATENDENDO TELEFONE MOVEL...");
    }


    public void CorreioVoz() {
        System.out.println("DEIXANDO RECADO TELEFONE MOVEL...");
    }
}
