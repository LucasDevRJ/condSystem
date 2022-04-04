package com.github.lucasdevrj.condsystem.condominio;

import com.github.lucasdevrj.condsystem.informacoespessoais.Endereco;
import com.github.lucasdevrj.condsystem.financeiro.Financeiro;
/**
 * Classe que representa o Condominio
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Condominio {

	private Endereco endereco;
	private String nome;
	private int tamanho;
	private int numeroPiscinas;
	private int numeroQuadras;
	private int numeroAcademia;
	private int numeroParquinho;
	private float valorAluguel;
	private Financeiro receita;
	
	/**
	 * Cada 100 metros dos par�metros de largura/altura custam R$ 500,00. A conta � feita destes valores para construir o pr�dio.
	 * @param largura
	 * @param altura
	 */
	public void construirPredio(float largura, float altura) {
		float precoLargura = (largura * 500) / 100;
		float precoAlura = (altura * 500) / 100;
		float precoConstrucao = precoAlura + precoLargura;
		
		float tamanhoAndar = altura / 600; //cada apartamento possui 600 metros de altura
		int totalAndares = (int) tamanhoAndar;
		
		float tamanhoApartamento = largura / 300; //cada apartamento possui 300 metros
		int quantidadeApartamentos = (int) tamanhoApartamento;
		
		if (this.getReceita().getLucro() >= precoConstrucao) {
			this.getReceita().getReceita().setTotal(this.getReceita().getReceita().getTotal() - precoConstrucao);
			System.out.println("Pr�dio Constru�do com Sucesso!");
			System.out.println("Altura do Pr�dio: " + altura + " metros");
			System.out.println("Largura do Pr�dio: " + largura + " metros");
			System.out.println("Total de Andares: " + totalAndares);
			System.out.println("Quantidade de Apartamentos por Andar: " + quantidadeApartamentos);
			System.out.println("Custo da Constru��o: R$ " + precoConstrucao);
		} else {
			System.out.println("Saldo insuficiente para construir pr�dio!");
		}
	}
	/**
	 * A cada 1000 metros de tamanho(par�metro) h� mais de condom�nio, custa R$ 10.000,00 para aumentar o condom�nio.
	 * @param tamanho
	 */
	public void aumentarTamanhoCondominio(int tamanho) {
		float precoCompra = (tamanho * 10000.00f) / 1000;
		if (tamanho > 0) {
			if (this.getReceita().getLucro() >= precoCompra) {
				this.getReceita().getReceita().setTotal(this.getReceita().getReceita().getTotal() - precoCompra);
				this.setTamanho(this.getTamanho() + tamanho);
				System.out.println("Compra de Metros Realizada com Sucesso!");
				System.out.println("Metros Comprados: " + tamanho + " metros");
				System.out.println("Valor: R$ " + precoCompra);
				System.out.println("Tamanho do Condom�nio: " + this.getTamanho() + " metros");
			} else {
				System.out.println("Dinheiro insuficiente para comprar mais territorio!");
			}
		} else {
			System.out.println("Tamanho desejado inv�lido!");
		}
	}
	
	/**
	 * H� cada 10 metros do par�metro da piscina custa R$ 200,00 para a constru��o.
	 * @param tamanhoPiscina
	 */
	public void construirPiscina(int tamanhoPiscina) {
		float precoConstrucao = (tamanhoPiscina * 200.00f) / 10;
		if (this.getTamanho() > tamanhoPiscina) {
			if (this.getReceita().getLucro() >= precoConstrucao) {
				this.getReceita().getReceita().setTotal(this.getReceita().getReceita().getTotal() - precoConstrucao);
				this.setNumeroPiscinas(this.getNumeroPiscinas() + 1);
				this.setTamanho(this.getTamanho() - tamanhoPiscina);
				System.out.println("Constru��o da Piscina Realizada com Sucesso!");
				System.out.println("Valor da Constru��o: R$ " + precoConstrucao);
				System.out.println("Tamanho da Piscina Construido: " + tamanhoPiscina + " metros");
				System.out.println("N�mero Total de Piscinas no Condom�nio: " + this.getNumeroPiscinas());
			} else {
				System.out.println("Dinheiro insuficiente para construir a piscina!");
			}
		} else {
			System.out.println("Tamanho da piscina � maior que o condom�nio!");
		}
	}
	
	/**
	 * O par�metro do tamanhoParquinho custa R$ 1000,00 h� cada 100 metros de comprimento.
	 * @param tamanhoParquinho
	 */
	public void construirParquinho(int tamanhoParquinho) {
		float precoConstrucao = (tamanhoParquinho * 1000.00f) / 100;
		if (this.getTamanho() > tamanhoParquinho) {
			if (this.getReceita().getLucro() >= precoConstrucao) {
				this.getReceita().getReceita().setTotal(this.getReceita().getReceita().getTotal() - precoConstrucao);
				this.setNumeroParquinho(this.getNumeroParquinho() + 1);
				this.setTamanho(this.getTamanho() - tamanhoParquinho);
				System.out.println("Constru��o do Parquinho Realizada com Sucesso!");
				System.out.println("Valor da Constru��o: R$ " + precoConstrucao);
				System.out.println("Tamanho do Parquinho Construido: " + tamanhoParquinho + " metros");
				System.out.println("N�mero Total de Parquinhos no Condom�nio: " + this.getNumeroParquinho());
			} else {
				System.out.println("Dinheiro insuficiente para construir o parquinho!");
			}
		} else {
			System.out.println("Tamanho do parquinho � maior que o condom�nio!");
		}
	}
	
	/**
	 * Os par�metros s�o os n�meros de unidades requerentes pelo usu�rio e cada parte do equipamento possui um valor pr�prio. Equipamentos Membros Superiores custam R$ 3.000,00; Equipamentos Membros Inferiores custam R$ 4.000,00 e Equipamentos Para o Tronco custam R$ 6.000,00 
	 * @param numeroEquipamentosPartesSuperiores
	 * @param numeroEquipamentosPartesInferiores
	 * @param numeroEquipamentosTronco
	 */
	public void construirAcademia(int numeroEquipamentosPartesSuperiores, int numeroEquipamentosPartesInferiores, int numeroEquipamentosTronco) {
		float valorEquipamentosSuperiores = 3000.0f;
		float valorEquipamentosInferiores = 4000.0f;
		float valorEquipamentosTronco = 6000.0f;
		float valorTotal = valorEquipamentosSuperiores + valorEquipamentosInferiores + valorEquipamentosTronco;
		
		if (this.getReceita().getLucro() >= valorTotal) {
			this.getReceita().getReceita().setTotal(this.getReceita().getReceita().getTotal() - valorTotal);
			this.setNumeroAcademia(this.getNumeroAcademia() + 1);
			
			System.out.println("Academia Construida com Sucesso!");
			System.out.println("N�mero de Equipamentos para Membros Superiores: " + numeroEquipamentosPartesSuperiores);
			System.out.println("N�mero de Equipamentos para Membros Inferiores: " + valorEquipamentosInferiores);
			System.out.println("N�mero de Equipamentos para Tronco: " + valorEquipamentosTronco);
			System.out.println("Custo Total: R$ " + valorTotal);
		} else {
			System.out.println("Valor insufici�nte para a constru��o!");
		}
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome.length() == 0) {
			throw new NullPointerException("Insira o nome, por favor!");
		}
		
		this.nome = nome;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		if (tamanho <= 0) {
			throw new IllegalArgumentException("Insira um tamanho v�lido, por favor!");
		}
		
		this.tamanho = tamanho;
	}
	
	public int getNumeroPiscinas() {
		return numeroPiscinas;
	}
	
	public void setNumeroPiscinas(int numeroPiscinas) {
		if (numeroPiscinas <= 0) {
			throw new IllegalArgumentException("Insira um n�mero de piscina(s) v�lido(s), por favor!");
		}
		
		this.numeroPiscinas = numeroPiscinas;
	}
	
	public int getNumeroQuadras() {
		return numeroQuadras;
	}
	
	public void setNumeroQuadras(int numeroQuadras) {
		if (numeroQuadras <= 0) {
			throw new IllegalArgumentException("Insira um n�mero de quadra(s) v�lida(s), por favor!");
		}
		
		this.numeroQuadras = numeroQuadras;
	}
	
	public int getNumeroAcademia() {
		return numeroAcademia;
	}
	
	public void setNumeroAcademia(int numeroAcademia) {
		if (numeroAcademia <= 0) {
			throw new IllegalArgumentException("Insira um n�mero de academia(s) v�lida(s), por favor!");
		}
		
		this.numeroAcademia = numeroAcademia;
	}

	public float getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(float valorAluguel) {
		if (valorAluguel <= 0) {
			throw new IllegalArgumentException("Insira um valor de aluguel v�lido, por favor!");
		}
		
		this.valorAluguel = valorAluguel;
	}

	public Financeiro getReceita() {
		return receita;
	}

	public void setReceita(Financeiro receita) {
		this.receita = receita;
	}

	public int getNumeroParquinho() {
		return numeroParquinho;
	}

	public void setNumeroParquinho(int numeroParquinho) {
		if (numeroParquinho <= 0) {
			throw new IllegalArgumentException("Insira um n�mero de parquinho(s) v�lido(s), por favor!");
		}
		
		this.numeroParquinho = numeroParquinho;
	}
}
