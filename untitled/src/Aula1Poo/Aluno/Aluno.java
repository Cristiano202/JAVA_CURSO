package Aula1Poo.Aluno;
import java.time.LocalDate;

public class Aluno {
   public long matricula;
   public String nome;
   public LocalDate dateNascimento;
   public   String turma;
   public char sexo;

   public Aluno(long matricula,String nome,LocalDate dataNascimento,String turma,char sexo){
       this.nome=nome;
       this.matricula=matricula;
       this.dateNascimento=dataNascimento ;
       this.turma=turma;
       this.sexo=sexo;

   }
   public void imprime(){
       System.out.println(this.nome);
       System.out.println(this.matricula);
       System.out.println(this.dateNascimento);
       System.out.println(this.turma);
       System.out.println(this.sexo);
   }
}
