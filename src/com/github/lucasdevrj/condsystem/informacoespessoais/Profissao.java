package com.github.lucasdevrj.condsystem.informacoespessoais;
/**
 * Classe que representa a Profiss„o
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class Profissao {

	private String cargo;
	private float salario;	
	private String turno;
	private String dataIngresso;
	private String descricaoAtividades;
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		cargo = cargo.trim();
		
		cargo = cargo.replaceAll("[^a-zA-Z Ì„·‡Ùı¸Õ√¡¿’‘‹]", "");
		
		if (cargo.contains("  ")) {
			throw new IllegalArgumentException("N„o coloque muitos espaÁos, por favor!");
		}
		
		if (cargo.length() == 0) {
			throw new NullPointerException("Insira o cargo, por favor!");
		}
		
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		if (salario <= 0) {
			throw new IllegalArgumentException("Insira um sal·rio v·lido, por favor!");
		}
		
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		turno = turno.trim();
		
		turno = turno.replaceAll("[^a-zA-Z Ì„·‡Ùı¸Õ√¡¿’‘‹]", "");
		
		if (turno.contains("  ")) {
			throw new IllegalArgumentException("N„o coloque muitos espaÁos, por favor!");
		}
		
		if (turno.length() == 0) {
			throw new NullPointerException("Insira um turno, por favor!");
		}
		
		this.turno = turno;
	}

	public String getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(String dataIngresso) {
		dataIngresso = dataIngresso.trim();
		
		dataIngresso = dataIngresso.replaceAll("[^0-9]", "");
		
		dataIngresso = dataIngresso.substring(0,2) + "/" + dataIngresso.substring(2,4) + "/" + dataIngresso.substring(4,8);
		
		if (dataIngresso.length() == 0) {
			throw new NullPointerException("Insira a data de ingresso, por favor!");
		}
		
		this.dataIngresso = dataIngresso;
	}

	public String getDescricaoAtividades() {
		return descricaoAtividades;
	}

	public void setDescricaoAtividades(String descricaoAtividades) {
		descricaoAtividades = descricaoAtividades.trim();
		
		descricaoAtividades = descricaoAtividades.replaceAll("[^a-zA-Z Ì„·‡Ùı¸Õ√¡¿’‘‹,.!;:]", "");
		
		if (descricaoAtividades.contains("  ")) {
			throw new IllegalArgumentException("N„o coloque muitos espaÁos, por favor!");
		}
		
		if (descricaoAtividades.length() == 0) {
			throw new NullPointerException("Insira a descriÁao de atividades, por favor!");
		}
		
		this.descricaoAtividades = descricaoAtividades;
	}
}
