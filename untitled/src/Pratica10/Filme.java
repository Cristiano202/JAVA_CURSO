package Pratica10;

public class Filme {
    private String nome;
    private int sala;
    private int codigo;

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Sala: " + sala);
        System.out.println("Código: " + codigo);
        System.out.println("----------------------");
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

    public boolean setSala(int sala) {
        if(sala<1 || sala >10){
            System.out.println("Codigo invalido!! ");
            System.out.println("Só temnos salas de 1 a 10 !");
            return false;
        }
        else {
            this.sala=sala;
            System.out.println("Filme adicionado com sucesso !!");
            return true;
        }
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}