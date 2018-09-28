package cap2;

import java.util.Locale;

public class Aula09 {

	public static void main(String[] args) {
		char gender = 'f';
		int age = 32;
		double balance = 10.35784;
		String name = "Maria";
		
			System.out.print("Good morning");
			System.out.println("Boa tarde");
			System.out.println("Boa noite");
			System.out.println("---------------------");
			System.out.printf("%.2f%n", balance);
			System.out.printf("%.4f%n", balance);
			Locale.setDefault(Locale.US);
			System.out.printf("%.4f%n", balance);
			System.out.println("---------------------");
			
			System.out.printf("%s is %d years old, gender %c, and got balance = %.2f bitcoins%n", name, age, gender, balance);
		
		
	}

}
