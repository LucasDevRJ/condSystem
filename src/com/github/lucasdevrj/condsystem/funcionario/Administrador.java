package com.github.lucasdevrj.condsystem.funcionario;

import com.github.lucasdevrj.condsystem.financeiro.Financeiro;
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
		System.out.println("Informações do Colaborador");
		System.out.println("Informações Pessoais");
		System.out.println("Nome: " + colaborador.getInformacoesPessoais().getNome());
		System.out.println("Sobrenome: " + colaborador.getInformacoesPessoais().getSobrenome());
		System.out.println("Data de Nascimento: " + colaborador.getInformacoesPessoais().getDataNascimento());
		System.out.println("Naturalidade: " + colaborador.getInformacoesPessoais().getNaturalidade());
		System.out.println("Cidade Natal: " + colaborador.getInformacoesPessoais().getCidadeNatal());
		System.out.println("RG: " + colaborador.getInformacoesPessoais().getRg());
		System.out.println("CPF: " + colaborador.getInformacoesPessoais().getCpf());
		System.out.println("Informações do Endereço");
		System.out.println("País: " + colaborador.getEndereco().getPais());
		System.out.println("Cidade: " + colaborador.getEndereco().getCidade());
		System.out.println("Estado: " + colaborador.getEndereco().getEstado());
		System.out.println("Rua: " + colaborador.getEndereco().getRua());
		System.out.println("Número: " + colaborador.getEndereco().getNumero());
		System.out.println("CEP: " + colaborador.getEndereco().getCep());
		System.out.println("Ponto de Referência: " + colaborador.getEndereco().getPontoReferencia());
		System.out.println("Complemento: " + colaborador.getEndereco().getComplemento());
		System.out.println("Informações de Emprego");
		System.out.println("Cargo: " + colaborador.getProfissao().getCargo());
		System.out.println("Salário: " + colaborador.getProfissao().getSalario());
		System.out.println("Turno: " + colaborador.getProfissao().getTurno());
	}
	/**
	 * Método para acessar o Financeiro do Condomínio, passando como parâmetro a Classe Financeiro e sua referência.
	 */
	@Override
	public void acessarFinanceiro(Financeiro financeiro) {
		System.out.println("Situação Financeira do Condomínio");
		System.out.println("Total de Despesa: R$ " + financeiro.getDespesa().getTotal());
		System.out.println("Total de Custo: R$ " + financeiro.getCusto().getTotal());
		System.out.println("Total de Receita: R$ " + financeiro.getReceita().getTotal());
		System.out.println("Lucro Total: R$ " + financeiro.getLucro());
	}
	/**
	 * Método para acessar as informações de algum Morador, passando como parâmetro a Classe Morador e sua referência.
	 */
	@Override
	public void acessarInformacoesMorador(Morador morador) {
		System.out.println("Informações do Morador");
		System.out.println("Informações Pessoais");
		System.out.println("Nome: " + morador.getInformacoesPessoais().getNome());
		System.out.println("Sobrenome: " + morador.getInformacoesPessoais().getSobrenome());
		System.out.println("Data de Nascimento: " + morador.getInformacoesPessoais().getDataNascimento());
		System.out.println("Naturalidade: " + morador.getInformacoesPessoais().getNaturalidade());
		System.out.println("Cidade Natal: " + morador.getInformacoesPessoais().getCidadeNatal());
		System.out.println("Profissão: " + morador.getProfissao().getCargo());
		System.out.println("RG: " + morador.getInformacoesPessoais().getRg());
		System.out.println("CPF: " + morador.getInformacoesPessoais().getCpf());
		System.out.println("Informações de Emprego");
		System.out.println("Cargo: " + morador.getProfissao().getCargo());
		System.out.println("Salário: " + morador.getProfissao().getSalario());
		System.out.println("Turno: " + morador.getProfissao().getTurno());
		System.out.println("Informações do Apartamento");
		System.out.println("Bloco: " + morador.getApartamento().getBloco());
		System.out.println("Número: " + morador.getApartamento().getNumero());
		System.out.println("Tamanho: " + morador.getApartamento().getTamanho());
		System.out.println("Número de Quartos: " + morador.getApartamento().getNumeroQuartos());
		System.out.println("Número de Banheiros: " + morador.getApartamento().getNumeroBanheiros());
		System.out.println("Número de Vagas para Carro: " + morador.getApartamento().getNumeroVagasCarro());
		System.out.println("Descrição: " + morador.getApartamento().getDescricao());
		System.out.println("Preço Aluguel: " + morador.getApartamento().getPrecoAluguel());
		if (morador.isEhProprietario() == true) {
			System.out.println("É Proprietário: Sim");
		} else {
			System.out.println("É Proprietário: Não");
		}
	}
	/**
	 * Método para agendar reunião do Condomínio, passando como parâmetro uma String e sua referência.
	 */
	@Override
	public void agendarReuniao(String data) {
		System.out.println("A reunião do condomínio foi agendada para a data: " + data + "! Por favor todos compareçam!");
	}
}
