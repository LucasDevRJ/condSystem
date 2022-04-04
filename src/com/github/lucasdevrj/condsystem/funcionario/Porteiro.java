package com.github.lucasdevrj.condsystem.funcionario;
/**
 * Classe que representa o Porteiro
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Porteiro extends Colaborador {
	
	private boolean portaEstaAberta;
	private boolean portaoEstaAberto;
	/**
	 * M�todo para o Porteiro abrir a porta, que possui uma l�gica para verificar se a porta esta aberta ou fechada.
	 */
	public void abrirPorta() {
		if (this.isPortaEstaAberta() == false) {
			System.out.println("O porteiro " + super.getInformacoesPessoais().getNome() +  " " + super.getInformacoesPessoais().getSobrenome() + " abriu a porta.");
			this.setPortaEstaAberta(true);
		} else {
			System.out.println("A porta j� esta aberta!");
		}
	}
	/**
	 * M�todo para o Porteiro abrir o port�o, que possui uma l�gica para verificar se a port�o esta aberta ou fechada.
	 */
	public void abrirPortao() {
		if (this.isPortaoEstaAberto() == false) {
			System.out.println("O porteiro " + super.getInformacoesPessoais().getNome() +  " " + super.getInformacoesPessoais().getSobrenome() + " abriu o port�o.");
			this.setPortaoEstaAberto(true);
		} else {
			System.out.println("O port�o j� esta aberto!");
		}
	}
	
	public boolean isPortaEstaAberta() {
		return portaEstaAberta;
	}
	
	public void setPortaEstaAberta(boolean portaEstaAberta) {
		this.portaEstaAberta = portaEstaAberta;
	}
	
	public boolean isPortaoEstaAberto() {
		return portaoEstaAberto;
	}
	
	public void setPortaoEstaAberto(boolean portaoEstaAberto) {
		this.portaoEstaAberto = portaoEstaAberto;
	}
}
