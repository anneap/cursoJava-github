package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Aula62 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de pessoas: ");
		int n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {

			System.out.println("Informe a " + i + "º altura");
			vect[i] = sc.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}
		double media = soma/n;
		System.out.printf("Média das Alturas: %.2f", media);

		sc.close();

	}

}
