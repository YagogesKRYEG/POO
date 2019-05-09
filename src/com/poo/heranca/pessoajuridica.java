package com.poo.heranca;

public class pessoajuridica extends Cliente{
	private String RazaoSocial;
	private String cnpj;
	private String nomeFantasia;
	private String rg;
	
	public pessoajuridica() {
		super();
	}

	public pessoajuridica(String RazaoSocial, String cnpj, String nomeFantasia) {
		this.RazaoSocial = RazaoSocial;
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}
	
	public pessoajuridica(String razaoSocial, String cnpj, String nomeFantasia, int id ,String email, String telefone, String endere�o) {
		this.RazaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		super.setId(id);
		super.setEmail(email);
		super.setEndere�o(endere�o);
		super.setTelefone(telefone);
	}

	public String getRazaoSocial() {
		return RazaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	@Override
	public void cadastrar() {
		System.out.println("Os dados do cliente foram cadastrados");
	}
	
}
