package com.github.lucasdevrj.condsystem.funcionario;

import com.github.lucasdevrj.condsystem.gravacoes.GravarArquivoProfessorAcademia;
import com.github.lucasdevrj.condsystem.leituras.LeituraArquivo;

/**
 * Classe que representa o Professor de Academia
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class ProfessorAcademia extends Colaborador {

	private static boolean estaMontandoSerie;
	/**
	 * M�todo para o Professor de Academia montar a s�rie, que possui uma l�gica para verificar se a s�rie j� foi montada ou n�o.
	 */
	public void montarSerie(ProfessorAcademia professor) {
		GravarArquivoProfessorAcademia.gravacaoMontagemSerie(professor);
		LeituraArquivo.lerArquivo();
	}
	/**
	 * M�todo para o Professor de Academia demonstrar um exerc�cio, com informa��es do Professor.
	 */
	public void demonstrarExercicio(ProfessorAcademia professor) {
		GravarArquivoProfessorAcademia.gravarDemonstracaoExercicio(professor);
		LeituraArquivo.lerArquivo();
	}

	public static boolean isEstaMontandoSerie() {
		return estaMontandoSerie;
	}

	public void setEstaMontandoSerie(boolean estaMontandoSerie) {
		this.estaMontandoSerie = estaMontandoSerie;
	}
}
