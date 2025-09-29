import java.util.Scanner;

public class Ex04 {
    static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Informe uma senha ");
        String senhaCorreta=scanner.nextLine();
        String senha=null;
        for(int i=3;i>=1 ;i--){
            System.out.println("Digite sua senha : ");
            senha=scanner.nextLine();

            if(senhaCorreta.equals(senha)){
                System.out.println("Senha correta ");
                break;
            }
            else {
                System.out.println("tente novamente, voce tem " +(i-1) + " chances");
            }

        }
    }
}
