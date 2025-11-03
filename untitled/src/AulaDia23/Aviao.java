package AulaDia23;

public class Aviao implements Voavel{
    private String fabricante;
    private  String modelo;
    private  int ano;

    @Override
    public void voar() {
        System.out.println("Dentro  do aviao");

    }

    @Override
    public String toString() {
        return "Aviao{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
