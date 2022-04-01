package com.github.lucasdevrj.condsystem.funcionario;

public class Jardineiro extends Colaborador {

	private boolean jardinagemEstaGrande;
	
	public void jardinar() {
		if (this.isJardinagemEstaGrande() == true) {
			System.out.println("O jardineiro " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta jardinando.");
		} else {
			System.out.println("A jardinagem não está grande o suficiente!");
		}
	}

	public boolean isJardinagemEstaGrande() {
		return jardinagemEstaGrande;
	}

	public void setJardinagemEstaGrande(boolean jardinagemEstaGrande) {
		this.jardinagemEstaGrande = jardinagemEstaGrande;
	}
}
