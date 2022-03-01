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
		cargo = cargo.replaceAll("[^a-zA-Z]", "");
		if (cargo.length() == 0) {
			System.out.println("Digite o cargo!");
		} else {
			this.cargo = cargo;
		}
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		if (salario < 0) {
			System.out.println("Valor inválido!");
		} else {
			this.salario = salario;
		}
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		turno = turno.replaceAll("[^A-Za-z]", "");
		if (turno.length() == 0) {
			System.out.println("Digite o turno!");
		}
		this.turno = turno;
	}

	public String getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(String dataIngresso) {
		dataIngresso = dataIngresso.replaceAll("[^0-9]", "");
		dataIngresso = dataIngresso.substring(0,2) + "/" + dataIngresso.substring(2,4) + "/" + dataIngresso.substring(4,8);
		this.dataIngresso = dataIngresso;
	}

	public String getDescricaoAtividades() {
		return descricaoAtividades;
	}

	public void setDescricaoAtividades(String descricaoAtividades) {
		this.descricaoAtividades = descricaoAtividades;
	}

}
