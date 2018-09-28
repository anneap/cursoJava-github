package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.ProdutoAula52;

public class Aula49 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira as informações do produto: ");
		System.out.print("Nome:");
		String nome = sc.nextLine();

		System.out.print("Preço: ");
		double preco = sc.nextDouble();

		ProdutoAula52 produto = new ProdutoAula52(nome, preco);

		System.out.println();
		System.out.println("Informações do Produto: " + produto);

		System.out.println();
		System.out.println("Informe o número de produtos que deseja adicionar no estoque:");
		int quantidade = sc.nextInt();

		produto.addProduto(quantidade);
		System.out.println();
		System.out.println("Atualização dos Dados: " + produto);

		System.out.println();
		System.out.println("Informe o número de produtos que deseja remover do estoque:");
		quantidade = sc.nextInt();

		produto.removeProduto(quantidade);
		System.out.println();
		System.out.println("Atualização dos Dados: " + produto);

		sc.close();

	}
}
