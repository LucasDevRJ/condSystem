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
	 * M�todo reescrito para acessar todas as informa��es de algum Colaborador. Passando como par�metro a classe Colaborador e sua refer�ncia.
	 */
	@Override
	public void acessarInformacoesColaborador(Colaborador colaborador) {
		GravarArquivoAdministrador.gravaAcessoInformacoesColaborador(colaborador);
		LeituraArquivo.lerArquivo();
	}
	/**
	 * M�todo para acessar o Financeiro do Condom�nio, passando como par�metro a Classe Financeiro e sua refer�ncia.
	 */
	@Override
	public void acessarFinanceiro(Financeiro financeiro) {
		GravarArquivoAdministrador.gravarAcessoFinanceiro(financeiro);
		LeituraArquivo.lerArquivo();
	}
	/**
	 * M�todo para acessar as informa��es de algum Morador, passando como par�metro a Classe Morador e sua refer�ncia.
	 */
	@Override
	public void acessarInformacoesMorador(Morador morador) {
		GravarArquivoAdministrador.gravarAcessoInformacoesMorador(morador);
		LeituraArquivo.lerArquivo();
	}
	/**
	 * M�todo para agendar reuni�o do Condom�nio, passando como par�metro uma String e sua refer�ncia.
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
