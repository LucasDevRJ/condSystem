package com.github.lucasdevrj.condsystem.gravacoes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import com.github.lucasdevrj.condsystem.financeiro.Financeiro;
import com.github.lucasdevrj.condsystem.funcionario.Colaborador;
import com.github.lucasdevrj.condsystem.morador.Morador;

public class GravarArquivoAdministrador {

	public static void gravaAcessoInformacoesColaborador(Colaborador colaborador) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("Informa��es do Colaborador");
			bw.newLine();
			bw.write("Informa��es Pessoais");
			bw.newLine();
			bw.write("Nome: " + colaborador.getInformacoesPessoais().getNome());
			bw.newLine();
			bw.write("Sobrenome: " + colaborador.getInformacoesPessoais().getSobrenome());
			bw.newLine();
			bw.write("Data de Nascimento: " + colaborador.getInformacoesPessoais().getDataNascimento());
			bw.newLine();
			bw.write("Naturalidade: " + colaborador.getInformacoesPessoais().getNaturalidade());
			bw.newLine();
			bw.write("Cidade Natal: " + colaborador.getInformacoesPessoais().getCidadeNatal());
			bw.newLine();
			bw.write("RG: " + colaborador.getInformacoesPessoais().getRg());
			bw.newLine();
			bw.write("CPF: " + colaborador.getInformacoesPessoais().getCpf());
			bw.newLine();
			bw.write("Informa��es do Endere�o");
			bw.newLine();
			bw.write("Pa�s: " + colaborador.getEndereco().getPais());
			bw.newLine();
			bw.write("Cidade: " + colaborador.getEndereco().getCidade());
			bw.newLine();
			bw.write("Estado: " + colaborador.getEndereco().getEstado());
			bw.newLine();
			bw.write("Rua: " + colaborador.getEndereco().getRua());
			bw.newLine();
			bw.write("N�mero: " + colaborador.getEndereco().getNumero());
			bw.newLine();
			bw.write("CEP: " + colaborador.getEndereco().getCep());
			bw.newLine();
			bw.write("Ponto de Refer�ncia: " + colaborador.getEndereco().getPontoReferencia());
			bw.newLine();
			bw.write("Complemento: " + colaborador.getEndereco().getComplemento());
			bw.newLine();
			bw.write("Informa��es de Emprego");
			bw.newLine();
			bw.write("Cargo: " + colaborador.getProfissao().getCargo());
			bw.newLine();
			bw.write("Sal�rio: " + colaborador.getProfissao().getSalario());
			bw.newLine();
			bw.write("Turno: " + colaborador.getProfissao().getTurno());
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
	
	public static void gravarAcessoFinanceiro(Financeiro financeiro) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("Situa��o Financeira do Condom�nio");
			bw.newLine();
			bw.write("Total de Despesa: R$ " + financeiro.getDespesa().getTotal());
			bw.newLine();
			bw.write("Total de Custo: R$ " + financeiro.getCusto().getTotal());
			bw.newLine();
			bw.write("Total de Receita: R$ " + financeiro.getReceita().getTotal());
			bw.newLine();
			bw.write("Lucro Total: R$ " + financeiro.getLucro());
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
	
	public static void gravarAcessoInformacoesMorador(Morador morador) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("Informa��es do Morador");
			bw.newLine();
			bw.write("Informa��es Pessoais");
			bw.newLine();
			bw.write("Nome: " + morador.getInformacoesPessoais().getNome());
			bw.newLine();
			bw.write("Sobrenome: " + morador.getInformacoesPessoais().getSobrenome());
			bw.newLine();
			bw.write("Data de Nascimento: " + morador.getInformacoesPessoais().getDataNascimento());
			bw.newLine();
			bw.write("Naturalidade: " + morador.getInformacoesPessoais().getNaturalidade());
			bw.newLine();
			bw.write("Cidade Natal: " + morador.getInformacoesPessoais().getCidadeNatal());
			bw.newLine();
			bw.write("Profiss�o: " + morador.getProfissao().getCargo());
			bw.newLine();
			bw.write("RG: " + morador.getInformacoesPessoais().getRg());
			bw.newLine();
			bw.write("CPF: " + morador.getInformacoesPessoais().getCpf());
			bw.newLine();
			bw.write("Informa��es de Emprego");
			bw.newLine();
			bw.write("Cargo: " + morador.getProfissao().getCargo());
			bw.newLine();
			bw.write("Sal�rio: " + morador.getProfissao().getSalario());
			bw.newLine();
			bw.write("Turno: " + morador.getProfissao().getTurno());
			bw.newLine();
			bw.write("Informa��es do Apartamento");
			bw.newLine();
			bw.write("Bloco: " + morador.getApartamento().getBloco());
			bw.newLine();
			bw.write("N�mero: " + morador.getApartamento().getNumero());
			bw.newLine();
			bw.write("Tamanho: " + morador.getApartamento().getTamanho());
			bw.newLine();
			bw.write("N�mero de Quartos: " + morador.getApartamento().getNumeroQuartos());
			bw.newLine();
			bw.write("N�mero de Banheiros: " + morador.getApartamento().getNumeroBanheiros());
			bw.newLine();
			bw.write("N�mero de Vagas para Carro: " + morador.getApartamento().getNumeroVagasCarro());
			bw.newLine();
			bw.write("Descri��o: " + morador.getApartamento().getDescricao());
			bw.newLine();
			bw.write("Pre�o Aluguel: " + morador.getApartamento().getPrecoAluguel());
			bw.newLine();
			if (morador.isEhProprietario() == true) {
				bw.write("� Propriet�rio: Sim");
			} else {
				bw.write("� Propriet�rio: N�o");
			}
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
	
	public static void gravaAgendamentoReuniao(String data) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("A reuni�o do condom�nio foi agendada para a data: " + data + "! Por favor todos compare�am!");
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
}
