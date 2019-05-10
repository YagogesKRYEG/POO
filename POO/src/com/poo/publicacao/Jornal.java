package com.poo.publicacao;

import java.util.List;

import com.poo.interfaces.Acoes;

public class Jornal extends Publicacao implements Acoes{
	private String caderno;

public Jornal() {
}

public Jornal(String caderno) {
	this.caderno = caderno;
}

public String getCaderno() {
	return caderno;
}

public void setCaderno(String caderno,int id,String titulo, String editora,int paginas, List<Autor> autores) {
	this.caderno = caderno;
	super.setId(id);
	super.setTitulo(titulo);
	super.setEditora(editora);
	super.setPaginas(paginas);
	super.setAutores(autores);
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

public void setCaderno(String caderno) {
	this.caderno = caderno;
};
	
}
