package com.github.lucasdevrj.condsystem.gravacoes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import com.github.lucasdevrj.condsystem.apartamento.Apartamento;
import com.github.lucasdevrj.condsystem.condominio.Condominio;
import com.github.lucasdevrj.condsystem.financeiro.Receita;
import com.github.lucasdevrj.condsystem.inquilino.Inquilino;
import com.github.lucasdevrj.condsystem.leituras.LeituraArquivo;
import com.github.lucasdevrj.condsystem.morador.Morador;

public class GravarArquivoMorador {

	public static void gravaCompraApartamento(Morador morador, Receita financias) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("Apartamento Comprado com Sucesso!");
			bw.newLine();
			bw.write("Nome Completo do Novo Propritário: " + morador.getInformacoesPessoais().getNome() + " " + morador.getInformacoesPessoais().getSobrenome());
			bw.newLine();
			bw.write("CPF do Novo Proprietário: " + morador.getInformacoesPessoais().getCpf());
			bw.newLine();
			bw.write("RG do Novo Proprietário: " + morador.getInformacoesPessoais().getRg());
			bw.newLine();
			bw.write("Valor do Imóvel: R$ " + morador.getApartamento().getPrecoApartamento());
			bw.newLine();
			bw.write("Endereço do Imóvel: " + morador.getApartamento().getEndereco().getCidade() + " - " + morador.getApartamento().getEndereco().getRua() + " - " + morador.getApartamento().getNumero());
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
	
	public static void gravaPagamentoAluguelCondominio(Morador morador, Receita financias, Condominio condominio) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("Aluguel Pago com Sucesso!");
			bw.newLine();
			bw.write("Nome Completo: " + morador.getInformacoesPessoais().getNome() + " " + morador.getInformacoesPessoais().getSobrenome());
			bw.newLine();
			bw.write("CPF: " + morador.getInformacoesPessoais().getCpf());
			bw.newLine();
			bw.write("RG: " + morador.getInformacoesPessoais().getRg());
			bw.newLine();
			bw.write("Número Apartamento: " + morador.getApartamento().getNumero());
			bw.newLine();
			bw.write("Bloco Apartamento: " + morador.getApartamento().getBloco());
			bw.newLine();
			bw.write("Valor Pago: R$ " + condominio.getValorAluguel());
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
	
	public static void gravaAlugamentoApartamento(Inquilino inquilino, Morador proprietario) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("Imóvel Alugado com Sucesso!");
			bw.newLine();
			bw.write("Informações do Proprietário");
			bw.newLine();
			bw.write("Nome do Proprietário: " + proprietario.getInformacoesPessoais().getNome());
			bw.newLine();
			bw.write("Sobrenome do Proprietário: " + proprietario.getInformacoesPessoais().getSobrenome());
			bw.newLine();
			bw.write("CPF do Proprietário: " + inquilino.getInformacoesPessoais().getCpf());
			bw.newLine();
			bw.write("RG do Proprietário: " + inquilino.getInformacoesPessoais().getRg());
			bw.newLine();
			bw.write("Informações do Inquilino");
			bw.newLine();
			bw.write("Nome do Inquilino: " + inquilino.getInformacoesPessoais().getNome());
			bw.newLine();
			bw.write("Sobrenome do Inquilino: " + inquilino.getInformacoesPessoais().getSobrenome());
			bw.newLine();
			bw.write("CPF do Inquilino: " + inquilino.getInformacoesPessoais().getCpf());
			bw.newLine();
			bw.write("RG do Inquilino: " + inquilino.getInformacoesPessoais().getRg());
			bw.newLine();
			bw.write("Profissão do Inquilino: " + inquilino.getProfissao().getCargo());
			bw.newLine();
			bw.write("Salário do Inquilino: " + inquilino.getProfissao().getSalario());
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
	
	public static void gravaRecebimentoAluguel(Inquilino inquilino, Apartamento apartamento) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("Aluguel Recebido com Sucessso!");
			bw.newLine();
			bw.write("Nome Completo do Inquilino: " + inquilino.getInformacoesPessoais().getNome() + " " + inquilino.getInformacoesPessoais().getSobrenome());
			bw.newLine();
			bw.write("CPF do Inquilino: " + inquilino.getInformacoesPessoais().getCpf());
			bw.newLine();
			bw.write("Valor do Aluguel: R$ " + apartamento.getPrecoAluguel());
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
	
	public static void gravaReformaApartamento(int opcaoEscolhida, Morador morador) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			int opcaoReforma = opcaoEscolhida;
			float reformaPreco = 1000.0f;
			
			switch (opcaoReforma) {
			case 1:
				if (morador.getProfissao().getSalario() >= reformaPreco) {
					morador.getProfissao().setSalario(morador.getTitular().getSaldo() - reformaPreco);
					bw.write("Reforma paga com sucesso!\nA reforma será no:\nQuarto\nBanheiro");
				} else {
					System.out.println("Infelizmente não possui renda suficiente para a reforma de R$ 1.000,00");
				}
			break;
			
			case 2:
				reformaPreco = 2000.0f;
				if (morador.getProfissao().getSalario() >= reformaPreco) {
					morador.getProfissao().setSalario(morador.getTitular().getSaldo() - reformaPreco);
					bw.write("Reforma paga com sucesso!\nA reforma será no:\nDois Quartos\nBanheiro\nSala\n");
				} else {
					System.out.println("Infelizmente não possui renda suficiente para a reforma de R$ 2.000,00");
				}
			break;
			
			case 3:
				reformaPreco = 3000.0f;
				if (morador.getProfissao().getSalario() >= reformaPreco) {
					morador.getProfissao().setSalario(morador.getTitular().getSaldo() - reformaPreco);
					bw.write("Reforma paga com sucesso!\nA reforma será no:\nTrês Quartos\n Dois Banheiro\nSala\nCozinha\nSotão");
				} else {
					System.out.println("Infelizmente não possui renda suficiente para a reforma de R$ 3.000,00");
				}
			break;
			
			default:
				System.out.println("Opção inválida!\nDigite as opções:\n1 - Quarto e Banheiro\n2 - 2 Quartos, Banheiro e Sala\n3 - Três Quartos, Dois Banheiros, Sala, Cozinha e Sotão");
			break;
			}
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
}
