package condSystem;

public class Cliente {

	private InformacoesPessoais informacoesPessoais;
	private Profissao profissao;
	private Endereco endereco;
	
	public InformacoesPessoais getInformacoesPessoais() {
		return informacoesPessoais;
	}
	
	public void setInformacoesPessoais(InformacoesPessoais informacoesPessoais) {
		this.informacoesPessoais = informacoesPessoais;
	}
	
	public Profissao getProfissao() {
		return profissao;
	}
	
	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
