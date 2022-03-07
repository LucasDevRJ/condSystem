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
		
		Endereco enderecoPorteiro = new Endereco();
		enderecoPorteiro.setPais("Brasil");
		enderecoPorteiro.setCep("43334543");
		enderecoPorteiro.setEstado("Rio de Janeiro");
		enderecoPorteiro.setCidade("Rio de Janeiro");
		enderecoPorteiro.setRua("Rua dos Asfaltos");
		enderecoPorteiro.setNumero("312");
		enderecoPorteiro.setPontoReferencia("Avenida Wilson");
		
		InformacoesPessoais informacoesPessoaisPorteiro = new InformacoesPessoais();
		informacoesPessoaisPorteiro.setNome("Carl");
		informacoesPessoaisPorteiro.setSobrenome("Jhoson");
		informacoesPessoaisPorteiro.setDataNascimento("16/04/1992");
		informacoesPessoaisPorteiro.setCpf("112.321.554-12");
		informacoesPessoaisPorteiro.setRg("22.432.112-1");
		informacoesPessoaisPorteiro.setNaturalidade("brasileiro");
		informacoesPessoaisPorteiro.setCidadeNatal("Rio de Janeiro");
		
		Profissao profissaoPorteiro = new Profissao();
		profissaoPorteiro.setCargo("Porteiro");
		profissaoPorteiro.setDataIngresso("21/03/2007");
		profissaoPorteiro.setSalario(2630.0f);
		profissaoPorteiro.setTurno("Vespertino");
		profissaoPorteiro.setDescricaoAtividades("Realização das atividades de porteiro.");
		
		Conta contaPorteiro = new Conta();
		contaPorteiro.setAgencia(21);
		contaPorteiro.setNumero(34423432);
		contaPorteiro.setSaldo(3420.60f);
		contaPorteiro.setSenha(33321);
		
		Porteiro porteiro = new Porteiro();
		porteiro.setEndereco(enderecoPorteiro);
		porteiro.setInformacoesPessoais(informacoesPessoaisPorteiro);
		porteiro.setProfissao(profissaoPorteiro);
		porteiro.setTitular(contaPorteiro);
		
		Endereco enderecoPedreiro = new Endereco();
		enderecoPedreiro.setPais("Brasil");
		enderecoPedreiro.setCep("34234332");
		enderecoPedreiro.setEstado("Rio de Janeiro");
		enderecoPedreiro.setCidade("Rio de Janeiro");
		enderecoPedreiro.setRua("Rua dos Gatinhos");
		enderecoPedreiro.setNumero("4010");
		enderecoPedreiro.setPontoReferencia("Proximo a faculdade Fisk");
		
		InformacoesPessoais informacoesPessoaisPedreiro = new InformacoesPessoais();
		informacoesPessoaisPedreiro.setNome("Luciano");
		informacoesPessoaisPedreiro.setSobrenome("Pereira");
		informacoesPessoaisPedreiro.setDataNascimento("12/09/1999");
		informacoesPessoaisPedreiro.setCpf("115.344.221-19");
		informacoesPessoaisPedreiro.setRg("11.321.654-3");
		informacoesPessoaisPedreiro.setNaturalidade("brasileiro");
		informacoesPessoaisPedreiro.setCidadeNatal("Rio de Janeiro");
		
		Profissao profissaoPedreiro = new Profissao();
		profissaoPedreiro.setCargo("Porteiro");
		profissaoPedreiro.setDataIngresso("19/07/2002");
		profissaoPedreiro.setSalario(3420.50f);
		profissaoPedreiro.setTurno("Vespertino");
		profissaoPedreiro.setDescricaoAtividades("Realização das atividades de pedreiro.");
		
		Conta contaPedreiro = new Conta();
		contaPedreiro.setAgencia(21);
		contaPedreiro.setNumero(34423432);
		contaPedreiro.setSaldo(3420.60f);
		contaPedreiro.setSenha(33321);
		
		Porteiro pedreiro = new Porteiro();
		pedreiro.setEndereco(enderecoPedreiro);
		pedreiro.setInformacoesPessoais(informacoesPessoaisPedreiro);
		pedreiro.setProfissao(profissaoPedreiro);
		pedreiro.setTitular(contaPedreiro);
		
		Endereco enderecoProfessorAcademia = new Endereco();
		enderecoProfessorAcademia.setPais("Brasil");
		enderecoProfessorAcademia.setCep("44354432");
		enderecoProfessorAcademia.setEstado("Rio de Janeiro");
		enderecoProfessorAcademia.setCidade("Rio de Janeiro");
		enderecoProfessorAcademia.setRua("Rua dos Gafonhotos");
		enderecoProfessorAcademia.setNumero("3200");
		enderecoProfessorAcademia.setPontoReferencia("Proximo a shopping Guanabara");
		
		InformacoesPessoais informacoesPessoaisProfessorAcademia = new InformacoesPessoais();
		informacoesPessoaisProfessorAcademia.setNome("Rodolfo");
		informacoesPessoaisProfessorAcademia.setSobrenome("Gomes");
		informacoesPessoaisProfessorAcademia.setDataNascimento("21/02/2002");
		informacoesPessoaisProfessorAcademia.setCpf("101.322.876-23");
		informacoesPessoaisProfessorAcademia.setRg("22.432.113-2");
		informacoesPessoaisProfessorAcademia.setNaturalidade("brasileiro");
		informacoesPessoaisProfessorAcademia.setCidadeNatal("Paraíba");
		
		Profissao profissaoProfessorAcademia = new Profissao();
		profissaoProfessorAcademia.setCargo("Professor de Academia");
		profissaoProfessorAcademia.setDataIngresso("23/03/1997");
		profissaoProfessorAcademia.setSalario(4640.0f);
		profissaoProfessorAcademia.setTurno("Vespertino");
		profissaoProfessorAcademia.setDescricaoAtividades("Realização das atividades de professor de academia.");
		
		Conta contaProfessorAcademia = new Conta();
		contaProfessorAcademia.setAgencia(19);
		contaProfessorAcademia.setNumero(44355432);
		contaProfessorAcademia.setSaldo(2870.60f);
		contaProfessorAcademia.setSenha(44432);
		
		Porteiro professorAcademia = new Porteiro();
		professorAcademia.setEndereco(enderecoProfessorAcademia);
		professorAcademia.setInformacoesPessoais(informacoesPessoaisProfessorAcademia);
		professorAcademia.setProfissao(profissaoProfessorAcademia);
		professorAcademia.setTitular(contaProfessorAcademia);
		
		Endereco enderecoSeguranca = new Endereco();
		enderecoSeguranca.setPais("Brasil");
		enderecoSeguranca.setCep("73843432");
		enderecoSeguranca.setEstado("Rio de Janeiro");
		enderecoSeguranca.setCidade("Rio de Janeiro");
		enderecoSeguranca.setRua("Rua dos Arautos");
		enderecoSeguranca.setNumero("1230");
		enderecoSeguranca.setPontoReferencia("Próximo ao Barra Shooping");
		
		InformacoesPessoais informacoesPessoaisSeguranca = new InformacoesPessoais();
		informacoesPessoaisSeguranca.setNome("Júlio");
		informacoesPessoaisSeguranca.setSobrenome("Ribas");
		informacoesPessoaisSeguranca.setDataNascimento("24/04/1998");
		informacoesPessoaisSeguranca.setCpf("311.465.342-11");
		informacoesPessoaisSeguranca.setRg("45.233.112-3");
		informacoesPessoaisSeguranca.setNaturalidade("brasileiro");
		informacoesPessoaisSeguranca.setCidadeNatal("Rio de Janeiro");
		
		Profissao profissaoSeguranca = new Profissao();
		profissaoSeguranca.setCargo("Segurança");
		profissaoSeguranca.setDataIngresso("11/06/2010");
		profissaoSeguranca.setSalario(3830.50f);
		profissaoSeguranca.setTurno("Vespertino");
		profissaoSeguranca.setDescricaoAtividades("Realização das atividades de professor de segurança.");
		
		Conta contaSeguranca = new Conta();
		contaSeguranca.setAgencia(23);
		contaSeguranca.setNumero(44323432);
		contaSeguranca.setSaldo(4230.00f);
		contaSeguranca.setSenha(44343);
		
		Seguranca seguranca = new Seguranca();
		seguranca.setEndereco(enderecoSeguranca);
		seguranca.setInformacoesPessoais(informacoesPessoaisSeguranca);
		seguranca.setProfissao(profissaoSeguranca);
		seguranca.setTitular(contaSeguranca);
		
		Endereco enderecoAdministrador = new Endereco();
		enderecoAdministrador.setPais("Brasil");
		enderecoAdministrador.setCep("34343343");
		enderecoAdministrador.setEstado("Rio de Janeiro");
		enderecoAdministrador.setCidade("Rio de Janeiro");
		enderecoAdministrador.setRua("Rua dos Mouras");
		enderecoAdministrador.setNumero("1950");
		enderecoAdministrador.setPontoReferencia("Próximo a feira");
		
		InformacoesPessoais informacoesPessoaisAdministrador = new InformacoesPessoais();
		informacoesPessoaisAdministrador.setNome("Rafael");
		informacoesPessoaisAdministrador.setSobrenome("Gonzales");
		informacoesPessoaisAdministrador.setDataNascimento("04/06/2001");
		informacoesPessoaisAdministrador.setCpf("234.654.211-33");
		informacoesPessoaisAdministrador.setRg("32.443.120-5");
		informacoesPessoaisAdministrador.setNaturalidade("brasileiro");
		informacoesPessoaisAdministrador.setCidadeNatal("Rio de Janeiro");
		
		Profissao profissaoAdministrador = new Profissao();
		profissaoAdministrador.setCargo("Administrador");
		profissaoAdministrador.setDataIngresso("03/09/2005");
		profissaoAdministrador.setSalario(5230.00f);
		profissaoAdministrador.setTurno("Vespertino");
		profissaoAdministrador.setDescricaoAtividades("Realização das atividades de administrador.");
		
		Conta contaAdministrador = new Conta();
		contaAdministrador.setAgencia(17);
		contaAdministrador.setNumero(54534541);
		contaAdministrador.setSaldo(9430.50f);
		contaAdministrador.setSenha(33234);
		
		Administrador administrador = new Administrador();
		administrador.setEndereco(enderecoAdministrador);
		administrador.setInformacoesPessoais(informacoesPessoaisAdministrador);
		administrador.setProfissao(profissaoAdministrador);
		administrador.setTitular(contaAdministrador);
	}
}
