package condSystem;

public class Morador {

	private InformacoesPessoais informacoesPessoais;
	private Apartamento apartamento;
	private Profissao profissao;
	private boolean ehProprietario;
	private float saldoBancario;
	
	public void depositar(float valor) {
		float saldo = this.getSaldoBancario();
		
		if (valor <= profissao.getSalario()) {
			saldo += valor;
			this.setSaldoBancario(saldo);
		} else {
			System.out.println("N�o possui o valor que deseja sacar na sua conta!");
		}
	}
	
	
	public void reformarApartamento(int opcaoEscolhida) {
		int opcaoReforma = opcaoEscolhida;
		float reformaPreco = 1000.0f;
		
		switch (opcaoReforma) {
			case 1:
				if (profissao.getSalario() >= reformaPreco) {
					System.out.println("Reforma paga com sucesso!\nA reforma ser� no:\nQuarto\nBanheiro");
					this.setSaldoBancario(this.getSaldoBancario() - reformaPreco);
				} else {
					System.out.println("Infelizmente n�o possui renda suficiente para a reforma de R$ 1.000,00");
				}
			break;
			
			case 2:
				reformaPreco = 2000.0f;
				if (profissao.getSalario() >= reformaPreco) {
					System.out.println("Reforma paga com sucesso!\nA reforma ser� no:\nDois Quartos\nBanheiro\nSala\n");
					this.setSaldoBancario(this.getSaldoBancario() - reformaPreco);
				} else {
					System.out.println("Infelizmente n�o possui renda suficiente para a reforma de R$ 2.000,00");
				}
			break;
			
			case 3:
				reformaPreco = 3000.0f;
				if (profissao.getSalario() >= reformaPreco) {
					System.out.println("Reforma paga com sucesso!\nA reforma ser� no:\nTr�s Quartos\n Dois Banheiro\nSala\nCozinha\nSot�o");
					this.setSaldoBancario(this.getSaldoBancario() - reformaPreco);
				} else {
					System.out.println("Infelizmente n�o possui renda suficiente para a reforma de R$ 3.000,00");
				}
			break;
			
			default:
				System.out.println("Op��o inv�lida!\nDigite as op��es:\n1 - Quarto e Banheiro\n2 - 2 Quartos, Banheiro e Sala\n3 - Tr�s Quartos, Dois Banheiros, Sala, Cozinha e Sot�o");
			break;
		}
	}

	public InformacoesPessoais getInformacoesPessoais() {
		return informacoesPessoais;
	}

	public void setInformacoesPessoais(InformacoesPessoais informacoesPessoais) {
		this.informacoesPessoais = informacoesPessoais;
	}

	public Apartamento getApartamento() {
		return apartamento;
	}

	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}

	public boolean isEhProprietario() {
		return ehProprietario;
	}

	public void setEhProprietario(boolean ehProprietario) {
		this.ehProprietario = ehProprietario;
	}

	public Profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}

	public float getSaldoBancario() {
		return saldoBancario;
	}

	public void setSaldoBancario(float saldoBancario) {
		this.saldoBancario = saldoBancario;
	}

}
