package Aula2JavaBasico;

import java.util.Scanner;

public class Ex03 {
    public static boolean ehperfeito(int num){

        int soma=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                soma+=i;
            }
        }
        return soma==num;
    }
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int num=scanner.nextInt();
        if(ehperfeito(num)){
            System.out.println("É um numero perfeito");
        }
        else {
            System.out.println("Não é um numero perfeito");
        }

    scanner.close();
    }


}
