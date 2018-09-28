package cap2;

import java.util.Locale;
import java.util.Scanner;

public class Aula33 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
		System.out.print("Digite um número:");
		double n = sc.nextDouble();
		double sq = Math.sqrt(n);
		System.out.printf("Raiz Quadrada = %.3f%n", sq);
		
		System.out.print("Repetir (s/n)? ");
		resp = sc.next().charAt(0);
		
		} while (resp!= 'n');
		sc.close();
	}

}
