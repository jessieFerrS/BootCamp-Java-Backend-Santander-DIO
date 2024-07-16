package exemplo.pilaresPoo;

public class Autrodomo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("897654321");
        //jeep.ligar();

        Moto z900 = new Moto();
        z900.setChassi("123456789");
        //z900.ligar();

        //POLIMORFISMO
        Veiculo coringa = z900;
        coringa.ligar();
    }
}
