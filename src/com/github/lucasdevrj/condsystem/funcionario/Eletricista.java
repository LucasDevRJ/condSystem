package com.github.lucasdevrj.condsystem.funcionario;
/**
 * Classe que representa o Eletricista
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Eletricista extends Colaborador {
	/**
	 * Método para o Eletricista trocar a fiação, exibindo uma mensagem com informações do Eletricista.
	 */
	public void trocaFiacao() {
		System.out.println("O eletricista " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta trocando a fiação.");
	}
	/**
	 * Método para o Eletricista consertar a fiação, exibindo uma mensagem com informações do Eletricista.
	 */
	public void consertaFiacao() {
		System.out.println("O eletricista " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta consertando a fiação.");
	}
}
