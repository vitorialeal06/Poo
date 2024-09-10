package br.edu.uft.poo.a2024s2.a10092024;
import java.util.Scanner; 
public class Media {
	public static void main (String args[]) {
		Scanner scanner = new Scanner (System.in);
		
		float A = scanner.nextFloat();
		float B = scanner.nextFloat();
		
		double MEDIA = (A*3.5 + B*7.5)/11;
		
		
		System.out.printf("MEDIA = %.5f", MEDIA);
	}
}
