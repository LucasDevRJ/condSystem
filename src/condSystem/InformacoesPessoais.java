package condSystem;

public class InformacoesPessoais {

	private String nome;
	private String sobrenome;
	private String dataNascimento;
	private String naturalidade;
	private String cidadeNatal;
	private String rg;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome.length() == 0) {
			throw new NullPointerException("Insira o nome, por favor!");
		}
		
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		if (sobrenome.length() == 0) {
			throw new NullPointerException("Insira o sobrenome, por favor!");
		}
		
		this.sobrenome = sobrenome;
	}

	public String getNaturalidade() {
		return naturalidade;
	}
	
	public void setNaturalidade(String naturalidade) {
		if (naturalidade.length() == 0) {
			throw new NullPointerException("Insira a naturalidade, por favor!");
		}
		
		this.naturalidade = naturalidade;
	}
	
	public String getCidadeNatal() {
		return cidadeNatal;
	}
	
	public void setCidadeNatal(String cidadeNatal) {
		if (cidadeNatal.length() == 0) {
			throw new NullPointerException("Insira a cidade natal, por favor!");
		}
		
		this.cidadeNatal = cidadeNatal;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		if (rg.length() == 0) {
			throw new NullPointerException("Insira o RG, por favor!");
		}
		
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		if (cpf.length() == 0) {
			throw new NullPointerException("Insira o CPF, por favor!");
		}
		
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		if (dataNascimento.length() == 0) {
			throw new NullPointerException("Insira a data de nascimento, por favor!");
		}
		
		this.dataNascimento = dataNascimento;
	}
}
