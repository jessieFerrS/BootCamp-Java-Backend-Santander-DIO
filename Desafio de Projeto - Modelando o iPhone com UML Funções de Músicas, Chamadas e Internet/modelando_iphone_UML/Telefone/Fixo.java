package modelando_iphone_UML.Telefone;

public class Fixo implements AparelhoTelefonico{
    public void ligar(String numero) {
        System.out.println("LIGANDO TELEFONE FIXO...");
    }


    public void atender() {
        System.out.println("ATENDENDO TELEFONE FIXO...");
    }


    public void CorreioVoz() {
        System.out.println("DEIXANDO RECADO TELEFONE FIXO...");
    }
}
