package br.com.aula5.beans;

public class Conta {
	private int agencia;
	private int conta;
	private double saldo;
	private Cliente cliente;

	public Conta() {
	}

	public Conta(int agencia, int conta, double saldo, Cliente cliente) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	// Operações (metodos)

	public void extrato() {
		System.out.println("Ag: " + this.agencia + " c/c: " + this.conta + " saldo: " + this.saldo + " Cliente: " + cliente.getNome());
	}

	public void deposito(double valor) {
		this.saldo = this.saldo + valor;
	}

	public void saque(double valor) {
		if (valor < this.saldo) {
			this.saldo = this.saldo - valor;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

}
