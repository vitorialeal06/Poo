package exercicios;

public abstract class PolReg {
    int lado, tamanho;

    public int perimetro(){
        return lado*tamanho;
    }
    public int angulo(){
        return (lado-2)*180;
    }
    public abstract int area();

    public PolReg(int lado, int tamanho){
        this.lado = lado;
        this.tamanho = tamanho;
    }
    public PolReg(int tamanho){
        this.tamanho = tamanho;
    }

    public void mostra(){
        System.out.println("area: "+area()+ "perimetro: "+perimetro()+"angulo: "+angulo());
    }
}
