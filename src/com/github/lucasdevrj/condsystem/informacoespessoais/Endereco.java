package com.github.lucasdevrj.condsystem.informacoespessoais;

public class Endereco {

	private String pais;
	private String cidade;
	private String estado;
	private String rua;
	private String numero;
	private String cep;
	private String pontoReferencia;
	private String complemento;
	
	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		if (pais.length() == 0) {
			throw new NullPointerException("Insira o país, por favor!");
		}
		
		this.pais = pais;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		if (cidade.length() == 0) {
			throw new NullPointerException("Insira a cidade, por favor!");
		}
		
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		if (estado.length() == 0) {
			throw new NullPointerException("Insira o Estado, por favor!");
		}
		
		this.estado = estado;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		if (rua.length() == 0) {
			throw new NullPointerException("Insira a Rua, por favor!");
		}
		
		this.rua = rua;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		if (numero.length() == 0) {
			throw new NullPointerException("Insira o número, por favor!");
		}
		
		this.numero = numero;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		if (cep.length() == 0) {
			throw new NullPointerException("Insira o CEP, por favor!");
		}
		
		this.cep = cep;
	}
	
	public String getPontoReferencia() {
		return pontoReferencia;
	}
	
	public void setPontoReferencia(String pontoReferencia) {
		if (pontoReferencia.length() == 0) {
			throw new NullPointerException("Insira o ponto de referência, por favor!");
		}
		
		this.pontoReferencia = pontoReferencia;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		if (complemento.length() == 0) {
			throw new NullPointerException("Insira o complemento, por favor!");
		}
		
		this.complemento = complemento;
	}
}
