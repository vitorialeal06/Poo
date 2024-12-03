package exercicios;

public class Primo {
    public void ConferePrimo(int valor){
        int valida = 0;
        for (int i= 2; i<valor-1; i++) {
            if (valor % i == 0)
                valida++;
        }
        if(valida == 0)
            System.out.println("Primo");
        else
            System.out.println("Não é primo");

    }

    public static void main(String[] args) {
        Primo p = new Primo();
        p.ConferePrimo(4);
    }
}
