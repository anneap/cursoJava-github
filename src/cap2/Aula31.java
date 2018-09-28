package cap2;

import java.util.Scanner;

public class Aula31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números inteiros você vai digitar?");
		int n = sc.nextInt();
		int soma = 0;
		
		for (int i =1; i <=n; i++) {
			System.out.print("Valor #"+i+": ");
			int x = sc.nextInt();
			soma += x;
		}
		System.out.println("Soma = "+ soma);
		sc.close();
	}

}
