import java.util.Scanner;
public class DDD {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int ddd = sc.nextInt();

        switch (ddd){
            case 61:
                System.out.println("Brasilia");
                break;
            case 71:
                System.out.println("Salvador");
                break;
            case 11:
                System.out.println("Sao Paulo");
                break;
            case 21:
                System.out.println("ERRE JOTA");
                break;
            case 32:
                System.out.println("juiz de fora");
                break;
            case 19:
                System.out.println("campinas");
                break;
            case 27:
                System.out.println("vitoria");
                break;
            case 31:
                System.out.println("BH");
                break;
            default:
                System.out.println("DDD nao cadastrado");
        }
    }
}
