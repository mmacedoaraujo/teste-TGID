package model.entities;

import model.entities.enums.Categorias;

public class Produto {

	private String nome;
	private double preço;
	private int quantidade;
	private Categorias categoria;

	public Produto() {

	}

	public Produto(String nome, double preço, int quantidade, Categorias categoria) {
		this.nome = nome;
		this.preço = preço;
		this.quantidade = quantidade;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public double getPreço() {
		return preço;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public Categorias getCategoria() {
		return categoria;
	}

}
