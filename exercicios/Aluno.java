package exercicios;
import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
    int nota1, nota2;
    String nome;

   public Aluno( String nome, int nota1, int nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nome = nome;
    }

    public double calcularMedia() {
       return (double) (nota1 + nota2) / 2;
    }

    public String toString() {
       return ("nome: "+nome +"nota1: "+nota1+"nota2: "+ nota2);
   }

}

class controle{
    public static void main(String[] args) {
        double soma=0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        while(true){
            System.out.println("Digite o nome do aluno: ");
            String nome = sc.nextLine();

            if(nome.equals("fim"))
                break;

            System.out.println("Digite a nota 1 do aluno: ");
            int nota1 = sc.nextInt();

            System.out.println("Digite a nota 2 do aluno: ");
            int nota2 = sc.nextInt();
            sc.nextLine();

            Aluno aluno = new Aluno(nome, nota1, nota2);
            alunos.add(aluno);
            soma += aluno.calcularMedia();
        }

        System.out.println(alunos);
        System.out.println("media da turma: "+ (soma/alunos.size()));

        for(int i=0;i<alunos.size();i++){
            if(alunos.get(i).calcularMedia() < 6){
                System.out.println("aluno aprovado"+ alunos.get(i));
            }
            else{
                System.out.println("aluno reprovado"+ alunos.get(i));
            }
            if(alunos.get(i).calcularMedia() < soma/alunos.size()){
                System.out.println("aluno menor q media turma"+ alunos.get(i));
            }
        }
    }
}



