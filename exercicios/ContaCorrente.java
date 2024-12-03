package exercicios;

public class ContaCorrente extends Conta implements Tributavel{
    private double limite;


    @Override
    public double calcularTributos() {
        return limite*0.1;
    }
}
