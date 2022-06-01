package com.github.lucasdevrj.condsystem.morador;
/**
 * Classe que representa o Morador
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
import com.github.lucasdevrj.condsystem.funcionario.Colaborador;
import com.github.lucasdevrj.condsystem.informacoespessoais.InformacoesPessoais;

import java.io.IOException;
import java.io.PrintWriter;

import com.github.lucasdevrj.condsystem.apartamento.Apartamento;
import com.github.lucasdevrj.condsystem.informacoespessoais.Profissao;
import com.github.lucasdevrj.condsystem.contabancaria.Conta;
import com.github.lucasdevrj.condsystem.financeiro.Receita;
import com.github.lucasdevrj.condsystem.condominio.Condominio;
import com.github.lucasdevrj.condsystem.inquilino.Inquilino;
import com.github.lucasdevrj.condsystem.leituras.LeituraArquivo;

public class Morador extends Colaborador { /** pode não ser colaborador do condomínio em si, mas é de alguma empresa **/

	private InformacoesPessoais informacoesPessoais;
	private Apartamento apartamento;
	private Profissao profissao;
	private boolean ehProprietario;
	private Conta titular;
	/**
	 * Método para comprar um apartamento, que possui uma lógica para verificar se é proprietário e se tem saldo suficiênte para comprar o apartamento.
	 * @param financias
	 */
	public void comprarApartamento(Morador morador, Receita financias) {
		if (this.isEhProprietario() == false) {
			if (titular.getSaldo() >= this.apartamento.getPrecoApartamento()) {
				this.getTitular();
				this.getTitular().setSaldo(titular.getSaldo() - this.getApartamento().getPrecoApartamento());
				financias.setTotal(financias.getTotal() + this.apartamento.getPrecoApartamento());
				this.setEhProprietario(true);
				
				try {
					PrintWriter grava = new PrintWriter("arquivos.txt");
					
					grava.println("Apartamento Comprado com Sucesso!");
					grava.println("Nome Completo do Novo Propritário: " + morador.getInformacoesPessoais().getNome() + " " + morador.getInformacoesPessoais().getSobrenome());
					grava.println("CPF do Novo Proprietário: " + morador.getInformacoesPessoais().getCpf());
					grava.println("RG do Novo Proprietário: " + morador.getInformacoesPessoais().getRg());
					grava.println("Valor do Imóvel: R$ " + morador.getApartamento().getPrecoApartamento());
					grava.println("Endereço do Imóvel: " + morador.getApartamento().getEndereco().getCidade() + " - " + morador.getApartamento().getEndereco().getRua() + " - " + morador.getApartamento().getNumero());
					
					grava.close();
					
				} catch (IOException erro) {
					erro.printStackTrace();
				}
				LeituraArquivo.lerArquivo();
			}
		}
	}
	/**
	 * Método para comprar um apartamento, que possui uma lógica para verificar se é proprietário e se tem saldo suficiênte para pagar o aluguel.
	 * @param financias
	 * @param condominio
	 */
	public void pagarAluguelCondominio(Morador morador, Receita financias, Condominio condominio) {
		if (this.isEhProprietario() == true) {
			if (this.titular.getSaldo() >= condominio.getValorAluguel()) {
				this.titular.setSaldo(this.titular.getSaldo() - condominio.getValorAluguel());
				financias.setTotal(condominio.getValorAluguel() + financias.getTotal());
				try {
					PrintWriter grava = new PrintWriter("arquivos.txt");
					
					grava.println("Aluguel Pago com Sucesso!");
					grava.println("Nome Completo: " + morador.getInformacoesPessoais().getNome() + " " + morador.getInformacoesPessoais().getSobrenome());
					grava.println("CPF: " + morador.getInformacoesPessoais().getCpf());
					grava.println("RG: " + morador.getInformacoesPessoais().getRg());
					grava.println("Número Apartamento: " + morador.getApartamento().getNumero());
					grava.println("Bloco Apartamento: " + morador.getApartamento().getBloco());
					grava.println("Valor Pago: R$ " + condominio.getValorAluguel());
					
					grava.close();
					
				} catch (IOException erro) {
					erro.printStackTrace();
				}
				
				LeituraArquivo.lerArquivo();
			} else {
				System.out.println("Saldo insuficiente para pagar o alguel!");
			}
		} else {
			System.out.println("Para pagar aluguel tem que ser proprietário do apartamento!");
		}
	}
	/**
	 * Método para alugar o apartamento, passando informações do inquilino e proprietário.
	 * @param inquilino
	 * @param proprietario
	 */
	public void alugaApartamento(Inquilino inquilino) {
		if (this.isEhProprietario() == true) {
			try {
				PrintWriter grava = new PrintWriter("arquivos.txt");
				
				grava.println("Imóvel Alugado com Sucesso!");
				grava.println("Informações do Proprietário");
				grava.println("Nome do Proprietário: " + this.getInformacoesPessoais().getNome());
				grava.println("Sobrenome do Proprietário: " + this.getInformacoesPessoais().getSobrenome());
				grava.println("CPF do Proprietário: " + inquilino.getInformacoesPessoais().getCpf());
				grava.println("RG do Proprietário: " + inquilino.getInformacoesPessoais().getRg());
				grava.println("Informações do Inquilino");
				grava.println("Nome do Inquilino: " + inquilino.getInformacoesPessoais().getNome());
				grava.println("Sobrenome do Inquilino: " + inquilino.getInformacoesPessoais().getSobrenome());
				grava.println("CPF do Inquilino: " + inquilino.getInformacoesPessoais().getCpf());
				grava.println("RG do Inquilino: " + inquilino.getInformacoesPessoais().getRg());
				grava.println("Profissão do Inquilino: " + inquilino.getProfissao().getCargo());
				grava.println("Salário do Inquilino: " + inquilino.getProfissao().getSalario());
				
				grava.close();
				
			} catch (IOException erro) {
				erro.printStackTrace();
			}
			
			LeituraArquivo.lerArquivo();
		} else {
			System.out.println("Para alugar um imóvel precisa ser proprietário!");
		}
	}
	/**
	 * Método para receber aluguel do inquilino, com lógica para verificar se é proprietário e se o inquilino tem saldo para pagar. 
	 * @param inquilino
	 * @param apartamento
	 */
	public void receberAluguel(Inquilino inquilino) {
		if (this.isEhProprietario() == true) {
			if (inquilino.getTitular().getSaldo() >= apartamento.getPrecoAluguel()) {
				this.getTitular().setSaldo(this.getTitular().getSaldo() + apartamento.getPrecoAluguel());
				inquilino.getTitular().setSaldo(this.titular.getSaldo() - apartamento.getPrecoAluguel());
				try {
					PrintWriter grava = new PrintWriter("arquivos.txt");
					
					grava.println("Aluguel Recebido com Sucessso!");
					grava.println("Nome Completo do Inquilino: " + inquilino.getInformacoesPessoais().getNome() + " " + inquilino.getInformacoesPessoais().getSobrenome());
					grava.println("CPF do Inquilino: " + inquilino.getInformacoesPessoais().getCpf());
					grava.println("Valor do Aluguel: R$ " + apartamento.getPrecoAluguel());
					
					grava.close();
					
				} catch (IOException erro) {
					erro.printStackTrace();
				}
				LeituraArquivo.lerArquivo();
			}
		}
	}
	/**
	 * Método para reformar apartamento, possuindo uma estrutura de repetição para verificar qual reforma foi solicitada.
	 * @param opcaoEscolhida
	 */
	public void reformarApartamento(int opcaoEscolhida) {
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			int opcaoReforma = opcaoEscolhida;
			float reformaPreco = 1000.0f;
			
			switch (opcaoReforma) {
			case 1:
				if (this.getProfissao().getSalario() >= reformaPreco) {
					this.getProfissao().setSalario(this.getTitular().getSaldo() - reformaPreco);
					grava.println("Reforma paga com sucesso!\nA reforma será no:\nQuarto\nBanheiro");
				} else {
					System.out.println("Infelizmente não possui renda suficiente para a reforma de R$ 1.000,00");
				}
			break;
			
			case 2:
				reformaPreco = 2000.0f;
				if (this.getProfissao().getSalario() >= reformaPreco) {
					this.getProfissao().setSalario(this.getTitular().getSaldo() - reformaPreco);
					grava.println("Reforma paga com sucesso!\nA reforma será no:\nDois Quartos\nBanheiro\nSala\n");
				} else {
					System.out.println("Infelizmente não possui renda suficiente para a reforma de R$ 2.000,00");
				}
			break;
			
			case 3:
				reformaPreco = 3000.0f;
				if (this.getProfissao().getSalario() >= reformaPreco) {
					this.getProfissao().setSalario(this.getTitular().getSaldo() - reformaPreco);
					grava.println("Reforma paga com sucesso!\nA reforma será no:\nTrês Quartos\n Dois Banheiro\nSala\nCozinha\nSotão");
				} else {
					System.out.println("Infelizmente não possui renda suficiente para a reforma de R$ 3.000,00");
				}
			break;
			
			default:
				System.out.println("Opção inválida!\nDigite as opções:\n1 - Quarto e Banheiro\n2 - 2 Quartos, Banheiro e Sala\n3 - Três Quartos, Dois Banheiros, Sala, Cozinha e Sotão");
			break;
			}
			
			grava.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		LeituraArquivo.lerArquivo();
	}

	public InformacoesPessoais getInformacoesPessoais() {
		return informacoesPessoais;
	}

	public void setInformacoesPessoais(InformacoesPessoais informacoesPessoais) {
		this.informacoesPessoais = informacoesPessoais;
	}

	public Apartamento getApartamento() {
		return apartamento;
	}

	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}

	public boolean isEhProprietario() {
		return ehProprietario;
	}

	public void setEhProprietario(boolean ehProprietario) {
		this.ehProprietario = ehProprietario;
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
