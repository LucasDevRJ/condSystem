package com.github.lucasdevrj.condsystem.funcionario;

import java.io.IOException;
import java.io.PrintWriter;

import com.github.lucasdevrj.condsystem.leituras.LeituraArquivo;

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
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			if (this.isJardinagemEstaGrande() == true) {
				grava.println("O jardineiro " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta jardinando.");
			} else {
				grava.println("A jardinagem n�o est� grande o suficiente!");
			}
			
			grava.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		LeituraArquivo.lerArquivo();
	}

	public boolean isJardinagemEstaGrande() {
		return jardinagemEstaGrande;
	}

	public void setJardinagemEstaGrande(boolean jardinagemEstaGrande) {
		this.jardinagemEstaGrande = jardinagemEstaGrande;
	}
}
