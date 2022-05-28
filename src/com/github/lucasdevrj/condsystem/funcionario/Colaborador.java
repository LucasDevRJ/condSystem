package com.github.lucasdevrj.condsystem.funcionario;

import com.github.lucasdevrj.condsystem.informacoespessoais.InformacoesPessoais;
import com.github.lucasdevrj.condsystem.informacoespessoais.Endereco;
import com.github.lucasdevrj.condsystem.informacoespessoais.Profissao;
import com.github.lucasdevrj.condsystem.leituras.LeituraArquivo;

import java.util.Comparator;

import com.github.lucasdevrj.condsystem.contabancaria.Conta;
import com.github.lucasdevrj.condsystem.gravacoes.GravarArquivoAdministrador;
import com.github.lucasdevrj.condsystem.gravacoes.GravarArquivoColaborador;
/**
 * Classe que representa o Colaborador n�o especifico
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public abstract class Colaborador {

	private static InformacoesPessoais informacoesPessoais;
	private Endereco endereco;
	private Profissao profissao;
	private Conta titular;
	
	/**
	 * M�todo para receber sal�rio, pegando a Conta do funcion�rio e adicionando o sal�rio nela.
	 */
	public void receberSalario(Colaborador colaborador) {
		titular.setSaldo(titular.getSaldo() + profissao.getSalario());
		GravarArquivoColaborador.gravaRecebimentoSalario(colaborador);
		LeituraArquivo.lerArquivo();
	}

	public static InformacoesPessoais getInformacoesPessoais() {
		return informacoesPessoais;
	}

	public void setInformacoesPessoais(InformacoesPessoais informacoesPessoais) {
		this.informacoesPessoais = informacoesPessoais;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}

	public Conta getTitular() {
		return titular;
	}

	public void setTitular(Conta titular) {
		this.titular = titular;
	}
}
