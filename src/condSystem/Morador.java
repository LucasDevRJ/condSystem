package condSystem;

public class Morador extends Colaborador { //pode não ser colaborador do condomínio em si, mas é de alguma empresa

	private InformacoesPessoais informacoesPessoais;
	private Apartamento apartamento;
	private Profissao profissao;
	private boolean ehProprietario;
	private Conta titular;
	
	public void comprarApartamento(Receita financias) {
		if (this.isEhProprietario() == false) {
			if (this.titular.getSaldo() >= this.apartamento.getPrecoApartamento()) {
				this.getTitular().setSaldo(this.getTitular().getSaldo() - this.getApartamento().getPrecoApartamento());
				financias.setTotal(financias.getTotal() + this.apartamento.getPrecoApartamento());
				System.out.println("Apartamento Comprado com Sucesso!");
				System.out.println("Nome Completo do Novo Propritário: " + this.getInformacoesPessoais().getNome() + " " + this.getInformacoesPessoais().getSobrenome());
				System.out.println("CPF do Novo Proprietário: " + this.getInformacoesPessoais().getCpf());
				System.out.println("RG do Novo Proprietário: " + this.getInformacoesPessoais().getRg());
				System.out.println("Valor do Imóvel: R$ " + this.apartamento.getPrecoApartamento());
				System.out.println("Endereço do Imóvel: " + this.apartamento.getEndereco().getCidade() + " - " + this.apartamento.getEndereco().getRua() + " - " + this.apartamento.getNumero());
			}
		}
	}
	
	public void pagarAluguelCondominio(Receita financias, Condominio condominio) {
		if (this.isEhProprietario() == true) {
			if (this.titular.getSaldo() >= condominio.getValorAluguel()) {
				this.titular.setSaldo(this.titular.getSaldo() - condominio.getValorAluguel());
				financias.setTotal(condominio.getValorAluguel() + financias.getTotal());
				System.out.println("Aluguel Pago com Sucesso!");
				System.out.println("Nome Completo: " + this.getInformacoesPessoais().getNome() + " " + this.getInformacoesPessoais().getSobrenome());
				System.out.println("CPF: " + this.getInformacoesPessoais().getCpf());
				System.out.println("RG: " + this.getInformacoesPessoais().getRg());
				System.out.println("Número Apartamento: " + this.getApartamento().getNumero());
				System.out.println("Bloco Apartamento: " + this.getApartamento().getBloco());
				System.out.println("Valor Pago: R$ " + condominio.getValorAluguel());
			} else {
				System.out.println("Saldo insuficiente para pagar o alguel!");
			}
		} else {
			System.out.println("Para pagar aluguel tem que ser proprietário do apartamento!");
		}
	}
	
	public void alugarApartamento(Inquilino inquilino, Morador proprietario) {
		if (this.isEhProprietario() == true) {
			System.out.println("Imóvel Alugado com Sucesso!");
			System.out.println("Informações do Proprietário");
			System.out.println("Nome do Proprietário: " + proprietario.getInformacoesPessoais().getNome());
			System.out.println("Sobrenome do Proprietário: " + proprietario.getInformacoesPessoais().getSobrenome());
			System.out.println("CPF do Proprietário: " + inquilino.getInformacoesPessoais().getCpf());
			System.out.println("RG do Proprietário: " + inquilino.getInformacoesPessoais().getRg());
			System.out.println("Informações do Inquilino");
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
	
	public void receberAluguel(Inquilino inquilino, Apartamento apartamento) {
		if (this.isEhProprietario() == true) {
			if (inquilino.getTitular().getSaldo() >= apartamento.getPrecoAluguel()) {
				System.out.println("Aluguel Recebido com Sucessso!");
				System.out.println("Nome Completo do Inquilino: " + inquilino.getInformacoesPessoais().getNome() + " " + inquilino.getInformacoesPessoais().getSobrenome());
				System.out.println("CPF do Inquilino: " + inquilino.getInformacoesPessoais().getCpf());
				System.out.println("Valor do Aluguel: R$ " + apartamento.getPrecoAluguel());
				this.getTitular().setSaldo(this.getTitular().getSaldo() + apartamento.getPrecoAluguel());
				inquilino.getTitular().setSaldo(this.titular.getSaldo() - apartamento.getPrecoAluguel());
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

}
