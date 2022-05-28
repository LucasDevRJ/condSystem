package com.github.lucasdevrj.condsystem.gravacoes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import com.github.lucasdevrj.condsystem.funcionario.Pedreiro;

public class GravarArquivoPedreiro {

	public static void gravaConserto(String oQue) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			if (Pedreiro.isEstaConsertado() == false) {
				bw.write("O pedreiro " + Pedreiro.getInformacoesPessoais().getNome() + " " + Pedreiro.getInformacoesPessoais().getSobrenome() + " esta consertando o " + oQue + ".");
				Pedreiro.setEstaConsertado(true);
			} else {
				bw.write("O " + oQue + " já foi consertado!");
			}
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
	
	public static void gravaConstrucao(String oQue) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			if (Pedreiro.isFoiConstruido() == false) {
				bw.write("O pedreiro " + Pedreiro.getInformacoesPessoais().getNome() + " " + Pedreiro.getInformacoesPessoais().getSobrenome() + " esta construindo o " + oQue + ".");
				Pedreiro.setFoiConstruido(true);
			} else {
				bw.write("O " + oQue + " já foi construido!");
			}
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
}
