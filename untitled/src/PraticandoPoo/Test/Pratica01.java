package PraticandoPoo.Test;

import PraticandoPoo.Dominio.Jogador;

import java.util.Scanner;

public class Pratica01 {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Jogador[] jogadores=new Jogador[2];
        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i] = new Jogador();

            System.out.print("Informe seu nome: ");
            jogadores[i].setNome(sc.nextLine());

            System.out.print("Informe sua idade: ");
            jogadores[i].setIdade(sc.nextInt());
            sc.nextLine();

            System.out.print("Informe seu time: ");
            jogadores[i].setTime(sc.nextLine());

            System.out.print("Informe seu sexo: ");
            jogadores[i].setSexo(sc.nextLine());

            System.out.print("Informe seu salario: ");
            jogadores[i].setSalario(sc.nextFloat());
            sc.nextLine();
        }


        sc.close();
        for (Jogador j : jogadores) {
            j.imprimi();
        }


    }
}
