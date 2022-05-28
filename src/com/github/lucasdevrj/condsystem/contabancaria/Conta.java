package com.github.lucasdevrj.condsystem.contabancaria;

import com.github.lucasdevrj.condsystem.contabancaria.Conta;
import com.github.lucasdevrj.condsystem.funcionario.Colaborador;
import com.github.lucasdevrj.condsystem.gravacoes.GravarArquivoConta;
import com.github.lucasdevrj.condsystem.leituras.LeituraArquivo;
/**
 * Classe que representa uma Conta não especificada
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Conta {

	private int numero;
	private int agencia;
	private float saldo;
	private int senha;
	/**
	 * Método para depositar um valor em outra Conta. Lembrando que terá de ter valor suficiente para deposito.
	 * @param valor
	 * @param titular
	 */
	public void depositar(float valor, Colaborador titular) {
		if (valor <= titular.getProfissao().getSalario()) {
			this.setSaldo(valor + this.getSaldo());
			GravarArquivoConta.gravaDeposito(valor, titular);
			LeituraArquivo.lerArquivo();
		} else {
			System.out.println("Valor Insuficiênte!");
		}
	}
	/**
	 * Método para sacar valor suficiente do Banco.
	 * @param valor
	 */
	public void sacar(float valor) {
		if (valor <= this.getSaldo()) {
			this.setSaldo(valor - this.getSaldo());
			System.out.println("Saque Realizado com Sucesso!");
			System.out.println("Valor do Saque: R$ " + valor);
			System.out.println("Valor do Saldo Bancário: R$ " + this.getSaldo());
		} else {
			System.out.println("Valor Insuficiênte!");
		}
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			throw new IllegalArgumentException("Insira um número de conta válido, por favor!");
		}
		
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			throw new IllegalArgumentException("Insira um número de agência válida, por favor!");
		}
		
		this.agencia = agencia;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		if (saldo <= 0) {
			throw new IllegalArgumentException("Insira um saldo válido, por favor!");
		}
		
		this.saldo = saldo;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		if (senha <= 0) {
			throw new IllegalArgumentException("Insira uma senha válida, por favor!");
		}
		
		this.senha = senha;
	}
}
