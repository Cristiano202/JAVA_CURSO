package Pratica10;

public class CadrastroCinema {
    private String nome;
    private int sala;
    private int codigo;

    public void imprimir(){
        System.out.println("Nome: "+getNome());
        System.out.println("Sala: "+getSala());
        System.out.println("Codigo: "+getCodigo());
    }

    public CadrastroCinema() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
