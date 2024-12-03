package exercicios;

import java.util.Scanner;

public class InterfacePolig {
    public static void main(String[] args) {
        int op, tamanho, lados;
        Scanner sc = new Scanner(System.in);
        System.out.println("qual poligono vc quer? [1] regular [2]triangulo [3]quadrado");
        op = sc.nextInt();
        switch (op) {
//            case 1:
//                System.out.println("digite lados e tamanho");
//                lados = sc.nextInt();
//                tamanho = sc.nextInt();
//                PolReg poligono = new PolReg(lados, tamanho);
//                poligono.mostra();
//                break;
            case 2:
                System.out.println("digite tamanho");
                tamanho = sc.nextInt();
                PolReg triangulo = new TrianguloEq(tamanho);
                triangulo.mostra();
                break;
            case 3:
                System.out.println("digite tamanho");
                tamanho = sc.nextInt();
                PolReg quadrado = new Quadrado(tamanho);
                quadrado.mostra();

        }
    }
}
