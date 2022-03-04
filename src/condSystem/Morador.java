package condSystem;

public class Morador extends Colaborador { //pode não ser colaborador do condomínio em si, mas é de alguma empresa

	private InformacoesPessoais informacoesPessoais;
	private Apartamento apartamento;
	private Profissao profissao;
	private boolean ehProprietario;
	private float valorAluguel;
	private Conta titular;
	
	public void alugarApartamento(Inquilino inquilino) {
		if (this.isEhProprietario() == true) {
			System.out.println("Imóvel Alugado com Sucesso!");
			System.out.println("Nome do Inquilino: " + inquilino.getInformacoesPessoais().getNome());
			System.out.println("Sobrenome do Inquilino: " + inquilino.getInformacoesPessoais().getSobrenome());
			System.out.println("CPF do Inquilino: " + inquilino.getInformacoesPessoais().getCpf());
			System.out.println("RG do Inquilino: " + inquilino.getInformacoesPessoais().getRg());
			System.out.println("Profissão do Inquilino: " + inquilino.getProfissao().getCargo());
			System.out.println("Salário do Inquilino: " + inquilino.getProfissao().getSalario());
		} else {
			System.out.println("Para alugar um imóvel precisa ser proprietário!");
		}
	}
	
	public void receberAluguel(Inquilino inquilino) {
		if (this.isEhProprietario() == true) {
			if (inquilino.getTitular().getSaldo() >= this.getValorAluguel()) {
				System.out.println("Aluguel Recebido com Sucessso!");
				System.out.println("Nome Completo do Inquilino: " + inquilino.getInformacoesPessoais().getNome() + " " + inquilino.getInformacoesPessoais().getSobrenome());
				System.out.println("CPF do Inquilino: " + inquilino.getInformacoesPessoais().getCpf());
				System.out.println("Valor do Aluguel: R$ " + this.getValorAluguel());
				float saldoInquilino = inquilino.getTitular().getSaldo();
				saldoInquilino -= this.getValorAluguel();
				inquilino.getTitular().setSaldo(saldoInquilino);
			}
		}
	}
	
	public void reformarApartamento(int opcaoEscolhida) {
		int opcaoReforma = opcaoEscolhida;
		float reformaPreco = 1000.0f;
		
		switch (opcaoReforma) {
			case 1:
				if (profissao.getSalario() >= reformaPreco) {
					System.out.println("Reforma paga com sucesso!\nA reforma será no:\nQuarto\nBanheiro");
					titular.setSaldo(titular.getSaldo() - reformaPreco);
				} else {
					System.out.println("Infelizmente não possui renda suficiente para a reforma de R$ 1.000,00");
				}
			break;
			
			case 2:
				reformaPreco = 2000.0f;
				if (profissao.getSalario() >= reformaPreco) {
					System.out.println("Reforma paga com sucesso!\nA reforma será no:\nDois Quartos\nBanheiro\nSala\n");
					titular.setSaldo(titular.getSaldo() - reformaPreco);
				} else {
					System.out.println("Infelizmente não possui renda suficiente para a reforma de R$ 2.000,00");
				}
			break;
			
			case 3:
				reformaPreco = 3000.0f;
				if (profissao.getSalario() >= reformaPreco) {
					System.out.println("Reforma paga com sucesso!\nA reforma será no:\nTrês Quartos\n Dois Banheiro\nSala\nCozinha\nSotão");
					titular.setSaldo(titular.getSaldo() - reformaPreco);
				} else {
					System.out.println("Infelizmente não possui renda suficiente para a reforma de R$ 3.000,00");
				}
			break;
			
			default:
				System.out.println("Opção inválida!\nDigite as opções:\n1 - Quarto e Banheiro\n2 - 2 Quartos, Banheiro e Sala\n3 - Três Quartos, Dois Banheiros, Sala, Cozinha e Sotão");
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

	public float getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(float valorAluguel) {
		if (this.isEhProprietario() == true) {
			if (valorAluguel > 0) {
				this.valorAluguel = valorAluguel;
			} else {
				System.out.println("Valor menor que 0!");
			}
		} else {
			System.out.println("Precisa ser proprietário do imóvel para definir um preço de alguel nele!");
		}
	}

}
