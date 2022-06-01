package com.github.lucasdevrj.condsystem.funcionario;

import java.io.IOException;
import java.io.PrintWriter;

import com.github.lucasdevrj.condsystem.leituras.LeituraArquivo;

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
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			if (this.isEstaMontandoSerie() == false) {
				grava.println("Professor de Educa��o F�sica " + super.getInformacoesPessoais().getNome() + super.getInformacoesPessoais().getSobrenome() + " esta montando s�rie para o aluno.");
			} else {
				grava.println("Professor de Educa��o F�sica " + super.getInformacoesPessoais().getNome() + super.getInformacoesPessoais().getSobrenome() + " j� montou a s�rie para o aluno.");
			}
			
			grava.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		LeituraArquivo.lerArquivo();
	}
	/**
	 * M�todo para o Professor de Academia demonstrar um exerc�cio, com informa��es do Professor.
	 */
	public void demonstrarExercicio(ProfessorAcademia professor) {
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			grava.println("Professor de Educa��o F�sica " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta demonstrando o exerc�cio para o aluno.");
			
			grava.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		LeituraArquivo.lerArquivo();
	}

	public boolean isEstaMontandoSerie() {
		return estaMontandoSerie;
	}

	public void setEstaMontandoSerie(boolean estaMontandoSerie) {
		this.estaMontandoSerie = estaMontandoSerie;
	}
}
