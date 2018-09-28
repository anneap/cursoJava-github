package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.ProdutoAula63;

public class Aula63 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe a quantidade de tipos de produto: ");
		int n = sc.nextInt();
		System.out.println();
		ProdutoAula63[] vect = new ProdutoAula63[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Informe o nome do produto: ");
			String nome = sc.nextLine();

			System.out.println("Informe o preço do produto: ");
			double preco = sc.nextDouble();
			vect[i] = new ProdutoAula63(nome, preco);
		}
		
		double soma = 0.0;
		for (int i = 0; i<vect.length; i++) {
			soma+= vect[i].getPreco();
		}
		
		double media = soma/vect.length;
		System.out.printf("A média dos preços do produtos é: %.2f%n", media);

		sc.close();

	}

}
