package condSystem;

public abstract class Colaborador {

	private InformacoesPessoais informacoesPessoais;
	private Endereco endereco;
	private String cargo;
	private float salario;	
	private String turno;

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
		this.salario = salario;
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

	public InformacoesPessoais getInformacoesPessoais() {
		return informacoesPessoais;
	}

	public void setInformacoesPessoais(InformacoesPessoais informacoesPessoais) {
		this.informacoesPessoais = informacoesPessoais;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
