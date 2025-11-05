package AulaDia05.Dominio;

public class Poupanca extends Conta implements RenTavel {


    public Poupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    public Boolean setTaxaJuro(double taxaJuro){
        setSaldo(getSaldo()+(getSaldo()*taxaJuro)/100);
        return true;

    }


    @Override
    public boolean renderJuro() {
        return false;
    }
}
