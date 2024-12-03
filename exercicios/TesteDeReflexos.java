package exercicios;
import java.util.Random;
import java.util.Scanner;

public class TesteDeReflexos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); //Inicializa o objeto Random para gerar valores aleatórios.


        System.out.println("Prepare-se!...");

        int tempoEspera = 1000 + random.nextInt(5000); //Gera um tempo de espera aleatório entre 1000 ms (1 segundo) e 6000 ms (6 segundos).
        try {
            Thread.sleep(tempoEspera); //Faz o programa "dormir" pelo tempo gerado acima, simulando o atraso antes do comando "Agora!".
        } catch (InterruptedException e) {
            e.printStackTrace();
            //InterruptedException é uma exceção verificada (checked exception) que pode ser lançada quando um thread é interrompido enquanto está "dormindo"
            //(ou seja, enquanto está em um estado de espera, como durante uma chamada a Thread.sleep()). Isso significa que outro thread
            // pode interromper o que está sendo executado no thread atual, resultando nessa exceção.

            //Por exemplo, o método Thread.sleep(tempoEspera) tenta fazer com que o programa "durma" ou aguarde
            // por um certo período de tempo (em milissegundos). No entanto, se esse thread for interrompido por outro
            // thread antes de terminar o tempo de espera, o método lança a exceção InterruptedException.

            //Este comando é usado para imprimir a "pilha de chamadas" (stack trace) da exceção. Isso fornece informações
            // detalhadas sobre onde o erro ocorreu no código, como o tipo de exceção e o local exato no código fonte.
            // Isso pode ser útil para depuração durante o desenvolvimento
        }

        int numeroAleatorio = random.nextInt(100); //Gera um número aleatório entre 0 e 99.
        System.out.println("Agora! Digite o número: " + numeroAleatorio);

        long inicioTempo = System.nanoTime(); //Marca o início do tempo quando o número é exibido

        int entradaUsuario = scanner.nextInt(); //Captura o número digitado pelo usuário.

        long fimTempo = System.nanoTime(); //Marca o final do tempo quando o usuário pressiona Enter.

        if (entradaUsuario == numeroAleatorio) {
            double tempoDecorrido = (fimTempo - inicioTempo) / 1_000_000_000.0; //Calcula o tempo decorrido em milissegundos.
            System.out.printf("Parabéns! Você levou %.3f segundos para responder.%n", tempoDecorrido);

        } else {
            System.out.println("Você digitou o número errado. Tente novamente!");
        }
    }
}