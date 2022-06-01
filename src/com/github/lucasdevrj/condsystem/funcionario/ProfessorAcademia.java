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
	 * Método para o Professor de Academia montar a série, que possui uma lógica para verificar se a série já foi montada ou não.
	 */
	public void montarSerie() {
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			if (this.isEstaMontandoSerie() == false) {
				grava.println("Professor de Educação Física " + super.getInformacoesPessoais().getNome() + super.getInformacoesPessoais().getSobrenome() + " esta montando série para o aluno.");
			} else {
				grava.println("Professor de Educação Física " + super.getInformacoesPessoais().getNome() + super.getInformacoesPessoais().getSobrenome() + " já montou a série para o aluno.");
			}
			
			grava.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		LeituraArquivo.lerArquivo();
	}
	/**
	 * Método para o Professor de Academia demonstrar um exercício, com informações do Professor.
	 */
	public void demonstrarExercicio(ProfessorAcademia professor) {
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			grava.println("Professor de Educação Física " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta demonstrando o exercício para o aluno.");
			
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
