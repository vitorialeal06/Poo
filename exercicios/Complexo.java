package exercicios;

public class Complexo {
    private double real;
    private double imag;
    public Complexo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public Complexo(double real) {
        this.real = real;
    }

    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImag() {
        return imag;
    }
    public void setImag(double imag) {
        this.imag = imag;
    }
    public double Modulo(){
        return Math.sqrt(real * real + imag * imag);
    }
}
