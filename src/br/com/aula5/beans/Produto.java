package br.com.aula5.beans;

import br.com.aula5.interfaces.padraoImposto;

public abstract class Produto implements padraoImposto{

	private int codigo;
	private int preco;
	private String descricao;
	
	public Produto() {
		super();
	}

	public Produto(int codigo, int preco, String descricao) {
		super();
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//Método 
	public void calcImposto() { 
		System.out.println("Valor do Imposto: " + preco * 1.20);
	}
}
