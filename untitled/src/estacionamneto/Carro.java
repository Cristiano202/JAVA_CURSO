package estacionamneto;

public class Carro extends Veiculo{
    private int passageiro;

    public int getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(int passageiro) {
        this.passageiro = passageiro;
    }

    public Carro(String placa, String proprietario, String dataEntrada, String horaEntrada, int passageiro) {

        super(placa, proprietario, dataEntrada, horaEntrada);
        this.passageiro = passageiro;
    }


    @Override
    public float precoEstacionamento() {
        if(passageiro<=5)return 20;
        if (passageiro>5)return 30;
        return 0;
    }
}
