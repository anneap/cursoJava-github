package entidades;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		quantidade = 0;
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
	public String toString () {
		return nome
				+ " , $"
				+ String.format("%.2f", preco)
				+ ", "
				+quantidade
				+ " unidades, "
				+ "Total no Estoque: "
				+ String.format("%.2f", totalValorEstoque());
				
	}

}
