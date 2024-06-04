package modelando_iphone_UML.Usuario;

import modelando_iphone_UML.Iphone.Iphone;
import modelando_iphone_UML.Navegador.InternetExplorer;
import modelando_iphone_UML.Navegador.NavegadorInternet;
import modelando_iphone_UML.Reprodutor.ReprodutorMusical;
import modelando_iphone_UML.Telefone.AparelhoTelefonico;


public class Usuario{
    public static void main(String[] args) {

        System.out.println("-------------------NAVEGADOR----------------------");
        NavegadorInternet navegadorInternet = new Iphone();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
        navegadorInternet.exibirPagina("www.google.com.br");

        System.out.println("\n------------------REPRODUTOR----------------------");
        ReprodutorMusical reprodutorMusical = new Iphone();
        reprodutorMusical.selecionarMusica("Beyonce - Formation");
        reprodutorMusical.pausar();
        reprodutorMusical.tocar();

        System.out.println("--------------------TELEFONE-----------------------");
        AparelhoTelefonico aparelhoTelefonico = new Iphone();
        aparelhoTelefonico.ligar("98765-4321");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.CorreioVoz();



    }
}
