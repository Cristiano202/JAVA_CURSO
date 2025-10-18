package Pratica10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<CadrastroCinema> listaFilmes = new ArrayList<>();

        boolean resposta = true;
        do {
            CadrastroCinema cc = new CadrastroCinema(); // novo filme a cada loop

            System.out.print("Informe o nome do filme: ");
            cc.setNome(sc.nextLine());

            System.out.print("Informe a sala: ");
            cc.setSala(sc.nextInt());
            sc.nextLine();

            System.out.print("Informe o código do filme: ");
            cc.setCodigo(sc.nextInt());
            sc.nextLine();

            listaFilmes.add(cc); // adiciona à lista

            System.out.print("Você deseja continuar cadastrando filmes? (true/false): ");
            resposta = sc.nextBoolean();
            sc.nextLine();
        } while (resposta);

        System.out.println("\nFilmes cadastrados:");
        for (CadrastroCinema filme : listaFilmes) {
            filme.imprimir();
            System.out.println("----------------------");
        }

        sc.close();
    }
}