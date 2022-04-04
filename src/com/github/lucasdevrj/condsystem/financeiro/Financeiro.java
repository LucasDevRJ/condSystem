package com.github.lucasdevrj.condsystem.financeiro;
/**
 * Classe que representa o Financeiro
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Financeiro {

	private Despesa despesa;
	private Custo custo;
	private Receita receita;
	private float lucro;
	
	public Despesa getDespesa() {
		return despesa;
	}
	
	public void setDespesa(Despesa despesa) {
		this.despesa = despesa;
	}
	
	public Custo getCusto() {
		return custo;
	}
	
	public void setCusto(Custo custo) {
		this.custo = custo;
	}
	
	public Receita getReceita() {
		return receita;
	}
	
	public void setReceita(Receita receita) {
		this.receita = receita;
	}
	
	public float getLucro() {
		return lucro = receita.getTotal() - (despesa.getTotal() + custo.getTotal());
	}
}
