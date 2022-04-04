package com.github.lucasdevrj.condsystem.sistemacondominio;

import com.github.lucasdevrj.condsystem.funcionario.Colaborador;
import com.github.lucasdevrj.condsystem.morador.Morador;
import com.github.lucasdevrj.condsystem.financeiro.Financeiro;
/**
 * Classe que representa o Sistema do Condom�nio
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public interface CondSystem {
	/**
	 * M�todo abstrato para acessar informa��es do Colaborador, passando como par�metro a classe Colaborador e sua respectiva refer�ncia.
	 * @param colaborador
	 */
	public abstract void acessarInformacoesColaborador(Colaborador colaborador);
	/**
	 * M�todo abstrato para acessar informa��es do Morador, passando como par�metro a classe Morador e sua respectiva refer�ncia.
	 * @param morador
	 */
	public abstract void acessarInformacoesMorador(Morador morador);
	/**
	 * M�todo abstrato para acessar informa��es do Financeiro, passando como par�metro a classe Financeiro e sua respectiva refer�ncia.
	 * @param financeiro
	 */
	public abstract void acessarFinanceiro(Financeiro financeiro);
	/**
	 * M�todo abstrato para agendar reuni�es do Condom�nio, passando como par�metro uma String e sua refer�ncia.
	 * @param data
	 */
	public abstract void agendarReuniao(String data);
}
