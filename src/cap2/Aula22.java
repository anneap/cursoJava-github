package cap2;

public class Aula22 {

	public static void main(String[] args) {
		// fun��es para String

		String original = "abcde FCHIJ ABC abc DEFG ";

		// letras minusculas
		String s01 = original.toLowerCase();
		// letras maiusculas
		String s02 = original.toUpperCase();
		// elimina os espa�os
		String s03 = original.trim();
		// pegar a partir de uma posi��o e motar uma nova string
		String s04 = original.substring(2);
		// Inicio e Limite para recortar a string e criar nova
		String s05 = original.substring(2, 9);
		// trocar um caracter na String
		String s06 = original.replace('a', 'x');
		// trocar mais caracteres na String
		String s07 = original.replace("abc", "xy");
		// primeira e �ltima ocorr�ncia em uma String
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");

		// Separador de vetor ""
		String s = "batata ma�� lim�o";
		String[] vect = s.split(" ");

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("Trim: -" + s03 + "-");
		System.out.println("Substring(2): -" + s04 + "-");
		System.out.println("Substring(2,9): -" + s05 + "-");
		System.out.println("Replace ('a','x'): -" + s06 + "-");
		System.out.println("Replace ('abc','xy'): -" + s07 + "-");
		System.out.println("Index Of 'bc': " + i);
		System.out.println("Last Index Of 'bc': " + j);
		System.out.println("---------------------");
		;
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);

	}

}
