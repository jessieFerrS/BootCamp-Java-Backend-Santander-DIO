package modelando_iphone_UML.Iphone;

import modelando_iphone_UML.Navegador.NavegadorInternet;
import modelando_iphone_UML.Reprodutor.ReprodutorMusical;
import modelando_iphone_UML.Telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.printf("EXIBINDO PAGINA NO IPHONE: %s", url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO ABA NO IPHONE...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA NO IPHONE...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.printf("SELECIONANDO MUSICA NO IPHONE: %s\n", musica);
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA NO IPHONE...");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MUSICA NO IPHONE...");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO DO IPHONE...");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO DO IPHONE...");
    }

    @Override
    public void CorreioVoz() {
        System.out.println("DEIXANDO RECADO DO IPHONE...");
    }
}
