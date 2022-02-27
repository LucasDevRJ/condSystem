package condSystem;

public class Endereco {

	private String rua;
	private String numero;
	private String cep;
	private String pontoReferencia;
	private String complemento;
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		rua = rua.replaceAll("[^A-Za-z ]", "");
		
		while (rua.indexOf(" ") != rua.lastIndexOf(" ")) {
			rua = rua.replace("  ", " ");
		}
		
		if (rua.length() == 0) {
			System.out.println("Digite a rua!");
		} else {
			this.rua = rua;
		}
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		numero = numero.replaceAll("[^0-9]", "");
		if (numero.length() == 0) {
			System.out.println("Digite a Rua!");
		} else {
			this.numero = numero;
		}
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		cep = cep.replaceAll("[^0-9]", "");
		cep = cep.substring(0,5) + "-" + cep.substring(5,8);
		if (cep.length() == 0) {
			System.out.println("Digite o CEP!");
		} else {
			this.cep = cep;
		}
	}
	
	public String getPontoReferencia() {
		return pontoReferencia;
	}
	
	public void setPontoReferencia(String pontoReferencia) {
		if (pontoReferencia.length() >= 10) {
			System.out.println("Digite pelo menos 10 caracteres!");
		} else {
			this.pontoReferencia = pontoReferencia;
		}
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		if (complemento.length() >= 10) {
			System.out.println("Digite pelo menos 10 caracteres!");
		} else {
			this.complemento = complemento;
		}
	}
}
