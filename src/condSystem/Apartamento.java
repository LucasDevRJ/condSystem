package condSystem;

public class Apartamento {

	private Endereco endereco;
	private String bloco;
	private String numero;
	private int tamanho;
	private int numeroQuartos;
	private int numeroBanheiros;
	private int numeroVagasCarro;
	private String descricao;
	
	public String getBloco() {
		return bloco;
	}
	
	public void setBloco(String bloco) {
		this.bloco = bloco;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public int getNumeroQuartos() {
		return numeroQuartos;
	}
	
	public void setNumeroQuartos(int numeroQuartos) {
		this.numeroQuartos = numeroQuartos;
	}
	
	public int getNumeroBanheiros() {
		return numeroBanheiros;
	}
	
	public void setNumeroBanheiros(int numeroBanheiros) {
		this.numeroBanheiros = numeroBanheiros;
	}
	public int getNumeroVagasCarro() {
		return numeroVagasCarro;
	}
	
	public void setNumeroVagasCarro(int numeroVagasCarro) {
		this.numeroVagasCarro = numeroVagasCarro;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
