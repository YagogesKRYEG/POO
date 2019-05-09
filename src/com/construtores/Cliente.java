package com.construtores;

public class Cliente {
	
	private int id;
	private String nome;
	private String email;
	
	/*
	 * Métodos de acesso get set ...
	 */
	
	
	
	
	
	
	/*
	 * Sempre público
	 * Sempre com o mesmo nome da classe
	 * Não tipo tem tipo de retorno,ou seja NÃO É VOID OU
	 * QUALQUER OU TIPO
	 */
	
	public Cliente(int id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Cliente() {} 
	
	public String cadastrar() {
		return "Cadastro Realizado";
	}
	public String nomePorId(int id) {
		
		String msg="";
		
		if(this.id==id) {
			msg = this.nome;
		}
		else {
			msg = "Não localizado";
		}
		return msg;
	}

}
