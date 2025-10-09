package Aula2Poo.Main;

import Aula2Poo.Aluno.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        Aluno[] alunos = new Aluno[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nAluno " + (i + 1));

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Nota: ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); // limpar buffer

            alunos[i] = new Aluno(nome, idade, nota);
        }

        System.out.println("\n Dados dos Alunos:");
        for (Aluno aluno : alunos) {
            aluno.exibirDados();
            System.out.println();
        }

        scanner.close();
    }
}