package modelando_iphone_UML.Navegador;

public class InternetExplorer implements NavegadorInternet{
    public void exibirPagina(String url) {
        System.out.printf("EXIBINDO PAGINA NO INTERNET EXPLORER: %s", url);
    }


    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO ABA NO INTERNET EXPLORER...");
    }


    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA NO INTERNET EXPLORER...");
    }
}
