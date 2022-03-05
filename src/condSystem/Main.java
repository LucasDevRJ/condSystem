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
		
	}
}
