package Aula3JavaBasico;

import java.util.Scanner;



public class TestLogico {
    public static boolean Elogico(int num){
        int soma=0;
        while(num>0){
            soma+=num%10;
            num/=10;
        }
        return soma==10;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Digite um numero inteiro positivo : ");
        int numero= sc.nextInt();
        sc.nextLine();
        if(Elogico(numero)){
            System.out.println("Esse numero  é magico");
        }
        else {
            System.out.println("Esse numero não é magico");
        }
        sc.close();

    }

}
