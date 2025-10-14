package PraticandoPoo.Test;

import PraticandoPoo.Dominio.Jogador;

import java.util.Scanner;

public class Pratica01 {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Jogador jogador1=new Jogador();
        System.out.print("Informe seu nome : ");
        jogador1.setNome(sc.nextLine());

        System.out.print("Informe sua idade: ");
        jogador1.setIdade(sc.nextInt());
        sc.nextLine();

        System.out.print("Informe seu time: ");
        jogador1.setTime(sc.nextLine());

        System.out.print("Informe seu sexo: ");
        jogador1.setSexo(sc.nextLine());

        System.out.print("Informe seu salario: ");
        jogador1.setSalario(sc.nextFloat());

        sc.nextLine();
        sc.close();
        jogador1.imprimi();

    }
}
