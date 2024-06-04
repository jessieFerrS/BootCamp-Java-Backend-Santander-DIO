package modelando_iphone_UML.Reprodutor;

public class MP3Player implements ReprodutorMusical{
    public void selecionarMusica(String musica) {
        System.out.printf("SELECIONANDO MUSICA MP3: %s", musica);
    }


    public void tocar() {
        System.out.println("TOCANDO MUSICA...");
    }


    public void pausar() {
        System.out.println("PAUSANDO MUSICA...");
    }
}
