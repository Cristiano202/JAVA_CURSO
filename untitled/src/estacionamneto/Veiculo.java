package estacionamneto;

public abstract class Veiculo {

    private String placa;
    private String proprietario;
    private String dataEntrada;
    private String horaEntrada;


    public Veiculo() {

    }
    public  void emprimir(){
        System.out.println("Placa: "+getPlaca());
        System.out.println("Proprietario: "+getProprietario());
        System.out.println("data entrada: "+getDataEntrada());
        System.out.println(" sairda hora: "+getHoraEntrada());
    }
    public abstract float precoEstacionamento();


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }


}