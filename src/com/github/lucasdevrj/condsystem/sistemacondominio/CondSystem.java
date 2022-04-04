package com.github.lucasdevrj.condsystem.sistemacondominio;

import com.github.lucasdevrj.condsystem.funcionario.Colaborador;
import com.github.lucasdevrj.condsystem.morador.Morador;
import com.github.lucasdevrj.condsystem.financeiro.Financeiro;
/**
 * Classe que representa o Sistema do Condomínio
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public interface CondSystem {
	/**
	 * Método abstrato para acessar informações do Colaborador, passando como parâmetro a classe Colaborador e sua respectiva referência.
	 * @param colaborador
	 */
	public abstract void acessarInformacoesColaborador(Colaborador colaborador);
	/**
	 * Método abstrato para acessar informações do Morador, passando como parâmetro a classe Morador e sua respectiva referência.
	 * @param morador
	 */
	public abstract void acessarInformacoesMorador(Morador morador);
	/**
	 * Método abstrato para acessar informações do Financeiro, passando como parâmetro a classe Financeiro e sua respectiva referência.
	 * @param financeiro
	 */
	public abstract void acessarFinanceiro(Financeiro financeiro);
	/**
	 * Método abstrato para agendar reuniões do Condomínio, passando como parâmetro uma String e sua referência.
	 * @param data
	 */
	public abstract void agendarReuniao(String data);
}
