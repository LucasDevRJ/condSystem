package condSystem;

public class Morador extends Colaborador { //pode n�o ser colaborador do condom�nio em si, mas � de alguma empresa

	private InformacoesPessoais informacoesPessoais;
	private Apartamento apartamento;
	private Profissao profissao;
	private boolean ehProprietario;
	private Conta titular;
	
	public void receberAluguel(float valor) {
		if (this.isEhProprietario() == true) {
			titular.setSaldo(titular.getSaldo() + valor);
			System.out.println("Aluguel Recebido com Sucesso!");
			System.out.println("Valor: R$ " + valor);
		} else {
			System.out.println("Tem que ser propriet�rio para receber aluguel!");
		}
	}
	
	public void reformarApartamento(int opcaoEscolhida) {
		int opcaoReforma = opcaoEscolhida;
		float reformaPreco = 1000.0f;
		
		switch (opcaoReforma) {
			case 1:
				if (profissao.getSalario() >= reformaPreco) {
					System.out.println("Reforma paga com sucesso!\nA reforma ser� no:\nQuarto\nBanheiro");
					titular.setSaldo(titular.getSaldo() - reformaPreco);
				} else {
					System.out.println("Infelizmente n�o possui renda suficiente para a reforma de R$ 1.000,00");
				}
			break;
			
			case 2:
				reformaPreco = 2000.0f;
				if (profissao.getSalario() >= reformaPreco) {
					System.out.println("Reforma paga com sucesso!\nA reforma ser� no:\nDois Quartos\nBanheiro\nSala\n");
					titular.setSaldo(titular.getSaldo() - reformaPreco);
				} else {
					System.out.println("Infelizmente n�o possui renda suficiente para a reforma de R$ 2.000,00");
				}
			break;
			
			case 3:
				reformaPreco = 3000.0f;
				if (profissao.getSalario() >= reformaPreco) {
					System.out.println("Reforma paga com sucesso!\nA reforma ser� no:\nTr�s Quartos\n Dois Banheiro\nSala\nCozinha\nSot�o");
					titular.setSaldo(titular.getSaldo() - reformaPreco);
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

	public Conta getTitular() {
		return titular;
	}

	public void setTitular(Conta titular) {
		this.titular = titular;
	}

}
