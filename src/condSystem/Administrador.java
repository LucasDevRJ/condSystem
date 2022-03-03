package condSystem;

public class Administrador extends Colaborador implements CondSystem {

	@Override
	public void acessarInformacoesColaborador(Colaborador colaborador) {
		System.out.println("Informações do " + colaborador);
		System.out.println("Informações Pessoais:");
		System.out.println("Nome: " + colaborador.getInformacoesPessoais().getNome());
		System.out.println("Sobrenome: " + colaborador.getInformacoesPessoais().getSobrenome());
		System.out.println("Data de Nascimento: " + colaborador.getInformacoesPessoais().getDataNascimento());
		System.out.println("Naturalidade: " + colaborador.getInformacoesPessoais().getNaturalidade());
		System.out.println("Cidade Natal: " + colaborador.getInformacoesPessoais().getCidadeNatal());
		System.out.println("Profissão: " + colaborador.getInformacoesPessoais().getProfissao());
		System.out.println("RG: " + colaborador.getInformacoesPessoais().getRg());
		System.out.println("CPF: " + colaborador.getInformacoesPessoais().getCpf());
		System.out.println();
		System.out.println("Endereço:");
		System.out.println("País: " + colaborador.getEndereco().getPais());
		System.out.println("Cidade: " + colaborador.getEndereco().getCidade());
		System.out.println("Estado: " + colaborador.getEndereco().getEstado());
		System.out.println("Rua: " + colaborador.getEndereco().getRua());
		System.out.println("Número: " + colaborador.getEndereco().getNumero());
		System.out.println("CEP: " + colaborador.getEndereco().getCep());
		System.out.println("Ponto de Referência: " + colaborador.getEndereco().getPontoReferencia());
		System.out.println("Complemento: " + colaborador.getEndereco().getComplemento());
		System.out.println();
		System.out.println("Emprego:");
		System.out.println("Cargo: " + colaborador.getProfissao().getCargo());
		System.out.println("Salário: " + colaborador.getProfissao().getSalario());
		System.out.println("Turno: " + colaborador.getProfissao().getTurno());
	}

	@Override
	public void acessarFinanceiro(Financeiro financeiro) {
		System.out.println("Situação Financeira do Condomínio");
		System.out.println("Total de Despesa: R$ " + financeiro.getDespesa().getTotal());
		System.out.println("Total de Custo: R$ " + financeiro.getCusto().getTotal());
		System.out.println("Total de Receita: R$ " + financeiro.getReceita().getTotal());
		System.out.println("Lucro Total: R$ " + financeiro.getLucro());
	}

	@Override
	public void acessarInformacoesMorador(Morador morador) {
		System.out.println("Informações do " + morador);
		System.out.println("Informações Pessoais:");
		System.out.println("Nome: " + morador.getInformacoesPessoais().getNome());
		System.out.println("Sobrenome: " + morador.getInformacoesPessoais().getSobrenome());
		System.out.println("Data de Nascimento: " + morador.getInformacoesPessoais().getDataNascimento());
		System.out.println("Naturalidade: " + morador.getInformacoesPessoais().getNaturalidade());
		System.out.println("Cidade Natal: " + morador.getInformacoesPessoais().getCidadeNatal());
		System.out.println("Profissão: " + morador.getInformacoesPessoais().getProfissao());
		System.out.println("RG: " + morador.getInformacoesPessoais().getRg());
		System.out.println("CPF: " + morador.getInformacoesPessoais().getCpf());
		System.out.println();
		System.out.println("Emprego:");
		System.out.println("Cargo: " + morador.getProfissao().getCargo());
		System.out.println("Salário: " + morador.getProfissao().getSalario());
		System.out.println("Turno: " + morador.getProfissao().getTurno());
		System.out.println();
		System.out.println("Apartamento:");
		System.out.println("Bloco: " + morador.getApartamento().getBloco());
		System.out.println("Número: " + morador.getApartamento().getNumero());
		System.out.println("Tamanho: " + morador.getApartamento().getTamanho());
		System.out.println("Número de Quartos: " + morador.getApartamento().getNumeroQuartos());
		System.out.println("Número de Banheiros: " + morador.getApartamento().getNumeroBanheiros());
		System.out.println("Número de Vagas para Carro: " + morador.getApartamento().getNumeroVagasCarro());
		System.out.println("Descrição: " + morador.getApartamento().getDescricao());
		System.out.println("Preço Aluguel: " + morador.getApartamento().getPrecoAlguel());
		if (morador.isEhProprietario() == true) {
			System.out.println("É Proprietário: Sim");
		} else {
			System.out.println("É Proprietário: Não");
		}
	}

	@Override
	public void agendarReuniao(String data) {
		data = data.replaceAll("[^0-9]", "");
		data = data.substring(0,2) + "/" + data.substring(2,4) + "/" + data.substring(4,8);
		
		System.out.println("A reunião do condomínio foi agendada para a data: " + data + "\nPor favor todos compareçam!");
	}
}
