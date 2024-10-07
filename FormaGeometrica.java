abstract class FormaGeometrica {
    abstract double  calcularArea();
}

class Retangulo extends FormaGeometrica{
    double largura, altura;

    Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    @Override
    double calcularArea(){
        return largura * altura;
    }
}

class Circulo extends FormaGeometrica{
    double raio;

    Circulo(double raio){
        this.raio = raio;
    }

    @Override
    double calcularArea(){
        return Math.PI * raio;
    }
}


class Maim{
    public static void main(String[] args) {
        FormaGeometrica retangulo = new Retangulo(10,20);
        FormaGeometrica circulo = new Circulo(10);

        System.out.println("retangulo"+retangulo.calcularArea());
        System.out.println("circulo"+circulo.calcularArea());
    }
}
