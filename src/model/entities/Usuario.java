package model.entities;

public class Usuario {

	private String nome;
	private String email;
	private String cpf;

	public Usuario() {

	}

	public Usuario(String name, String email, String cpf) {
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
