package br.com.aula5.beans;

public class Poupanca  extends Conta {
	private int rendimento;
	
	//Contrutor vazio.	
	public Poupanca() {
		super();		
	}
	
    // Contrutor cheio.
	public Poupanca(int agencia, int conta, double saldo, Cliente cliente, int rendimento) {
		super(agencia, conta, saldo, cliente);
		this.rendimento = rendimento;
	
	}

	// Getters e Setters
	public void setRendimento(int rendimento) {
		this.rendimento = rendimento;
	}

		public int getRendimento() {
		return rendimento;
	}
	
	//Métodos (operações)
	
	public void creditarRendimento() {
		setSaldo(this.rendimento + super.getSaldo());
	}

}
