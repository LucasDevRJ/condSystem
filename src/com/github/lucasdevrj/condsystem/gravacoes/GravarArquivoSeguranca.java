package com.github.lucasdevrj.condsystem.gravacoes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import com.github.lucasdevrj.condsystem.funcionario.Seguranca;

public class GravarArquivoSeguranca {

	public static void gravarVigio(Seguranca seguranca, String local) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("O segurança " + seguranca.getInformacoesPessoais().getNome() + " " + seguranca.getInformacoesPessoais().getSobrenome() + " esta vigiando o " + local + ".");
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
}
