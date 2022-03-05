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
	private float precoAluguel;
	
	public String getBloco() {
		return bloco;
	}
	
	public void setBloco(String bloco) {
		bloco = bloco.replaceAll("[^a-zA-Z0-9]", "");
		if (bloco.length() == 0) {
			System.out.println("Digite o bloco!");
		} else {
			this.bloco = bloco;
		}
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		numero = numero.replaceAll("[^a-zA-Z0-9]", "");
		if (numero.length() == 0) {
			System.out.println("Digite o bloco!");
		} else {
			this.numero = numero;
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
	
	public int getNumeroQuartos() {
		return numeroQuartos;
	}
	
	public void setNumeroQuartos(int numeroQuartos) {
		if (numeroQuartos < 0) {
			System.out.println("Valor inválido!");
		} else {
			this.numeroQuartos = numeroQuartos;
		}
	}
	
	public int getNumeroBanheiros() {
		return numeroBanheiros;
	}
	
	public void setNumeroBanheiros(int numeroBanheiros) {
		if (numeroBanheiros < 0) {
			System.out.println("Valor inválido!");
		} else {
			this.numeroBanheiros = numeroBanheiros;
		}
	}
	
	public int getNumeroVagasCarro() {
		return numeroVagasCarro;
	}
	
	public void setNumeroVagasCarro(int numeroVagasCarro) {
		if (numeroVagasCarro < 0) {
			System.out.println("Valor inválido!");
		} else {
			this.numeroVagasCarro = numeroVagasCarro;
		}
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		if (descricao.length() == 0) {
			System.out.println("Digite a descrição!");
		} else {
			this.descricao = descricao;
		}
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public float getPrecoAluguel() {
		return precoAluguel;
	}

	public void setPrecoAluguel(float precoAluguel, Morador proprietario) {
		if (proprietario.isEhProprietario() == true) {
			if (precoAluguel > 0) {
				this.precoAluguel = precoAluguel;;
			} else {
				System.out.println("O valor do aluguel precisa ser maior que 0!");
			}
		} else {
			System.out.println("Para precificar o apartamento como aluguel é preciso ser proprietário!");
		}
	}
}
