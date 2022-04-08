package com.github.lucasdevrj.condsystem.enumerador;
/**
 * Enumerador do Projeto
 * @author Lucas Pereira de Lima
 * @version 1.0
 */

public enum Blocos {
	/**Variável constante que é o Bloco do Condomínio.*/
	BLOCO_A("Bloco A"),
	/**Variável constante que é o Bloco do Condomínio.*/
	BLOCO_B("Bloco B"), 
	/**Variável constante que é o Bloco do Condomínio.*/
	BLOCO_C("Bloco C");
	
	private String bloco;
	
	Blocos(String bloco) {
		this.bloco = bloco;
	}
	
	public String getBloco() {
		return bloco;
	}
}
