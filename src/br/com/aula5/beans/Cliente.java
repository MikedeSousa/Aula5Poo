package br.com.aula5.beans;

public class Cliente {
	private String nome;
	private String cpf;
	private String fone;
	
	public Cliente() {}
	
	public Cliente(String nome, String cpf, String fone) {		
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
	}
	//Getters + Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}
	

}
