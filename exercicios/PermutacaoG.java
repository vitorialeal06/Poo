package exercicios;
import java.util.Arrays;
import java.util.Scanner;

public class PermutacaoG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite um valor: ");
        int numero2 = sc.nextInt();

        if (numero1<0 || numero2<0) {
            System.out.println("os numeros nao podem ser negativos");
            return;
        }

        if (permutacao(numero1, numero2)){
            System.out.println(numero1 +" é permutação de "+ numero2);
        }
        else{
            System.out.println(numero1 +" não é permutação de "+ numero2);
        }
    }

    public static boolean permutacao(int numero1, int numero2){
        String str1 = String.valueOf(numero1); //Converte o número num1 para uma string.
        String str2 = String.valueOf(numero2); //Converte o número num2 para uma string.

        int maior = Math.max (str1.length(), str2.length()); //Calcula o maior comprimento entre as strings para normalizar os números.

        str1 = String.format("%0" + maior + "d", numero1); //Adiciona zeros à esquerda de num1 para que tenha o mesmo comprimento que o maior número.
        str2 = String.format("%0" + maior + "d", numero2); //Adiciona zeros à esquerda de num2 para que tenha o mesmo comprimento que o maior número.

        char[] array1 = str1.toCharArray(); //Converte a string str1 em um array de caracteres.
        char[] array2 = str2.toCharArray(); //Converte a string str2 em um array de caracteres.

        Arrays.sort(array1); //Ordena o array de caracteres array1 em ordem crescente.
        Arrays.sort(array2); //Ordena o array de caracteres array2 em ordem crescente.

        return Arrays.equals(array1, array2); //Retorna true se os arrays ordenados forem iguais; caso contrário, retorna false.
    }
}
