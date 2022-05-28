package com.github.lucasdevrj.condsystem.gravacoes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import com.github.lucasdevrj.condsystem.funcionario.Jardineiro;

public class GravarArquivoJardineiro {

	public static void gravarJardinagem() {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			if (Jardineiro.isJardinagemEstaGrande() == true) {
				System.out.println("O jardineiro " + Jardineiro.getInformacoesPessoais().getNome() + " " + Jardineiro.getInformacoesPessoais().getSobrenome() + " esta jardinando.");
			} else {
				System.out.println("A jardinagem n�o est� grande o suficiente!");
			}
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
}
