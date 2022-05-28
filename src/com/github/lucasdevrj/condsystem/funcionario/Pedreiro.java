package com.github.lucasdevrj.condsystem.funcionario;

import com.github.lucasdevrj.condsystem.gravacoes.GravarArquivoEletricista;
import com.github.lucasdevrj.condsystem.gravacoes.GravarArquivoPedreiro;
import com.github.lucasdevrj.condsystem.leituras.LeituraArquivo;

/**
 * Classe que representa o Pedreiro
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Pedreiro extends Colaborador {

	private static boolean estaConsertado;
	private static boolean foiConstruido;
	/**
	 * Método para o Pedreiro consertar algo, que possui uma lógica para verificar se o objeto esta consertado ou não.
	 */
	public void consertar(Pedreiro pedreiro, String oQue) {
		GravarArquivoPedreiro.gravaConserto(pedreiro, oQue);
		LeituraArquivo.lerArquivo();
	}
	/**
	 * Método para o Pedreiro construir algo, que possui uma lógica para verificar se já foi construido ou não.
	 */
	public void construir(Pedreiro pedreiro, String oQue) {
		GravarArquivoPedreiro.gravaConstrucao(pedreiro, oQue);
		LeituraArquivo.lerArquivo();
	}
	
	public static boolean isEstaConsertado() {
		return estaConsertado;
	}
	
	public static void setEstaConsertado(boolean estaConsertado) {
		Pedreiro.estaConsertado = estaConsertado;
	}
	
	public static boolean isFoiConstruido() {
		return foiConstruido;
	}
	
	public static void setFoiConstruido(boolean foiConstruido) {
		Pedreiro.foiConstruido = foiConstruido;
	}
}
