package com.github.lucasdevrj.condsystem.informacoespessoais;
/**
 * Classe que representa o EndereÁo
 * @author Lucas Pereira de Lima
 * @version 1.0
 */
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
		pais = pais.trim();
		
		pais = pais.replaceAll("[^a-zA-Z Ì„·ÈÙ‡Ùı¸Õ√¡¿’‘‹]", "");
		
		if (pais.contains("  ")) {
			throw new IllegalArgumentException("N„o coloque muitos espaÁos, por favor!");
		}
		
		if (pais.length() == 0) {
			throw new NullPointerException("Insira o paÌs, por favor!");
		}
		
		this.pais = pais;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		cidade = cidade.trim();
		
		cidade = cidade.replaceAll("[^a-zA-Z Ì„·ÈÙ‡Ùı¸Õ√¡¿’‘‹]", "");
		
		if (cidade.contains("  ")) {
			throw new IllegalArgumentException("N„o coloque muitos espaÁos, por favor!");
		}
		
		if (cidade.length() == 0) {
			throw new NullPointerException("Insira a cidade, por favor!");
		}
		
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		estado = estado.trim();
		
		estado = estado.replaceAll("[^a-zA-Z Ì„·ÈÙ‡Ùı¸Õ√¡¿’‘‹]", "");
		
		if (estado.contains("  ")) {
			throw new IllegalArgumentException("N„o coloque muitos espaÁos, por favor!");
		}
		
		if (estado.length() == 0) {
			throw new NullPointerException("Insira o Estado, por favor!");
		}
		
		this.estado = estado;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		rua = rua.trim();
		
		rua = rua.replaceAll("[^a-zA-Z Ì„·ÈÙ‡Ùı¸Õ√¡¿’‘‹]", "");
		
		if (rua.contains("  ")) {
			throw new IllegalArgumentException("N„o coloque muitos espaÁos, por favor!");
		}
		
		if (rua.length() == 0) {
			throw new NullPointerException("Insira a Rua, por favor!");
		}
		
		this.rua = rua;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		numero = numero.trim();
		
		numero = numero.replaceAll("[^0-9]", "");
		
		if (numero.length() == 0) {
			throw new NullPointerException("Insira o n˙mero, por favor!");
		}
		
		this.numero = numero;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		cep = cep.trim();
		
		cep = cep.replaceAll("[^0-9]", "");
		
		cep = cep.substring(0, 5) + "-" + cep.substring(5, 8);
		
		if (cep.length() == 0) {
			throw new NullPointerException("Insira o CEP, por favor!");
		}
		
		this.cep = cep;
	}
	
	public String getPontoReferencia() {
		return pontoReferencia;
	}
	
	public void setPontoReferencia(String pontoReferencia) {
		pontoReferencia = pontoReferencia.trim();
		
		pontoReferencia = pontoReferencia.replaceAll("[^a-zA-Z Ì„·‡Ùı¸Õ√¡¿’‘‹,.!;:]", "");
		
		if (pontoReferencia.contains("  ")) {
			throw new IllegalArgumentException("N„o coloque muitos espaÁos, por favor!");
		}
		
		if (pontoReferencia.length() == 0) {
			throw new NullPointerException("Insira o ponto de referÍncia, por favor!");
		}
		
		this.pontoReferencia = pontoReferencia;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		complemento = complemento.trim();
		
		complemento = complemento.replaceAll("[^a-zA-Z Ì„·‡Ùı¸Õ√¡¿’‘‹,.!;:]", "");
		
		if (complemento.contains("  ")) {
			throw new IllegalArgumentException("N„o coloque muitos espaÁos, por favor!");
		}
		
		if (complemento.length() == 0) {
			throw new NullPointerException("Insira o complemento, por favor!");
		}
		
		this.complemento = complemento;
	}
}
