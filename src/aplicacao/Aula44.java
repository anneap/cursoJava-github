package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class Aula44 {

	//Aula44public static final double PI = 3.14159;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Aula45Calculadora calc = new Calculadora();
		

		System.out.println("Informe o valor do raio: ");
		double raio = sc.nextDouble();
		double c = Calculadora.circunferencia(raio);
		//Aula45double c = calc.circunferencia(raio);
		//Aula44double c = circunferencia(raio);
		double v = Calculadora.volume(raio);
		//Aula45double v = calc.volume(raio);
		//Aula44double v = volume(raio);

		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		//Aula44System.out.printf("PI: %.2f%n", PI);
		System.out.printf("PI: %.2f%n", Calculadora.PI);
		sc.close();
	}

	/*Aula44public static double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}

	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3.0;
	}
*/
}
