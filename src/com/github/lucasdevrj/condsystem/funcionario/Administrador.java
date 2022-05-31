package com.github.lucasdevrj.condsystem.funcionario;

import java.io.IOException;
import java.io.PrintWriter;

import com.github.lucasdevrj.condsystem.financeiro.Financeiro;
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
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			grava.println("Informações do Colaborador");
			grava.println("Informações Pessoais");
			grava.println("Nome: " + colaborador.getInformacoesPessoais().getNome());
			grava.println("Sobrenome: " + colaborador.getInformacoesPessoais().getSobrenome());
			grava.println("Data de Nascimento: " + colaborador.getInformacoesPessoais().getDataNascimento());
			grava.println("Naturalidade: " + colaborador.getInformacoesPessoais().getNaturalidade());
			grava.println("Cidade Natal: " + colaborador.getInformacoesPessoais().getCidadeNatal());
			grava.println("RG: " + colaborador.getInformacoesPessoais().getRg());
			grava.println("CPF: " + colaborador.getInformacoesPessoais().getCpf());
			grava.println("Informações do Endereço");
			grava.println("País: " + colaborador.getEndereco().getPais());
			grava.println("Cidade: " + colaborador.getEndereco().getCidade());
			grava.println("Estado: " + colaborador.getEndereco().getEstado());
			grava.println("Rua: " + colaborador.getEndereco().getRua());
			grava.println("Número: " + colaborador.getEndereco().getNumero());
			grava.println("CEP: " + colaborador.getEndereco().getCep());
			grava.println("Ponto de Referência: " + colaborador.getEndereco().getPontoReferencia());
			grava.println("Complemento: " + colaborador.getEndereco().getComplemento());
			grava.println("Informações de Emprego");
			grava.println("Cargo: " + colaborador.getProfissao().getCargo());
			grava.println("Salário: " + colaborador.getProfissao().getSalario());
			grava.println("Turno: " + colaborador.getProfissao().getTurno());
			
			grava.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		
		LeituraArquivo.lerArquivo();
	}
	/**
	 * Método para acessar o Financeiro do Condomínio, passando como parâmetro a Classe Financeiro e sua referência.
	 */
	@Override
	public void acessarFinanceiro(Financeiro financeiro) {
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			grava.println("Situação Financeira do Condomínio");
			grava.println("Total de Despesa: R$ " + financeiro.getDespesa().getTotal());
			grava.println("Total de Custo: R$ " + financeiro.getCusto().getTotal());
			grava.println("Total de Receita: R$ " + financeiro.getReceita().getTotal());
			grava.println("Lucro Total: R$ " + financeiro.getLucro());
			
			grava.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		LeituraArquivo.lerArquivo();
	}
	/**
	 * Método para acessar as informações de algum Morador, passando como parâmetro a Classe Morador e sua referência.
	 */
	@Override
	public void acessarInformacoesMorador(Morador morador) {
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			grava.println("Informações do Morador");
			grava.println("Informações Pessoais");
			grava.println("Nome: " + morador.getInformacoesPessoais().getNome());
			grava.println("Sobrenome: " + morador.getInformacoesPessoais().getSobrenome());
			grava.println("Data de Nascimento: " + morador.getInformacoesPessoais().getDataNascimento());
			grava.println("Naturalidade: " + morador.getInformacoesPessoais().getNaturalidade());
			grava.println("Cidade Natal: " + morador.getInformacoesPessoais().getCidadeNatal());
			grava.println("Profissão: " + morador.getProfissao().getCargo());
			grava.println("RG: " + morador.getInformacoesPessoais().getRg());
			grava.println("CPF: " + morador.getInformacoesPessoais().getCpf());
			grava.println("Informações de Emprego");
			grava.println("Cargo: " + morador.getProfissao().getCargo());
			grava.println("Salário: " + morador.getProfissao().getSalario());
			grava.println("Turno: " + morador.getProfissao().getTurno());
			grava.println("Informações do Apartamento");
			grava.println("Bloco: " + morador.getApartamento().getBloco());
			grava.println("Número: " + morador.getApartamento().getNumero());
			grava.println("Tamanho: " + morador.getApartamento().getTamanho());
			grava.println("Número de Quartos: " + morador.getApartamento().getNumeroQuartos());
			grava.println("Número de Banheiros: " + morador.getApartamento().getNumeroBanheiros());
			grava.println("Número de Vagas para Carro: " + morador.getApartamento().getNumeroVagasCarro());
			grava.println("Descrição: " + morador.getApartamento().getDescricao());
			grava.println("Preço Aluguel: " + morador.getApartamento().getPrecoAluguel());
			
			if (morador.isEhProprietario() == true) {
				grava.println("É Proprietário: Sim");
			} else {
				grava.println("É Proprietário: Não");
			}
			
			grava.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
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
		
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			grava.println("A reunião do condomínio foi agendada para a data: " + data + "! Por favor todos compareçam!");
			
			grava.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		LeituraArquivo.lerArquivo();
	}
}
