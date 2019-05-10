package com.poo.eventos;

public class Filme extends Eventos implements Acoes {
	private String sessao;

	public Filme() {
	}

	public Filme(String sessao) {
		this.sessao = sessao;
	}

	public Filme(String sessao,int id,String titulo, String editora,int paginas) {
		this.sessao = sessao;
		super.setId(id);
	}
	
}
