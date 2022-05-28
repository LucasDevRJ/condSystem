package com.github.lucasdevrj.condsystem.gravacoes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import com.github.lucasdevrj.condsystem.funcionario.Porteiro;

public class GravarArquivoPorteiro {

	public static void gravarAberturaPorta(Porteiro porteiro) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			if (Porteiro.isPortaEstaAberta() == false) {
				bw.write("O porteiro " + porteiro.getInformacoesPessoais().getNome() +  " " + porteiro.getInformacoesPessoais().getSobrenome() + " abriu a porta.");
				Porteiro.setPortaEstaAberta(true);
			} else {
				bw.write("A porta já esta aberta!");
			}
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
	
	public static void gravarAberturaPortao(Porteiro porteiro) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			if (Porteiro.isPortaoEstaAberto() == false) {
				System.out.println("O porteiro " + porteiro.getInformacoesPessoais().getNome() +  " " + porteiro.getInformacoesPessoais().getSobrenome() + " abriu o portão.");
				Porteiro.setPortaoEstaAberto(true);
			} else {
				System.out.println("O portão já esta aberto!");
			}
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
}
