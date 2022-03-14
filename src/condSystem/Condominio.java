package condSystem;

public class Condominio {

	private Endereco endereco;
	private String nome;
	private int tamanho;
	private int numeroPiscinas;
	private int numeroQuadras;
	private int numeroAcademia;
	private int numeroParquinho;
	private float valorAluguel;
	private Financeiro receita;
	
	public void construirParquinho(float tamanhoParquinho) {
		//a constru��o do parquinho custa R$ 1000,00 a cada 100 metros
		float precoConstrucao = (tamanhoParquinho * 1000.00f) / 100;
		if (this.getTamanho() > tamanhoParquinho) {
			if (this.getReceita().getLucro() >= precoConstrucao) {
				this.setNumeroParquinho(this.getNumeroParquinho() + 1);
				System.out.println("Constru��o do Parquinho Realizada com Sucesso!");
				System.out.println("Valor da Constru��o: R$ " + precoConstrucao);
				System.out.println("Tamanho do Parquinho Construido: " + tamanhoParquinho + " metros");
				System.out.println("N�mero Total de Parquinhos no Condom�nio: " + this.getNumeroParquinho());
			}
		}
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public int getNumeroPiscinas() {
		return numeroPiscinas;
	}
	
	public void setNumeroPiscinas(int numeroPiscinas) {
		this.numeroPiscinas = numeroPiscinas;
	}
	
	public int getNumeroQuadras() {
		return numeroQuadras;
	}
	
	public void setNumeroQuadras(int numeroQuadras) {
		this.numeroQuadras = numeroQuadras;
	}
	
	public int getNumeroAcademia() {
		return numeroAcademia;
	}
	
	public void setNumeroAcademia(int numeroAcademia) {
		this.numeroAcademia = numeroAcademia;
	}

	public float getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(float valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	public Financeiro getReceita() {
		return receita;
	}

	public void setReceita(Financeiro receita) {
		this.receita = receita;
	}

	public int getNumeroParquinho() {
		return numeroParquinho;
	}

	public void setNumeroParquinho(int numeroParquinho) {
		this.numeroParquinho = numeroParquinho;
	}
}
