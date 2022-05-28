package com.github.lucasdevrj.condsystem.gravacoes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import com.github.lucasdevrj.condsystem.funcionario.ProfessorAcademia;

public class GravarArquivoProfessorAcademia {

	public static void gravacaoMontagemSerie() {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			if (ProfessorAcademia.isEstaMontandoSerie() == false) {
				System.out.println("Professor de Educa��o F�sica " + ProfessorAcademia.getInformacoesPessoais().getNome() + ProfessorAcademia.getInformacoesPessoais().getSobrenome() + " esta montando s�rie para o aluno.");
			} else {
				System.out.println("Professor de Educa��o F�sica " + ProfessorAcademia.getInformacoesPessoais().getNome() + ProfessorAcademia.getInformacoesPessoais().getSobrenome() + " j� montou a s�rie para o aluno.");
			}
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
	
	public static void gravarDemonstracaoExercicio() {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("Professor de Educa��o F�sica " + ProfessorAcademia.getInformacoesPessoais().getNome() + " " + ProfessorAcademia.getInformacoesPessoais().getSobrenome() + " esta demonstrando o exerc�cio para o aluno.");
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
}
