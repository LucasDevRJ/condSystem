package condSystem;

public class Main {

	public static void main(String[] args) {
		InformacoesPessoais ipp = new InformacoesPessoais();
		ipp.setNome("Tulio");
		ipp.setSobrenome("Neto");
		
		Porteiro pt = new Porteiro();
		pt.setInformacoesPessoais(ipp);
		
		Administrador adm = new Administrador();
		adm.acessarInformacoesColaborador(pt);
	}
}
