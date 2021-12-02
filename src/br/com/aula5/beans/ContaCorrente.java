package br.com.aula5.beans;

public class ContaCorrente extends Conta {
	private double limite;
	private float taxa;
	
	public ContaCorrente() {}

	public ContaCorrente(int agencia, int conta, double saldo, Cliente cliente, double limite, float taxa) {
		super(agencia,conta,saldo,cliente);
		this.limite = limite;
		this.taxa = taxa;		
	}
    // Getters e Setters
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	
	//métodos ( operações)
	public void sacar(double valor) {
		
	}
	
	public void aumentarLimite(double valor) {
		this.limite = valor;
		
	}
	public void debitarTaxa() {
		
	}
	}
	
	
