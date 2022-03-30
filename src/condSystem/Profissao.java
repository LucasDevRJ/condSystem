package condSystem;

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
			throw new IllegalArgumentException("Insira um salário válido, por favor!");
		}
		
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		if (turno.length() == 0) {
			throw new NullPointerException("Insira um turno, por favor!");
		}
		
		this.turno = turno;
	}

	public String getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(String dataIngresso) {
		if (dataIngresso.length() == 0) {
			throw new NullPointerException("Insira a data de ingresso, por favor!");
		}
		
		this.dataIngresso = dataIngresso;
	}

	public String getDescricaoAtividades() {
		return descricaoAtividades;
	}

	public void setDescricaoAtividades(String descricaoAtividades) {
		if (descricaoAtividades.length() == 0) {
			throw new NullPointerException("Insira a descriçao de atividades, por favor!");
		}
		
		this.descricaoAtividades = descricaoAtividades;
	}
}
