package br.com.aula5.implementacao;

import br.com.aula5.beans.Celular;
import br.com.aula5.beans.Livro;

public class executarProdutos {

	public static void main(String[] args) {
		
	Livro lv1 = new Livro(1, 100, "Java 00", "Alunos", "123456");
	Livro lv2 = new Livro(2, 100, "Java Web", "Alunos", "102030");
	
	System.out.println("Produto: " + lv1.getDescricao() + " Autor: " + lv2.getAutor());
	lv2.calcImp();
	
	Celular cel = new Celular(3, 500, "Iphone X", 5, 68);
	System.out.println("Produto: " + cel.getDescricao() + " Camera: " + cel.getCameraMega()+ " Preço: " + cel.getPreco());
	
	cel.calcImp();
	
	

	
	

	}

}
