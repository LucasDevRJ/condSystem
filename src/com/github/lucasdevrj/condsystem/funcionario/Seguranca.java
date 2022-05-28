package com.github.lucasdevrj.condsystem.funcionario;

import com.github.lucasdevrj.condsystem.gravacoes.GravarArquivoSeguranca;
import com.github.lucasdevrj.condsystem.leituras.LeituraArquivo;

/**
 * Classe que representa o Segurança
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Seguranca extends Colaborador {
	/**
	 * Método para o Segurança vigiar algum local, passando informações do Segurança.
	 */
	public void vigiar(String local) {
		GravarArquivoSeguranca.gravarVigio(local);
		LeituraArquivo.lerArquivo();
	}
}
