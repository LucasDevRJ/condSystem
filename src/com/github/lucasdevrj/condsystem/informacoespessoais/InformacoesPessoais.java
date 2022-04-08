package com.github.lucasdevrj.condsystem.informacoespessoais;

/**
 * Classe que representa as Informações Pessoais
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
public class InformacoesPessoais {

	private String nome;
	private String sobrenome;
	private String dataNascimento;
	private String naturalidade;
	private String cidadeNatal;
	private String rg;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		nome = nome.trim();
		
		nome = nome.replaceAll("[^a-zA-Z íãáàôõüÍÃÁÀÕÔÜ]", "");
		
		if (nome.contains("  ")) {
			throw new IllegalArgumentException("Não coloque muitos espaços, por favor!");
		}
		
		if (nome.length() == 0) {
			throw new NullPointerException("Insira o nome, por favor!");
		}
		
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		sobrenome = sobrenome.trim();
		
		sobrenome = sobrenome.replaceAll("[^a-zA-Z íãáàôõüÍÃÁÀÕÔÜ]", "");
		
		if (sobrenome.contains("  ")) {
			throw new IllegalArgumentException("Não coloque muitos espaços, por favor!");
		}
		
		if (sobrenome.length() == 0) {
			throw new NullPointerException("Insira o sobrenome, por favor!");
		}
		
		this.sobrenome = sobrenome;
	}

	public String getNaturalidade() {
		return naturalidade;
	}
	
	public void setNaturalidade(String naturalidade) {
		naturalidade = naturalidade.trim();
		
		naturalidade = naturalidade.replaceAll("[^a-zA-Z íãáàôõüÍÃÁÀÕÔÜ]", "");
		
		if (naturalidade.contains("  ")) {
			throw new IllegalArgumentException("Não coloque muitos espaços, por favor!");
		}
		
		if (naturalidade.length() == 0) {
			throw new NullPointerException("Insira a naturalidade, por favor!");
		}
		
		this.naturalidade = naturalidade;
	}
	
	public String getCidadeNatal() {
		return cidadeNatal;
	}
	
	public void setCidadeNatal(String cidadeNatal) {
		cidadeNatal = cidadeNatal.trim();
		
		cidadeNatal = cidadeNatal.replaceAll("[^a-zA-Z íãáàôõüÍÃÁÀÕÔÜ]", "");
		
		if (cidadeNatal.contains("  ")) {
			throw new IllegalArgumentException("Não coloque muitos espaços, por favor!");
		}
		
		if (cidadeNatal.length() == 0) {
			throw new NullPointerException("Insira a cidade natal, por favor!");
		}
		
		this.cidadeNatal = cidadeNatal;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		rg = rg.trim();
		
		rg = rg.replaceAll("[^0-9]", "");
		
		rg = rg.substring(0,2) + "." + rg.substring(2,5) + "." + rg.substring(5,8) + "-" + rg.substring(8,9);
		
		if (rg.length() == 0) {
			throw new NullPointerException("Insira o RG, por favor!");
		}
		
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		cpf = cpf.trim();
		
		cpf = cpf.replaceAll("[^0-9]", "");
		
		cpf = cpf.substring(0,3) + "." + cpf.substring(3,6) + "." + cpf.substring(6,9) + "-" + cpf.substring(9,11);
		
		if (cpf.length() == 0) {
			throw new NullPointerException("Insira o CPF, por favor!");
		}
		
		this.cpf = cpf;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		dataNascimento = dataNascimento.trim();
		
		dataNascimento = dataNascimento.replaceAll("[^0-9]", "");
		
		dataNascimento = dataNascimento.substring(0,2) + "/" + dataNascimento.substring(2,4) + "/" + dataNascimento.substring(4,8);
		
		if (dataNascimento.length() == 0) {
			throw new NullPointerException("Insira o CPF, por favor!");
		}
		
		if (dataNascimento.length() > 11) {
			throw new StringIndexOutOfBoundsException("Digite a data de nascimento completa, por favor!");
		}
		
		this.dataNascimento = dataNascimento;
	}
}
