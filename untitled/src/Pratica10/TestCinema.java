package Pratica10;

import java.util.Scanner;

public class TestCinema {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CadrastroCinema cc=new CadrastroCinema();
        System.out.print("Informe o nome do filme: ");
        cc.setNome(sc.nextLine());
        cc.imprimir();
    }
}
