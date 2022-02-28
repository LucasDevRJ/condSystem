package condSystem;

public class Condominio {

	private Endereco endereco;
	private String nome;
	private int tamanho;
	private int numeroPiscinas;
	private int numeroQuadras;
	private int numeroAcademia;
	
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
		nome = nome.replaceAll("[^A-Za-z-0-9]", "");
		
		if (nome.length() > 0) {
			this.nome = nome;
		} else {
			System.out.println("Digite o nome!");
		}
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		if (tamanho < 0) {
			System.out.println("Valor inválido!");
		} else {
			this.tamanho = tamanho;
		}
	}
	
	public int getNumeroPiscinas() {
		return numeroPiscinas;
	}
	
	public void setNumeroPiscinas(int numeroPiscinas) {
		if (numeroPiscinas < 0) {
			System.out.println("Valor inválido!");
		} else {
			this.numeroPiscinas = numeroPiscinas;
		}
	}
	
	public int getNumeroQuadras() {
		return numeroQuadras;
	}
	
	public void setNumeroQuadras(int numeroQuadras) {
		if (numeroQuadras < 0) {
			System.out.println("Valor inválido!");
		} else {
			this.numeroQuadras = numeroQuadras;
		}
	}
	
	public int getNumeroAcademia() {
		return numeroAcademia;
	}
	
	public void setNumeroAcademia(int numeroAcademia) {
		if (numeroAcademia < 0) {
			System.out.println("Valor inválido!");
		} else {
			this.numeroAcademia = numeroAcademia;
		}
	}
}
