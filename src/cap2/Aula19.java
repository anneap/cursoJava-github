package cap2;

import java.util.Scanner;

public class Aula19 {

	public static void main(String[] args) {
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		System.out.println("------------------");
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int mask =0b100000;
		int n = sc.nextInt();
		
		if( (n & mask) !=0) {
			System.out.println("6º bit é verdadeiro");
		}
		else {
			System.out.println("6º bit é falso");
		}
		
		sc.close();
		
		
		
	}

}
