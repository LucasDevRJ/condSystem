package com.github.lucasdevrj.condsystem.anotacoes;
/**
 * Anota��es do Projeto
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public @interface Autor {

	String autor() default "Lucas Pereira de Lima";
	
	String gitHub() default "LucasDevRJ";
}
