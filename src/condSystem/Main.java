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
	}
}
