package cap2;

import java.util.Scanner;

/* O maior número
 * é qual?
 */
public class Aula28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 3 números:");

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		/*
		 * if (n1>n2 && n1>n3){ System.out.println("O maior é= "+n1); }else if (n2 > n3)
		 * { System.out.println("O maior é = "+n2); }else {
		 * System.out.println("O maior é = "+n3); }
		 */
		int maior = max(n1, n2, n3);

		showResult(maior);

		sc.close();

	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
 public static void showResult(int value) {
	 System.out.println("Maior = "+value);
 }
}
