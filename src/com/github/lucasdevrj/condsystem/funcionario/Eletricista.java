package com.github.lucasdevrj.condsystem.funcionario;

import com.github.lucasdevrj.condsystem.gravacoes.GravarArquivoEletricista;
import com.github.lucasdevrj.condsystem.leituras.LeituraArquivo;

/**
 * Classe que representa o Eletricista
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Eletricista extends Colaborador {
	/**
	 * Método para o Eletricista trocar a fiação, exibindo uma mensagem com informações do Eletricista.
	 */
	public void trocaFiacao() {
		GravarArquivoEletricista.gravarTrocaFiacao();
		LeituraArquivo.lerArquivo();
	}
	/**
	 * Método para o Eletricista consertar a fiação, exibindo uma mensagem com informações do Eletricista.
	 */
	public void consertaFiacao() {
		GravarArquivoEletricista.gravarConsertoFiacao();
		LeituraArquivo.lerArquivo();
	}
}
