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
				System.out.println("Professor de Educação Física " + ProfessorAcademia.getInformacoesPessoais().getNome() + ProfessorAcademia.getInformacoesPessoais().getSobrenome() + " esta montando série para o aluno.");
			} else {
				System.out.println("Professor de Educação Física " + ProfessorAcademia.getInformacoesPessoais().getNome() + ProfessorAcademia.getInformacoesPessoais().getSobrenome() + " já montou a série para o aluno.");
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
			
			bw.write("Professor de Educação Física " + ProfessorAcademia.getInformacoesPessoais().getNome() + " " + ProfessorAcademia.getInformacoesPessoais().getSobrenome() + " esta demonstrando o exercício para o aluno.");
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
	}
}
