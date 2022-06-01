package com.github.lucasdevrj.condsystem.funcionario;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import com.github.lucasdevrj.condsystem.leituras.LeituraArquivo;

/**
 * Classe que representa o Pedreiro
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Pedreiro extends Colaborador {

	private boolean estaConsertado;
	private boolean foiConstruido;
	/**
	 * M�todo para o Pedreiro consertar algo, que possui uma l�gica para verificar se o objeto esta consertado ou n�o.
	 */
	public void consertar(String oQue) {
		try {
			PrintWriter grava = new PrintWriter("arquivos.txt");
			
			if (this.isEstaConsertado() == false) {
				grava.println("O pedreiro " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta consertando o " + oQue + ".");
				this.setEstaConsertado(true);
			} else {
				grava.write("O " + oQue + " j� foi consertado!");
			}
			
			grava.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		LeituraArquivo.lerArquivo();
	}
	/**
	 * M�todo para o Pedreiro construir algo, que possui uma l�gica para verificar se j� foi construido ou n�o.
	 */
	public void construir(String oQue) {
		try {
			FileOutputStream fos = new FileOutputStream("arquivos.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			if (this.isFoiConstruido() == false) {
				bw.write("O pedreiro " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta construindo o " + oQue + ".");
				this.setFoiConstruido(true);
			} else {
				bw.write("O " + oQue + " j� foi construido!");
			}
			
			bw.close();
			
		} catch (IOException erro) {
			erro.printStackTrace();
		}
		
		LeituraArquivo.lerArquivo();
	}
	
	public boolean isEstaConsertado() {
		return estaConsertado;
	}
	
	public void setEstaConsertado(boolean estaConsertado) {
		this.estaConsertado = estaConsertado;
	}
	
	public boolean isFoiConstruido() {
		return foiConstruido;
	}
	
	public void setFoiConstruido(boolean foiConstruido) {
		this.foiConstruido = foiConstruido;
	}
}
