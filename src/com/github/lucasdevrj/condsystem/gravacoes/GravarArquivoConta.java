package com.github.lucasdevrj.condsystem.gravacoes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import com.github.lucasdevrj.condsystem.contabancaria.Conta;
import com.github.lucasdevrj.condsystem.funcionario.Colaborador;

public class GravarArquivoConta {

	public static void gravaDeposito(float valor, Colaborador titular) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osr = new OutputStreamWriter(fos);
			BufferedWriter br = new BufferedWriter(osr);
			
			br.write("Deposito Realizado com Sucesso!");
			br.newLine();
			br.write("Valor do Deposito: R$ " + valor);
			br.newLine();
			br.write("Valor do Saldo Bancário: R$ " + titular.getTitular().getSaldo());
			
			br.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
	
	public static void gravarSaque(float valor) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osr = new OutputStreamWriter(fos);
			BufferedWriter br = new BufferedWriter(osr);
			
			br.write("Saque Realizado com Sucesso!");
			br.write("Valor do Saque: R$ " + valor);
			//br.write("Valor do Saldo Bancário: R$ " + titular.getSaldo());
			
			br.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
}
