package model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.entities.enums.StatusCompra;

public class Venda {
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date horaCompra;

	List<ItemVenda> itemVenda = new ArrayList<>();
	private Usuario usuario;
	private StatusCompra statusCompra;

	public Venda() {

	}

	public Venda(Date horaCompra, Usuario cliente, StatusCompra statusCompra) {
		this.horaCompra = horaCompra;
		this.usuario = cliente;
		this.statusCompra = statusCompra;
	}

	public Date getHoraCompra() {
		return horaCompra;
	}

	public List<ItemVenda> getItemVenda() {
		return itemVenda;
	}

	public Usuario getCliente() {
		return usuario;
	}

	public StatusCompra getStatus() {
		return statusCompra;
	}

	public void addItem(ItemVenda itemVenda) {
		this.itemVenda.add(itemVenda);
	}

	public double total() {
		double sum = 0;
		for (ItemVenda item : itemVenda) {
			sum += item.subTotal();
		}
		return sum;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("DADOS DO PEDIDO: \n");
		sb.append("Hora da compra: " + sdf.format(horaCompra) + "\n");
		sb.append("\nUsuário: " + usuario.getNome() + "\nEmail: " + usuario.getEmail() + "\nCPF: " + usuario.getCpf()
				+ "\nStatus do pedido: " + getStatus() + "\n");
		sb.append("\nITENS DO PEDIDO: \n");
		for (ItemVenda item : itemVenda) {

			sb.append(item);
		}
		sb.append("\nTotal do pedido: $" + String.format("%.2f", total()));
		return sb.toString();
	}

}
