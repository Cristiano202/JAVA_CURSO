package PraticandoPoo.Dominio;

import java.sql.SQLOutput;

public class Jogador {
    private String nome;
    private  int idade;
    private  String time;
    private char sexo;
    private float salario;

    public void imprimi(){
        System.out.println("Apresentando o jogador "+this.getNome());
        System.out.println("IDADE: "+this.getIdade());
        System.out.println(" TIME: "+this.getTime());
        System.out.println("SEXO: "+this.getTime());
        System.out.println("SEU salario: "+this.getSalario());

    }

    public Jogador(){

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
