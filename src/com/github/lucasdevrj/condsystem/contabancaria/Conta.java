package com.github.lucasdevrj.condsystem.contabancaria;

import java.io.IOException;
import java.io.PrintWriter;

import com.github.lucasdevrj.condsystem.contabancaria.Conta;
import com.github.lucasdevrj.condsystem.funcionario.Colaborador;
import com.github.lucasdevrj.condsystem.leituras.LeituraArquivo;
/**
 * Classe que representa uma Conta n?o especificada
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Conta {

	private int numero;
	private int agencia;
	private float saldo;
	private int senha;
	/**
	 * M?todo para depositar um valor em outra Conta. Lembrando que ter? de ter valor suficiente para deposito.
	 * @param valor
	 * @param titular
	 */
	public void depositar(float valor, Colaborador titular) {
		if (valor <= titular.getProfissao().getSalario()) {
			this.setSaldo(valor + this.getSaldo());
			
			try {
				PrintWriter grava = new PrintWriter("arquivos.txt");
				
				grava.println("Deposito Realizado com Sucesso!");
				grava.println("Valor do Deposito: R$ " + valor);
				grava.println("Valor do Saldo Banc?rio: R$ " + this.getSaldo());
				
				grava.close();
				
			} catch (IOException erro) {
				erro.printStackTrace();
			}
			
			LeituraArquivo.lerArquivo();
		} else {
			System.out.println("Valor Insufici?nte!");
		}
	}
	/**
	 * M?todo para sacar valor suficiente do Banco.
	 * @param valor
	 */
	public void sacar(float valor) {
		if (valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
			try {
				PrintWriter grava = new PrintWriter("arquivos.txt");
				
				grava.println("Saque Realizado com Sucesso!");
				grava.println("Valor do Saque: R$ " + valor);
				grava.println("Valor do Saldo Banc?rio: R$ " + this.getSaldo());
				
				grava.close();
				
			} catch (IOException erro) {
				erro.printStackTrace();
			}
			
			LeituraArquivo.lerArquivo();
		} else {
			System.out.println("Valor Insufici?nte!");
		}
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			throw new IllegalArgumentException("Insira um n?mero de conta v?lido, por favor!");
		}
		
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			throw new IllegalArgumentException("Insira um n?mero de ag?ncia v?lida, por favor!");
		}
		
		this.agencia = agencia;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		if (saldo <= 0) {
			throw new IllegalArgumentException("Insira um saldo v?lido, por favor!");
		}
		
		this.saldo = saldo;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		if (senha <= 0) {
			throw new IllegalArgumentException("Insira uma senha v?lida, por favor!");
		}
		
		this.senha = senha;
	}
}
