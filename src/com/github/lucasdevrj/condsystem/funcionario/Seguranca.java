package com.github.lucasdevrj.condsystem.funcionario;

import java.io.IOException;
import java.io.PrintWriter;

import com.github.lucasdevrj.condsystem.leituras.LeituraArquivo;

/**
 * Classe que representa o Seguran�a
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Seguranca extends Colaborador {
	/**
	 * M�todo para o Seguran�a vigiar algum local, passando informa��es do Seguran�a.
	 */
	public void vigiar(Seguranca seguranca, String local) {
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			grava.println("O seguran�a " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta vigiando o " + local + ".");
			
			grava.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		LeituraArquivo.lerArquivo();
	}
}
