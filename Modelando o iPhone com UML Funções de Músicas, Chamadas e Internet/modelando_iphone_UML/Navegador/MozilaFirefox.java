package modelando_iphone_UML.Navegador;

public class MozilaFirefox implements NavegadorInternet{
    public void exibirPagina(String url) {
        System.out.printf("EXIBINDO PAGINA NO FIREFOX: %s", url);
    }


    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO ABA NO FIREFOX...");
    }


    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA NO FIREFOX...");
    }
}
