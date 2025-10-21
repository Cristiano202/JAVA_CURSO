package estacionamneto;

public class Moto extends Veiculo {

    public Moto(String placa, String proprietario, String dataEntrada, String horaEntrada) {

        super(placa, proprietario, dataEntrada, horaEntrada);




    }
    public void emprimirPreço(){
        System.out.println("Preço: "+ precoEstacionamento());

    }
    @Override
    public float precoEstacionamento(){
        return 10;
    }
}
