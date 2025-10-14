package PraticandoPoo.Dominio;

import java.sql.SQLOutput;

public class Jogador {
    private String nome;
    private  int idade;
    private  String time;
    private String sexo;
    private float salario;

    public void imprimi(){
        System.out.println("------------------");
        System.out.println("Apresentando o jogador "+this.getNome());
        System.out.println("IDADE: "+this.getIdade());
        System.out.println("TIME: "+this.getTime());
        System.out.println("SEXO: "+this.getSexo());
        System.out.println("SEU salario: "+this.getSalario());

    }

    public Jogador(){

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(this.getIdade()<18){
            System.out.println("Você ainda é de menor ");
        }
        else {
            System.out.println("Você ja é de maior ");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
