package cap2;

import java.util.Locale;
import java.util.Scanner;

public class Aula30 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");

		double n = sc.nextDouble();

		while (n >= 0.0) {
			double sr = Math.sqrt(n);
			System.out.printf("%.3f%n", sr);
			System.out.print("Digite outro número:");
			n = sc.nextDouble();
		}
		System.out.println("Número Negativo");
		sc.close();
	}

}
