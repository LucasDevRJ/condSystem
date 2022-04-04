package com.github.lucasdevrj.condsystem.funcionario;
/**
 * Classe que representa o Jardineiro
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Jardineiro extends Colaborador {

	private boolean jardinagemEstaGrande;
	/**
	 * M�todo para o Jardineiro jardinar, que possui uma l�gica para verificar se a jardinagem esta grande ou n�o.
	 */
	public void jardinar() {
		if (this.isJardinagemEstaGrande() == true) {
			System.out.println("O jardineiro " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta jardinando.");
		} else {
			System.out.println("A jardinagem n�o est� grande o suficiente!");
		}
	}

	public boolean isJardinagemEstaGrande() {
		return jardinagemEstaGrande;
	}

	public void setJardinagemEstaGrande(boolean jardinagemEstaGrande) {
		this.jardinagemEstaGrande = jardinagemEstaGrande;
	}
}
