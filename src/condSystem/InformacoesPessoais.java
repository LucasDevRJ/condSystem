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
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getNaturalidade() {
		return naturalidade;
	}
	
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	
	public String getCidadeNatal() {
		return cidadeNatal;
	}
	
	public void setCidadeNatal(String cidadeNatal) {
		this.cidadeNatal = cidadeNatal;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
