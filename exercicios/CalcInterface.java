package exercicios;
import java.util.Scanner;
public class CalcInterface {

    Scanner sc = new Scanner(System.in);

    public double recebeOperando(int i){
        return sc.nextDouble();
    }

    public char recebeOperacao(){
        return sc.next().charAt(0);
    }

    public void mostraResultado(double res){
        System.out.println(res);
    }
}
