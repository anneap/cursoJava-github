package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Triangulo;

public class Aula37 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// double xA, xB, xC, yA, yB, yC;
		Triangulo x, y;

		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Informe as medidas do 1º triângulo");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		/*
		 * xA = sc.nextDouble(); xB = sc.nextDouble(); xC = sc.nextDouble();
		 */
		System.out.println("Informe as medidas do 2º triângulo");
		/*
		 * yA = sc.nextDouble(); yB = sc.nextDouble(); yC = sc.nextDouble();
		 */
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX =x.area();
		double areaY= y.area();

		//double p = (x.a + x.b + x.c);
		
		// double p = (xA + xB + xC) / 2.0;
		// double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		// double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		//p = (y.a + y.b + y.c);
		// p = (yA + yB + yC) / 2.0;
		// double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		// double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

		System.out.printf("O 1º Triângulo tem área: %.4f%n", areaX);
		System.out.printf("O 2º Triângulo tem área: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("O 1º triângulo tem a área maior!");
		} else {
			System.out.println("O 2º triângulo tem a área maior!");
		}

		sc.close();

	}

}
