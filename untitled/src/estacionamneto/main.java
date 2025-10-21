package estacionamneto;

import java.time.LocalDateTime;
import java.util.Scanner;

public class main {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Moto moto =new Moto();
        System.out.print("Informe  o numero da placar da sua moto: ");
        moto.setPlaca(sc.nextLine());

        System.out.print("Informe o proprietario: ");
        moto.setProprietario(sc.nextLine());

        System.out.print("Data de entrada: ");
        moto.setDataEntrada(sc.nextLine());

        System.out.print("Data de sairda: ");
        moto.setHoraEntrada(sc.nextLine());

        moto.emprimir();
        moto.emprimirPreço();

        Carro carro=new Carro("1222","cris", "11","23",5);
        System.out.println("-----------");
        System.out.print("Informe  o numero da placar da sua moto: ");
        carro.setPlaca(sc.nextLine());

        System.out.print("Informe o proprietario: ");
        carro.setProprietario(sc.nextLine());

        System.out.print("Data de entrada: ");
        carro.setDataEntrada(sc.nextLine());

        System.out.print("Data de sairda: ");
        carro.setHoraEntrada(sc.nextLine());

        System.out.print("Quantos passageiro: ");
        carro.setPassageiro(sc.nextInt());
        sc.nextLine();

        carro.emprimir();
        carro.emprimirPrecoCarro();

        sc.close();
    }
}
