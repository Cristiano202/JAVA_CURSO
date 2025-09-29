import java.util.Scanner;
public class Ex02 {

    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite valor de a ");
        double valorA= scanner.nextDouble();
        System.out.println("Digite valor de b ");
        double valorB= scanner.nextDouble();
        System.out.println("Digite o valor de c ");
        double valorC= scanner.nextDouble();
        double delta= valorB*valorA-4*valorA*valorC;
        if(delta<0){
            System.out.println("Não exite raiz reias");
        }
        if (delta ==0){
            System.out.println("Não possui raiz reias "+(-valorB/(2*valorA)));
        }
        else if(delta>0){
            System.out.println("X1: "+(-valorA+Math.sqrt(delta))/(2*valorA));
            System.out.println("X2: "+(-valorB+Math.sqrt(delta))/(2*valorB));

        }

    }
}
