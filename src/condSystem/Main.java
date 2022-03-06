package condSystem;

public class Main {

	public static void main(String[] args) {
		//Criação e instaciação de Objetos
		Endereco enderecoCondominio = new Endereco();
		enderecoCondominio.setPais("Brasil");
		enderecoCondominio.setCep("32454565");
		enderecoCondominio.setEstado("Rio de Janeiro");
		enderecoCondominio.setCidade("Rio de Janeiro");
		enderecoCondominio.setRua("Rua do Java");
		enderecoCondominio.setNumero("3004");
		enderecoCondominio.setPontoReferencia("Próximo à praça das Graças");
		
		Condominio condominio = new Condominio();
		condominio.setNome("Condomínio Lazer");
		condominio.setEndereco(enderecoCondominio);
		condominio.setNumeroAcademia(1);
		condominio.setNumeroPiscinas(1);
		condominio.setNumeroQuadras(2);
		condominio.setTamanho(1500);
		
		Apartamento apartamento = new Apartamento();
		apartamento.setBloco("Bloco A");
		apartamento.setNumero("305");
		apartamento.setEndereco(enderecoCondominio);
		apartamento.setNumeroBanheiros(1);
		apartamento.setNumeroQuartos(2);
		apartamento.setNumeroVagasCarro(1);
		//apartamento.setPrecoAlguel(300, null);
		
		InformacoesPessoais informacoesPessoaisMorador = new InformacoesPessoais();
		informacoesPessoaisMorador.setNome("Marcus");
		informacoesPessoaisMorador.setSobrenome("Fênix");
		informacoesPessoaisMorador.setDataNascimento("03/02/1997");
		informacoesPessoaisMorador.setCpf("323.544.985-40");
		informacoesPessoaisMorador.setRg("45.433.783-8");
		informacoesPessoaisMorador.setNaturalidade("brasileiro");
		informacoesPessoaisMorador.setCidadeNatal("Rio de Janeiro");
		
		Profissao profissaoMorador = new Profissao();
		profissaoMorador.setCargo("Contador");
		profissaoMorador.setDataIngresso("10/06/2013");
		profissaoMorador.setSalario(4240.0f);
		profissaoMorador.setTurno("Vespertino");
		profissaoMorador.setDescricaoAtividades("Realização das atividades contabéis.");
		
		Conta contaMorador = new Conta();
		contaMorador.setAgencia(32);
		contaMorador.setNumero(33433432);
		contaMorador.setSaldo(2370.40f);
		contaMorador.setSenha(33424);
		
		Morador morador = new Morador();
		morador.setApartamento(apartamento);
		morador.setInformacoesPessoais(informacoesPessoaisMorador);
		morador.setEndereco(enderecoCondominio);
		morador.setEhProprietario(true);
		morador.setProfissao(profissaoMorador);
		morador.setTitular(contaMorador);
	}
}
