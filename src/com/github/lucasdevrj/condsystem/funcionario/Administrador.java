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
	 * M�todo reescrito para acessar todas as informa��es de algum Colaborador. Passando como par�metro a classe Colaborador e sua refer�ncia.
	 */
	@Override
	public void acessarInformacoesColaborador(Colaborador colaborador) {
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			grava.println("Informa��es do Colaborador");
			grava.println("Informa��es Pessoais");
			grava.println("Nome: " + colaborador.getInformacoesPessoais().getNome());
			grava.println("Sobrenome: " + colaborador.getInformacoesPessoais().getSobrenome());
			grava.println("Data de Nascimento: " + colaborador.getInformacoesPessoais().getDataNascimento());
			grava.println("Naturalidade: " + colaborador.getInformacoesPessoais().getNaturalidade());
			grava.println("Cidade Natal: " + colaborador.getInformacoesPessoais().getCidadeNatal());
			grava.println("RG: " + colaborador.getInformacoesPessoais().getRg());
			grava.println("CPF: " + colaborador.getInformacoesPessoais().getCpf());
			grava.println("Informa��es do Endere�o");
			grava.println("Pa�s: " + colaborador.getEndereco().getPais());
			grava.println("Cidade: " + colaborador.getEndereco().getCidade());
			grava.println("Estado: " + colaborador.getEndereco().getEstado());
			grava.println("Rua: " + colaborador.getEndereco().getRua());
			grava.println("N�mero: " + colaborador.getEndereco().getNumero());
			grava.println("CEP: " + colaborador.getEndereco().getCep());
			grava.println("Ponto de Refer�ncia: " + colaborador.getEndereco().getPontoReferencia());
			grava.println("Complemento: " + colaborador.getEndereco().getComplemento());
			grava.println("Informa��es de Emprego");
			grava.println("Cargo: " + colaborador.getProfissao().getCargo());
			grava.println("Sal�rio: " + colaborador.getProfissao().getSalario());
			grava.println("Turno: " + colaborador.getProfissao().getTurno());
			
			grava.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		
		LeituraArquivo.lerArquivo();
	}
	/**
	 * M�todo para acessar o Financeiro do Condom�nio, passando como par�metro a Classe Financeiro e sua refer�ncia.
	 */
	@Override
	public void acessarFinanceiro(Financeiro financeiro) {
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			grava.println("Situa��o Financeira do Condom�nio");
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
	 * M�todo para acessar as informa��es de algum Morador, passando como par�metro a Classe Morador e sua refer�ncia.
	 */
	@Override
	public void acessarInformacoesMorador(Morador morador) {
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			grava.println("Informa��es do Morador");
			grava.println("Informa��es Pessoais");
			grava.println("Nome: " + morador.getInformacoesPessoais().getNome());
			grava.println("Sobrenome: " + morador.getInformacoesPessoais().getSobrenome());
			grava.println("Data de Nascimento: " + morador.getInformacoesPessoais().getDataNascimento());
			grava.println("Naturalidade: " + morador.getInformacoesPessoais().getNaturalidade());
			grava.println("Cidade Natal: " + morador.getInformacoesPessoais().getCidadeNatal());
			grava.println("Profiss�o: " + morador.getProfissao().getCargo());
			grava.println("RG: " + morador.getInformacoesPessoais().getRg());
			grava.println("CPF: " + morador.getInformacoesPessoais().getCpf());
			grava.println("Informa��es de Emprego");
			grava.println("Cargo: " + morador.getProfissao().getCargo());
			grava.println("Sal�rio: " + morador.getProfissao().getSalario());
			grava.println("Turno: " + morador.getProfissao().getTurno());
			grava.println("Informa��es do Apartamento");
			grava.println("Bloco: " + morador.getApartamento().getBloco());
			grava.println("N�mero: " + morador.getApartamento().getNumero());
			grava.println("Tamanho: " + morador.getApartamento().getTamanho());
			grava.println("N�mero de Quartos: " + morador.getApartamento().getNumeroQuartos());
			grava.println("N�mero de Banheiros: " + morador.getApartamento().getNumeroBanheiros());
			grava.println("N�mero de Vagas para Carro: " + morador.getApartamento().getNumeroVagasCarro());
			grava.println("Descri��o: " + morador.getApartamento().getDescricao());
			grava.println("Pre�o Aluguel: " + morador.getApartamento().getPrecoAluguel());
			
			if (morador.isEhProprietario() == true) {
				grava.println("� Propriet�rio: Sim");
			} else {
				grava.println("� Propriet�rio: N�o");
			}
			
			grava.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
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
		
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			grava.println("A reuni�o do condom�nio foi agendada para a data: " + data + "! Por favor todos compare�am!");
			
			grava.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		LeituraArquivo.lerArquivo();
	}
}
