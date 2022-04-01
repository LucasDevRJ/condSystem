package com.github.lucasdevrj.condsystem.funcionario;

public class Seguranca extends Colaborador {

	public void vigiar(String local) {
		System.out.println("O segurança " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta vigiando o " + local + ".");
	}
}
