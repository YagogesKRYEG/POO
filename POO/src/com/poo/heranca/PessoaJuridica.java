package com.poo.heranca;

public class pessoajuridica extends Cliente{
	private String razaoSocial;
	private String cnpj;
	private String nomeFantasia;
	
	public pessoajuridica() {
	}

	public pessoajuridica(String razaoSocial, String cnpj, String nomeFantasia) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}

	public pessoajuridica(String razaoSocial, String cnpj, String nomeFantasia, int id, String email, String telefone, String endereco) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		super.setId(id);
		super.setEmail(email);
		super.setTelefone(telefone);
		super.setEndereco(endereco);
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	@Override
	public void cadastrar() {
		System.out.println("Os dados do cliente foram cadastrados");
	}
	
	
}
