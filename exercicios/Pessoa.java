package exercicios;

import java.util.Calendar;
import java.util.Scanner;

public class Pessoa {
    String nome;
    int idade;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;

    public static int calculaIdade(int diaNascimento, int mesNascimento, int anoNascimento, int idade) {
        Calendar hoje = Calendar.getInstance();

        idade = hoje.get(Calendar.YEAR) - anoNascimento;

        if (hoje.get(Calendar.MONTH) < mesNascimento){
            idade--;
        }
        else if (hoje.get(Calendar.MONTH)==mesNascimento && hoje.get(Calendar.DAY_OF_MONTH) < diaNascimento){
            idade--;
        }
        return idade;
    }

    public static void informaIdade(int idade){
        System.out.println("Idade: " + idade + " anos");
    }

    public static void informaNome(String nome){
        System.out.println(nome);
    }

    public void ajustaDataNascimento(int diaNascimento, int mesNascimento, int anoNascimento){
        int novoDiaNascimento = 0;
        int novoMesNascimento = 0;
        int novoAnoNascimento = 0;

        this.diaNascimento = novoDiaNascimento;
        this.mesNascimento = novoMesNascimento;
        this.anoNascimento = novoAnoNascimento;

        System.out.println("Nova data de nascimento ajustada: "+ novoDiaNascimento + "/" + novoMesNascimento + "/" + novoAnoNascimento);
    }
}



class mainPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Digite o nome: ");
        pessoa.nome = scanner.nextLine();

        // Pedindo a data de nascimento da pessoa
        System.out.print("Digite o dia de nascimento: ");
        pessoa.diaNascimento = scanner.nextInt();
        System.out.print("Digite o mês de nascimento (1-12): ");
        pessoa.mesNascimento = scanner.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        pessoa.anoNascimento = scanner.nextInt();

        pessoa.idade = Pessoa.calculaIdade(pessoa.diaNascimento, pessoa.mesNascimento, pessoa.anoNascimento, pessoa.idade);

        Pessoa.informaNome(pessoa.nome);
        Pessoa.informaIdade(pessoa.idade);

        pessoa.ajustaDataNascimento(15, 12, 1990);

        pessoa.idade = Pessoa.calculaIdade(pessoa.diaNascimento, pessoa.mesNascimento, pessoa.anoNascimento, pessoa.idade);

        Pessoa.informaNome(pessoa.nome);

        System.out.println("Após o ajuste da data de nascimento:");
        Pessoa.informaIdade(pessoa.idade);
    }
}

