package com.github.lucasdevrj.condsystem.funcionario;
/**
 * Classe que representa o Professor de Academia
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class ProfessorAcademia extends Colaborador {

	private boolean estaMontandoSerie;
	/**
	 * M�todo para o Professor de Academia montar a s�rie, que possui uma l�gica para verificar se a s�rie j� foi montada ou n�o.
	 */
	public void montarSerie() {
		if (this.isEstaMontandoSerie() == false) {
			System.out.println("Professor de Educa��o F�sica " + super.getInformacoesPessoais().getNome() + super.getInformacoesPessoais().getSobrenome() + " esta montando s�rie para o aluno.");
		} else {
			System.out.println("Professor de Educa��o F�sica " + super.getInformacoesPessoais().getNome() + super.getInformacoesPessoais().getSobrenome() + " j� montou a s�rie para o aluno.");
		}
	}
	/**
	 * M�todo para o Professor de Academia demonstrar um exerc�cio, com informa��es do Professor.
	 */
	public void demonstrarExercicio() {
		System.out.println("Professor de Educa��o F�sica " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta demonstrando o exerc�cio para o aluno.");
	}

	public boolean isEstaMontandoSerie() {
		return estaMontandoSerie;
	}

	public void setEstaMontandoSerie(boolean estaMontandoSerie) {
		this.estaMontandoSerie = estaMontandoSerie;
	}
}
