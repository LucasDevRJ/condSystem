package com.github.lucasdevrj.condsystem.funcionario;

import com.github.lucasdevrj.condsystem.gravacoes.GravarArquivoJardineiro;
import com.github.lucasdevrj.condsystem.leituras.LeituraArquivo;

/**
 * Classe que representa o Jardineiro
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Jardineiro extends Colaborador {

	private static boolean jardinagemEstaGrande;
	/**
	 * M�todo para o Jardineiro jardinar, que possui uma l�gica para verificar se a jardinagem esta grande ou n�o.
	 */
	public void jardinar() {
		GravarArquivoJardineiro.gravarJardinagem();
		LeituraArquivo.lerArquivo();
	}

	public static boolean isJardinagemEstaGrande() {
		return jardinagemEstaGrande;
	}

	public void setJardinagemEstaGrande(boolean jardinagemEstaGrande) {
		this.jardinagemEstaGrande = jardinagemEstaGrande;
	}
}
