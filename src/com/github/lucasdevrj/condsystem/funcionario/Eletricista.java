package com.github.lucasdevrj.condsystem.funcionario;

public class Eletricista extends Colaborador {

	public void trocaFiacao() {
		System.out.println("O eletricista " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta trocando a fia��o.");
	}
	
	public void consertaFiacao() {
		System.out.println("O eletricista " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta consertando a fia��o.");
	}
}
