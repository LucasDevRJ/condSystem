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
		
		InformacoesPessoais informacoesPessoaisMorador = new InformacoesPessoais();
		informacoesPessoaisMorador.setNome("Marcus");
		informacoesPessoaisMorador.setSobrenome("Fênix");
		informacoesPessoaisMorador.setDataNascimento("03/02/1997");
		informacoesPessoaisMorador.setCpf("323.544.985-40");
		informacoesPessoaisMorador.setRg("45.433.783-8");
		informacoesPessoaisMorador.setNaturalidade("brasileiro");
		informacoesPessoaisMorador.setCidadeNatal("Rio de Janeiro");
		
		InformacoesPessoais informacoesPessoaisInquilino = new InformacoesPessoais();
		informacoesPessoaisInquilino.setNome("Dominic");
		informacoesPessoaisInquilino.setSobrenome("Santhiago");
		informacoesPessoaisInquilino.setDataNascimento("14/06/2003");
		informacoesPessoaisInquilino.setCpf("221.434.543-12");
		informacoesPessoaisInquilino.setRg("23.434.454-3");
		informacoesPessoaisInquilino.setNaturalidade("brasileiro");
		informacoesPessoaisInquilino.setCidadeNatal("Rio de Janeiro");
		
		Profissao profissaoMorador = new Profissao();
		profissaoMorador.setCargo("Contador");
		profissaoMorador.setDataIngresso("10/06/2013");
		profissaoMorador.setSalario(4240.0f);
		profissaoMorador.setTurno("Vespertino");
		profissaoMorador.setDescricaoAtividades("Realização das atividades contabéis.");
		
		Profissao profissaoInquilino = new Profissao();
		profissaoInquilino.setCargo("Gerente");
		profissaoInquilino.setDataIngresso("15/02/2006");
		profissaoInquilino.setSalario(3650.0f);
		profissaoInquilino.setTurno("Vespertino");
		profissaoInquilino.setDescricaoAtividades("Realização das atividades gerenciais.");
		
		Conta contaMorador = new Conta();
		contaMorador.setAgencia(32);
		contaMorador.setNumero(33433432);
		contaMorador.setSaldo(2370.40f);
		contaMorador.setSenha(33424);
		
		Conta contaInquilino = new Conta();
		contaInquilino.setAgencia(12);
		contaInquilino.setNumero(45434435);
		contaInquilino.setSaldo(3850.80f);
		contaInquilino.setSenha(23432);
		
		Morador morador = new Morador();
		morador.setApartamento(apartamento);
		morador.setInformacoesPessoais(informacoesPessoaisMorador);
		morador.setEndereco(enderecoCondominio);
		morador.setEhProprietario(true);
		morador.setProfissao(profissaoMorador);
		morador.setTitular(contaMorador);
		
		apartamento.setPrecoAluguel(800.0f);
		
		Inquilino inquilino = new Inquilino();
		inquilino.setEndereco(enderecoCondominio);
		inquilino.setInformacoesPessoais(informacoesPessoaisInquilino);
		inquilino.setProfissao(profissaoInquilino);
		inquilino.setTitular(contaInquilino);
		
		Endereco enderecoEletricista = new Endereco();
		enderecoEletricista.setPais("Brasil");
		enderecoEletricista.setCep("44344324");
		enderecoEletricista.setEstado("Rio de Janeiro");
		enderecoEletricista.setCidade("Rio de Janeiro");
		enderecoEletricista.setRua("Rua do JavaScript");
		enderecoEletricista.setNumero("804");
		enderecoEletricista.setPontoReferencia("Avenida das Américas");
		
		InformacoesPessoais informacoesPessoaisEletricista = new InformacoesPessoais();
		informacoesPessoaisEletricista.setNome("Dominic");
		informacoesPessoaisEletricista.setSobrenome("Santhiago");
		informacoesPessoaisEletricista.setDataNascimento("14/06/2003");
		informacoesPessoaisEletricista.setCpf("221.434.543-12");
		informacoesPessoaisEletricista.setRg("23.434.454-3");
		informacoesPessoaisEletricista.setNaturalidade("brasileiro");
		informacoesPessoaisEletricista.setCidadeNatal("Rio de Janeiro");
		
		Profissao profissaoEletricista = new Profissao();
		profissaoEletricista.setCargo("Eletricista");
		profissaoEletricista.setDataIngresso("20/05/2020");
		profissaoEletricista.setSalario(2810.0f);
		profissaoEletricista.setTurno("Vespertino");
		profissaoEletricista.setDescricaoAtividades("Realização das atividades de eletricista.");
		
		Conta contaEletricista = new Conta();
		contaEletricista.setAgencia(19);
		contaEletricista.setNumero(34325654);
		contaEletricista.setSaldo(5234.60f);
		contaEletricista.setSenha(21211);
		
		Eletricista eletricista = new Eletricista();
		eletricista.setEndereco(enderecoEletricista);
		eletricista.setInformacoesPessoais(informacoesPessoaisEletricista);
		eletricista.setProfissao(profissaoEletricista);
		eletricista.setTitular(contaEletricista);
		
		Endereco enderecoJardineiro = new Endereco();
		enderecoJardineiro.setPais("Brasil");
		enderecoJardineiro.setCep("44354334");
		enderecoJardineiro.setEstado("Rio de Janeiro");
		enderecoJardineiro.setCidade("Rio de Janeiro");
		enderecoJardineiro.setRua("Rua das Bananadas");
		enderecoJardineiro.setNumero("302");
		enderecoJardineiro.setPontoReferencia("Avenida Goiaba");
		
		InformacoesPessoais informacoesPessoaisJardineiro = new InformacoesPessoais();
		informacoesPessoaisJardineiro.setNome("Niko");
		informacoesPessoaisJardineiro.setSobrenome("Bellic");
		informacoesPessoaisJardineiro.setDataNascimento("10/02/1994");
		informacoesPessoaisJardineiro.setCpf("332.112.554-14");
		informacoesPessoaisJardineiro.setRg("11.232.113-4");
		informacoesPessoaisJardineiro.setNaturalidade("brasileiro");
		informacoesPessoaisJardineiro.setCidadeNatal("Rio de Janeiro");
		
		Profissao profissaoJardineiro = new Profissao();
		profissaoJardineiro.setCargo("Eletricista");
		profissaoJardineiro.setDataIngresso("12/01/2018");
		profissaoJardineiro.setSalario(2810.0f);
		profissaoJardineiro.setTurno("Vespertino");
		profissaoJardineiro.setDescricaoAtividades("Realização das atividades de jardinagens.");
		
		Conta contaJardineiro = new Conta();
		contaJardineiro.setAgencia(11);
		contaJardineiro.setNumero(33234543);
		contaJardineiro.setSaldo(2312.30f);
		contaJardineiro.setSenha(11122);
		
		Jardineiro jardineiro = new Jardineiro();
		jardineiro.setEndereco(enderecoJardineiro);
		jardineiro.setInformacoesPessoais(informacoesPessoaisJardineiro);
		jardineiro.setJardinagemEstaGrande(true);
		jardineiro.setProfissao(profissaoJardineiro);
		jardineiro.setTitular(contaJardineiro);
	}
}
