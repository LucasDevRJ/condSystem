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
	 * Método para o Eletricista trocar a fiação, exibindo uma mensagem com informações do Eletricista.
	 */
	public void trocaFiacao() {
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			grava.println("O eletricista " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta trocando a fiação.");
			
			grava.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		LeituraArquivo.lerArquivo();
	}
	/**
	 * Método para o Eletricista consertar a fiação, exibindo uma mensagem com informações do Eletricista.
	 */
	public void consertaFiacao() {
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			grava.println("O eletricista " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta consertando a fiação.");
			
			grava.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		LeituraArquivo.lerArquivo();
	}
}
