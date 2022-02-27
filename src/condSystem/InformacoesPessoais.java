package condSystem;

public class InformacoesPessoais {

	private String nome;
	private String sobrenome;
	private String dataNascimento;
	private String naturalidade;
	private String cidadeNatal;
	private String profissao;
	private String rg;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		nome = nome.replaceAll("[^A-Za-z]", "");
		
		if (nome.length() > 0) {
			this.nome = nome;
		} else {
			System.out.println("Digite o nome!");
		}
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		sobrenome = sobrenome.replaceAll("[^A-Za-z]", "");
		
		if (sobrenome.length() > 0) {
			this.sobrenome = sobrenome;
		} else {
			System.out.println("Digite o sobrenome!");
		}
	}

	public String getNaturalidade() {
		return naturalidade;
	}
	
	public void setNaturalidade(String naturalidade) {
		naturalidade = naturalidade.replaceAll("[^A-Za-z]", "");
		
		if (naturalidade.length() > 0) {
			this.naturalidade = naturalidade;
		} else {
			System.out.println("Digite a naturalidade!");
		}
	}
	
	public String getCidadeNatal() {
		return cidadeNatal;
	}
	
	public void setCidadeNatal(String cidadeNatal) {
		cidadeNatal = cidadeNatal.replaceAll("[^A-Za-z]", "");
		
		if (cidadeNatal.length() > 0) {
			this.cidadeNatal = cidadeNatal;
		} else {
			System.out.println("Digite a cidade natal!");
		}
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		profissao = profissao.replaceAll("[^A-Za-z]", "");
		
		if (profissao.length() > 0) {
			this.profissao = profissao;
		} else {
			System.out.println("Digite a profissão!");
		}
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		rg = rg.replaceAll("[^0-9]", "");
		rg = rg.substring(0,2) + "." + rg.substring(2,5) + "." + rg.substring(5,8) + "-" + rg.substring(8,9);
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		cpf = cpf.replaceAll("[^0-9]", "");
		cpf = cpf.substring(0,3) + "." + cpf.substring(3,6) + "." + cpf.substring(6,9) + "-" + cpf.substring(9,11);
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		dataNascimento = dataNascimento.replaceAll("[^0-9]", "");
		dataNascimento = dataNascimento.substring(0,2) + "/" + dataNascimento.substring(2,4) + "/" + dataNascimento.substring(4,8);
		this.dataNascimento = dataNascimento;
	}
}
