package com.github.lucasdevrj.condsystem.funcionario;
/**
 * Classe que representa o Eletricista
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Eletricista extends Colaborador {
	/**
	 * M�todo para o Eletricista trocar a fia��o, exibindo uma mensagem com informa��es do Eletricista.
	 */
	public void trocaFiacao() {
		System.out.println("O eletricista " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta trocando a fia��o.");
	}
	/**
	 * M�todo para o Eletricista consertar a fia��o, exibindo uma mensagem com informa��es do Eletricista.
	 */
	public void consertaFiacao() {
		System.out.println("O eletricista " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta consertando a fia��o.");
	}
}
