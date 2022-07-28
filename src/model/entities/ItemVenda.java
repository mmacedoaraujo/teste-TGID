package model.entities;

public class ItemVenda {

	private Produto produto;

	public ItemVenda() {

	}

	public ItemVenda(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return produto.getQuantidade();
	}

	public double getPreço() {
		return produto.getPreço();
	}

	public Produto getProduto() {
		return produto;
	}

	public double subTotal() {
		return produto.getPreço() * produto.getQuantidade();
	}
	
	public String toString() {
		return "\nProduto: " + produto.getNome() + "\nPreço: " + String.format("%.2f", produto.getPreço()) + "\nQuantidade: " + produto.getQuantidade() + "\nCategoria: " + produto.getCategoria() + "\nSubtotal: $" +subTotal() + "\n";
	}
}
