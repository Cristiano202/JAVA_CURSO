package AulaDia05.Dominio;

public class Poupanca implements RenTavel {
    public double taxa=0.05;
    public double saldo;

    public void taxaJuro(double valor){

        double rendaTotal=valor+(valor*taxa);
        System.out.println("Valor total: " +rendaTotal);

    }


    @Override
    public boolean renderJuro() {
        return false;
    }
}
