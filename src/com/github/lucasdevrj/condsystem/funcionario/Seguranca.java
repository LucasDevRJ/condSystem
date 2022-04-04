package com.github.lucasdevrj.condsystem.funcionario;
/**
 * Classe que representa o Seguran�a
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Seguranca extends Colaborador {

	public void vigiar(String local) {
		System.out.println("O seguran�a " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta vigiando o " + local + ".");
	}
}
