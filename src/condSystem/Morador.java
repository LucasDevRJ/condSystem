package condSystem;

public class Morador extends Colaborador { //pode n�o ser colaborador do condom�nio em si, mas � de alguma empresa

	private InformacoesPessoais informacoesPessoais;
	private Apartamento apartamento;
	private Profissao profissao;
	private boolean ehProprietario;
	private Conta titular;
	
	public void comprarApartamento(Receita financias) {
		if (this.isEhProprietario() == false) {
			if (this.titular.getSaldo() >= this.apartamento.getPrecoApartamento()) {
				this.getTitular().setSaldo(this.getTitular().getSaldo() - this.getApartamento().getPrecoApartamento());
				
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
				System.out.println("N�mero Apartamento: " + this.getApartamento().getNumero());
				System.out.println("Bloco Apartamento: " + this.getApartamento().getBloco());
				System.out.println("Valor Pago: R$ " + condominio.getValorAluguel());
			}
		}
	}
	
	public void alugarApartamento(Inquilino inquilino) {
		if (this.isEhProprietario() == true) {
			System.out.println("Im�vel Alugado com Sucesso!");
			System.out.println("Nome do Inquilino: " + inquilino.getInformacoesPessoais().getNome());
			System.out.println("Sobrenome do Inquilino: " + inquilino.getInformacoesPessoais().getSobrenome());
			System.out.println("CPF do Inquilino: " + inquilino.getInformacoesPessoais().getCpf());
			System.out.println("RG do Inquilino: " + inquilino.getInformacoesPessoais().getRg());
			System.out.println("Profiss�o do Inquilino: " + inquilino.getProfissao().getCargo());
			System.out.println("Sal�rio do Inquilino: " + inquilino.getProfissao().getSalario());
		} else {
			System.out.println("Para alugar um im�vel precisa ser propriet�rio!");
		}
	}
	
	public void receberAluguel(Inquilino inquilino, Apartamento apartamento) {
		if (this.isEhProprietario() == true) {
			if (inquilino.getTitular().getSaldo() >= apartamento.getPrecoAluguel()) {
				System.out.println("Aluguel Recebido com Sucessso!");
				System.out.println("Nome Completo do Inquilino: " + inquilino.getInformacoesPessoais().getNome() + " " + inquilino.getInformacoesPessoais().getSobrenome());
				System.out.println("CPF do Inquilino: " + inquilino.getInformacoesPessoais().getCpf());
				System.out.println("Valor do Aluguel: R$ " + apartamento.getPrecoAluguel());
				float saldoInquilino = inquilino.getTitular().getSaldo();
				saldoInquilino -= apartamento.getPrecoAluguel();
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
