package Pratica10;

import java.util.Scanner;

public class TestCinema {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CadrastroCinema cc=new CadrastroCinema();
        boolean resposta=true;
        do {
            System.out.print("Informe o nome do filme: ");
            cc.setNome(sc.nextLine());

            System.out.print("Informe a sala: ");
            cc.setSala(sc.nextInt());
            sc.nextLine();

            System.out.print("Informe o codigo do filme: ");
            cc.setCodigo(sc.nextInt());
            sc.nextLine();

            System.out.print("Voce deseja continuar cadastrando filme: ");
            resposta=sc.nextBoolean();
            sc.nextLine();
        }while (resposta==true);

        cc.imprimir();
    }
}
