package br.edu.uft.poo.a2024s2.a10092024;
import java.util.Scanner;

public class Faculdade {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String [] nome = new String[10];
		
		for(int i=0; i<10;i++) {
			nome[i] = sc.next();
		}
		
		System.out.println(nome[2]);
		System.out.println(nome[6]);
		System.out.println(nome[8]);
	}

}
