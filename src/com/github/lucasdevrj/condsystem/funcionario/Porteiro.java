package com.github.lucasdevrj.condsystem.funcionario;

import com.github.lucasdevrj.condsystem.gravacoes.GravarArquivoPorteiro;
import com.github.lucasdevrj.condsystem.leituras.LeituraArquivo;

/**
 * Classe que representa o Porteiro
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Porteiro extends Colaborador {
	
	private static boolean portaEstaAberta;
	private static boolean portaoEstaAberto;
	/**
	 * Método para o Porteiro abrir a porta, que possui uma lógica para verificar se a porta esta aberta ou fechada.
	 */
	public void abrirPorta() {
		GravarArquivoPorteiro.gravarAberturaPorta();
		LeituraArquivo.lerArquivo();
	}
	/**
	 * Método para o Porteiro abrir o portão, que possui uma lógica para verificar se a portão esta aberta ou fechada.
	 */
	public void abrirPortao() {
		GravarArquivoPorteiro.gravarAberturaPortao();
		LeituraArquivo.lerArquivo();
	}
	
	public static boolean isPortaEstaAberta() {
		return portaEstaAberta;
	}
	
	public static void setPortaEstaAberta(boolean portaEstaAberta) {
		Porteiro.portaEstaAberta = portaEstaAberta;
	}
	
	public static boolean isPortaoEstaAberto() {
		return portaoEstaAberto;
	}
	
	public static void setPortaoEstaAberto(boolean portaoEstaAberto) {
		Porteiro.portaoEstaAberto = portaoEstaAberto;
	}
}
