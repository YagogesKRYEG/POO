package br.com.exemplo.basico;

import com.matematica.funcoes;

import br.com.usarclasses.MFun�oes;

public class UsarFun�oes {

	public static void main(String[] args) {
		// vamos declarar um array de valores 
		//do tipo double e passar as funcoes
		double[] valores = {15, 32, 56, 80, 11};
		
		MFun�oes funcoes = new MFun�oes();
		
		System.out.println("O resultado da soma �: "+funcoes.soma(valores));
		System.out.println("O resultado da m�dia �: "+funcoes.soma(valores));
		System.out.println("O maior valor valor �: "+funcoes.soma(valores));
		
	}

}
