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
	 * M�todo para o Pedreiro consertar algo, que possui uma l�gica para verificar se o objeto esta consertado ou n�o.
	 */
	public void consertar(String oQue) {
		if (this.isEstaConsertado() == false) {
			System.out.println("O pedreiro " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta consertando o " + oQue + ".");
			this.setEstaConsertado(true);
		} else {
			System.out.println("O " + oQue + " j� foi consertado!");
		}
	}
	/**
	 * M�todo para o Pedreiro construir algo, que possui uma l�gica para verificar se j� foi construido ou n�o.
	 */
	public void construir(String oQue) {
		if (this.isFoiConstruido() == false) {
			System.out.println("O pedreiro " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta construindo o " + oQue + ".");
			this.setFoiConstruido(true);
		} else {
			System.out.println("O " + oQue + " j� foi construido!");
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
