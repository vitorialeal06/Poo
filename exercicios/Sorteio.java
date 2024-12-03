package exercicios;
import java.util.Scanner;

class MenorQueException extends Exception{
    public MenorQueException(String msg){
        super(msg);
    }
}

class MaiorQueException extends Exception{
    public MaiorQueException(String msg){
        super(msg);
    }
}

public class Sorteio {

    public void palpite() {
        int p = (int) (Math.random() * 10);
        int valor = 0;
        int contador = 0;

        System.out.println(p);
        System.out.println("digite o palpite: ");
        Scanner sc = new Scanner(System.in); //instanciou o objeto


        while (true) {
            valor = sc.nextInt();
            contador++;
            try {
                if (valor > p) {
                    throw new MaiorQueException("valor maior que palpite");
                } else if (valor < p) {
                    throw new MenorQueException("valor menor que palpite");
                } else {
                    System.out.println("acertou o palpite");
                    System.out.println("acertou em " + contador);
                    break;
                }
            } catch (MaiorQueException | MenorQueException e) {
                System.out.println(e.getMessage());
            }


        }
    }
    public static void main(String[] args) {
        Sorteio s = new Sorteio();
        s.palpite();
    }
}


