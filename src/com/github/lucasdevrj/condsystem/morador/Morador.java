package com.github.lucasdevrj.condsystem.morador;
/**
 * Classe que representa o Morador
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
import com.github.lucasdevrj.condsystem.funcionario.Colaborador;
import com.github.lucasdevrj.condsystem.gravacoes.GravarArquivoMorador;
import com.github.lucasdevrj.condsystem.informacoespessoais.InformacoesPessoais;
import com.github.lucasdevrj.condsystem.apartamento.Apartamento;
import com.github.lucasdevrj.condsystem.informacoespessoais.Profissao;
import com.github.lucasdevrj.condsystem.contabancaria.Conta;
import com.github.lucasdevrj.condsystem.financeiro.Receita;
import com.github.lucasdevrj.condsystem.condominio.Condominio;
import com.github.lucasdevrj.condsystem.inquilino.Inquilino;
import com.github.lucasdevrj.condsystem.leituras.LeituraArquivo;

public class Morador extends Colaborador { /** pode n�o ser colaborador do condom�nio em si, mas � de alguma empresa **/

	private InformacoesPessoais informacoesPessoais;
	private Apartamento apartamento;
	private Profissao profissao;
	private boolean ehProprietario;
	private Conta titular;
	/**
	 * M�todo para comprar um apartamento, que possui uma l�gica para verificar se � propriet�rio e se tem saldo sufici�nte para comprar o apartamento.
	 * @param financias
	 */
	public void comprarApartamento(Morador morador, Receita financias) {
		if (this.isEhProprietario() == false) {
			if (titular.getSaldo() >= this.apartamento.getPrecoApartamento()) {
				this.getTitular();
				this.getTitular().setSaldo(titular.getSaldo() - this.getApartamento().getPrecoApartamento());
				financias.setTotal(financias.getTotal() + this.apartamento.getPrecoApartamento());
				this.setEhProprietario(true);
				GravarArquivoMorador.gravaCompraApartamento(morador, financias);
				LeituraArquivo.lerArquivo();
			}
		}
	}
	/**
	 * M�todo para comprar um apartamento, que possui uma l�gica para verificar se � propriet�rio e se tem saldo sufici�nte para pagar o aluguel.
	 * @param financias
	 * @param condominio
	 */
	public void pagarAluguelCondominio(Morador morador, Receita financias, Condominio condominio) {
		if (this.isEhProprietario() == true) {
			if (this.titular.getSaldo() >= condominio.getValorAluguel()) {
				this.titular.setSaldo(this.titular.getSaldo() - condominio.getValorAluguel());
				financias.setTotal(condominio.getValorAluguel() + financias.getTotal());
				GravarArquivoMorador.gravaPagamentoAluguelCondominio(morador, financias, condominio);
				LeituraArquivo.lerArquivo();
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
	public void alugaApartamento(Inquilino inquilino, Morador proprietario) {
		if (this.isEhProprietario() == true) {
			GravarArquivoMorador.gravaAlugamentoApartamento(inquilino, proprietario);
			LeituraArquivo.lerArquivo();
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
				this.getTitular().setSaldo(this.getTitular().getSaldo() + apartamento.getPrecoAluguel());
				inquilino.getTitular().setSaldo(this.titular.getSaldo() - apartamento.getPrecoAluguel());
				GravarArquivoMorador.gravaRecebimentoAluguel(inquilino, apartamento);
				LeituraArquivo.lerArquivo();
			}
		}
	}
	/**
	 * M�todo para reformar apartamento, possuindo uma estrutura de repeti��o para verificar qual reforma foi solicitada.
	 * @param opcaoEscolhida
	 */
	public void reformarApartamento(int opcaoEscolhida, Morador morador) {
		GravarArquivoMorador.gravaReformaApartamento(opcaoEscolhida, morador);
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
