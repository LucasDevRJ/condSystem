package com.github.lucasdevrj.condsystem.enumerador;
/**
 * Enumerador do Projeto
 * @author Lucas Pereira de Lima
 * @version 1.0
 */

public enum Blocos {
	/**Vari�vel constante que � o Bloco do Condom�nio.*/
	BLOCO1("Bloco A"),
	/**Vari�vel constante que � o Bloco do Condom�nio.*/
	BLOCO2("Bloco B"), 
	/**Vari�vel constante que � o Bloco do Condom�nio.*/
	BLOCO3("Bloco C");
	
	private String bloco;
	
	Blocos(String bloco) {
		this.bloco = bloco;
	}
	
	public String getBloco() {
		return bloco;
	}
}
