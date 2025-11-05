package AulaDia05.Dominio;

public class Poupanca extends Conta implements RenTavel {


    public Poupanca(String titular, double saldo) {
        super(titular, saldo);
    }



    @Override
    public boolean renderJuro() {
        return false;
    }
}
