package com.github.lucasdevrj.condsystem.apartamento;

import com.github.lucasdevrj.condsystem.enumerador.Blocos;
import com.github.lucasdevrj.condsystem.informacoespessoais.Endereco;
/**
 * Classe que representa Apartamentos
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Apartamento {

	private Endereco endereco;
	private Blocos bloco;
	private int numero;
	private int tamanho;
	private int numeroQuartos;
	private int numeroBanheiros;
	private int numeroVagasCarro;
	private String descricao;
	private float precoAluguel;
	private float precoApartamento;
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		if (numero < 100 || numero > 300) {
			throw new IllegalArgumentException("Insira um n�mero v�lido de apartamento, por favor!");
		} 
		this.numero = numero;
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
	
	public int getNumeroQuartos() {
		return numeroQuartos;
	}
	
	public void setNumeroQuartos(int numeroQuartos) {
		if (numeroQuartos <= 0) {
			throw new IllegalArgumentException("Insira um n�mero de quarto(s) v�lido(s), por favor!");
		}
		
		this.numeroQuartos = numeroQuartos;
	}
	
	public int getNumeroBanheiros() {
		return numeroBanheiros;
	}
	
	public void setNumeroBanheiros(int numeroBanheiros) {
		if (numeroBanheiros <= 0) {
			throw new IllegalArgumentException("Insira um n�mero de banheiro(s) v�lido(s), por favor!");
		}
		
		this.numeroBanheiros = numeroBanheiros;
	}
	
	public int getNumeroVagasCarro() {
		return numeroVagasCarro;
	}
	
	public void setNumeroVagasCarro(int numeroVagasCarro) {
		if (numeroVagasCarro <= 0) {
			throw new IllegalArgumentException("Insira um n�mero de vaga(s) v�lida(s), por favor!");
		}
		
		this.numeroVagasCarro = numeroVagasCarro;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		descricao = descricao.trim();
		
		if (descricao.length() == 0) {
			throw new NullPointerException("Insira uma descri��o, por favor!");
		}
		
		this.descricao = descricao;
	}
	
	public float getPrecoAluguel() {
		return precoAluguel;
	}
	
	public void setPrecoAluguel(float precoAluguel) {
		if (precoAluguel <= 0) {
			throw new IllegalArgumentException("Insira um pre�o de aluguel v�lido, por favor!");
		}
		
		this.precoAluguel = precoAluguel;
	}

	public float getPrecoApartamento() {
		return precoApartamento;
	}

	public void setPrecoApartamento(float precoApartamento) {
		if (precoApartamento <= 0) {
			throw new IllegalArgumentException("Insira um pre�o de apartamento v�lido, por favor!");
		}
		
		this.precoApartamento = precoApartamento;
	}

	public Blocos getBloco() {
		return bloco;
	}

	public void setBloco(Blocos bloco) {
		this.bloco = bloco;
	}
}
