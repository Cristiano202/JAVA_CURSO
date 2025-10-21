package estacionamneto;

public class Moto extends Veiculo {

    public Moto() {


    }
    public void emprimirPreço(){
        System.out.println("Preço: "+ precoEstacionamento());

    }
    @Override
    public float precoEstacionamento(){
        return 10;
    }
}
