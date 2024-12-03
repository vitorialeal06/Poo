package exercicios;

public class Quadrado extends PolReg {
    Quadrado(int tamanho) {
        super(4,tamanho);
    }
    public int area(){
        return tamanho*tamanho;
    }

}
