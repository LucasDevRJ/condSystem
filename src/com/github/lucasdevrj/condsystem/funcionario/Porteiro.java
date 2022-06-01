package com.github.lucasdevrj.condsystem.funcionario;

import java.io.IOException;
import java.io.PrintWriter;

import com.github.lucasdevrj.condsystem.leituras.LeituraArquivo;

/**
 * Classe que representa o Porteiro
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Porteiro extends Colaborador {
	
	private boolean portaEstaAberta;
	private boolean portaoEstaAberto;
	/**
	 * Método para o Porteiro abrir a porta, que possui uma lógica para verificar se a porta esta aberta ou fechada.
	 */
	public void abrirPorta() {
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			if (this.isPortaEstaAberta() == false) {
				grava.println("O porteiro " + super.getInformacoesPessoais().getNome() +  " " + super.getInformacoesPessoais().getSobrenome() + " abriu a porta.");
				this.setPortaEstaAberta(true);
			} else {
				grava.println("A porta já esta aberta!");
			}
			
			grava.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		LeituraArquivo.lerArquivo();
	}
	/**
	 * Método para o Porteiro abrir o portão, que possui uma lógica para verificar se a portão esta aberta ou fechada.
	 */
	public void abrirPortao() {
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			if (this.isPortaoEstaAberto() == false) {
				grava.println("O porteiro " + super.getInformacoesPessoais().getNome() +  " " + super.getInformacoesPessoais().getSobrenome() + " abriu o portão.");
				this.setPortaoEstaAberto(true);
			} else {
				grava.println("O portão já esta aberto!");
			}
			
			grava.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		LeituraArquivo.lerArquivo();
	}
	
	public boolean isPortaEstaAberta() {
		return portaEstaAberta;
	}
	
	public void setPortaEstaAberta(boolean portaEstaAberta) {
		this.portaEstaAberta = portaEstaAberta;
	}
	
	public boolean isPortaoEstaAberto() {
		return portaoEstaAberto;
	}
	
	public void setPortaoEstaAberto(boolean portaoEstaAberto) {
		this.portaoEstaAberto = portaoEstaAberto;
	}
}
