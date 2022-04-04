package com.github.lucasdevrj.condsystem.funcionario;
/**
 * Classe que representa o Pedreiro
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Pedreiro extends Colaborador {

	private boolean estaConsertado;
	private boolean foiConstruido;
	/**
	 * Método para o Pedreiro consertar algo, que possui uma lógica para verificar se o objeto esta consertado ou não.
	 */
	public void consertar(String oQue) {
		if (this.isEstaConsertado() == false) {
			System.out.println("O pedreiro " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta consertando o " + oQue + ".");
			this.setEstaConsertado(true);
		} else {
			System.out.println("O " + oQue + " já foi consertado!");
		}
	}
	/**
	 * Método para o Pedreiro construir algo, que possui uma lógica para verificar se já foi construido ou não.
	 */
	public void construir(String oQue) {
		if (this.isFoiConstruido() == false) {
			System.out.println("O pedreiro " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta construindo o " + oQue + ".");
			this.setFoiConstruido(true);
		} else {
			System.out.println("O " + oQue + " já foi construido!");
		}
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
