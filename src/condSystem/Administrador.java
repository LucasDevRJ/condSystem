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
		System.out.println("Cargo: " + colaborador.getCargo());
		System.out.println("Salário: " + colaborador.getSalario());
		System.out.println("Turno: " + colaborador.getTurno());
	}

	@Override
	public void acessarFinanceiro(Financeiro financeiro) {
		System.out.println("Situação Financeira do Condomínio");
		System.out.println("Total de Despesa: R$ " + financeiro.getDespesa().getTotal());
		System.out.println("Total de Custo: R$ " + financeiro.getCusto().getTotal());
		System.out.println("Total de Receita: R$ " + financeiro.getReceita().getTotal());
		System.out.println("Lucro Total: R$ " + financeiro.getLucro());
	}
}
