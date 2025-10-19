package Pratica10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Filme> listaFilmes = new ArrayList<>();

        boolean resposta = true;
        do {
            Filme cc = new Filme(); // novo filme a cada loop

            System.out.print("Informe o nome do filme: ");
            cc.setNome(sc.nextLine());
            boolean salaValidar;
            do {
                System.out.print("Informe a sala: ");
                salaValidar=cc.setSala(sc.nextInt());
                sc.nextLine();

            }while (!salaValidar);



            System.out.print("Informe o código do filme: ");
            cc.setCodigo(sc.nextInt());
            sc.nextLine();

            listaFilmes.add(cc); // adiciona à lista

            System.out.print("Você deseja continuar cadastrando filmes? (true/false): ");
            resposta = sc.nextBoolean();
            sc.nextLine();
        } while (resposta);

        System.out.println("\nFilmes cadastrados:");
        for (Filme filme : listaFilmes) {
            filme.imprimir();
            System.out.println("----------------------");
        }

        sc.close();
    }
}