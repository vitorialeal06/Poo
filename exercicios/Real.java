package exercicios;

public class Real extends Complexo{

    public Real(double real){
        super(real);
    }
    public int Sinal(){
        if(getReal()>0) return 1;
        else return -1;
    }
}
