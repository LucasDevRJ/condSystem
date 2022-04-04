package com.github.lucasdevrj.condsystem.funcionario;
/**
 * Classe que representa o Seguranša
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Seguranca extends Colaborador {

	public void vigiar(String local) {
		System.out.println("O seguranša " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta vigiando o " + local + ".");
	}
}
