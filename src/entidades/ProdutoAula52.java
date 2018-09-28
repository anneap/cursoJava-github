package entidades;

public class ProdutoAula52 {
	private String nome;
	private double preco;
	private int quantidade;

	public ProdutoAula52(String nome, double preco, int quantidade) {

		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public ProdutoAula52(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public ProdutoAula52() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double totalValorEstoque() {
		return preco * quantidade;
	}

	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome + " , $" + String.format("%.2f", preco) + ", " + quantidade + " unidades, " + "Total no Estoque: "
				+ String.format("%.2f", totalValorEstoque());

	}

}
