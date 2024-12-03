package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class AlunoG {
    private int primeiraNota;
    private int segundaNota;
    private String nome;

    // Construtor
    public AlunoG(String nome, int primeiraNota, int segundaNota) {
        this.nome = nome;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
    }

    // Getters e Setters
    public int getPrimeiraNota() {
        return primeiraNota;
    }

    public void setPrimeiraNota(int primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    public int getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(int segundaNota) {
        this.segundaNota = segundaNota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularMedia() {
        return (primeiraNota + segundaNota) / 2.0;
    }
}

class Controle {
    public static void main(String[] args) {
        ArrayList<AlunoG> alunos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String nome;

        // Entrada de dados
        while (true) {
            System.out.print("Digite o nome do aluno (ou 'fim' para encerrar): ");
            nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a primeira nota parcial (0 a 100): ");
            int primeiraNota = scanner.nextInt();

            System.out.print("Digite a segunda nota parcial (0 a 100): ");
            int segundaNota = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            AlunoG aluno = new AlunoG(nome, primeiraNota, segundaNota);
            alunos.add(aluno);
        }

        // Processamento
        if (!alunos.isEmpty()) {
            double somaMedias = 0.0;
            int aprovados = 0, finais = 0, reprovados = 0;

            for (AlunoG aluno : alunos) {
                double media = aluno.calcularMedia();
                somaMedias += media;

                if (media >= 70) {
                    aprovados++;
                } else if (media >= 40) {
                    finais++;
                } else {
                    reprovados++;
                }
            }

            double mediaTurma = somaMedias / alunos.size();

            // Resultados
            System.out.println("\nResultados:");
            System.out.printf("Média da turma: %.2f%n", mediaTurma);
            System.out.println("Aprovados: " + aprovados);
            System.out.println("Em final: " + finais);
            System.out.println("Reprovados: " + reprovados);

            System.out.println("\nAlunos com nota abaixo da média da turma:");
            for (AlunoG aluno : alunos) {
                if (aluno.calcularMedia() < mediaTurma) {
                    System.out.println("Nome: " + aluno.getNome());
                }
            }
        } else {
            System.out.println("Nenhum aluno foi inserido.");
        }

        scanner.close();
    }
}

