package condSystem;

public class Morador {

	private InformacoesPessoais informacoesPessoais;
	private Apartamento apartamento;
	private Profissao profissao;
	private boolean ehProprietario;
	private float saldoBancario;
	
	
	
	public void reformarApartamento(int opcaoEscolhida) {
		int opcaoReforma = opcaoEscolhida;
		float reformaPreco = 1000.0f;
		
		switch (opcaoReforma) {
			case 1:
				if (profissao.getSalario() >= reformaPreco) {
					System.out.println("Reforma paga com sucesso!\nA reforma será no:\nQuarto\nBanheiro");
				} else {
					System.out.println("Infelizmente não possui renda suficiente para a reforma de R$ 1.000,00");
				}
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
		if (profissao.getSalario() >= saldoBancario) {
			saldoBancario += profissao.getSalario();
			this.saldoBancario = saldoBancario;
		} else {
			System.out.println("Salário não compativel com o valor que deseja depositar!");
		}
	}

}
