package exercicios;

public class TrianguloEq extends PolReg{

    public TrianguloEq(int tamanho) {
        super(3,tamanho);
    }

    public int area(){
        return(tamanho*tamanho)/2;
    }
}
