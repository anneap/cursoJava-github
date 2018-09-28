package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import java.util.stream.Collectors;

public class Aula68 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List <String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("José");
		list.add("ana");
		list.add("adão");
		list.add(2, "Marcos");
		
		System.out.println(list.size());
		
		
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("__________________________");
		
		//list.remove("ana");
		//list.remove(1);
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("__________________________");
		
		System.out.println("Index of José: " + list.indexOf("José"));
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("__________________________");
		
		String nome = list.stream().filter(x -> x.charAt(0) == 'b').findFirst().orElse(null);
		System.out.println(nome);
		sc.close();

	}

}
