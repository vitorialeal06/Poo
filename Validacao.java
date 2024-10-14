class NotaInvalidaException extends Exception {
    public NotaInvalidaException(String mensagem) {
        super(mensagem);
    }
}

public class Validacao {
    private String nome;
    private double nota;

    public Validacao(String nome, double nota) throws NotaInvalidaException {
        this.nome = nome;
        this.nota = nota;
        setNota(nota);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) throws NotaInvalidaException {
        if (nota < 0 || nota > 10)
            throw new NotaInvalidaException("nota invalida");

        this.nota = nota;
    }
}
class tr{
    public static void main(String [] args){
        try{
            Validacao validacao = new Validacao("Felipe", 121);
            System.out.println(validacao.getNome());
        }

        catch (NotaInvalidaException e){
            System.out.println(e.getMessage());
        }
    }
}
