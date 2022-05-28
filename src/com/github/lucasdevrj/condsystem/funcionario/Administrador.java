package com.github.lucasdevrj.condsystem.funcionario;

import com.github.lucasdevrj.condsystem.financeiro.Financeiro;
import com.github.lucasdevrj.condsystem.gravacoes.GravarArquivoAdministrador;
import com.github.lucasdevrj.condsystem.leituras.LeituraArquivo;
import com.github.lucasdevrj.condsystem.morador.Morador;
import com.github.lucasdevrj.condsystem.sistemacondominio.CondSystem;
/**
 * Classe que representa o Administrador
 * @author Lucas Pereira de Lima
 * @version 1.0
 */

public class Administrador extends Colaborador implements CondSystem {
	/**
	 * Método reescrito para acessar todas as informações de algum Colaborador. Passando como parâmetro a classe Colaborador e sua referência.
	 */
	@Override
	public void acessarInformacoesColaborador(Colaborador colaborador) {
		GravarArquivoAdministrador.gravaAcessoInformacoesColaborador(colaborador);
		LeituraArquivo.lerArquivo();
	}
	/**
	 * Método para acessar o Financeiro do Condomínio, passando como parâmetro a Classe Financeiro e sua referência.
	 */
	@Override
	public void acessarFinanceiro(Financeiro financeiro) {
		GravarArquivoAdministrador.gravarAcessoFinanceiro(financeiro);
		LeituraArquivo.lerArquivo();
	}
	/**
	 * Método para acessar as informações de algum Morador, passando como parâmetro a Classe Morador e sua referência.
	 */
	@Override
	public void acessarInformacoesMorador(Morador morador) {
		GravarArquivoAdministrador.gravarAcessoInformacoesMorador(morador);
		LeituraArquivo.lerArquivo();
	}
	/**
	 * Método para agendar reunião do Condomínio, passando como parâmetro uma String e sua referência.
	 */
	@Override
	public void agendarReuniao(String data) {
		data = data.trim();
		
		data = data.replaceAll("[^0-9]", "");
		
		data = data.substring(0,2) + "/" + data.substring(2,4) + "/" + data.substring(4,8);
		
		if (data.length() == 0) {
			throw new NullPointerException("Insira o CPF, por favor!");
		}
		
		if (data.length() > 11) {
			throw new StringIndexOutOfBoundsException("Digite a data de nascimento completa, por favor!");
		}
		
		GravarArquivoAdministrador.gravaAgendamentoReuniao(data);
		LeituraArquivo.lerArquivo();
	}
}
