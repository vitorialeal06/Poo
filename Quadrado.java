public class Quadrado extends Retangulo{

    Quadrado(double lado1, String cor){
        super(lado1);
        this.setLado1(lado1);
        super.setCor(cor);
    }
    public double area(){
        return this.getLado1() * this.getLado1();
    }
}
