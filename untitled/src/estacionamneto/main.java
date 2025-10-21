package estacionamneto;

import java.time.LocalDateTime;

public class main {
    static void main(String[] args) {
        Moto moto =new Moto("1222","cris", "11","23");
        moto.emprimir();
        Carro carro=new Carro("1222","cris", "11","23",7);
        System.out.println("-----------");
        carro.emprimir();
    }
}
