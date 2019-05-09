package com.loja;

public class Produto {
	private int id;
	private String name;
	private String descricao;
	private Categoria categoria;
	private Fornecedor fornecedor;
	private double preco;
	public Produto() {
	}
	public Produto(int id, String name, String descricao, Categoria categoria, Fornecedor fornecedor, double preco) {
		this.id = id;
		this.name = name;
		this.descricao = descricao;
		this.categoria = categoria;
		this.fornecedor = fornecedor;
		this.preco = preco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
