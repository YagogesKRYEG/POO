package br.com.exemplo.basico;

import com.matematica.funcoes;

import br.com.usarclasses.MFunçoes;

public class UsarFunçoes {

	public static void main(String[] args) {
		// vamos declarar um array de valores 
		//do tipo double e passar as funcoes
		double[] valores = {15, 32, 56, 80, 11};
		
		MFunçoes funcoes = new MFunçoes();
		
		System.out.println("O resultado da soma é: "+funcoes.soma(valores));
		System.out.println("O resultado da média é: "+funcoes.soma(valores));
		System.out.println("O maior valor valor é: "+funcoes.soma(valores));
		
	}

}
