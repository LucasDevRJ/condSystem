package com.github.lucasdevrj.condsystem.contabancaria;

import com.github.lucasdevrj.condsystem.contabancaria.Conta;
import com.github.lucasdevrj.condsystem.funcionario.Colaborador;

public class Conta {

	private int numero;
	private int agencia;
	private float saldo;
	private int senha;
	
	public void depositar(float valor, Colaborador titular) {
		if (valor <= titular.getProfissao().getSalario()) {
			this.setSaldo(valor + this.getSaldo());
			System.out.println("Deposito Realizado com Sucesso!");
			System.out.println("Valor do Deposito: R$ " + valor);
			System.out.println("Valor do Saldo Banc�rio: R$ " + this.getSaldo());
		} else {
			System.out.println("Valor Insufici�nte!");
		}
	}
	
	public void sacar(float valor) {
		if (valor <= this.getSaldo()) {
			this.setSaldo(valor - this.getSaldo());
			System.out.println("Saque Realizado com Sucesso!");
			System.out.println("Valor do Saque: R$ " + valor);
			System.out.println("Valor do Saldo Banc�rio: R$ " + this.getSaldo());
		} else {
			System.out.println("Valor Insufici�nte!");
		}
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			throw new IllegalArgumentException("Insira um n�mero de conta v�lido, por favor!");
		}
		
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			throw new IllegalArgumentException("Insira um n�mero de ag�ncia v�lida, por favor!");
		}
		
		this.agencia = agencia;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		if (saldo <= 0) {
			throw new IllegalArgumentException("Insira um saldo v�lido, por favor!");
		}
		
		this.saldo = saldo;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		if (senha <= 0) {
			throw new IllegalArgumentException("Insira uma senha v�lida, por favor!");
		}
		
		this.senha = senha;
	}
}
