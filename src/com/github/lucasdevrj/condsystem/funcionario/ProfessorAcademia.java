package com.github.lucasdevrj.condsystem.funcionario;
/**
 * Classe que representa o Professor de Academia
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class ProfessorAcademia extends Colaborador {

	private boolean estaMontandoSerie;
	/**
	 * Método para o Professor de Academia montar a série, que possui uma lógica para verificar se a série já foi montada ou não.
	 */
	public void montarSerie() {
		if (this.isEstaMontandoSerie() == false) {
			System.out.println("Professor de Educação Física " + super.getInformacoesPessoais().getNome() + super.getInformacoesPessoais().getSobrenome() + " esta montando série para o aluno.");
		} else {
			System.out.println("Professor de Educação Física " + super.getInformacoesPessoais().getNome() + super.getInformacoesPessoais().getSobrenome() + " já montou a série para o aluno.");
		}
	}
	/**
	 * Método para o Professor de Academia demonstrar um exercício, com informações do Professor.
	 */
	public void demonstrarExercicio() {
		System.out.println("Professor de Educação Física " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta demonstrando o exercício para o aluno.");
	}

	public boolean isEstaMontandoSerie() {
		return estaMontandoSerie;
	}

	public void setEstaMontandoSerie(boolean estaMontandoSerie) {
		this.estaMontandoSerie = estaMontandoSerie;
	}
}
