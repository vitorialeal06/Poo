package exercicios;

import java.util.Arrays;

public class Permutacao {
    public void permuta(int v1, int v2){

        char[] valor1 = Integer.toString(v1).toCharArray();
        char[] valor2 = Integer.toString(v2).toCharArray();

        Arrays.sort(valor1);
        Arrays.sort(valor2);

        if(Arrays.equals(valor1,valor2)){
            System.out.println("sao permutados");
        }
        else
            System.out.println("nao sao permutados");

    }
    public static void main(String[] args) {
        Permutacao p = new Permutacao();
        p.permuta(222, 222);
    }
}
