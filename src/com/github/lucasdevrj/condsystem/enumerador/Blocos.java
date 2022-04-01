package com.github.lucasdevrj.condsystem.enumerador;

public enum Blocos {

	BLOCO1("Bloco A"), BLOCO2("Bloco B"), BLOCO3("Bloco C");
	
	private String bloco;
	
	Blocos(String bloco) {
		this.bloco = bloco;
	}
	
	public String getBloco() {
		return bloco;
	}
}
