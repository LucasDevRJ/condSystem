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
	 * Método para o Professor de Academia montar a série, que possui uma lógica para verificar se a série já foi montada ou não.
	 */
	public void montarSerie(ProfessorAcademia professor) {
		GravarArquivoProfessorAcademia.gravacaoMontagemSerie(professor);
		LeituraArquivo.lerArquivo();
	}
	/**
	 * Método para o Professor de Academia demonstrar um exercício, com informações do Professor.
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
