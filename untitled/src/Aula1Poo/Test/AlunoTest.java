package Aula1Poo.Test;

import Aula1Poo.Aluno.Aluno;

import java.time.LocalDate;
import java.util.Scanner;

public class AlunoTest {
    static void main(String[] args) {
        Aluno aluno=new Aluno(100000,"cris", LocalDate.of(2005,11,14),"turmaB",'m');
        aluno.imprime();

    }
}
