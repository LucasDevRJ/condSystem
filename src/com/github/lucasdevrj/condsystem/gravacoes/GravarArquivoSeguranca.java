package com.github.lucasdevrj.condsystem.gravacoes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import com.github.lucasdevrj.condsystem.funcionario.Seguranca;

public class GravarArquivoSeguranca {

	public static void gravarVigio(String local) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			System.out.println("O segurança " + Seguranca.getInformacoesPessoais().getNome() + " " + Seguranca.getInformacoesPessoais().getSobrenome() + " esta vigiando o " + local + ".");
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
}
