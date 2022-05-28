package com.github.lucasdevrj.condsystem.gravacoes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import com.github.lucasdevrj.condsystem.funcionario.Eletricista;

public class GravarArquivoEletricista {

	public static void gravarTrocaFiacao(Eletricista eletricista) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("O eletricista " + eletricista.getInformacoesPessoais().getNome() + " " + eletricista.getInformacoesPessoais().getSobrenome() + " esta trocando a fiação.");
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
	
	public static void gravarConsertoFiacao(Eletricista eletricista) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("O eletricista " + eletricista.getInformacoesPessoais().getNome() + " " + eletricista.getInformacoesPessoais().getSobrenome() + " esta consertando a fiação.");
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
}
