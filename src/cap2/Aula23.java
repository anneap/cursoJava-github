package cap2;

import java.util.Scanner;

public class Aula23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println("O número " + n + " é par.");
		} else {
			System.out.println("O número " + n + " é impar.");
		}
		System.out.println("Que horas são?");
		int hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora < 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}
		sc.close();
	}

}
