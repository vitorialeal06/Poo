package exercicios;

import java.time.LocalDate;

public class PessoaV extends Universidade {
    private String nome;
    private int idade;
    private LocalDate dataNascimento;


    public PessoaV(String nome,LocalDate dataNascimento, String local, String departamento) {
        super(local, departamento);
        this.nome = nome;
        this.dataNascimento = dataNascimento;

    }

    public int calculaIdade(LocalDate data){
        LocalDate atual = LocalDate.now();
        return this.idade = atual.getYear()-(dataNascimento.getYear());
    }
    public int informaIdade(){
        return this.idade;
    }
    public String informaNome(){
        return this.nome;
    }
    public void ajustaDataNascimento(LocalDate data){
        this.dataNascimento = data;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public boolean trabalho(String nome, String local){
        System.out.println(nome + " trabalha em "+local);
        return true;
    }

    public static void main(String[] args){
        PessoaV p1 = new PessoaV("Albert", LocalDate.of(1879,5,12), "uft", "artes");
        System.out.println(p1.calculaIdade(LocalDate.now()));
        System.out.println(p1.trabalho("albetto","uft"));
    }
}
