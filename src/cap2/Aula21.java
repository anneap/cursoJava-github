package cap2;

import java.util.Locale;
import java.util.Scanner;

public class Aula21 {

	public static void main(String[] args) {
		//mudar a localidade
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		//ler inteiro
		int n1 = sc.nextInt();
		//limpar a quebra de linha
		sc.nextLine();
		//ler string
		String nome = sc.nextLine();
		//ler caracteres
		char genero = sc.next().charAt(0);

		String s = sc.next();
		//recuperar string pelo caracter
		char letra = s.charAt(0);
		//recuperar da string o número inteiro
		int digito = Integer.parseInt(s.substring(1));
		//recuperar o decimal
		double n2 = sc.nextDouble();
		//Digitação na mesma linha e variáveis separadas
		String nome2 = sc.next();
		char ch = sc.next().charAt(0);
		int idade = sc.nextInt();
		double altura = sc.nextDouble();
		
		

		System.out.println(n1);
		System.out.println(nome);
		System.out.println(genero);
		System.out.println(letra);
		System.out.println(digito);
		System.out.println(n2);
		System.out.println("-----------------------");
		System.out.println(nome2);
		System.out.println(ch);
		System.out.println(idade);
		System.out.println(altura);
		sc.close();

	}

}
