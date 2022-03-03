package condSystem;

public class Administrador extends Colaborador implements CondSystem {

	@Override
	public void acessarInformacoesColaborador(Colaborador colaborador) {
		System.out.println("Informa��es do " + colaborador);
		System.out.println("Informa��es Pessoais:");
		System.out.println("Nome: " + colaborador.getInformacoesPessoais().getNome());
		System.out.println("Sobrenome: " + colaborador.getInformacoesPessoais().getSobrenome());
		System.out.println("Data de Nascimento: " + colaborador.getInformacoesPessoais().getDataNascimento());
		System.out.println("Naturalidade: " + colaborador.getInformacoesPessoais().getNaturalidade());
		System.out.println("Cidade Natal: " + colaborador.getInformacoesPessoais().getCidadeNatal());
		System.out.println("Profiss�o: " + colaborador.getInformacoesPessoais().getProfissao());
		System.out.println("RG: " + colaborador.getInformacoesPessoais().getRg());
		System.out.println("CPF: " + colaborador.getInformacoesPessoais().getCpf());
		System.out.println();
		System.out.println("Endere�o:");
		System.out.println("Pa�s: " + colaborador.getEndereco().getPais());
		System.out.println("Cidade: " + colaborador.getEndereco().getCidade());
		System.out.println("Estado: " + colaborador.getEndereco().getEstado());
		System.out.println("Rua: " + colaborador.getEndereco().getRua());
		System.out.println("N�mero: " + colaborador.getEndereco().getNumero());
		System.out.println("CEP: " + colaborador.getEndereco().getCep());
		System.out.println("Ponto de Refer�ncia: " + colaborador.getEndereco().getPontoReferencia());
		System.out.println("Complemento: " + colaborador.getEndereco().getComplemento());
		System.out.println();
		System.out.println("Emprego:");
		System.out.println("Cargo: " + colaborador.getProfissao().getCargo());
		System.out.println("Sal�rio: " + colaborador.getProfissao().getSalario());
		System.out.println("Turno: " + colaborador.getProfissao().getTurno());
	}

	@Override
	public void acessarFinanceiro(Financeiro financeiro) {
		System.out.println("Situa��o Financeira do Condom�nio");
		System.out.println("Total de Despesa: R$ " + financeiro.getDespesa().getTotal());
		System.out.println("Total de Custo: R$ " + financeiro.getCusto().getTotal());
		System.out.println("Total de Receita: R$ " + financeiro.getReceita().getTotal());
		System.out.println("Lucro Total: R$ " + financeiro.getLucro());
	}

	@Override
	public void acessarInformacoesMorador(Morador morador) {
		System.out.println("Informa��es do " + morador);
		System.out.println("Informa��es Pessoais:");
		System.out.println("Nome: " + morador.getInformacoesPessoais().getNome());
		System.out.println("Sobrenome: " + morador.getInformacoesPessoais().getSobrenome());
		System.out.println("Data de Nascimento: " + morador.getInformacoesPessoais().getDataNascimento());
		System.out.println("Naturalidade: " + morador.getInformacoesPessoais().getNaturalidade());
		System.out.println("Cidade Natal: " + morador.getInformacoesPessoais().getCidadeNatal());
		System.out.println("Profiss�o: " + morador.getInformacoesPessoais().getProfissao());
		System.out.println("RG: " + morador.getInformacoesPessoais().getRg());
		System.out.println("CPF: " + morador.getInformacoesPessoais().getCpf());
		System.out.println();
		System.out.println("Emprego:");
		System.out.println("Cargo: " + morador.getProfissao().getCargo());
		System.out.println("Sal�rio: " + morador.getProfissao().getSalario());
		System.out.println("Turno: " + morador.getProfissao().getTurno());
		System.out.println();
		System.out.println("Apartamento:");
		System.out.println("Bloco: " + morador.getApartamento().getBloco());
		System.out.println("N�mero: " + morador.getApartamento().getNumero());
		System.out.println("Tamanho: " + morador.getApartamento().getTamanho());
		System.out.println("N�mero de Quartos: " + morador.getApartamento().getNumeroQuartos());
		System.out.println("N�mero de Banheiros: " + morador.getApartamento().getNumeroBanheiros());
		System.out.println("N�mero de Vagas para Carro: " + morador.getApartamento().getNumeroVagasCarro());
		System.out.println("Descri��o: " + morador.getApartamento().getDescricao());
		System.out.println("Pre�o Aluguel: " + morador.getApartamento().getPrecoAlguel());
		if (morador.isEhProprietario() == true) {
			System.out.println("� Propriet�rio: Sim");
		} else {
			System.out.println("� Propriet�rio: N�o");
		}
	}

	@Override
	public void agendarReuniao(String data) {
		data = data.replaceAll("[^0-9]", "");
		data = data.substring(0,2) + "/" + data.substring(2,4) + "/" + data.substring(4,8);
		
		System.out.println("A reuni�o do condom�nio foi agendada para a data: " + data + "\nPor favor todos compare�am!");
	}
}
