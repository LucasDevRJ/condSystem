package com.github.lucasdevrj.condsystem.funcionario;

import java.io.IOException;
import java.io.PrintWriter;

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
	public void trocaFiacao() {
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			grava.println("O eletricista " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta trocando a fia��o.");
			
			grava.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		LeituraArquivo.lerArquivo();
	}
	/**
	 * M�todo para o Eletricista consertar a fia��o, exibindo uma mensagem com informa��es do Eletricista.
	 */
	public void consertaFiacao() {
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			grava.println("O eletricista " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta consertando a fia��o.");
			
			grava.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		LeituraArquivo.lerArquivo();
	}
}
