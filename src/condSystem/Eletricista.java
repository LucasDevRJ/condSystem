package condSystem;

public class Eletricista extends Colaborador {

	public void trocaFiacao() {
		System.out.println("O eletricista " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta trocando a fiação.");
	}
	
	public void consertaFiacao() {
		System.out.println("O eletricista " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta consertando a fiação.");
	}
}
