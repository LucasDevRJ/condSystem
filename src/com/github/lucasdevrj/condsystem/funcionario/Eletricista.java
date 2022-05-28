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
	 * M�todo para o Eletricista trocar a fia��o, exibindo uma mensagem com informa��es do Eletricista.
	 */
	public void trocaFiacao(Eletricista eletricista) {
		GravarArquivoEletricista.gravarTrocaFiacao(eletricista);
		LeituraArquivo.lerArquivo();
	}
	/**
	 * M�todo para o Eletricista consertar a fia��o, exibindo uma mensagem com informa��es do Eletricista.
	 */
	public void consertaFiacao(Eletricista eletricista) {
		GravarArquivoEletricista.gravarConsertoFiacao(eletricista);
		LeituraArquivo.lerArquivo();
	}
}
