package condSystem;

public class ProfessorAcademia extends Colaborador {

	private boolean estaMontandoSerie;
	
	public void montarSerie() {
		if (this.isEstaMontandoSerie() == false) {
			System.out.println("Professor de Educação Física " + super.getInformacoesPessoais().getNome() + super.getInformacoesPessoais().getSobrenome() + " esta montando série para o aluno.");
		} else {
			System.out.println("Professor de Educação Física " + super.getInformacoesPessoais().getNome() + super.getInformacoesPessoais().getSobrenome() + " já montou a série para o aluno.");
		}
	}
	 
	public void demonstrarExercicio() {
		System.out.println("Professor de Educação Física " + super.getInformacoesPessoais().getNome() + " " + super.getInformacoesPessoais().getSobrenome() + " esta demonstrando o exercício para o aluno.");
	}

	public boolean isEstaMontandoSerie() {
		return estaMontandoSerie;
	}

	public void setEstaMontandoSerie(boolean estaMontandoSerie) {
		this.estaMontandoSerie = estaMontandoSerie;
	}
}
