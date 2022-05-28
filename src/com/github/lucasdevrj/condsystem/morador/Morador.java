package com.github.lucasdevrj.condsystem.morador;
/**
 * Classe que representa o Morador
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
import com.github.lucasdevrj.condsystem.funcionario.Colaborador;
import com.github.lucasdevrj.condsystem.informacoespessoais.InformacoesPessoais;
import com.github.lucasdevrj.condsystem.apartamento.Apartamento;
import com.github.lucasdevrj.condsystem.informacoespessoais.Profissao;
import com.github.lucasdevrj.condsystem.contabancaria.Conta;
import com.github.lucasdevrj.condsystem.financeiro.Receita;
import com.github.lucasdevrj.condsystem.condominio.Condominio;
import com.github.lucasdevrj.condsystem.inquilino.Inquilino;

public class Morador extends Colaborador { /** pode n�o ser colaborador do condom�nio em si, mas � de alguma empresa **/

	private static InformacoesPessoais informacoesPessoais;
	private Apartamento apartamento;
	private Profissao profissao;
	private boolean ehProprietario;
	private Conta titular;
	/**
	 * M�todo para comprar um apartamento, que possui uma l�gica para verificar se � propriet�rio e se tem saldo sufici�nte para comprar o apartamento.
	 * @param financias
	 */
	public void comprarApartamento(Receita financias) {
		if (this.isEhProprietario() == false) {
			if (titular.getSaldo() >= this.apartamento.getPrecoApartamento()) {
				this.getTitular();
				this.getTitular().setSaldo(titular.getSaldo() - this.getApartamento().getPrecoApartamento());
				financias.setTotal(financias.getTotal() + this.apartamento.getPrecoApartamento());
				System.out.println("Apartamento Comprado com Sucesso!");
				System.out.println("Nome Completo do Novo Proprit�rio: " + this.getInformacoesPessoais().getNome() + " " + this.getInformacoesPessoais().getSobrenome());
				System.out.println("CPF do Novo Propriet�rio: " + this.getInformacoesPessoais().getCpf());
				System.out.println("RG do Novo Propriet�rio: " + this.getInformacoesPessoais().getRg());
				System.out.println("Valor do Im�vel: R$ " + this.apartamento.getPrecoApartamento());
				System.out.println("Endere�o do Im�vel: " + this.apartamento.getEndereco().getCidade() + " - " + this.apartamento.getEndereco().getRua() + " - " + this.apartamento.getNumero());
				this.setEhProprietario(true);
			}
		}
	}
	/**
	 * M�todo para comprar um apartamento, que possui uma l�gica para verificar se � propriet�rio e se tem saldo sufici�nte para pagar o aluguel.
	 * @param financias
	 * @param condominio
	 */
	public void pagarAluguelCondominio(Receita financias, Condominio condominio) {
		if (this.isEhProprietario() == true) {
			if (this.titular.getSaldo() >= condominio.getValorAluguel()) {
				this.titular.setSaldo(this.titular.getSaldo() - condominio.getValorAluguel());
				financias.setTotal(condominio.getValorAluguel() + financias.getTotal());
				System.out.println("Aluguel Pago com Sucesso!");
				System.out.println("Nome Completo: " + this.getInformacoesPessoais().getNome() + " " + this.getInformacoesPessoais().getSobrenome());
				System.out.println("CPF: " + this.getInformacoesPessoais().getCpf());
				System.out.println("RG: " + this.getInformacoesPessoais().getRg());
				System.out.println("N�mero Apartamento: " + this.getApartamento().getNumero());
				System.out.println("Bloco Apartamento: " + this.getApartamento().getBloco());
				System.out.println("Valor Pago: R$ " + condominio.getValorAluguel());
			} else {
				System.out.println("Saldo insuficiente para pagar o alguel!");
			}
		} else {
			System.out.println("Para pagar aluguel tem que ser propriet�rio do apartamento!");
		}
	}
	/**
	 * M�todo para alugar o apartamento, passando informa��es do inquilino e propriet�rio.
	 * @param inquilino
	 * @param proprietario
	 */
	public void alugarApartamento(Inquilino inquilino, Morador proprietario) {
		if (this.isEhProprietario() == true) {
			System.out.println("Im�vel Alugado com Sucesso!");
			System.out.println("Informa��es do Propriet�rio");
			System.out.println("Nome do Propriet�rio: " + proprietario.getInformacoesPessoais().getNome());
			System.out.println("Sobrenome do Propriet�rio: " + proprietario.getInformacoesPessoais().getSobrenome());
			System.out.println("CPF do Propriet�rio: " + inquilino.getInformacoesPessoais().getCpf());
			System.out.println("RG do Propriet�rio: " + inquilino.getInformacoesPessoais().getRg());
			System.out.println("Informa��es do Inquilino");
			System.out.println("Nome do Inquilino: " + inquilino.getInformacoesPessoais().getNome());
			System.out.println("Sobrenome do Inquilino: " + inquilino.getInformacoesPessoais().getSobrenome());
			System.out.println("CPF do Inquilino: " + inquilino.getInformacoesPessoais().getCpf());
			System.out.println("RG do Inquilino: " + inquilino.getInformacoesPessoais().getRg());
			System.out.println("Profiss�o do Inquilino: " + inquilino.getProfissao().getCargo());
			System.out.println("Sal�rio do Inquilino: " + inquilino.getProfissao().getSalario());
		} else {
			System.out.println("Para alugar um im�vel precisa ser propriet�rio!");
		}
	}
	/**
	 * M�todo para receber aluguel do inquilino, com l�gica para verificar se � propriet�rio e se o inquilino tem saldo para pagar. 
	 * @param inquilino
	 * @param apartamento
	 */
	public void receberAluguel(Inquilino inquilino, Apartamento apartamento) {
		if (this.isEhProprietario() == true) {
			if (inquilino.getTitular().getSaldo() >= apartamento.getPrecoAluguel()) {
				System.out.println("Aluguel Recebido com Sucessso!");
				System.out.println("Nome Completo do Inquilino: " + inquilino.getInformacoesPessoais().getNome() + " " + inquilino.getInformacoesPessoais().getSobrenome());
				System.out.println("CPF do Inquilino: " + inquilino.getInformacoesPessoais().getCpf());
				System.out.println("Valor do Aluguel: R$ " + apartamento.getPrecoAluguel());
				this.getTitular().setSaldo(this.getTitular().getSaldo() + apartamento.getPrecoAluguel());
				inquilino.getTitular().setSaldo(this.titular.getSaldo() - apartamento.getPrecoAluguel());
			}
		}
	}
	/**
	 * M�todo para reformar apartamento, possuindo uma estrutura de repeti��o para verificar qual reforma foi solicitada.
	 * @param opcaoEscolhida
	 */
	public void reformarApartamento(int opcaoEscolhida) {
		int opcaoReforma = opcaoEscolhida;
		float reformaPreco = 1000.0f;
		
		switch (opcaoReforma) {
			case 1:
				if (profissao.getSalario() >= reformaPreco) {
					System.out.println("Reforma paga com sucesso!\nA reforma ser� no:\nQuarto\nBanheiro");
					titular.setSaldo(titular.getSaldo() - reformaPreco);
				} else {
					System.out.println("Infelizmente n�o possui renda suficiente para a reforma de R$ 1.000,00");
				}
			break;
			
			case 2:
				reformaPreco = 2000.0f;
				if (profissao.getSalario() >= reformaPreco) {
					System.out.println("Reforma paga com sucesso!\nA reforma ser� no:\nDois Quartos\nBanheiro\nSala\n");
					titular.setSaldo(titular.getSaldo() - reformaPreco);
				} else {
					System.out.println("Infelizmente n�o possui renda suficiente para a reforma de R$ 2.000,00");
				}
			break;
			
			case 3:
				reformaPreco = 3000.0f;
				if (profissao.getSalario() >= reformaPreco) {
					System.out.println("Reforma paga com sucesso!\nA reforma ser� no:\nTr�s Quartos\n Dois Banheiro\nSala\nCozinha\nSot�o");
					titular.setSaldo(titular.getSaldo() - reformaPreco);
				} else {
					System.out.println("Infelizmente n�o possui renda suficiente para a reforma de R$ 3.000,00");
				}
			break;
			
			default:
				System.out.println("Op��o inv�lida!\nDigite as op��es:\n1 - Quarto e Banheiro\n2 - 2 Quartos, Banheiro e Sala\n3 - Tr�s Quartos, Dois Banheiros, Sala, Cozinha e Sot�o");
			break;
		}
	}

	public static InformacoesPessoais getInformacoesPessoais() {
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
