package br.com.usarclasses;

import com.loja.Categoria;
import com.loja.Fornecedor;
import com.loja.Produto;

public class GerenciarProdutos {
	
	public static void main(String[] args) {
		/*
		 * Vamos criar um vetor(Array|Coleção) de categorias
		 * 
		 * 
		 */
		Categoria[] cat = {
					new Categoria(11,"Informatica","Tecnologia"),
					new Categoria(12,"Suprimentos","Diversos"),
					new Categoria(13,"Escolar","Para o Estudo")
		};
		Fornecedor [] fornecedor = {
				
				new Fornecedor(51,"Microsoft","1111"),
				new Fornecedor(52,"logitec","556"),
				new Fornecedor(53,"Tilibra","55487")
		};
		Produto pr = new Produto();
		pr.setId(60);
		pr.setName("Mouse");
		pr.setDescricao("Mouse sem Fio");
		pr.setCategoria(cat[0]);
		pr.setFornecedor(fornecedor[1]);
		pr.setPreco(20);
	}

}
