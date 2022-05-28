package com.github.lucasdevrj.condsystem.condominio;

import com.github.lucasdevrj.condsystem.informacoespessoais.Endereco;

import com.github.lucasdevrj.condsystem.financeiro.Financeiro;
import com.github.lucasdevrj.condsystem.gravacoes.GravarArquivoCondominio;
import com.github.lucasdevrj.condsystem.leituras.LeituraArquivo;
/**
 * Classe que representa o Condominio
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Condominio {

	private String nome;
	private Endereco endereco;
	private static int tamanho;
	private static int numeroPiscinas;
	private int numeroQuadras;
	private int numeroAcademia;
	private static int numeroParquinho;
	private float valorAluguel;
	private Financeiro receita;
	
	/**
	 * Cada 100 metros dos parâmetros de largura/altura custam R$ 500,00. A conta é feita destes valores para construir o prédio.
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
			GravarArquivoCondominio.gravarConstrucaoPredio(largura, altura, totalAndares, quantidadeApartamentos, precoConstrucao);
			LeituraArquivo.lerArquivo();
			this.getReceita().getReceita().setTotal(this.getReceita().getReceita().getTotal() - precoConstrucao);
			
		} else {
			System.out.println("Saldo insuficiente para construir prédio!");
		}
	}
	/**
	 * A cada 1000 metros de tamanho(parâmetro) há mais de condomínio, custa R$ 10.000,00 para aumentar o condomínio.
	 * @param tamanho
	 */
	public void aumentarTamanhoCondominio(int tamanho) {
		float precoCompra = (tamanho * 10000.00f) / 1000;
		if (tamanho > 0) {
			if (this.getReceita().getLucro() >= precoCompra) {
				this.getReceita().getReceita().setTotal(this.getReceita().getReceita().getTotal() - precoCompra);
				this.setTamanho(this.getTamanho() + tamanho);
				GravarArquivoCondominio.gravarCompraMetros(tamanho, precoCompra);
				LeituraArquivo.lerArquivo();
				
			} else {
				System.out.println("Dinheiro insuficiente para comprar mais territorio!");
			}
		} else {
			System.out.println("Tamanho desejado inválido!");
		}
	}
	
	/**
	 * Há cada 10 metros do parâmetro da piscina custa R$ 200,00 para a construção.
	 * @param tamanhoPiscina
	 */
	public void construirPiscina(int tamanhoPiscina) {
		float precoConstrucao = (tamanhoPiscina * 200.00f) / 10;
		if (this.getTamanho() > tamanhoPiscina) {
			if (this.getReceita().getLucro() >= precoConstrucao) {
				this.getReceita().getReceita().setTotal(this.getReceita().getReceita().getTotal() - precoConstrucao);
				this.setNumeroPiscinas(this.getNumeroPiscinas() + 1);
				this.setTamanho(this.getTamanho() - tamanhoPiscina);
				GravarArquivoCondominio.gravarConstrucaoPiscina(precoConstrucao, tamanhoPiscina);
				LeituraArquivo.lerArquivo();
			} else {
				System.out.println("Dinheiro insuficiente para construir a piscina!");
			}
		} else {
			System.out.println("Tamanho da piscina é maior que o condomínio!");
		}
	}
	
	/**
	 * O parâmetro do tamanhoParquinho custa R$ 1000,00 há cada 100 metros de comprimento.
	 * @param tamanhoParquinho
	 */
	public void construirParquinho(int tamanhoParquinho) {
		float precoConstrucao = (tamanhoParquinho * 1000.00f) / 100;
		if (this.getTamanho() > tamanhoParquinho) {
			if (this.getReceita().getLucro() >= precoConstrucao) {
				this.getReceita().getReceita().setTotal(this.getReceita().getReceita().getTotal() - precoConstrucao);
				this.setNumeroParquinho(this.getNumeroParquinho() + 1);
				this.setTamanho(this.getTamanho() - tamanhoParquinho);
				GravarArquivoCondominio.gravarConstruirParquinho(precoConstrucao, tamanhoParquinho);
				LeituraArquivo.lerArquivo();
			} else {
				System.out.println("Dinheiro insuficiente para construir o parquinho!");
			}
		} else {
			System.out.println("Tamanho do parquinho é maior que o condomínio!");
		}
	}
	
	/**
	 * Os parâmetros são os números de unidades requerentes pelo usuário e cada parte do equipamento possui um valor próprio. Equipamentos Membros Superiores custam R$ 3.000,00; Equipamentos Membros Inferiores custam R$ 4.000,00 e Equipamentos Para o Tronco custam R$ 6.000,00 
	 * @param numeroEquipamentosPartesSuperiores
	 * @param numeroEquipamentosPartesInferiores
	 * @param numeroEquipamentosTronco
	 */
	public void construirAcademia(int numeroEquipamentosPartesSuperiores, int numeroEquipamentosPartesInferiores, int numeroEquipamentosTronco) {
		float valorEquipamentosSuperiores = 3000.0f * numeroEquipamentosPartesSuperiores;
		float valorEquipamentosInferiores = 4000.0f * numeroEquipamentosPartesInferiores;
		float valorEquipamentosTronco = 6000.0f * numeroEquipamentosTronco;
		float valorTotal = valorEquipamentosSuperiores + valorEquipamentosInferiores + valorEquipamentosTronco;
		if (this.getReceita().getLucro() >= valorTotal) {
			this.getReceita().getReceita().setTotal(this.getReceita().getReceita().getTotal() - valorTotal);
			this.setNumeroAcademia(this.getNumeroAcademia() + 1);
			GravarArquivoCondominio.gravaConstruirAcademia(numeroEquipamentosPartesSuperiores, numeroEquipamentosTronco, numeroEquipamentosPartesInferiores, valorTotal);
			LeituraArquivo.lerArquivo();
		} else {
			System.out.println("Valor insuficiênte para a construção!");
		}
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public static int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		if (tamanho <= 0) {
			throw new IllegalArgumentException("Insira um tamanho válido, por favor!");
		}
		
		this.tamanho = tamanho;
	}
	
	public static int getNumeroPiscinas() {
		return numeroPiscinas;
	}
	
	public void setNumeroPiscinas(int numeroPiscinas) {
		if (numeroPiscinas <= 0) {
			throw new IllegalArgumentException("Insira um número de piscina(s) válido(s), por favor!");
		}
		
		this.numeroPiscinas = numeroPiscinas;
	}
	
	public int getNumeroQuadras() {
		return numeroQuadras;
	}
	
	public void setNumeroQuadras(int numeroQuadras) {
		if (numeroQuadras <= 0) {
			throw new IllegalArgumentException("Insira um número de quadra(s) válida(s), por favor!");
		}
		
		this.numeroQuadras = numeroQuadras;
	}
	
	public int getNumeroAcademia() {
		return numeroAcademia;
	}
	
	public void setNumeroAcademia(int numeroAcademia) {
		if (numeroAcademia <= 0) {
			throw new IllegalArgumentException("Insira um número de academia(s) válida(s), por favor!");
		}
		
		this.numeroAcademia = numeroAcademia;
	}

	public float getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(float valorAluguel) {
		if (valorAluguel <= 0) {
			throw new IllegalArgumentException("Insira um valor de aluguel válido, por favor!");
		}
		
		this.valorAluguel = valorAluguel;
	}

	public Financeiro getReceita() {
		return receita;
	}

	public void setReceita(Financeiro receita) {
		this.receita = receita;
	}

	public static int getNumeroParquinho() {
		return numeroParquinho;
	}

	public void setNumeroParquinho(int numeroParquinho) {
		if (numeroParquinho <= 0) {
			throw new IllegalArgumentException("Insira um número de parquinho(s) válido(s), por favor!");
		}
		
		this.numeroParquinho = numeroParquinho;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
