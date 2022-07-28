package application;

import java.util.Calendar;

import model.entities.Usuario;
import model.entities.ItemVenda;
import model.entities.Produto;
import model.entities.Venda;
import model.entities.enums.Categorias;
import model.entities.enums.StatusCompra;

public class Program {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		Venda venda = new Venda(cal.getTime(), new Usuario("Marcos Macêdo", "marcos@gmail.com", "010.020.030-00"),
				StatusCompra.PROCESSANDO);

		venda.addItem(new ItemVenda(new Produto("TV", 2379.89, 1, Categorias.ELETRÔNICOS)));
		venda.addItem(new ItemVenda(new Produto("Senhor dos Anéis - Box Trilogia", 149.99, 1, Categorias.LIVROS)));

		System.out.println(venda);

		Venda venda2 = new Venda(cal.getTime(),
				new Usuario("Alessandra Vitória", "alessandra@gmail.com", "100.200.300-00"),
				StatusCompra.PAGAMENTO_PENDENTE);

		venda2.addItem(new ItemVenda(new Produto("Secador", 79.19, 1, Categorias.BELEZA_E_PERFUMARIA)));
		venda2.addItem(new ItemVenda(new Produto("Calça Jeans", 139.90, 1, Categorias.MODA)));
		venda2.addItem(new ItemVenda(new Produto("Blusa", 49.99, 1, Categorias.MODA)));
		venda2.addItem(new ItemVenda(new Produto("Smartphone", 1689.49, 1, Categorias.ELETRÔNICOS)));

		System.out.println("\n============================================================\n");

		System.out.println(venda2);
	}

}
