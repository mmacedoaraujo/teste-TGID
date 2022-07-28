package model.entities;

public class Cliente {

	private String nome;
	private String email;
	private String cpf;

	public Cliente() {

	}

	public Cliente(String name, String email, String cpf) {
		this.nome = name;
		this.email = email;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getCpf() {
		return cpf;
	}

}
