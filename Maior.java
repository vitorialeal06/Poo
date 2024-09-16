import java.util.Scanner;
public class Maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int maior =0;
        if (a>b && a>c){
            maior = a;
        }
        else if (b>a && b>c){
            maior = b;
        }
        else if (c>a && c>b){
            maior = c;
        }
        System.out.println(maior+" eh maior");
    }
}
