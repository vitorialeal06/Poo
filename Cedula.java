import java.util.Scanner;
public class Cedula{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int resto=a;
        System.out.println(a);

        System.out.println(a/100+ " de 100");
        resto = a%100;

        System.out.println(resto/50+ " de 50");
        resto = resto%50;

        System.out.println(resto/20+ " de 20");
        resto = resto%20;

        System.out.println(resto/10+ " de 10"); 
        resto = resto%10;

        System.out.println(resto/5+ " de 5");
        resto = resto%5;

        System.out.println(resto/2+ " de 2");
        resto = resto%2;
        
        System.out.println(resto/1+ " de 1");


    }

}
