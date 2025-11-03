package AulaDia23;

import java.util.Scanner;

public class Aula001 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Aviao aviao=new Aviao();
        Passaro passaro=new Passaro();
        System.out.println("Aula sobre interfaces");

        System.out.print("Qual modelo do aviao: ");
        aviao.setModelo(sc.nextLine());
        System.out.print("Qual ano do aviao: ");
        aviao.setAno(sc.nextInt());
        sc.nextLine();

        aviao.voar();
        System.out.println(aviao.toString());
        System.out.println("Qual especie do passaro: ");
        passaro.setEspecie(sc.nextLine());
        passaro.voar();
        System.out.println(passaro.toString());

    }
}
