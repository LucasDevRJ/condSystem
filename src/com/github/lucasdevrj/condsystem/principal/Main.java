package com.github.lucasdevrj.condsystem.principal;

import java.util.ArrayList;

/**
 * Classe que representa o Principal do Projeto
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
import com.github.lucasdevrj.condsystem.anotacoes.Autor;
import com.github.lucasdevrj.condsystem.apartamento.Apartamento;
import com.github.lucasdevrj.condsystem.comparador.ComparadorColaborador;
import com.github.lucasdevrj.condsystem.comparador.ComparadorMorador;
import com.github.lucasdevrj.condsystem.condominio.Condominio;
import com.github.lucasdevrj.condsystem.contabancaria.Conta;
import com.github.lucasdevrj.condsystem.enumerador.Blocos;
import com.github.lucasdevrj.condsystem.financeiro.Custo;
import com.github.lucasdevrj.condsystem.financeiro.Despesa;
import com.github.lucasdevrj.condsystem.financeiro.Financeiro;
import com.github.lucasdevrj.condsystem.financeiro.Receita;
import com.github.lucasdevrj.condsystem.funcionario.Administrador;
import com.github.lucasdevrj.condsystem.funcionario.Colaborador;
import com.github.lucasdevrj.condsystem.funcionario.Eletricista;
import com.github.lucasdevrj.condsystem.funcionario.Jardineiro;
import com.github.lucasdevrj.condsystem.funcionario.Pedreiro;
import com.github.lucasdevrj.condsystem.funcionario.Porteiro;
import com.github.lucasdevrj.condsystem.funcionario.ProfessorAcademia;
import com.github.lucasdevrj.condsystem.funcionario.Seguranca;
import com.github.lucasdevrj.condsystem.informacoespessoais.Endereco;
import com.github.lucasdevrj.condsystem.informacoespessoais.InformacoesPessoais;
import com.github.lucasdevrj.condsystem.informacoespessoais.Profissao;
import com.github.lucasdevrj.condsystem.inquilino.Inquilino;
import com.github.lucasdevrj.condsystem.morador.Morador;

@Autor (
		autor = "Lucas Pereira de Lima",
		gitHub = "LucasDevRJ"
	)

public class Main {

	public static void main(String[] args) {
		
		Endereco enderecoCondominio = new Endereco();
		
		try {
			enderecoCondominio.setPais("Brasil");
			enderecoCondominio.setCep("22710270");
			enderecoCondominio.setEstado("Rio de Janeiro");
			enderecoCondominio.setCidade("Rio de Janeiro");
			enderecoCondominio.setRua("Rua do Java");
			enderecoCondominio.setNumero("3004");
			enderecoCondominio.setPontoReferencia("Próximo à praça das Graças");
			
		} catch (NullPointerException erro) {
			erro.printStackTrace();
		}
	
		Condominio condominio = new Condominio();
		
		try {
			condominio.setNome("Condomínio Lazer");
			condominio.setEndereco(enderecoCondominio);
			condominio.setNumeroAcademia(1);
			condominio.setNumeroPiscinas(1);
			condominio.setNumeroQuadras(2);
			condominio.setNumeroParquinho(1);
			condominio.setTamanho(1500);
			condominio.setValorAluguel(900.0f);
		} catch (NullPointerException | IllegalArgumentException  erro) {
			erro.printStackTrace();
		}
		
		Blocos blocoA = Blocos.BLOCO_A;
		Blocos blocoB = Blocos.BLOCO_B;
		Blocos blocoC = Blocos.BLOCO_C;

		Apartamento apartamento = new Apartamento();
		
		try {
			apartamento.setBloco(blocoB);
			apartamento.setNumero(205);
			apartamento.setEndereco(enderecoCondominio);
			apartamento.setTamanho(250);
			apartamento.setNumeroBanheiros(1);
			apartamento.setNumeroQuartos(2);
			apartamento.setNumeroVagasCarro(1);
			apartamento.setPrecoApartamento(230000.00f);
			apartamento.setDescricao("Apartamento com " + apartamento.getTamanho() + " metros, " + apartamento.getNumeroBanheiros() + " banheiro(s), " + apartamento.getNumeroQuartos() + " quarto(s) e " + apartamento.getNumeroVagasCarro() + " vaga(s).");
			
		} catch (NullPointerException | IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		InformacoesPessoais informacoesPessoaisMorador = new InformacoesPessoais();
		
		try {
			informacoesPessoaisMorador.setNome("Marcus");
			informacoesPessoaisMorador.setSobrenome("Fenix");
			informacoesPessoaisMorador.setDataNascimento("15041999");
			informacoesPessoaisMorador.setCpf("32111332244");
			informacoesPessoaisMorador.setRg("212334221");
			informacoesPessoaisMorador.setNaturalidade("brasileiro");
			informacoesPessoaisMorador.setCidadeNatal("Rio de Janeiro");
			
		} catch (NullPointerException | StringIndexOutOfBoundsException erro) {
			erro.printStackTrace();
		}
		
		Apartamento apartamento2 = new Apartamento();
		
		try {
			apartamento2.setBloco(blocoB);
			apartamento2.setNumero(217);
			apartamento2.setEndereco(enderecoCondominio);
			apartamento2.setTamanho(260);
			apartamento2.setNumeroBanheiros(1);
			apartamento2.setNumeroQuartos(2);
			apartamento2.setNumeroVagasCarro(1);
			apartamento2.setPrecoApartamento(250000.00f);
			apartamento2.setDescricao("Apartamento com " + apartamento2.getTamanho() + " metros, " + apartamento2.getNumeroBanheiros() + " banheiro(s), " + apartamento2.getNumeroQuartos() + " quarto(s) e " + apartamento2.getNumeroVagasCarro() + " vaga(s).");
			
		} catch (NullPointerException | IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		InformacoesPessoais informacoesPessoaisMorador2 = new InformacoesPessoais();
		
		try {
			informacoesPessoaisMorador2.setNome("Manuel");
			informacoesPessoaisMorador2.setSobrenome("Reto");
			informacoesPessoaisMorador2.setDataNascimento("13011994");
			informacoesPessoaisMorador2.setCpf("23412198722");
			informacoesPessoaisMorador2.setRg("115453247");
			informacoesPessoaisMorador2.setNaturalidade("brasileiro");
			informacoesPessoaisMorador2.setCidadeNatal("Rio de Janeiro");
			
		} catch (NullPointerException erro) {
			erro.printStackTrace();
		}
		
		Profissao profissaoMorador2 = new Profissao();
		
		try {
			profissaoMorador2.setCargo("Policial");
			profissaoMorador2.setDataIngresso("17032001");
			profissaoMorador2.setSalario(6450.0f);
			profissaoMorador2.setTurno("Matutino");
			profissaoMorador2.setDescricaoAtividades("Realização das atividades de policial.");
			
		} catch (NullPointerException | IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Conta contaMorador2 = new Conta();
		
		try {
			contaMorador2.setAgencia(21);
			contaMorador2.setNumero(55434356);
			contaMorador2.setSaldo(4340.60f);
			contaMorador2.setSenha(23232);
			
		} catch (IllegalArgumentException erro) {
			erro.printStackTrace();
		}

		Morador morador2 = new Morador();
		morador2.setApartamento(apartamento2);
		morador2.setInformacoesPessoais(informacoesPessoaisMorador2);
		morador2.setEndereco(enderecoCondominio);
		morador2.setEhProprietario(true);
		morador2.setProfissao(profissaoMorador2);
		morador2.setTitular(contaMorador2);
		
		try {
			apartamento2.setPrecoAluguel(1700.0f);
			
		} catch (IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Apartamento apartamento3 = new Apartamento();
		
		try {
			apartamento3.setBloco(blocoA);
			apartamento3.setNumero(216);
			apartamento3.setEndereco(enderecoCondominio);
			apartamento3.setTamanho(280);
			apartamento3.setNumeroBanheiros(2);
			apartamento3.setNumeroQuartos(3);
			apartamento3.setNumeroVagasCarro(2);
			apartamento3.setPrecoApartamento(260000.00f);
			apartamento3.setDescricao("Apartamento com " + apartamento3.getTamanho() + " metros, " + apartamento3.getNumeroBanheiros() + " banheiro(s), " + apartamento3.getNumeroQuartos() + " quarto(s) e " + apartamento3.getNumeroVagasCarro() + " vaga(s).");
			
		} catch (NullPointerException | IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		InformacoesPessoais informacoesPessoaisMorador3 = new InformacoesPessoais();
		
		try {
			informacoesPessoaisMorador3.setNome("Lúcio");
			informacoesPessoaisMorador3.setSobrenome("Adalberto");
			informacoesPessoaisMorador3.setDataNascimento("15081992");
			informacoesPessoaisMorador3.setCpf("34423166723");
			informacoesPessoaisMorador3.setRg("215438764");
			informacoesPessoaisMorador3.setNaturalidade("brasileiro");
			informacoesPessoaisMorador3.setCidadeNatal("São Paulo");
			
		} catch (NullPointerException erro) {
			erro.printStackTrace();
		}
		
		Profissao profissaoMorador3 = new Profissao();
		
		try {
			profissaoMorador3.setCargo("Médico");
			profissaoMorador3.setDataIngresso("21042000");
			profissaoMorador3.setSalario(12340.00f);
			profissaoMorador3.setTurno("Integral");
			profissaoMorador3.setDescricaoAtividades("Realização das atividades de médico.");
			
		} catch (NullPointerException | IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Conta contaMorador3 = new Conta();
		
		try {
			contaMorador3.setAgencia(33);
			contaMorador3.setNumero(54356765);
			contaMorador3.setSaldo(32560.00f);
			contaMorador3.setSenha(88767);
			
		} catch (IllegalArgumentException erro) {
			erro.printStackTrace();
		}

		Morador morador3 = new Morador();
		morador3.setApartamento(apartamento3);
		morador3.setInformacoesPessoais(informacoesPessoaisMorador3);
		morador3.setEndereco(enderecoCondominio);
		morador3.setEhProprietario(true);
		morador3.setProfissao(profissaoMorador3);
		morador3.setTitular(contaMorador3);
		
		try {
			apartamento3.setPrecoAluguel(2400.0f);
			
		} catch (IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Apartamento apartamento4 = new Apartamento();
		
		try {
			apartamento4.setBloco(blocoA);
			apartamento4.setNumero(265);
			apartamento4.setEndereco(enderecoCondominio);
			apartamento4.setTamanho(320);
			apartamento4.setNumeroBanheiros(2);
			apartamento4.setNumeroQuartos(3);
			apartamento4.setNumeroVagasCarro(2);
			apartamento4.setPrecoApartamento(270000.00f);
			apartamento4.setDescricao("Apartamento com " + apartamento4.getTamanho() + " metros, " + apartamento4.getNumeroBanheiros() + " banheiro(s), " + apartamento4.getNumeroQuartos() + " quarto(s) e " + apartamento4.getNumeroVagasCarro() + " vaga(s).");
			
		} catch (NullPointerException | IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		InformacoesPessoais informacoesPessoaisMorador4 = new InformacoesPessoais();
		
		try {
			informacoesPessoaisMorador4.setNome("Gabriel");
			informacoesPessoaisMorador4.setSobrenome("Saldoso");
			informacoesPessoaisMorador4.setDataNascimento("11051999");
			informacoesPessoaisMorador4.setCpf("23343211221");
			informacoesPessoaisMorador4.setRg("543325432");
			informacoesPessoaisMorador4.setNaturalidade("brasileiro");
			informacoesPessoaisMorador4.setCidadeNatal("Rio de Janeiro");
			
		} catch (NullPointerException erro) {
			erro.printStackTrace();
		}
		
		Profissao profissaoMorador4 = new Profissao();
		
		try {
			profissaoMorador4.setCargo("Empresário");
			profissaoMorador4.setDataIngresso("13032005");
			profissaoMorador4.setSalario(8210.00f);
			profissaoMorador4.setTurno("Integral");
			profissaoMorador4.setDescricaoAtividades("Realização das atividades de empresário.");
			
		} catch (NullPointerException | IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Conta contaMorador4 = new Conta();
		
		try {
			contaMorador4.setAgencia(43);
			contaMorador4.setNumero(11343454);
			contaMorador4.setSaldo(345345.00f);
			contaMorador4.setSenha(43323);
			
		} catch (IllegalArgumentException erro) {
			erro.printStackTrace();
		}

		Morador morador4 = new Morador();
		morador4.setApartamento(apartamento4);
		morador4.setInformacoesPessoais(informacoesPessoaisMorador4);
		morador4.setEndereco(enderecoCondominio);
		morador4.setEhProprietario(false);
		morador4.setProfissao(profissaoMorador4);
		morador4.setTitular(contaMorador4);
		
		try {
			apartamento4.setPrecoAluguel(2400.0f);
			
		} catch (IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		InformacoesPessoais informacoesPessoaisInquilino = new InformacoesPessoais();
		
		try {
			informacoesPessoaisInquilino.setNome("Dominic");
			informacoesPessoaisInquilino.setSobrenome("Santhiago");
			informacoesPessoaisInquilino.setDataNascimento("14062003");
			informacoesPessoaisInquilino.setCpf("22143454312");
			informacoesPessoaisInquilino.setRg("234344543");
			informacoesPessoaisInquilino.setNaturalidade("brasileiro");
			informacoesPessoaisInquilino.setCidadeNatal("Rio de Janeiro");
			
		} catch (NullPointerException erro) {
			erro.printStackTrace();
		}
		
		Profissao profissaoMorador = new Profissao();
		
		try {
			profissaoMorador.setCargo("Contador");
			profissaoMorador.setDataIngresso("10062013");
			profissaoMorador.setSalario(4240.0f);
			profissaoMorador.setTurno("Vespertino");
			profissaoMorador.setDescricaoAtividades("Realização das atividades contabéis.");
			
		} catch (NullPointerException | IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Profissao profissaoInquilino = new Profissao();
		
		try {
			profissaoInquilino.setCargo("Gerente");
			profissaoInquilino.setDataIngresso("15022006");
			profissaoInquilino.setSalario(3650.0f);
			profissaoInquilino.setTurno("Vespertino");
			profissaoInquilino.setDescricaoAtividades("Realização das atividades gerenciais.");
			
		} catch (NullPointerException | IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Conta contaMorador = new Conta();
		
		try {
			contaMorador.setAgencia(32);
			contaMorador.setNumero(33433432);
			contaMorador.setSaldo(10000.0f);
			contaMorador.setSenha(33424);
			
		} catch (IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Conta contaInquilino = new Conta();
		
		try {
			contaInquilino.setAgencia(12);
			contaInquilino.setNumero(45434435);
			contaInquilino.setSaldo(3850.80f);
			contaInquilino.setSenha(23432);
			
		} catch (IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Morador morador = new Morador();
		morador.setApartamento(apartamento);
		morador.setInformacoesPessoais(informacoesPessoaisMorador);
		morador.setEndereco(enderecoCondominio);
		morador.setEhProprietario(true);
		morador.setProfissao(profissaoMorador);
		morador.setTitular(contaMorador);
		
		try {
			apartamento.setPrecoAluguel(1500.0f);
			
		} catch (IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Inquilino inquilino = new Inquilino();
		inquilino.setEndereco(enderecoCondominio);
		inquilino.setInformacoesPessoais(informacoesPessoaisInquilino);
		inquilino.setProfissao(profissaoInquilino);
		inquilino.setTitular(contaInquilino);
		
		Endereco enderecoEletricista = new Endereco();
		
		try {
			enderecoEletricista.setPais("Brasil");
			enderecoEletricista.setCep("44344324");
			enderecoEletricista.setEstado("Rio de Janeiro");
			enderecoEletricista.setCidade("Rio de Janeiro");
			enderecoEletricista.setRua("Rua do JavaScript");
			enderecoEletricista.setNumero("804");
			enderecoEletricista.setPontoReferencia("Avenida das Américas");
			
		} catch (NullPointerException erro) {
			erro.printStackTrace();
		}
		
		InformacoesPessoais informacoesPessoaisEletricista = new InformacoesPessoais();
		
		try {
			informacoesPessoaisEletricista.setNome("Dominic");
			informacoesPessoaisEletricista.setSobrenome("Santhiago");
			informacoesPessoaisEletricista.setDataNascimento("14062003");
			informacoesPessoaisEletricista.setCpf("22143454312");
			informacoesPessoaisEletricista.setRg("234344543");
			informacoesPessoaisEletricista.setNaturalidade("brasileiro");
			informacoesPessoaisEletricista.setCidadeNatal("Rio de Janeiro");
			
		} catch (NullPointerException erro) {
			erro.printStackTrace();
		}
		
		Profissao profissaoEletricista = new Profissao();
		
		try {
			profissaoEletricista.setCargo("Eletricista");
			profissaoEletricista.setDataIngresso("20052020");
			profissaoEletricista.setSalario(2810.0f);
			profissaoEletricista.setTurno("Vespertino");
			profissaoEletricista.setDescricaoAtividades("Realização das atividades de eletricista.");
			
		} catch (NullPointerException | IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Conta contaEletricista = new Conta();
		
		try {
			contaEletricista.setAgencia(19);
			contaEletricista.setNumero(34325654);
			contaEletricista.setSaldo(5234.60f);
			contaEletricista.setSenha(21211);
			
		} catch (IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Eletricista eletricista = new Eletricista();
		eletricista.setEndereco(enderecoEletricista);
		eletricista.setInformacoesPessoais(informacoesPessoaisEletricista);
		eletricista.setProfissao(profissaoEletricista);
		eletricista.setTitular(contaEletricista);
		
		Endereco enderecoJardineiro = new Endereco();
		
		try {
			enderecoJardineiro.setPais("Brasil");
			enderecoJardineiro.setCep("44354334");
			enderecoJardineiro.setEstado("Rio de Janeiro");
			enderecoJardineiro.setCidade("Rio de Janeiro");
			enderecoJardineiro.setRua("Rua das Bananadas");
			enderecoJardineiro.setNumero("302");
			enderecoJardineiro.setPontoReferencia("Avenida Goiaba");
			
		} catch (NullPointerException erro) {
			erro.printStackTrace();
		}
		
		InformacoesPessoais informacoesPessoaisJardineiro = new InformacoesPessoais();
		
		try {
			informacoesPessoaisJardineiro.setNome("Niko");
			informacoesPessoaisJardineiro.setSobrenome("Bellic");
			informacoesPessoaisJardineiro.setDataNascimento("10021994");
			informacoesPessoaisJardineiro.setCpf("33211255414");
			informacoesPessoaisJardineiro.setRg("112321134");
			informacoesPessoaisJardineiro.setNaturalidade("brasileiro");
			informacoesPessoaisJardineiro.setCidadeNatal("Rio de Janeiro");
			
		} catch (NullPointerException erro) {
			erro.printStackTrace();
		}
		
		Profissao profissaoJardineiro = new Profissao();
		
		try {
			profissaoJardineiro.setCargo("Eletricista");
			profissaoJardineiro.setDataIngresso("12012018");
			profissaoJardineiro.setSalario(2810.0f);
			profissaoJardineiro.setTurno("Vespertino");
			profissaoJardineiro.setDescricaoAtividades("Realização das atividades de jardinagens.");
			
		} catch (NullPointerException | IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Conta contaJardineiro = new Conta();
		
		try {
			contaJardineiro.setAgencia(11);
			contaJardineiro.setNumero(33234543);
			contaJardineiro.setSaldo(2312.30f);
			contaJardineiro.setSenha(11122);
			
		} catch (IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Jardineiro jardineiro = new Jardineiro();
		jardineiro.setEndereco(enderecoJardineiro);
		jardineiro.setInformacoesPessoais(informacoesPessoaisJardineiro);
		jardineiro.setJardinagemEstaGrande(true);
		jardineiro.setProfissao(profissaoJardineiro);
		jardineiro.setTitular(contaJardineiro);
		
		Endereco enderecoPorteiro = new Endereco();
		
		try {
			enderecoPorteiro.setPais("Brasil1");
			enderecoPorteiro.setCep("43334543");
			enderecoPorteiro.setEstado("Rio de Janeiro");
			enderecoPorteiro.setCidade("Rio de Janeiro");
			enderecoPorteiro.setRua("Rua dos Asfaltos");
			enderecoPorteiro.setNumero("312");
			enderecoPorteiro.setPontoReferencia("Avenida Wilson");
			enderecoPorteiro.setComplemento("Casa número 12");
			
		} catch (NullPointerException erro) {
			erro.printStackTrace();
		}
		
		InformacoesPessoais informacoesPessoaisPorteiro = new InformacoesPessoais();
		
		try {
			informacoesPessoaisPorteiro.setNome("Carl");
			informacoesPessoaisPorteiro.setSobrenome("Jhoson");
			informacoesPessoaisPorteiro.setDataNascimento("16041992");
			informacoesPessoaisPorteiro.setCpf("11232155412");
			informacoesPessoaisPorteiro.setRg("224321121");
			informacoesPessoaisPorteiro.setNaturalidade("brasileiro");
			informacoesPessoaisPorteiro.setCidadeNatal("Rio de Janeiro");
			
		} catch (NullPointerException | IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Profissao profissaoPorteiro = new Profissao();
		
		try {
			profissaoPorteiro.setCargo("Porteiro");
			profissaoPorteiro.setDataIngresso("21032007");
			profissaoPorteiro.setSalario(2630.0f);
			profissaoPorteiro.setTurno("Vespertino");
			profissaoPorteiro.setDescricaoAtividades("Realização das atividades de porteiro.");
			
		} catch (NullPointerException | IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Conta contaPorteiro = new Conta();
		
		try {
			contaPorteiro.setAgencia(21);
			contaPorteiro.setNumero(34423432);
			contaPorteiro.setSaldo(3420.60f);
			contaPorteiro.setSenha(33321);
			
		} catch (NullPointerException | IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Porteiro porteiro = new Porteiro();
		porteiro.setEndereco(enderecoPorteiro);
		porteiro.setInformacoesPessoais(informacoesPessoaisPorteiro);
		porteiro.setProfissao(profissaoPorteiro);
		porteiro.setTitular(contaPorteiro);
		
		Endereco enderecoPedreiro = new Endereco();
		
		try {
			enderecoPedreiro.setPais("Brasil");
			enderecoPedreiro.setCep("34234332");
			enderecoPedreiro.setEstado("Rio de Janeiro");
			enderecoPedreiro.setCidade("Rio de Janeiro");
			enderecoPedreiro.setRua("Rua dos Gatinhos");
			enderecoPedreiro.setNumero("4010");
			enderecoPedreiro.setPontoReferencia("Proximo a faculdade Fisk");
			
		} catch (NullPointerException erro) {
			erro.printStackTrace();
		}
		
		InformacoesPessoais informacoesPessoaisPedreiro = new InformacoesPessoais();
		
		try {
			informacoesPessoaisPedreiro.setNome("Luciano");
			informacoesPessoaisPedreiro.setSobrenome("Pereira");
			informacoesPessoaisPedreiro.setDataNascimento("12091999");
			informacoesPessoaisPedreiro.setCpf("11534422119");
			informacoesPessoaisPedreiro.setRg("113216543");
			informacoesPessoaisPedreiro.setNaturalidade("brasileiro");
			informacoesPessoaisPedreiro.setCidadeNatal("Rio de Janeiro");
			
		} catch (NullPointerException erro) {
			erro.printStackTrace();
		}
		
		Profissao profissaoPedreiro = new Profissao();
		
		try {
			profissaoPedreiro.setCargo("Porteiro");
			profissaoPedreiro.setDataIngresso("19072002");
			profissaoPedreiro.setSalario(3420.50f);
			profissaoPedreiro.setTurno("Vespertino");
			profissaoPedreiro.setDescricaoAtividades("Realização das atividades de pedreiro.");
			
		} catch (NullPointerException | IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Conta contaPedreiro = new Conta();
		
		try {
			contaPedreiro.setAgencia(21);
			contaPedreiro.setNumero(34423432);
			contaPedreiro.setSaldo(3420.60f);
			contaPedreiro.setSenha(33321);
			
		} catch (IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Pedreiro pedreiro = new Pedreiro();
		pedreiro.setEndereco(enderecoPedreiro);
		pedreiro.setInformacoesPessoais(informacoesPessoaisPedreiro);
		pedreiro.setProfissao(profissaoPedreiro);
		pedreiro.setTitular(contaPedreiro);
		
		Endereco enderecoProfessorAcademia = new Endereco();
		
		try {
			enderecoProfessorAcademia.setPais("Brasil");
			enderecoProfessorAcademia.setCep("44354432");
			enderecoProfessorAcademia.setEstado("Rio de Janeiro");
			enderecoProfessorAcademia.setCidade("Rio de Janeiro");
			enderecoProfessorAcademia.setRua("Rua dos Gafonhotos");
			enderecoProfessorAcademia.setNumero("3200");
			enderecoProfessorAcademia.setPontoReferencia("Proximo a shopping Guanabara");
			
		} catch (NullPointerException erro) {
			erro.printStackTrace();
		}
		
		InformacoesPessoais informacoesPessoaisProfessorAcademia = new InformacoesPessoais();
		
		try {
			informacoesPessoaisProfessorAcademia.setNome("Rodolfo");
			informacoesPessoaisProfessorAcademia.setSobrenome("Gomes");
			informacoesPessoaisProfessorAcademia.setDataNascimento("21022002");
			informacoesPessoaisProfessorAcademia.setCpf("10132287623");
			informacoesPessoaisProfessorAcademia.setRg("224321132");
			informacoesPessoaisProfessorAcademia.setNaturalidade("brasileiro");
			informacoesPessoaisProfessorAcademia.setCidadeNatal("Paraíba");
			
		} catch (NullPointerException erro) {
			erro.printStackTrace();
		}
		
		Profissao profissaoProfessorAcademia = new Profissao();
		
		try {
			profissaoProfessorAcademia.setCargo("Professor de Academia");
			profissaoProfessorAcademia.setDataIngresso("23031997");
			profissaoProfessorAcademia.setSalario(4640.0f);
			profissaoProfessorAcademia.setTurno("Vespertino");
			profissaoProfessorAcademia.setDescricaoAtividades("Realização das atividades de professor de academia.");
			
		} catch (NullPointerException erro) {
			erro.printStackTrace();
		}
		
		Conta contaProfessorAcademia = new Conta();
		
		try {
			contaProfessorAcademia.setAgencia(19);
			contaProfessorAcademia.setNumero(44355432);
			contaProfessorAcademia.setSaldo(2870.60f);
			contaProfessorAcademia.setSenha(44432);
			
		} catch (IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		ProfessorAcademia professorAcademia = new ProfessorAcademia();
		professorAcademia.setEndereco(enderecoProfessorAcademia);
		professorAcademia.setInformacoesPessoais(informacoesPessoaisProfessorAcademia);
		professorAcademia.setProfissao(profissaoProfessorAcademia);
		professorAcademia.setTitular(contaProfessorAcademia);
		
		Endereco enderecoSeguranca = new Endereco();
		
		try {
			enderecoSeguranca.setPais("Brasil");
			enderecoSeguranca.setCep("73843432");
			enderecoSeguranca.setEstado("Rio de Janeiro");
			enderecoSeguranca.setCidade("Rio de Janeiro");
			enderecoSeguranca.setRua("Rua dos Arautos");
			enderecoSeguranca.setNumero("1230");
			enderecoSeguranca.setPontoReferencia("Próximo ao Barra Shooping");
			
		} catch (NullPointerException erro) {
			erro.printStackTrace();
		}
		
		InformacoesPessoais informacoesPessoaisSeguranca = new InformacoesPessoais();
		
		try {
			informacoesPessoaisSeguranca.setNome("Júlio");
			informacoesPessoaisSeguranca.setSobrenome("Ribas");
			informacoesPessoaisSeguranca.setDataNascimento("24041998");
			informacoesPessoaisSeguranca.setCpf("31146534211");
			informacoesPessoaisSeguranca.setRg("452331123");
			informacoesPessoaisSeguranca.setNaturalidade("brasileiro");
			informacoesPessoaisSeguranca.setCidadeNatal("Rio de Janeiro");
			
		} catch (NullPointerException erro) {
			erro.printStackTrace();
		}
		
		Profissao profissaoSeguranca = new Profissao();
		
		try {
			profissaoSeguranca.setCargo("Segurança");
			profissaoSeguranca.setDataIngresso("11062010");
			profissaoSeguranca.setSalario(3830.50f);
			profissaoSeguranca.setTurno("Vespertino");
			profissaoSeguranca.setDescricaoAtividades("Realização das atividades de professor de segurança.");
			
		} catch (NullPointerException | IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Conta contaSeguranca = new Conta();
		
		try {
			contaSeguranca.setAgencia(23);
			contaSeguranca.setNumero(44323432);
			contaSeguranca.setSaldo(4230.00f);
			contaSeguranca.setSenha(44343);
			
		} catch (IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Seguranca seguranca = new Seguranca();
		seguranca.setEndereco(enderecoSeguranca);
		seguranca.setInformacoesPessoais(informacoesPessoaisSeguranca);
		seguranca.setProfissao(profissaoSeguranca);
		seguranca.setTitular(contaSeguranca);
		
		Endereco enderecoAdministrador = new Endereco();
		
		try {
			enderecoAdministrador.setPais("Brasil");
			enderecoAdministrador.setCep("34343343");
			enderecoAdministrador.setEstado("Rio de Janeiro");
			enderecoAdministrador.setCidade("Rio de Janeiro");
			enderecoAdministrador.setRua("Rua dos Mouras");
			enderecoAdministrador.setNumero("1950");
			enderecoAdministrador.setPontoReferencia("Próximo a feira");
			
		} catch (NullPointerException erro) {
			erro.printStackTrace();
		}
		
		InformacoesPessoais informacoesPessoaisAdministrador = new InformacoesPessoais();
		
		try {
			informacoesPessoaisAdministrador.setNome("Rafael");
			informacoesPessoaisAdministrador.setSobrenome("Gonzales");
			informacoesPessoaisAdministrador.setDataNascimento("04062001");
			informacoesPessoaisAdministrador.setCpf("23465421133");
			informacoesPessoaisAdministrador.setRg("324431205");
			informacoesPessoaisAdministrador.setNaturalidade("brasileiro");
			informacoesPessoaisAdministrador.setCidadeNatal("Rio de Janeiro");
			
		} catch (NullPointerException erro) {
			erro.printStackTrace();
		}
		 
		Profissao profissaoAdministrador = new Profissao();
		
		try {
			profissaoAdministrador.setCargo("Administrador");
			profissaoAdministrador.setDataIngresso("03092005");
			profissaoAdministrador.setSalario(5230.00f);
			profissaoAdministrador.setTurno("Vespertino");
			profissaoAdministrador.setDescricaoAtividades("Realização das atividades de administrador.");
			
		} catch (NullPointerException | IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Conta contaAdministrador = new Conta();
		
		try {
			contaAdministrador.setAgencia(17);
			contaAdministrador.setNumero(54534541);
			contaAdministrador.setSaldo(9430.50f);
			contaAdministrador.setSenha(33234);
			
		} catch (IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Administrador administrador = new Administrador();
		administrador.setEndereco(enderecoAdministrador);
		administrador.setInformacoesPessoais(informacoesPessoaisAdministrador);
		administrador.setProfissao(profissaoAdministrador);
		administrador.setTitular(contaAdministrador);
		
		Custo custo = new Custo();
		
		try {
			custo.setConsertos(635.30f);
			custo.setConstrucao(1234.50f);
			custo.setMaterialConstrucao(3160.0f);
			custo.setMaterialLimpeza(213.40f);
			
		} catch (IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		custo.setSalarioTotal(administrador);
		custo.setSalarioTotal(porteiro);
		custo.setSalarioTotal(seguranca);
		custo.setSalarioTotal(eletricista);
		custo.setSalarioTotal(jardineiro);
		custo.setSalarioTotal(pedreiro);
		custo.setSalarioTotal(professorAcademia);
		
		Despesa despesa = new Despesa();
		
		try {
			despesa.setAgua(8340.30f);
			despesa.setEletricidade(1560.50f);
			despesa.setGas(563.20f);
			despesa.setImposto(320.30f);
			
		} catch (IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		Receita receita = new Receita();
		
		Financeiro financeiro = new Financeiro();
		financeiro.setCusto(custo);
		financeiro.setDespesa(despesa);
		financeiro.setReceita(receita);
		
		condominio.setReceita(financeiro);
		
		ArrayList<Morador> listaMoradores = new ArrayList<Morador>();
		listaMoradores.add(morador);
		listaMoradores.add(morador2);
		listaMoradores.add(morador3);
		listaMoradores.add(morador4);
		
		ArrayList<Colaborador> listaColaboradores = new ArrayList<>();
		listaColaboradores.add(administrador);
		listaColaboradores.add(porteiro);
		listaColaboradores.add(seguranca);
		listaColaboradores.add(eletricista);
		listaColaboradores.add(jardineiro);
		listaColaboradores.add(pedreiro);
		listaColaboradores.add(professorAcademia);
		
		//Chamadas de métodos
		pedreiro.consertar(pedreiro, "piso do condomínio");
		System.out.println();
		pedreiro.construir(pedreiro, "parquinho");
		System.out.println();
		porteiro.abrirPorta(porteiro);
		System.out.println();
		porteiro.abrirPortao(porteiro);
		System.out.println();
		seguranca.vigiar(seguranca, "condomínio");
		System.out.println();
		eletricista.consertaFiacao(eletricista);
		System.out.println();
		eletricista.trocaFiacao(eletricista);
		System.out.println();
		jardineiro.jardinar(jardineiro);
		System.out.println();
		professorAcademia.montarSerie(professorAcademia);
		System.out.println();
		
		ArrayList<Apartamento> listaApartamentos = new ArrayList<Apartamento>();
		listaApartamentos.add(apartamento);
		listaApartamentos.add(apartamento2);
		listaApartamentos.add(apartamento3);
		listaApartamentos.add(apartamento4);
		
		try {
			for (Apartamento apartamentos : listaApartamentos) {
				if (!apartamento.equals(apartamento2)) {
					throw new IllegalArgumentException("Apartamentos com números e blocos iguais!");
				}
			}
		} catch (IllegalArgumentException erro) {
			erro.printStackTrace();
		}
		
		ComparadorMorador comparaMoradores = new ComparadorMorador();
		listaMoradores.sort(comparaMoradores);
	
		for (Morador moradores : listaMoradores) {
			administrador.acessarInformacoesMorador(moradores);
			System.out.println();
		}
		
		professorAcademia.demonstrarExercicio(professorAcademia);
		System.out.println();
		morador4.comprarApartamento(morador4, receita);
		System.out.println();
		professorAcademia.montarSerie(professorAcademia);
		System.out.println();
		morador.pagarAluguelCondominio(morador, receita, condominio);
		System.out.println();
		morador2.pagarAluguelCondominio(morador2, receita, condominio);
		System.out.println();
		morador3.pagarAluguelCondominio(morador3, receita, condominio);
		System.out.println();
		morador4.pagarAluguelCondominio(morador4, receita, condominio);
		System.out.println();
		administrador.acessarFinanceiro(financeiro);
		System.out.println();
		
		ComparadorColaborador comparaColaborador = new ComparadorColaborador();
		listaColaboradores.sort(comparaColaborador);
		
		for (Colaborador colaboradores : listaColaboradores) {
			administrador.acessarInformacoesColaborador(colaboradores);
			System.out.println();
		}
		
		administrador.acessarFinanceiro(financeiro);
		System.out.println();
		condominio.construirParquinho(300);
		System.out.println();
		condominio.aumentarTamanhoCondominio(2000);
		System.out.println();
		administrador.agendarReuniao("23042022");
		System.out.println();
		condominio.construirPredio(3000, 4000);
		System.out.println();
		condominio.construirAcademia(8, 4, 7);
		System.out.println();
		condominio.construirPiscina(600);
		System.out.println();
		administrador.acessarFinanceiro(financeiro);
		System.out.println();
		contaEletricista.depositar(300.00f, jardineiro);
		System.out.println();
		eletricista.receberSalario();
		System.out.println();
		morador.reformarApartamento(2, morador);
	}
}
