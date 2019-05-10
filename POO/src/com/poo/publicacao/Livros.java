package com.poo.publicacao;

import java.util.List;

import com.poo.interfaces.Acoes;

;

public class Livros extends Publicacao implements Acoes {
	
	private String genero;
	private String isbn;
	public Livros() {
	}
	
	public Livros(String genero, String isbn) {
		this.genero = genero;
		this.isbn = isbn;
	}

	public Livros(String genero, String isbn,int id,String titulo, String editora,int paginas, List<Autor> autores) {
		this.genero = genero;
		this.isbn = isbn;
		super.setId(id);
		super.setTitulo(titulo);
		super.setEditora(editora);
		super.setPaginas(paginas);
		super.setAutores(autores);
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String cadastrar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> pesquisar(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
