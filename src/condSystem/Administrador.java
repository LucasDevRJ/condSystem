package condSystem;

public class Administrador extends Colaborador implements CondSystem {

	@Override
	public void cadastrarMorador() {
		InformacoesPessoais ip = new InformacoesPessoais();
		ip.setNome("");
		//ip.setDataNascimento();
		ip.setNaturalidade("Brasileiro324343****");
		ip.setRg("");
		ip.setCpf("11111111111222222");
		ip.setDataNascimento("11111111");
		
		System.out.println(ip.getNome());
		System.out.println(ip.getDataNascimento());
		System.out.println(ip.getNaturalidade());
		System.out.println(ip.getRg());
		System.out.println(ip.getCpf());
		System.out.println(ip.getDataNascimento());
	}
}
