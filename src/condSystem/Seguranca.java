package condSystem;

public class Seguranca extends Colaborador {

	public void vigiar(String local) {
		System.out.println("O seguranša " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta vigiando o " + local + ".");
	}
}
