public class Triangulo extends Figura{
    private double base;
    private double altura;

    Triangulo(double base, double altura, String cor){
        this.base = base;
        this.altura = altura;
        super.setCor(cor);

    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area(){
        return base*altura;
    }
    public String toString(){
        return String.format("area: %.2f", area());
    }
}
