package cap2;

import java.util.Scanner;

public class Aula20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		
		String x, y, z;
		
		x = sc.next(); // quebra de linha e espaço
		y = sc.next();
		z = sc.next();
		
		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("---------------------");
		x = sc.next(); // quebra de linha e espaço
		y = sc.next();
		z = sc.next();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("---------------------");
		
			
		sc.close();
		

	}

}
