package AulaDia05.Dominio;

public class ContaCorrente extends Conta implements Tributavel{
    private double taxaManutencao;

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    public void taxaManutencao(double taxa){

    }

    public ContaCorrente(String titular, double saldo, double taxaManutencao) {
        super(titular, saldo);
        this.taxaManutencao = taxaManutencao;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public Boolean descontarTaxa() {
        return null;
    }
}
