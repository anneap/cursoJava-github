package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Produto;

public class Aula40 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto produto = new Produto();

		System.out.println("Insira as informa��es do produto: ");
		System.out.print("Nome:");
		produto.nome = sc.nextLine();
		System.out.print("Pre�o: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade:");
		produto.quantidade = sc.nextInt();

		

		System.out.println();
		System.out.println("Informa��es do Produto: " + produto);
		// System.out.println(produto.nome+","+produto.preco+","+produto.quantidade);

		System.out.println();
		System.out.println("Informe o n�mero de produtos que deseja adicionar no estoque:");
		int quantidade = sc.nextInt();

		produto.addProduto(quantidade);
		System.out.println();
		System.out.println("Atualiza��o dos Dados: " + produto);

		System.out.println();
		System.out.println("Informe o n�mero de produtos que deseja remover do estoque:");
		quantidade = sc.nextInt();

		produto.removeProduto(quantidade);
		System.out.println();
		System.out.println("Atualiza��o dos Dados: " + produto);

		sc.close();

	}

}
