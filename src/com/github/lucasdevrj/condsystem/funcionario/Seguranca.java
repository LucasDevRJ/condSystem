package com.github.lucasdevrj.condsystem.funcionario;

import com.github.lucasdevrj.condsystem.gravacoes.GravarArquivoSeguranca;
import com.github.lucasdevrj.condsystem.leituras.LeituraArquivo;

/**
 * Classe que representa o Seguran�a
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Seguranca extends Colaborador {
	/**
	 * M�todo para o Seguran�a vigiar algum local, passando informa��es do Seguran�a.
	 */
	public void vigiar(String local) {
		GravarArquivoSeguranca.gravarVigio(local);
		LeituraArquivo.lerArquivo();
	}
}
