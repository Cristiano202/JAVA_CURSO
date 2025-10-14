package PraticandoPoo.Test;

import PraticandoPoo.Dominio.Jogador;

import java.util.Scanner;

public class Pratica01 {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Jogador jogador1=new Jogador();
        System.out.print("Informe seu nome : ");
        jogador1.setNome(sc.nextLine());
        System.out.print("Informe sua idade ");
        jogador1.setIdade(sc.nextInt());
        jogador1.imprimi();

    }
}
