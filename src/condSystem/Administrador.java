package condSystem;

public class Administrador extends Colaborador implements CondSystem {

	@Override
	public void cadastrarMorador() {
		InformacoesPessoais ip = new InformacoesPessoais();
		ip.setNome("");
		System.out.println(ip.getNome());
	}
}
