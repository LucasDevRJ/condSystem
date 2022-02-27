package condSystem;

public class Administrador extends Colaborador implements CondSystem {

	@Override
	public void cadastrarMorador() {
		InformacoesPessoais ip = new InformacoesPessoais();
		ip.setNome("");
		//ip.setDataNascimento();
		ip.setNaturalidade("Brasileiro324343****");
		ip.setRg("1111444444444");
		ip.setCpf("11111111111222222");
		ip.setDataNascimento("11111111");
		
		System.out.println(ip.getNome());
		System.out.println(ip.getDataNascimento());
		System.out.println(ip.getNaturalidade());
		System.out.println(ip.getRg());
		System.out.println(ip.getCpf());
		System.out.println(ip.getDataNascimento());
		
		Endereco ed = new Endereco();
		ed.setRua("Rua               3743437ии&&&&Itagua");
		ed.setNumero("      dfjdip767676fjdfpid");
		ed.setCep("1111111   11");
		ed.setPontoReferencia("difjdfidjfdifjd458495!!@@@@@!!!!");
		
		System.out.println(ed.getRua());
		System.out.println(ed.getNumero());
		System.out.println(ed.getCep());
		System.out.println(ed.getPontoReferencia());
	}
}
