package br.com.aula5.implementacao;

import br.com.aula5.beans.Cliente;
import br.com.aula5.beans.Conta;
import br.com.aula5.beans.ContaCorrente;
import br.com.aula5.beans.Poupanca;

public class executarContas {

	public static void main(String[] args) {
		
		//1° Definir os Clientes
		Cliente cliente1 = new Cliente ("Ana Maria Braga", "1234567890", "5511990901010");

		Cliente cliente2 = new Cliente ("Fausto Silva", "0987654321", "5511910102020");
		
		// 2° Abrir as contas
		
		Conta cc1 = new Conta(1010, 5001, 100, cliente1);		
		Conta cc2 = new Conta(1010, 5002, 100, cliente2);
		
		cc1.extrato();
		cc2.extrato();
		
		Poupanca pp = new Poupanca(1010, 5003, 300, cliente1, 10);
		
		pp.creditarRendimento();
		pp.extrato();
		
		ContaCorrente ccr = new ContaCorrente(1010, 5004, 400, cliente2, 200, 5);
		
		ccr.extrato();
		
		
	}

}
