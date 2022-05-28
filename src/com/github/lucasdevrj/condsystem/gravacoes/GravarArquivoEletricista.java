package com.github.lucasdevrj.condsystem.gravacoes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import com.github.lucasdevrj.condsystem.funcionario.Eletricista;

public class GravarArquivoEletricista {

	public static void gravarTrocaFiacao() {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("O eletricista " + Eletricista.getInformacoesPessoais().getNome() + " " + Eletricista.getInformacoesPessoais().getSobrenome() + " esta trocando a fiação.");
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
	
	public static void gravarConsertoFiacao() {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("O eletricista " + Eletricista.getInformacoesPessoais().getNome() + " " + Eletricista.getInformacoesPessoais().getSobrenome() + " esta consertando a fiação.");
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
}
