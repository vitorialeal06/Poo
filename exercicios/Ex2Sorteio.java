package exercicios;
import java.util.Scanner;

public class Ex2Sorteio {
    public static void main(String[] args) {

        int aleatorio = (int) (Math.random() * 1001);
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int palpite;
        System.out.println(aleatorio);

        do{
            System.out.println("Digite seu palpite: ");
            palpite = entrada.nextInt();

            if (palpite < aleatorio){
                System.out.println("Seu palpite é menor que o número sorteado");
                contador++;
            }
            if (palpite > aleatorio) {
                System.out.println("Seu palpite é maior que o número sorteado");
                contador++;
            }
        }while (palpite != aleatorio);

        System.out.println("Seu palpite está correto, você levou "+contador+" tentativas para acertar");
    }
}
